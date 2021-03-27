<template>
  <div id = "root-div">
    <div id="login">
      <div class='lword'>登录</div>
      <el-form ref="form" :model="form" label-width="80px">
        <el-form-item class="form-item">
          <el-input v-model="form.userName" placeholder="请输入您的账号" class="form-input"></el-input>
        </el-form-item>
        <el-form-item class="form-item">
          <el-input v-model="form.password" placeholder="请输入您的密码" show-password></el-input>
        </el-form-item>
        <el-button class="lbutton" type="primary" @click="onLogin">登录</el-button>
        <br/>
        <router-link class="link" to = '/register'>去注册</router-link>
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
        password: '',
        lids: ''   //此人关注的所有论坛
      }
    }
  },
  methods: {
    onLogin() {
      const that = this;
      if(this.form.userName!="" && this.form.password!="")
      {
        //向后端发送axios请求
        this.axios.post('/login',{
          'username': that.userName,
          'password': that.password
        }).then(function (respond){

        }).catch(function (error){
          console.log(error);
        });
        alert("登录成功");
        //页面跳转
        this.$router.push({
          path:'/index',
          name:'userName',
          query: {
            'username': this.userName,
            'lids': this.lids
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
#root-div{
  height: 100%;
  width: 100%;
  background-image: url("../assets/logo.png");
}
.lword{
  display: flex;
  justify-content: center;
  margin: 0 auto;
  font-size: 30px;
  font-weight: 800;
}
.form-item{
  text-align: center;
  margin: 40px 0;
  position: relative;
  right:40px;
}
.lbutton{
  margin: 0 auto;
  display: flex;
  justify-content: center;
}
.link{
  display: flex;
  justify-content: center;
  margin-top: 20px;
  font-size: 10px;
}
</style>

