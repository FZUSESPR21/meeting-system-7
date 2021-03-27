import Vue from 'vue'
import Router from 'vue-router'
import Main from '../views/main'
import Login from '../views/login'
import Register from '../views/register'

Vue.use(Router)


export default new Router({
  routes: [
    {
      path: '/login',
      name: 'login',
      component: Login,
      children:[
        {
          path:'/main',
          name:'Main',
          component: Main,
          props:true
        }
      ]
    },
    {
      path: '/register',
      name: 'register',
      component: Register
    }
  ]
})
