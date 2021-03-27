<template>
  <div>
  <el-table
    :data="tableData"
    border
    style="width: 801px;height:850px;margin: 0 auto"
    :header-row-style="{'height': '100px','color':'red'}"
    >
    <el-table-column
      prop="id"
      label="会议编号"
      width="200"
      height="50"
      >
    </el-table-column>
    <el-table-column
      prop="theme"
      label="会议主题"
      width="200"
      height="50">
    </el-table-column>
    <el-table-column
      prop="start_time"
      label="开始时间"
      width="200"
      height="50">
    </el-table-column>
    <el-table-column
      label="操作"
      width="200"
      height="50">
      <template slot-scope="scope">
        <el-button @click="dialogVisibility=true" type="text" size="small">查看</el-button>
      </template>
    </el-table-column>
  </el-table>
  <el-dialog :visible.sync="dialogVisibility">
    <mycard></mycard>
   <user></user>
  </el-dialog>
  </div>
</template>

<script>
  import mycard from "./mycard";
  import user from "./user";
  export default {
    methods: {
      handleClick (row) {
        console.log(row)
      }
    },

    data () {
      return {
        tableData: [{
          id: '001',
          theme: 'xxx',
          start_time: 'xxx'
        }],
        dialogVisibility:false,
      }
    },
    components:{
      user,mycard
    }
  }
</script>
<style   scoped>
/deep/.el-table th,.el-table tr{
   padding: 0px;
}

</style>

