<template>
  <el-table
    :data="tableData"
    border
    style="width: 100%">
    <el-table-column
      fixed
      prop="uid"
      label="用户编号"
      width="400">
    </el-table-column>
    <el-table-column
      prop="uname"
      label="用户姓名"
      width="400">
    </el-table-column>
    <el-table-column
      prop="actress"
      label="用户角色"
      width="400">
    </el-table-column>
    <el-table-column
      prop="meeting"
      label="参加会议"
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
        uid: '001',
        uname: 'xxx',
        actress: 'xxx',
        meeting: 'xxx'
      }]
    }
  }
}
</script>
