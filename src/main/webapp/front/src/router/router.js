import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import juanzengzheList from '../pages/juanzengzhe/list'
import juanzengzheDetail from '../pages/juanzengzhe/detail'
import juanzengzheAdd from '../pages/juanzengzhe/add'
import shenlingzheList from '../pages/shenlingzhe/list'
import shenlingzheDetail from '../pages/shenlingzhe/detail'
import shenlingzheAdd from '../pages/shenlingzhe/add'
import wupinfenleiList from '../pages/wupinfenlei/list'
import wupinfenleiDetail from '../pages/wupinfenlei/detail'
import wupinfenleiAdd from '../pages/wupinfenlei/add'
import juanzengwupinList from '../pages/juanzengwupin/list'
import juanzengwupinDetail from '../pages/juanzengwupin/detail'
import juanzengwupinAdd from '../pages/juanzengwupin/add'
import juanzengxinxiList from '../pages/juanzengxinxi/list'
import juanzengxinxiDetail from '../pages/juanzengxinxi/detail'
import juanzengxinxiAdd from '../pages/juanzengxinxi/add'
import juanzengchuliList from '../pages/juanzengchuli/list'
import juanzengchuliDetail from '../pages/juanzengchuli/detail'
import juanzengchuliAdd from '../pages/juanzengchuli/add'
import shenlingwupinList from '../pages/shenlingwupin/list'
import shenlingwupinDetail from '../pages/shenlingwupin/detail'
import shenlingwupinAdd from '../pages/shenlingwupin/add'
import yuyueshenlingwupinList from '../pages/yuyueshenlingwupin/list'
import yuyueshenlingwupinDetail from '../pages/yuyueshenlingwupin/detail'
import yuyueshenlingwupinAdd from '../pages/yuyueshenlingwupin/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'juanzengzhe',
					component: juanzengzheList
				},
				{
					path: 'juanzengzheDetail',
					component: juanzengzheDetail
				},
				{
					path: 'juanzengzheAdd',
					component: juanzengzheAdd
				},
				{
					path: 'shenlingzhe',
					component: shenlingzheList
				},
				{
					path: 'shenlingzheDetail',
					component: shenlingzheDetail
				},
				{
					path: 'shenlingzheAdd',
					component: shenlingzheAdd
				},
				{
					path: 'wupinfenlei',
					component: wupinfenleiList
				},
				{
					path: 'wupinfenleiDetail',
					component: wupinfenleiDetail
				},
				{
					path: 'wupinfenleiAdd',
					component: wupinfenleiAdd
				},
				{
					path: 'juanzengwupin',
					component: juanzengwupinList
				},
				{
					path: 'juanzengwupinDetail',
					component: juanzengwupinDetail
				},
				{
					path: 'juanzengwupinAdd',
					component: juanzengwupinAdd
				},
				{
					path: 'juanzengxinxi',
					component: juanzengxinxiList
				},
				{
					path: 'juanzengxinxiDetail',
					component: juanzengxinxiDetail
				},
				{
					path: 'juanzengxinxiAdd',
					component: juanzengxinxiAdd
				},
				{
					path: 'juanzengchuli',
					component: juanzengchuliList
				},
				{
					path: 'juanzengchuliDetail',
					component: juanzengchuliDetail
				},
				{
					path: 'juanzengchuliAdd',
					component: juanzengchuliAdd
				},
				{
					path: 'shenlingwupin',
					component: shenlingwupinList
				},
				{
					path: 'shenlingwupinDetail',
					component: shenlingwupinDetail
				},
				{
					path: 'shenlingwupinAdd',
					component: shenlingwupinAdd
				},
				{
					path: 'yuyueshenlingwupin',
					component: yuyueshenlingwupinList
				},
				{
					path: 'yuyueshenlingwupinDetail',
					component: yuyueshenlingwupinDetail
				},
				{
					path: 'yuyueshenlingwupinAdd',
					component: yuyueshenlingwupinAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
