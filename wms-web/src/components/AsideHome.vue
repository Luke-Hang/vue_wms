<!--  -->
<template>
    <el-menu
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b"
        default-active="/Home"
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
    }
  }
}
</script>

<style lang='stylus' scoped>

</style>
