import Vue from 'vue'
import Router from 'vue-router'
import Index from '../views/index'
import Main from '../views/main'
import Login from '../views/login'
import register from "../views/register";
Vue.use(Router)


export default new Router({
  routes: [
    {
      path: '/index',
      name: 'Index',
      component: Index,
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
      path: '/login',
      name: 'Login',
      component: Login,
    },
    {
      path:'/register',
      name:'Register',
      component:register
    }


  ]
})
