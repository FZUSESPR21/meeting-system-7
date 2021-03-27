<template>
  <div style="margin-top: 30px">
  <el-table
    :data="tableData"
    border
    style="width: 100%">
    <el-table-column
      fixed
      prop="uid"
      label="用户编号"
      width="210">
    </el-table-column>
    <el-table-column
      prop="uname"
      label="用户姓名"
      width="210">
    </el-table-column>
    <el-table-column
      prop="actress"
      label="用户角色"
      width="210">
    </el-table-column>
    <el-table-column
      prop="meeting"
      label="参加会议"
      width="209">
    </el-table-column>
  </el-table>
  </div>
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
      },
        {
          uid: '001',
          uname: 'xxx',
          actress: 'xxx',
          meeting: 'xxx'
        },
        {
          uid: '001',
          uname: 'xxx',
          actress: 'xxx',
          meeting: 'xxx'
        }]
    }
  }
}
</script>
<style>
</style>
