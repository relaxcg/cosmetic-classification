<script setup>
import {ref} from "vue";

const account = ref("")

const loginForm = ref({
  account: "",
  password: "",
})

const loginRules = ref({
  account: [
    {
      required: true,
      trigger: 'blur',
      message: "请输入用户名"
    }
  ]
})

</script>

<template>
  <div class="login-container">
    <el-form ref="loginFromRef" class="login-form" :model="loginForm" :rules="loginRules">
      <div class="title-container">
        <h3 class="title">后台管理系统</h3>
      </div>

      <el-form-item prop="username">
        <span class="icon-container">
          <i class="el-icon-user"></i>
        </span>
        <!--        <el-input placeholder="请输入用户名" name="username" type="text" v-model="loginForm.username" />-->
        <el-input placeholder="请输入用户名" name="username" type="text" v-model="account"/>
      </el-form-item>

      <el-form-item prop="password">
        <span class="icon-container">
          <i class="el-icon-lock"></i>
        </span>
        <!--        <el-input placeholder="请输入密码" name="password" :type="passwordType" v-model="loginForm.password" />-->
        <el-input placeholder="请输入密码" name="password"/>
        <span class="show-pwd">
<!--          <svg-icon-->
          <!--              :icon="passwordType === 'password' ? 'eye' : 'eye-open'"-->
          <!--              @click="onChangePwdType"-->
          <!--          />-->

        </span>
      </el-form-item>

      <el-form-item class="code-box">
       <span class="icon-container">

         <i class="el-icon-tickets"></i>

        </span>
        <!--        <el-input-->
        <!--            placeholder="图形验证码"-->
        <!--            v-model="loginForm.captcha_code" class="code-input" maxlength="4">-->
        <!--        </el-input>-->
        <el-input
            placeholder="图形验证码"
            class="code-input" maxlength="4">
        </el-input>
        <!--        <div class="code-img" @click="getCodeImg">{{loginForm.captcha_code}}</div>-->
        <div class="code-img"></div>
      </el-form-item>


      <!--      <el-button type="primary" style="width: 100%; margin-bottom: 30px;" :loading="loading"-->
      <!--                 @click="handleLogin">登录</el-button>-->
      <el-button type="primary" style="width: 100%; margin-bottom: 30px;">登录</el-button>
    </el-form>
  </div>
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
  transition: filter 300ms;
}

.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}

.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
