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
        <el-input placeholder="请输入用户名" name="username" type="text" v-model="loginForm.username" />
      </el-form-item>

      <el-form-item prop="password">
        <span class="icon-container">
          <i class="el-icon-lock"></i>
        </span>
        <el-input placeholder="请输入密码" name="password" :type="passwordType" v-model="loginForm.password" />
        <span class="show-pwd">
          <svg-icon
              :icon="passwordType === 'password' ? 'eye' : 'eye-open'"
              @click="onChangePwdType"
          />

        </span>
      </el-form-item>

      <el-form-item class="code-box">
       <span class="icon-container">

         <i class="el-icon-tickets"></i>

        </span>
        <el-input
            placeholder="图形验证码"
            v-model="loginForm.captcha_code" class="code-input" maxlength="4">
        </el-input>
        <div class="code-img" @click="getCodeImg">{{loginForm.captcha_code}}</div>
      </el-form-item>


      <el-button type="primary" style="width: 100%; margin-bottom: 30px;" :loading="loading"
                 @click="handleLogin">登录</el-button>
    </el-form>
  </div>
</template>

<script setup>
import {} from 'vue'
</script>

<style lang="scss" scoped></style>