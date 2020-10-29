# 获取sentinel-dashboard镜像
docker pull bladex/sentinel-dashboard

# 启动
docker run --name sentinel -d -p 8858:8858 bladex/sentinel-dashboard

# 登录
用户名/密码：sentinel/sentinel