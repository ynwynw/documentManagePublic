const config = {
    get() {
        return {
            url : process.env.VUE_APP_BASE_API_URL + process.env.VUE_APP_BASE_API + '/',
            name: process.env.VUE_APP_BASE_API,
			menuList:[
				{
					name: '新闻资讯管理',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'公告信息',
							url:'/index/newsList'
						},
					]
				},
				{
					name: '档案信息管理',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'档案信息',
							url:'/index/danganxinxiList'
						},
					]
				},
			]
        }
    },
    getProjectName(){
        return {
            projectName: "档案管理系统"
        } 
    }
}
export default config
