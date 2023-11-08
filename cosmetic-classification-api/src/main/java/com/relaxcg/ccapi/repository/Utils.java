package com.relaxcg.ccapi.repository;

import com.alibaba.fastjson2.JSON;
import com.relaxcg.ccapi.repository.entity.BaseDO;
import com.relaxcg.ccapi.repository.entity.ClassDO;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author relaxcg
 * @date 2023/11/8 14:47
 */
public class Utils {

    private static final String PATH = "d:\\cc";
    private static final String CLASS = "d:\\cc\\class.txt";
    private static final String COSMETIC = "d:\\cc\\cosmetic.txt";

    public static void init() {
        File clz = new File(PATH);
        if (!clz.exists()) {
            clz.mkdir();
        }
    }

    private static File getFile(String name) {
        File file = new File(name);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("e");
            }
        }
        return file;
    }

    public static void append(BaseDO objDO) {
        File file = getFile(FilePath.getPath(objDO));
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(JSON.toJSONString(objDO) + "\r\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> getAll(FilePath filePath, Class<T> tClass) {
        try (Stream<String> stream = Files.lines(Paths.get(filePath.path))) {
            List<String> list = stream.toList();
            return list.stream().map(s -> JSON.parseObject(s, tClass)).collect(Collectors.toList());
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) throws IOException {
        init();
        append(new ClassDO(1, "1", LocalDateTime.now()));
        append(new ClassDO(2, "2", LocalDateTime.now()));
        // ClassDO classDO = new ClassDO(1, "", LocalDateTime.now());
        // System.out.println(classDO.toString());
    }

    @RequiredArgsConstructor
    public enum FilePath {
        CLASS("d:\\cc\\class.txt"),
        COSMETIC("d:\\cc\\cosmetic.txt");
        private final String path;

        public static String getPath(Object obj) {
            if (obj instanceof ClassDO) {
                return CLASS.path;
            }
            throw new RuntimeException("no such file:" + obj.getClass().getName());
        }
    }
}
