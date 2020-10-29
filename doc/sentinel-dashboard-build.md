# 获取sentinel-dashboard镜像
docker pull bladex/sentinel-dashboard

# 启动
docker run --name sentinel -d -p 8858:8858 -p 8719:8719 bladex/sentinel-dashboard

# 登录
用户名/密码：sentinel/sentinel

# 解决镜像时间与服务器时间不一致
apk add tzdata
cp /usr/share/zoneinfo/PRC /etc/localtime