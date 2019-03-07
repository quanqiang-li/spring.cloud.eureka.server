[toc]
# 简介
eureka 服务注册中心
集群部署
# 打包
## peer1 节点
mvn clean package -P peer1
## peer2节点
mvn clean package -P peer2
# 部署
nohup java -jar eureka.server-peer1.jar 2>&1 &
nohup java -jar eureka.server-peer2.jar 2>&1 &

# 访问
http://ip:8761/  
http://ip:8762/
![注册中心](https://note.youdao.com/yws/public/resource/030c5ed1a14c969b99e35b06051c9f7a/xmlnote/C1198B87FEEB42498FEB2F469BCAB428/65138)
