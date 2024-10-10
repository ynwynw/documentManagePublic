import { createRouter, createWebHashHistory } from 'vue-router'
import index from '../views'
import home from '../views/pages/home.vue'
import login from '../views/pages/login.vue'
import newsList from '@/views/pages/news/list'
import yonghuList from '@/views/pages/yonghu/list'
import yonghuDetail from '@/views/pages/yonghu/formModel'
import yonghuAdd from '@/views/pages/yonghu/formAdd'
import yonghuRegister from '@/views/pages/yonghu/register'
import yonghuCenter from '@/views/pages/yonghu/center'
import guanlizheList from '@/views/pages/guanlizhe/list'
import guanlizheDetail from '@/views/pages/guanlizhe/formModel'
import guanlizheAdd from '@/views/pages/guanlizhe/formAdd'
import bumenList from '@/views/pages/bumen/list'
import bumenDetail from '@/views/pages/bumen/formModel'
import bumenAdd from '@/views/pages/bumen/formAdd'
import danganleixingList from '@/views/pages/danganleixing/list'
import danganleixingDetail from '@/views/pages/danganleixing/formModel'
import danganleixingAdd from '@/views/pages/danganleixing/formAdd'
import danganxinxiList from '@/views/pages/danganxinxi/list'
import danganxinxiDetail from '@/views/pages/danganxinxi/formModel'
import danganxinxiAdd from '@/views/pages/danganxinxi/formAdd'
import storeupList from '@/views/pages/storeup/list'

const routes = [{
		path: '/',
		redirect: '/index/home'
	},
	{
		path: '/index',
		component: index,
		children: [{
			path: 'home',
			component: home
		}
		, {
			path: 'newsList',
			component: newsList
		}
		, {
			path: 'yonghuList',
			component: yonghuList
		}, {
			path: 'yonghuDetail',
			component: yonghuDetail
		}, {
			path: 'yonghuAdd',
			component: yonghuAdd
		}
		, {
			path: 'yonghuCenter',
			component: yonghuCenter
		}
		, {
			path: 'guanlizheList',
			component: guanlizheList
		}, {
			path: 'guanlizheDetail',
			component: guanlizheDetail
		}, {
			path: 'guanlizheAdd',
			component: guanlizheAdd
		}
		, {
			path: 'bumenList',
			component: bumenList
		}, {
			path: 'bumenDetail',
			component: bumenDetail
		}, {
			path: 'bumenAdd',
			component: bumenAdd
		}
		, {
			path: 'danganleixingList',
			component: danganleixingList
		}, {
			path: 'danganleixingDetail',
			component: danganleixingDetail
		}, {
			path: 'danganleixingAdd',
			component: danganleixingAdd
		}
		, {
			path: 'danganxinxiList',
			component: danganxinxiList
		}, {
			path: 'danganxinxiDetail',
			component: danganxinxiDetail
		}, {
			path: 'danganxinxiAdd',
			component: danganxinxiAdd
		}
		, {
			path: 'storeupList',
			component: storeupList
		}
		]
	},
	{
		path: '/login',
		component: login
	}
	,{
		path: '/yonghuRegister',
		component: yonghuRegister
	}
]

const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes
})

export default router
