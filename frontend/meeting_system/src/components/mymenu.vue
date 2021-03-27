<template>
  <div id="my-menu">
    <el-row class="tac">
      <el-col :span="3">
        <h5>校友论坛</h5>
        <el-menu
          default-active="2"
          class="el-menu-vertical-demo"
          @open="handleOpen"
          @close="handleClose"
          @select="handleSelect"
          <el-menu-item v-for="i in lids" :index="i.toString()">
            <i class="el-icon-document"></i>
            {{topics[i - 1]}}
          </el-menu-item>

        </el-menu>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  mame: 'my-menu',
  // props: ['lids'],
  data(){
    return {
      topics: [
        "神经网络",
        "人工智能",
        "动态感知",
        "机器学习",
        "计算机视觉"
      ],
      lids: [1,2,3,4,5]
    }
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    handleSelect(key, keyPath){
      console.log(key, keyPath);
    }
  }
}
</script>

<style>

</style>
