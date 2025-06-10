<!--  -->
<template>
<el-container style="height: 500px; border: 1px solid #eee">
  <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
    <AsideHome></AsideHome>
  </el-aside>
  
  <el-container>
    <el-header style="text-align: right; font-size: 12px">
        <HeaderHome></HeaderHome>
    </el-header>
    
    <el-main>
        <MainHome></MainHome>
    </el-main>
  </el-container>
</el-container>
</template>

<script>
import AsideHome from './AsideHome.vue';
import HeaderHome from './HeaderHome.vue';
import MainHome from './MainHome.vue';
export default {
  components: { AsideHome, HeaderHome, MainHome },
  data () {
/*     const item={
                date: '2016-05-02',
        name: '王小虎',
        address: '上海市普陀区金沙江路 1518 弄'
    };
    return {
        tableData: Array(10).fill(item)
    } */
  }
}
</script>

<style scoped>
.el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }
  
  .el-aside {
    color: #333;
  }
</style>
