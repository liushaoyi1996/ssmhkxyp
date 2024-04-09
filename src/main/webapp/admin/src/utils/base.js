const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmhkxyp/",
            name: "ssmhkxyp",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmhkxyp/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园爱心捐赠系统"
        } 
    }
}
export default base
