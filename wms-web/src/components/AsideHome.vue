<!--  -->
<template>
    <el-menu
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b"
        style="height: 100%"
        default-active="/Home"
        :collapse="isCollapse"
    >
      <el-menu-item index="/Home">
        <i class="el-icon-s-home"></i>
        <span>首页</span>
      </el-menu-item>
      <el-menu-item index="/one">
        <i class="el-icon-s-flag"></i>
        <span>导航一</span>
      </el-menu-item>
      <el-menu-item index="/two">
        <i class="el-icon-s-flag"></i>
        <span>导航一</span>
      </el-menu-item>
    </el-menu>
</template>

<script>
export default {
  data () {
    return {
      // collapseFlag: false
    }
  },
  props:{
    isCollapse:Boolean
  }
}
</script>

<style lang='stylus' scoped>

</style>
