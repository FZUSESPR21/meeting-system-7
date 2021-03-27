<template>
  <div id="my-menu">
    <div class="forumTitle">校友论坛</div>
    <el-menu
      default-active="1"
      class="el-menu-vertical-demo"
      @select="handleSelect"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"
      style="min-height: 930px;"
    >
      <el-menu-item v-for="(item,index) in lids" :key="index" >
        <i class="el-icon-document"></i>
        <router-link :to="{name:'Main',params:{lid:3}}" style="text-decoration: none !important; color: white">{{topics[index]}}</router-link>
      </el-menu-item>
    </el-menu>
  </div>
</template>

<script>
export default {
  mame: 'my-menu',
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
  },
  props:{
    'newlids':{
      type:Array,
      default:()=>[]
    },
  }
}
</script>

<style>
.forumTitle
{
  width: 200px;
  height: 60px;
  line-height: 60px;
  text-align: center;
  font-size: 30px;
  font-weight: bold;
  background-color: #e8ebe4;
}
</style>
