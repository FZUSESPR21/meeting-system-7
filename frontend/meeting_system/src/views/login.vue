<template>
  <div>
    <div id="login">
      <div class='lword'>登录</div>
      <el-form ref="form" :model="form" label-width="80px">
          <el-form-item class="form-item">
            <el-input v-model="form.userName" placeholder="请输入您的账号" class="form-input"></el-input>
          </el-form-item>
          <el-form-item class="form-item">
            <el-input v-model="form.password" placeholder="请输入您的密码" class="form-input"></el-input>
          </el-form-item>
          <el-button type="primary" @click="onLogin">登录</el-button>
          <br/>
          <a class="link">去注册</a>
        </el-form>
    </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        form: {
          userName: '',
          password:'',
        }
      }
    },
    methods: {
      onLogin() {
        if(this.form.userName!=""&&this.form.password!="")
        {
          //向后端发送axios请求
          alert("登录成功");
          //页面跳转
          this.$router.push({
          path:'/',
          name:'userName',
          params: {
              userName : this.form.userName
          }
      })
        }
        else
        {
          alert("登录失败")
        }
      }
    }
  }
</script>
<style scoped>
  #login{
    position: absolute;
    width:50%;
    margin: 0 auto;
    top:50%;
    left:50%;
    transform: translate(-50%,-50%);
  }
  .lword{
    font-size: 30px;
    font-weight: 800;
  }
  .form-item{
    text-align: center;
    margin: 40px 0;
    position: relative;
    right:40px;
  }
  .link{
    display: inline-block;
    margin-top: 20px;
    font-size: 10px;
  }
</style>

