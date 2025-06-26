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
          <template slot-scope="scope">
            <el-tag
                :type="scope.row.sex === 1 ? 'primary' : 'success'"
                disable-transitions>{{scope.row.sex === 1 ? '男' : '女'}}</el-tag>
          </template>
        </el-table-column>
        <!--      在 el-tag 组件中，通过 type 属性来设置标签的颜色
          type 值      颜色
          'primary'   蓝色
          'success'   绿色
          'warning'   黄色
          'danger'    红色
          'info'      灰色-->
        <el-table-column prop="roleId" label="角色">
          <template slot-scope="scope">
            <el-tag
                :type="scope.row.roleId === 0 ? 'danger' : (scope.row.roleId === 1 ? 'primary' : 'success')"
                disable-transitions>{{scope.row.roleId === 0 ? '超级管理员' : (scope.row.roleId === 1 ? '管理员' : '普通用户')}}</el-tag>
          </template>
        </el-table-column>
        <el-table-column prop="phone" label="电话">
        </el-table-column>
        <el-table-column prop="op" label="操作">
          <el-button size="small" type="success" @click="edit">编辑</el-button>
          <el-popconfirm
              title="确定删除吗？"
              @confirm="del(scope.row.id)"
              style="margin-left: 5px;"
          >
            <el-button slot="reference" size="small" type="danger" >删除</el-button>
          </el-popconfirm>

<!--          <el-button size="small" type="danger" @click="del">删除</el-button>-->

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
    },
    del(){
      alert('确定删除吗')
    },

    edit(){
      alert('确定修改吗')
    }
  }

}
</script>

<style lang='stylus' scoped>

</style>
