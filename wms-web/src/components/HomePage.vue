<!--  -->
<template>
<el-container style="height: 500px; border: 1px solid #eee">
  <el-aside :width="aside_witdh" style="background-color: rgb(238, 241, 246)">
    <AsideHome :isCollapse="collapseFlag"></AsideHome>
  </el-aside>
  
  <el-container>
    <el-header style="text-align: right; font-size: 12px">
        <HeaderHome @doCollapse="doCollapse" :icon="icon"></HeaderHome>
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
    return{
      collapseFlag:false,
      icon:'el-icon-s-fold',
      aside_witdh:'200px',
    }
  },
  methods:{
    doCollapse(){
      this.collapseFlag = !this.collapseFlag
      if (!this.collapseFlag){
        this.icon='el-icon-s-fold'
        this.aside_witdh='200px'
      }else {
        this.icon='el-icon-s-unfold'
        this.aside_witdh='64px'
      }
    }
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
