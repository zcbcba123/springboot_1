# springboot_1
备份记录
使用方法:(不用配置tomcat)
打开MyMainApplication，点击左侧的run三角
然后在浏览器输入http://localhost:8080/hello

部署到服务器(服务器也不用配置tomcat)
直接用maven里的package构建个jar包，然后把jar包放到服务器运行该jar包就可以了
在服务端使用java -jar spring-boot-01....jar就可以运行该jar包了。该jar包生成的位置是在项目的target下(该路径地址在package后有log打印)
