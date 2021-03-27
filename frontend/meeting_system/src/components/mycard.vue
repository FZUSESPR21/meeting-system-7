<template>
<div>
  <el-card shadow="hover" class="mycard box-card">
   <div class="themetitle">议题名称</div>
     <ul class="themedetails">
       <li>议会时间:</li>
       <li>议会主席:</li>
       <li>分议会主席:</li>
     </ul>
  </el-card>
</div>

</template>
<script>
export default {
    data(){
      return {
         themeContent:{
           themeTitle:"",
           themeTime:"",
           councilChairman:"",
           subCouncilChairman:""
         }
      }
    }
}
</script>
<style scoped>
.mycard{
  width:100%;
  height: 300px;
  position: relative;
}
.themetitle{
    font-size:30px;
    font-weight:bold;
    width: 200px;
    height: 50px;
    position: absolute;
    top:50px;
    left: 0px;
}
.themedetails{
  height: 200px;
  width: 500px;
  list-style: none;
  position: absolute;
  top:120px;
  left:-180px;
}
.themedetails li
{
  margin-bottom: 20px;
}
</style>
