import Vue from 'vue'
import Router from 'vue-router'
import Index from '../views/index'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/index',
      name: 'Index',
      component: Index
    }
  ]
})
