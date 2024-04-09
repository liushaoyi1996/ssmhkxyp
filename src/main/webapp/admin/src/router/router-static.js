import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import wupinfenlei from '@/views/modules/wupinfenlei/list'
    import juanzengwupin from '@/views/modules/juanzengwupin/list'
    import systemintro from '@/views/modules/systemintro/list'
    import chat from '@/views/modules/chat/list'
    import juanzengzhe from '@/views/modules/juanzengzhe/list'
    import yuyueshenlingwupin from '@/views/modules/yuyueshenlingwupin/list'
    import juanzengxinxi from '@/views/modules/juanzengxinxi/list'
    import shenlingzhe from '@/views/modules/shenlingzhe/list'
    import shenlingwupin from '@/views/modules/shenlingwupin/list'
    import config from '@/views/modules/config/list'
    import juanzengchuli from '@/views/modules/juanzengchuli/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/wupinfenlei',
        name: '物品分类',
        component: wupinfenlei
      }
      ,{
	path: '/juanzengwupin',
        name: '捐赠物品',
        component: juanzengwupin
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/chat',
        name: '线上交流',
        component: chat
      }
      ,{
	path: '/juanzengzhe',
        name: '捐赠者',
        component: juanzengzhe
      }
      ,{
	path: '/yuyueshenlingwupin',
        name: '预约申领物品',
        component: yuyueshenlingwupin
      }
      ,{
	path: '/juanzengxinxi',
        name: '捐赠信息',
        component: juanzengxinxi
      }
      ,{
	path: '/shenlingzhe',
        name: '申领者',
        component: shenlingzhe
      }
      ,{
	path: '/shenlingwupin',
        name: '申领物品',
        component: shenlingwupin
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/juanzengchuli',
        name: '捐赠处理',
        component: juanzengchuli
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
