<template>
  <div id="my-menu">
    <h2>校友论坛</h2>
    <el-menu
      default-active="1"
      class="el-menu-vertical-demo"
      @select="handleSelect"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"
      style="min-height: 800px"
    >
      <el-menu-item v-for="i in lids" :index="i.toString()">
        <i class="el-icon-document"></i>
        {{topics[i - 1]}}
      </el-menu-item>
    </el-menu>
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
      lids: [1,2,3,5]
    }
  },
  methods: {
    handleSelect(key, keyPath){
      console.log(key, keyPath);
    }
  }
}
</script>

<style>

</style>
