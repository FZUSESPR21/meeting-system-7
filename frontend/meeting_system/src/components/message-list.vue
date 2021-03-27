<template>
  <div id = "message-list">
  <div class="block">
    <div class="radio">
      <el-radio-group v-model="reverse">
        <el-radio :label="true">倒序</el-radio>
        <el-radio :label="false">正序</el-radio>
      </el-radio-group>
      <br><br><br>
    </div>

    <el-timeline :reverse="reverse">
      <el-timeline-item
        v-for="(message, index) in messages"
        :key="index"
        :timestamp="message.timestamp">
        {{message.content}}
      </el-timeline-item>
    </el-timeline>
  </div>
  </div>
</template>

<script>
export default {
  name: "message-list",
  props:{
     lids:"",
  },
  data() {
    return {
      reverse: true,
      messages: [{
        content: '活动按期开始',
        timestamp: '2018-04-15'
      }, {
        content: '通过审核',
        timestamp: '2018-04-13'
      }, {
        content: '创建成功',
        timestamp: '2018-04-11'
      }]
    };
  }
}
</script>

<style scoped>

#message-list{

  min-height: 990px;
  background-color: #e8ebe4;
  position: relative;
}
.block{
  position: absolute;
  top:100px;
  left: 5px;
}
</style>
