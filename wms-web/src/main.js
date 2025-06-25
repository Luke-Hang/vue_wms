import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import axios from 'axios'
Vue.config.productionTip = false
Vue.prototype.$axios = axios;
Vue.prototype.$httpUrl='http://localhost:8090'
Vue.use(ElementUI);
new Vue({
  render: h => h(App),
}).$mount('#app')
