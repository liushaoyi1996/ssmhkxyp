<template>
<div class="home-preview" :style='{"width":"100%","margin":"10px auto"}'>




	
<div class="news" :style='{"margin":"0 0 10px","background":"#fff"}'>
	<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"200px","margin":"40px auto","lineHeight":"54px","textAlign":"center"}'>
		<span :style='{"color":"#000","fontSize":"30px"}'>公告信息</span>
	</div>
	
	
	
	
	
	
	
	
	<!-- 样式七 -->
	<div v-if="newsList.length" class="list list7 index-pv1" :style='{"width":"100%","padding":"10px","background":"#fff","justifyContent":"center","display":"flex","height":"auto"}'>
	  <div v-for="(item,index) in newsList" v-if="index<4" :key="index" @click="toDetail('newsDetail', item)" class="new7-list-item animation-box" style="cursor: pointer;" :style='{"width":"230px","padding":"10px 10px 40px 10px","margin":"0 5px","position":"relative","background":"#C7D4B9","height":"auto"}'>
	    <img :style='{"width":"100%","objectFit":"cover","borderRadius":"10px","height":"275px"}' style="box-sizing: border-box;object-fit: cover;width: 100%;height: 250px;" :src="baseUrl + item.picture">
	    <div :style='{"padding":"1px 10px","fontSize":"14px","lineHeight":"28px","overflow":"hidden","color":"#000000","height":"30px"}' class="new7-list-item-title line1">{{ item.title }}</div>
	    <div :style='{"padding":"0 10px","margin":"0 auto","overflow":"hidden","color":"#666","background":"#fff","width":"90%","fontSize":"14px","lineHeight":"24px","height":"50px"}' class="new7-list-item-descript line1">{{ item.introduction }}</div>
	    <div :style='{"padding":"0 10px","transform":"translateX(-50%)","color":"#fff","borderRadius":"10px 10px 0 0","left":"50%","bottom":"0","background":"#768169","width":"auto","fontSize":"12px","lineHeight":"24px","position":"absolute"}' class="new7-list-item-time">{{ item.addtime.split(' ')[0] }}</div>
	    <div :style='{"width":"100%","padding":"0 10px","alignItems":"center","justifyContent":"space-between","display":"flex","height":"auto"}'>
	      <div :style='{"color":"#666","fontSize":"14px","lineHeight":"24px"}'></div>
	      <div :style='{"color":"#999","fontSize":"14px","lineHeight":"24px"}'></div>
	    </div>
	  </div>
	</div>
	
	
	
	
	<div @click="moreBtn('news')" :style='{"border":"1px solid #768169","margin":"10px auto","borderRadius":"20px","textAlign":"center","background":"#fff","display":"block","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#768169","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#768169","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>


<div class="lists" :style='{"margin":"0 0 10px","backgroundSize":"100% 100%","position":"relative","background":"#fff","backgroundImage":"url(http://codegen.caihongy.cn/20221015/31b091a5dcd4468aa3453056f179329f.png)","height":"auto"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"200px","margin":"50px auto","lineHeight":"54px","textAlign":"center"}'>
	  <span :style='{"color":"#000","fontSize":"30px"}'>捐赠信息展示</span>
	</div>
	
	
	
	
	
	<!-- 样式四 -->
	<div class="list list4 index-pv1" :style='{"width":"1000px","padding":"10px","margin":"0 auto","position":"relative","height":"800px"}'>
		<div v-if="juanzengxinxiList.length>0" class="list-4-item animation-box" @click="toDetail('juanzengxinxiDetail', juanzengxinxiList[0])" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 10px","overflow":"hidden","borderRadius":"20px","flexWrap":"wrap","flexDirection":"column","background":"#fff","display":"flex","width":"274px","position":"relative","height":"auto"}'>
			<img :style='{"width":"100%","objectFit":"cover","borderRadius":"20px","height":"400px"}' v-if="juanzengxinxiList[0].wupintupian.substr(0,4)=='http'" :src="juanzengxinxiList[0].wupintupian.split(',')[0]" alt="" />
			<img :style='{"width":"100%","objectFit":"cover","borderRadius":"20px","height":"400px"}' v-else :src="baseUrl + (juanzengxinxiList[0].wupintupian?juanzengxinxiList[0].wupintupian.split(',')[0]:'')" alt="" />
			<div class="list-4-item-title line1" :style='{"width":"100%","lineHeight":"44px","fontSize":"18px","color":"#000","textAlign":"center"}'>{{juanzengxinxiList[0].wupinmingcheng}}</div>
		</div>
		<div :style='{"margin":"0 0 10px","top":"10px","left":"310px","flexDirection":"column","display":"flex","width":"210px","position":"absolute","height":"auto"}' class="list-4-body">
			<div v-if="juanzengxinxiList.length>1" @click="toDetail('juanzengxinxiDetail', juanzengxinxiList[1])" class="list-4-item animation-box item-2" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 10px 20px","overflow":"hidden","borderRadius":"20px","flexWrap":"wrap","background":"#fff","display":"inline-block","width":"210px","position":"relative","height":"auto"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"20px","height":"120px"}' v-if="juanzengxinxiList[1].wupintupian.substr(0,4)=='http'" :src="juanzengxinxiList[1].wupintupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"20px","height":"120px"}' v-else :src="baseUrl + (juanzengxinxiList[1].wupintupian?juanzengxinxiList[1].wupintupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"100%","lineHeight":"44px","fontSize":"18px","color":"#000","textAlign":"center"}'>{{juanzengxinxiList[1].wupinmingcheng}}</div>
			</div>
			<div v-if="juanzengxinxiList.length>2" @click="toDetail('juanzengxinxiDetail', juanzengxinxiList[2])" class="list-4-item animation-box item-3" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 10px","overflow":"hidden","borderRadius":"20px","flexWrap":"wrap","flexDirection":"column","background":"#fff","display":"flex","width":"210px","position":"relative","height":"auto"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"20px","height":"120px"}' v-if="juanzengxinxiList[2].wupintupian.substr(0,4)=='http'" :src="juanzengxinxiList[2].wupintupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"20px","height":"120px"}' v-else :src="baseUrl + (juanzengxinxiList[2].wupintupian?juanzengxinxiList[2].wupintupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"100%","lineHeight":"44px","fontSize":"18px","color":"#000","textAlign":"center"}'>{{juanzengxinxiList[2].wupinmingcheng}}</div>
			</div>
		</div>
		<div :style='{"margin":"10px 0 0","top":"0px","flexWrap":"wrap","display":"flex","width":"590px","position":"absolute","right":"-140px","height":"auto"}' class="list-4-body">
			<div v-if="juanzengxinxiList.length>3" @click="toDetail('juanzengxinxiDetail', juanzengxinxiList[3])" class="list-4-item animation-box item-4" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 10px","overflow":"hidden","borderRadius":"20px","background":"#fff","display":"inline-block","width":"auto","position":"relative","height":"auto"}'>
				<img :style='{"width":"220px","objectFit":"cover","borderRadius":"20px","height":"305px"}' v-if="juanzengxinxiList[3].wupintupian.substr(0,4)=='http'" :src="juanzengxinxiList[3].wupintupian.split(',')[0]" alt="" />
				<img :style='{"width":"220px","objectFit":"cover","borderRadius":"20px","height":"305px"}' v-else :src="baseUrl + (juanzengxinxiList[3].wupintupian?juanzengxinxiList[3].wupintupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"100%","lineHeight":"44px","fontSize":"18px","color":"#000","textAlign":"center"}'>{{juanzengxinxiList[3].wupinmingcheng}}</div>
			</div>
			<div v-if="juanzengxinxiList.length>4" @click="toDetail('juanzengxinxiDetail', juanzengxinxiList[4])" class="list-4-item animation-box item-5" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 20px","flexDirection":"column","display":"flex","right":"90px","overflow":"hidden","top":"0","borderRadius":"20px","flexWrap":"wrap","background":"#fff","width":"220px","position":"absolute","height":"auto"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"20px","height":"305px"}' v-if="juanzengxinxiList[4].wupintupian.substr(0,4)=='http'" :src="juanzengxinxiList[4].wupintupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"20px","height":"305px"}' v-else :src="baseUrl + (juanzengxinxiList[4].wupintupian?juanzengxinxiList[4].wupintupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"100%","lineHeight":"44px","fontSize":"18px","color":"#000","textAlign":"center"}'>{{juanzengxinxiList[4].wupinmingcheng}}</div>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	<div @click="moreBtn('juanzengxinxi')" :style='{"border":"0","margin":"0px auto","borderRadius":"10px","textAlign":"center","background":"#c7d4b9","bottom":"120px","display":"block","width":"150px","lineHeight":"50px","position":"absolute","right":"500px"}'>
		<span :style='{"color":"#333","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#333","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>


</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        systemIntroductionDetail: {},
        newsList: [],

        juanzengxinxiList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getSystemIntroduction();
      this.getList();
    },
    //方法集合
    methods: {
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 10,
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
			
			this.$http.get('juanzengxinxi/list', {params: {
				page: 1,
				limit: 6,
			}}).then(res => {
				if (res.data.code == 0) {
					this.juanzengxinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: scale(0.98) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: scale(0.95) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: scale(0.95) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
