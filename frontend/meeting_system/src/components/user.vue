<template>
  <div style="margin-top: 30px">
  <el-table
    :data="tableData"
    border
    style="width: 100%;max-height: 300px"
  max-height="200px">
    <el-table-column
      prop="uid"
      label="用户编号"
      width="420">
    </el-table-column>
    <el-table-column
      prop="uname"
      label="用户姓名"
      width="419">
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
        },
        {
          uid: '001',
          uname: 'xxx',
          actress: 'xxx',
          meeting: 'xxx'
        }],
    }
  }
}
</script>
<style>
</style>
