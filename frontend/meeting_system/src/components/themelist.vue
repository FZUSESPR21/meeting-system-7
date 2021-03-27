<template>
  <el-table
    :data="tableData"
    border
    style="width: 100%">
    <el-table-column
      fixed
      prop="id"
      label="会议编号"
      width="400">
    </el-table-column>
    <el-table-column
      prop="theme"
      label="会议主题"
      width="400">
    </el-table-column>
    <el-table-column
      prop="start_time"
      label="开始时间"
      width="400">
    </el-table-column>
    <el-table-column
      fixed="right"
      label="操作"
      width="150">
      <template slot-scope="scope">
        <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script>
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
        }]
      }
    }
  }
</script>

