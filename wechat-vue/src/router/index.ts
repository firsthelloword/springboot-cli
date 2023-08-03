import {createRouter, createWebHistory} from 'vue-router'
import { defineAsyncComponent } from 'vue'
import Login from "@/views/login.vue"
import HomePage from "@/views/HomePage.vue"
const router = createRouter({ 
  history: createWebHistory(),  // history 模式
  routes: [
    {
      path: '/',
      name: 'home',
      component: Login,
      meta: {
        title: '登录',
      },
    },
    {
      path: '/home',
      name: 'home',
      component: HomePage,
      meta: {
        title: '首页',
      },
    },
  ]
})

// 全局路由守卫
// router.beforeEach((to, from, next)=>{
//   if (to.meta.title) {
//     document.title = `${to.meta.title}`;
//   }
//   next()
// })

// router.afterEach((to, from)=>{
// })

export default router