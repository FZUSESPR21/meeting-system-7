<template>
  <div>
    <div id="login">
      <div class="rword"></div>
      <el-form ref="form" :model="ruleForm" label-width="80px">
          <el-form-item class="form-item">
            <el-input v-model="ruleForm.userName" placeholder="请输入您的账号" class="form-input"></el-input>
          </el-form-item>
          <el-form-item  prop="pass" class="form-item" >
            <el-input  v-model="ruleForm.pass" show-password autocomplete="off" placeholder="请输入您的密码"></el-input>
          </el-form-item>
          <el-form-item  prop="checkPass" class="form-item" >
            <el-input  v-model="ruleForm.checkPass" show-password autocomplete="off" placeholder="请再次输入您的密码" @change="checkRight"></el-input>
          </el-form-item>
          <div class='word'>
            选择您要关注的论坛
          </div>
            <el-checkbox v-model="ruleForm.checked1" >神经网络</el-checkbox>
            <el-checkbox v-model="ruleForm.checked2" >人工智能</el-checkbox>
            <el-checkbox v-model="ruleForm.checked3" >动态感知</el-checkbox>
            <el-checkbox v-model="ruleForm.checked4" >机器学习</el-checkbox>
            <el-checkbox v-model="ruleForm.checked5" >计算机视觉</el-checkbox>
            <br/>
          <el-button type="primary" @click="onRegister" class="register">注册</el-button>
        </el-form>
    </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        ruleForm: {
          userName: '',
          pass:'',
          checkPass:'',
          checked1: false,
          checked2: false,
          checked3: false,
          checked4: false,
          checked5: false,
        }
      }
    },
    methods: {
      onRegister:function() {
        const that = this;
        if(this.ruleForm.userName!=""&&this.ruleForm.pass!=""&&this.ruleForm.pass==this.ruleForm.checkPass)
        {
          //向后端发送axios请求
          this.axios.post('/register',{
            'username': that.userName,
            'password': that.password
          }).then(function (respond){

          }).catch(function (error){
            console.log(error);
          });
          alert("注册成功");
          //向后端发送axios数据
          //将用户信息存在cookie当中
        }
        else{
          alert("注册失败")
        }

      },
      checkRight:function(){
        if(this.ruleForm.pass!=this.ruleForm.checkPass)
          alert("两次密码不匹配");
        else
          {}
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
  .rword{
    font-size: 30px;
    font-weight: 800;
  }
  .form-item{
    text-align: center;
    margin: 40px 0;
    position: relative;
    right:40px;
  }
  .register{
    margin-top:40px;
  }
  .link{
    display: inline-block;
    margin-top: 20px;
    font-size: 10px;
  }
  .word{
    position: relative;
    left:4em;
    font-size: 10px;
    color:rgb(192,196,204);
    text-align: left;
    margin-bottom: 15px;
  }
</style>

