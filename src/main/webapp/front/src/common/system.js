export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除","审核"],"menu":"捐赠者","menuJump":"列表","tableName":"juanzengzhe"}],"menu":"捐赠者管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","审核"],"menu":"申领者","menuJump":"列表","tableName":"shenlingzhe"}],"menu":"申领者管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"物品分类","menuJump":"列表","tableName":"wupinfenlei"}],"menu":"物品分类管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除","审核","发布","捐赠处理"],"menu":"捐赠物品","menuJump":"列表","tableName":"juanzengwupin"}],"menu":"捐赠物品管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","修改","删除"],"menu":"捐赠处理","menuJump":"列表","tableName":"juanzengchuli"}],"menu":"捐赠处理管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","修改","删除","审核"],"menu":"申领物品","menuJump":"列表","tableName":"shenlingwupin"}],"menu":"申领物品管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除","审核"],"menu":"预约申领物品","menuJump":"列表","tableName":"yuyueshenlingwupin"}],"menu":"预约申领物品管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-service","buttons":["查看","修改","删除"],"menu":"线上交流","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","申领"],"menu":"捐赠信息列表","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看"],"menu":"捐赠物品","menuJump":"列表","tableName":"juanzengwupin"}],"menu":"捐赠物品管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","申领"],"menu":"捐赠信息列表","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"捐赠者","tableName":"juanzengzhe"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"申领物品","menuJump":"列表","tableName":"shenlingwupin"}],"menu":"申领物品管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"预约申领物品","menuJump":"列表","tableName":"yuyueshenlingwupin"}],"menu":"预约申领物品管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","申领"],"menu":"捐赠信息列表","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"申领者","tableName":"shenlingzhe"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
