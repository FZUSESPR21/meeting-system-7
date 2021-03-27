<template>
<div >
    <el-button @click="dialogVisibility=true">发布信息</el-button>
    <el-dialog :visible.sync="dialogVisibility">
      <span style="font-size:40px;position:absolute;top:50px;left:100px">发布信息</span>
      <el-form :model="ruleForm" ref="ruleForm" label-width="100px" class="myform">
        <el-form-item label="论坛主题" prop="forumtheme" class="selectitem">
      <el-select v-model="ruleForm.value" placeholder="请选择" style="width:500px" >
    <el-option
      v-for="item in forumoptions"
      :key="item.value"
      :label="item.label"
      :value="item.value">
    </el-option>
  </el-select>
        </el-form-item>
        <el-form-item label="消息内容" prop="messagecontent" class="textitem">
          <el-input
  type="textarea"
  :rows="4"
  placeholder="请输入内容"
  v-model="ruleForm.textarea2"
  class="mytextarea"
  >
</el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
      <el-button @click="dialogVisibility=false">取 消</el-button>
      <el-button type="primary" @click="submitForm()">发 布</el-button>
    </div>

    </el-dialog>
</div>
</template>
<script>
export default {
   data(){
     return{
      ruleForm:{
        textarea2:"",
        value:""
      },
       dialogVisibility:false,
      forumThemeList:[],
      forumoptions: [{
          value: '选项1',
          label: '黄金糕'
        }, {
          value: '选项2',
          label: '双皮奶'
        }, {
          value: '选项3',
          label: '蚵仔煎'
        }, {
          value: '选项4',
          label: '龙须面'
        }, {
          value: '选项5',
          label: '北京烤鸭'
        }],
        value: ''
     }
   },
   methods:{
    openDialog() {

      }
   }
}
</script>
<style scoped >
.myform{
  width:700px;
  margin:0 auto;
}
.selectitem{
  width:600px;
  margin:0 auto;
  margin-top:100px !important;
}
.textitem{
 width: 700px;
 margin-top:50px !important;
 margin: 0 auto;
}
/deep/.textitem .el-form-item__label
{
   position: absolute;
   left:177px;
}
.mydialogselect{
  position: absolute;
  width:500px;
  top:50px;
  left: 150px;
}
.mydialogarea{
     margin-top: 100px;
     margin-left:-10px ;
}
.mytextarea
{
  width: 500px;
  height: 100px;
}

</style>
