springboot-dubbox
基于spring-boot dubbox搭建的java分布式系统

前后端分离
管理前端项目https://github.com/zhangxd1989/springboot-dubbox-web
春天的安全性基于角色的权限管理
统一异常管理
弹簧数据redis的整合
整合招摇-UI接口文档，访问地址的http：//本地主机：8081 /招摇-ui.html
定时任务
爬虫
邮件发送
RabbitMQ的示例
多配置文件管理
Maven的项目管理
MyBatis的多数据源
的logback记录日志
客户端用户注册，登录，修改信息，上传头像，忘记密码接口
接口访问次数限制
okhttp3第三方接口调用
德鲁伊sql监控

项目依赖的Mysql，动物园管理员，Redis的
平台管理员，网站为管理平台接口
平台的移动客户端为移动客户端接口
平台系统为服务提供者
在application.yml中配置数据库连接，Redis的连接及网络访问端口
执行数据库脚本中的数据库初始化脚本
在pom.xml中中配置饲养员连接地址
启动SysProviderApplication后分别启动ClientMobileApplication和WebAdminApplication
