[toc]
# 简介
eureka 服务注册中心
集群部署
# 打包 pom中配置了profiles 需要指定-P
## peer1 节点 略过测试编译和执行
mvn clean package -P peer1 -Dmaven.test.skip=true
## peer2 节点
mvn clean package -P peer2 -Dmaven.test.skip=true
## peer3 节点
mvn clean package -P peer3 -Dmaven.test.skip=true
# 部署
nohup java -jar eureka.server-peer1.jar 2>&1 &
nohup java -jar eureka.server-peer2.jar 2>&1 &
nohup java -jar eureka.server-peer3.jar 2>&1 &

# 访问
http://ip:8761/
http://ip:8762/
![注册中心](https://note.youdao.com/yws/public/resource/030c5ed1a14c969b99e35b06051c9f7a/xmlnote/C1198B87FEEB42498FEB2F469BCAB428/65138)
