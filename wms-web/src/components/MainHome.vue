<!--  -->
<template>
      <el-table :data="tableData">
        <el-table-column prop="id" label="ID" width="140">
        </el-table-column>
        <el-table-column prop="no" label="账号" width="140">
        </el-table-column>
        <el-table-column prop="name" label="姓名" width="140">
        </el-table-column>
        <el-table-column prop="age" label="年龄" width="120">
        </el-table-column>
        <el-table-column prop="sex" label="性别" width="120">
        </el-table-column>
        <el-table-column prop="roleId" label="角色">
        </el-table-column>
        <el-table-column prop="phone" label="电话">
        </el-table-column>
        <el-table-column prop="op" label="操作">
        </el-table-column>
      </el-table>
</template>

<script>
export default {
  name: "MainHome",
  data () {
    return {
        tableData: []
    }
  },
  // Vue 组件的 beforeMount 生命周期钩子中调用了一个名为 loadGet 的方法
  beforeMount() {
    this.loadGet();
    this.loadPost();
  },
  methods:{
    // res=>res.data，取返回数据里面的data字段
    loadGet(){
      this.$axios.get(this.$httpUrl+'/user/list').then(res=>res.data).then(res=>{
        console.log(res)
      })
      .catch(err=>{
        console.log(err)
      })
    },
    loadPost(){
      this.$axios.post(this.$httpUrl+'/user/listP',{}).then(res=>res.data).then(res=>{
        console.log(res)
        this.tableData=res.data
      })
    }
  }

}
</script>

<style lang='stylus' scoped>

</style>
