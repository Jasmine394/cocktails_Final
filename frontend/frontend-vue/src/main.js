import axios from 'axios'
import moment from 'moment'
import Vue from 'vue'
import App from './App.vue'
import router from './router'

Vue.config.productionTip = false
Vue.prototype.$http = axios
Vue.prototype.moment = moment

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
