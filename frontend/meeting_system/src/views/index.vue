<template>
  <div id="index">

    <el-container>
<!--      /*左侧边栏*/-->
      <el-aside width="200px">
        <MyMenu></MyMenu>
      </el-aside>
      <el-container>
<!--        /*头部*/-->
        <el-header>

        </el-header>
<!--        /* 主体 */-->
        <el-main>
          Main
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
  components: {MessageList, MyMenu}
}
</script>

<style>
.el-header, .el-footer {
  background-color: aliceblue;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  /*background-color: #D3DCE6;*/
  /*color: #333;*/
  /*text-align: center;*/
  /*line-height: 200px;*/
}

.el-main {
  background-color: #E9EEF3;
  color: #333;
  text-align: center;
  line-height: 160px;
}

body > .el-container {
  margin-bottom: 40px;
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}
</style>
