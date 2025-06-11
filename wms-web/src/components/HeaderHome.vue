<!--  -->
<template>
  <div style="display: flex;line-height: 60px;">
    <div style="margin-top: 8px;">
      <i class="el-icon-s-fold" style="font-size: 20px;"></i>
    </div>
    <div style="flex: 1; text-align: center;font-size: 34px;">
      <span>欢迎来到仓库管理系统</span>
    </div>
     <el-dropdown>
        <span>王小虎</span><i class="el-icon-arrow-down" style="margin-left: 50px;"></i>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item @click.native="toUser">个人中心</el-dropdown-item>
          <el-dropdown-item @click.native="logout">退出登录</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
      
  </div>
  
</template>

<script>
export default {
  name: 'HeaderHome',
  methods:{
    toUser(){
      console.log('toUser');
    },
    logout(){
      console.log('logout');
    }
  }
/*   data () {
    return {
    }
  } */
}
</script>

<style lang='stylus' scoped>

</style>
