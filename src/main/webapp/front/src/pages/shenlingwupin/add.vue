<template>
<div :style='{"width":"1000px","padding":"20px","margin":"10px auto","position":"relative","background":"#D8D8D8"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="110px"
    >
          <el-form-item :style='{"width":"40%","padding":"10px","margin":"0 2% 10px","display":"inline-block"}' label="申领编号" prop="shenlingbianhao">
              <el-input v-model="ruleForm.shenlingbianhao" placeholder="申领编号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"40%","padding":"10px","margin":"0 2% 10px","display":"inline-block"}' label="物品名称" prop="wupinmingcheng">
            <el-input v-model="ruleForm.wupinmingcheng" 
                placeholder="物品名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"40%","padding":"10px","margin":"0 2% 10px","display":"inline-block"}'  label="物品分类" prop="wupinfenlei">
            <el-select v-model="ruleForm.wupinfenlei" placeholder="请选择物品分类" >
              <el-option
                  v-for="(item,index) in wupinfenleiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"40%","padding":"10px","margin":"0 2% 10px","display":"inline-block"}' label="数量" prop="shuliang">
            <el-input v-model="ruleForm.shuliang" 
                placeholder="数量" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"40%","padding":"10px","margin":"0 2% 10px","display":"inline-block"}' label="申领时间" prop="shenlingshijian" >
              <el-date-picker
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.shenlingshijian" 
                  type="datetime"
                  placeholder="申领时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"width":"40%","padding":"10px","margin":"0 2% 10px","display":"inline-block"}' label="申领账号" prop="shenlingzhanghao">
            <el-input v-model="ruleForm.shenlingzhanghao" 
                placeholder="申领账号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"40%","padding":"10px","margin":"0 2% 10px","display":"inline-block"}' label="申领姓名" prop="shenlingxingming">
            <el-input v-model="ruleForm.shenlingxingming" 
                placeholder="申领姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"40%","padding":"10px","margin":"0 2% 10px","display":"inline-block"}' label="申领原因" prop="shenlingyuanyin">
            <editor 
                :style='{"padding":"0","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.shenlingyuanyin" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#768169","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #fff","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#D8D8D8","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          shenlingbianhao: this.getUUID(),
          wupinmingcheng: '',
          wupinfenlei: '',
          shuliang: '',
          shenlingyuanyin: '',
          shenlingshijian: '',
          shenlingzhanghao: '',
          shenlingxingming: '',
        },
        wupinfenleiOptions: [],
        rules: {
          shenlingbianhao: [
          ],
          wupinmingcheng: [
            { required: true, message: '物品名称不能为空', trigger: 'blur' },
          ],
          wupinfenlei: [
            { required: true, message: '物品分类不能为空', trigger: 'blur' },
          ],
          shuliang: [
            { required: true, message: '数量不能为空', trigger: 'blur' },
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          shenlingyuanyin: [
            { required: true, message: '申领原因不能为空', trigger: 'blur' },
          ],
          shenlingshijian: [
          ],
          shenlingzhanghao: [
          ],
          shenlingxingming: [
          ],
          sfsh: [
          ],
          shhf: [
          ],
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.ruleForm.shenlingshijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='shenlingbianhao'){
              this.ruleForm.shenlingbianhao = obj[o];
              continue;
            }
            if(o=='wupinmingcheng'){
              this.ruleForm.wupinmingcheng = obj[o];
              continue;
            }
            if(o=='wupinfenlei'){
              this.ruleForm.wupinfenlei = obj[o];
              continue;
            }
            if(o=='shuliang'){
              this.ruleForm.shuliang = obj[o];
              continue;
            }
            if(o=='shenlingyuanyin'){
              this.ruleForm.shenlingyuanyin = obj[o];
              continue;
            }
            if(o=='shenlingshijian'){
              this.ruleForm.shenlingshijian = obj[o];
              continue;
            }
            if(o=='shenlingzhanghao'){
              this.ruleForm.shenlingzhanghao = obj[o];
              continue;
            }
            if(o=='shenlingxingming'){
              this.ruleForm.shenlingxingming = obj[o];
              continue;
            }
          }
          this.ruleForm.shuliang = 0
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if(json.shenlingzhanghao!=''&&json.shenlingzhanghao){
                this.ruleForm.shenlingzhanghao = json.shenlingzhanghao
            }
            if(json.shenlingxingming!=''&&json.shenlingxingming){
                this.ruleForm.shenlingxingming = json.shenlingxingming
            }
          }
        });
        this.$http.get('option/wupinfenlei/wupinfenlei', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.wupinfenleiOptions = res.data.data;
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('shenlingwupin/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        var obj = JSON.parse(localStorage.getItem('crossObj'));
        var table = localStorage.getItem('crossTable');
        obj.shuliang = obj.shuliang - this.ruleForm.shuliang
        if(obj.shuliang<0){
          this.$message.error("数量不足");
          return
        }
      
        this.$http.post(table+`/update`, obj).then(res => {});
        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('shenlingwupin/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算
                          var obj = JSON.parse(localStorage.getItem('crossObj'));
                          var table = localStorage.getItem('crossTable');

                          obj.shuliang = parseFloat(obj.shuliang) - parseFloat(this.ruleForm.shuliang)

                          this.$http.post(table+`/update`,obj).then(res => {});
                          this.$http.post('shenlingwupin/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {
                  var obj = JSON.parse(localStorage.getItem('crossObj'));
                  var table = localStorage.getItem('crossTable');

                  obj.shuliang = parseFloat(obj.shuliang) - parseFloat(this.ruleForm.shuliang)

                  this.$http.post(table+`/update`,obj).then(res => {});
                  this.$http.post('shenlingwupin/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 110px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: center;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 110px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  width: 100%;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #000;
	  width: 100%;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #000;
	  width: 100%;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #000;
	  width: 100%;
	  font-size: 14px;
	  height: 120px;
	}
</style>
