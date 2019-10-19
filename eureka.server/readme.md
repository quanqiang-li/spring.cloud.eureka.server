[toc]
# 简介
eureka 服务注册中心
集群部署
# 打包 
注册中心打一个包即可，把每个节点需要的配置文件都打进去
# 部署
使用参数
nohup java -jar eureka.server-peer1.jar>peer1.out 2>&1 &
nohup java -jar eureka.server-peer2.jar>peer2.out 2>&1 &
nohup java -jar eureka.server-peer3.jar>peer3.out 2>&1 &

# 访问
http://ip:8761/
http://ip:8762/
[请移步](http://note.youdao.com/noteshare?id=ba0e8777952b4c6da3afbc1fbed94e16&sub=1A532708788F4605B490E5AC633751BE)
