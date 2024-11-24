# Docker

```bash
docker build -t qbit .

docker logs funny_haibt
docker rm funny_haibt

docker ps
docker container ls --all

docker run --privileged -d -v /your/config/path/:/config -v /your/downloads/path/:/downloads -e "VPN_ENABLED=no" -e "LAN_NETWORK=192.168.1.1/24" -e "NAME_SERVERS=8.8.8.8,8.8.4.4" -p 8080:8080 -p 8999:8999 -p 8999:8999/udp qbit


# access an interactive terminal in the container
docker exec -it <nameOfContainer> bash

# create a new version of the image, keeping the changes made.
docker commit <containerId>

# 
docker volume prune
docker volume inspect <volumeName>

```