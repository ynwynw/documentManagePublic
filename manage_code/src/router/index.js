import { createRouter, createWebHashHistory } from 'vue-router'
import news from '@/views/news/list'
import danganxinxi from '@/views/danganxinxi/list'
import yonghu from '@/views/yonghu/list'
import bumen from '@/views/bumen/list'
import guanlizhe from '@/views/guanlizhe/list'
import storeup from '@/views/storeup/list'
import config from '@/views/config/list'
import danganleixing from '@/views/danganleixing/list'
import guanlizheRegister from '@/views/guanlizhe/register'
import guanlizheCenter from '@/views/guanlizhe/center'

export const routes = [
  {
    path: '/login',
    name: 'login',
    component: () => import('../views/login.vue'),
  },
  {
    path: '/',
    name: '首页',
    component: () => import('../views/index'),
    children: [
      {
        path: '/',
        name: '首页',
        component: () => import('../views/HomeView.vue'),
        meta: {
          affix: true,
        },
      },
      {
        path: '/updatepassword',
        name: '修改密码',
        component: () => import('../views/updatepassword.vue'),
      },

      {
        path: '/guanlizheCenter',
        name: '管理员个人中心',
        component: guanlizheCenter,
      },
      {
        path: '/news',
        name: '公告信息',
        component: news,
      },
      {
        path: '/danganxinxi',
        name: '档案信息',
        component: danganxinxi,
      },
      {
        path: '/yonghu',
        name: '用户',
        component: yonghu,
      },
      {
        path: '/bumen',
        name: '部门',
        component: bumen,
      },
      {
        path: '/guanlizhe',
        name: '管理员',
        component: guanlizhe,
      },
      {
        path: '/storeup',
        name: '我的收藏',
        component: storeup,
      },
      {
        path: '/config',
        name: '轮播图',
        component: config,
      },
      {
        path: '/danganleixing',
        name: '档案类型',
        component: danganleixing,
      },
    ],
  },
  {
    path: '/guanlizheRegister',
    name: '管理员注册',
    component: guanlizheRegister,
  },
]

const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes,
})

export default router
