<template>
    <el-container class="login-box">
        <el-card class="card-box">
            <div class="title-box">密码登录</div>
            <el-form ref="form" :model="form">
                <el-input v-model="form.mobile" placeholder="手机号登录" class="input-box"></el-input>
                <el-input v-model="form.password" type="password" placeholder="请输入密码" class="input-box"></el-input>
                <el-button type="primary" class="btn-box">登录</el-button>
            </el-form>
        </el-card>
    </el-container>
</template>
  
<script setup lang="ts">
import { ref } from "vue";

const form = ref({
    mobile: '',
    password: '',
    code: ''
});
</script>
<style scoped>
.login-box {
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: #57AC6D;
}

.card-box {
    height: 250px;
    width: 400px;
}
.input-box{
    height: 40px;
    margin-top: 10px;
}
.btn-box{
    margin-top: 30px;
    width: 100%;
}
.title-box{
    text-align: center;
    font-size: 20px;
    font-weight: 600;
}
</style>