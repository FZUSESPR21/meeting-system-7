<template>
  <div id="index">

    <el-container>
<!--      /*左侧边栏*/-->
      <el-aside width="200px">
        <MyMenu :lids = lids :getMesFunc = getMes></MyMenu>  //传参
      </el-aside>
      <el-container>
        <el-header>

        </el-header>
<!--        /* 主体 */-->
        <el-main>
          <router-view/>
        </el-main>
<!--        /*页尾*/-->
        <el-footer>
          Footer
        </el-footer>
<!--        /*右侧边栏*/-->
      </el-container>
      <el-aside width="200px">
        <MessageList></MessageList>
      </el-aside>
    </el-container>

  </div>
</template>

<script>
import MessageList from "../components/message-list"
import MyMenu from "../components/mymenu";

export default {
  name: 'Index',
  components: {MessageList, MyMenu},
  data(){
    return{
      userName:this.$route.query.userName,
      lids:this.$route.query.lids,
      topic_mes:[]   //议题信息
    }
  },
  methods: {
    getMes(lid){  //从后端调用api获取某个分论坛的议题信息
      const that = this;
      //向后端发送axios请求
      this.axios.post('/forum',{
        lid: that.lid
      }).then(function (respond){
        let code = respond.data.code;
        if(code == 0){  //成功
          that.topic_mes = respond.data.mes;
        }
      }).catch(function (error){
        console.log(error);
      });
    }
  }
}
</script>

<style>
*{
  margin: 0;
  padding: 0;
  border: 0;
}
.el-header, .el-footer {
  background-color: #e8ebe4;
  color: #333;
  text-align: center;
  line-height: 60px;
}
.el-footer
{
  background-color: #545c64;
  width: 100%;
  margin-top: -20px;
}
.el-header
{
  width: 100% !important;
}
.el-aside {
  /*background-color: #D3DCE6;*/
  /*color: #333;*/
  /*text-align: center;*/
  /*line-height: 200px;*/
}

.el-main {
  background-color:;
  color: #333;
  text-align: center;
  line-height: 20px !important;
}

body > .el-container {
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}
.forumTitle
{
  width: 200px;
  height: 60px;
  line-height: 60px;
  text-align: center;
  font-size: 30px;
  font-weight: bold;
  background-color: #fff;
}
</style>
