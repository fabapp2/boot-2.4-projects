docker-compose -f docker/docker-compose.yaml down  --remove-orphans
docker-compose -f docker/docker-compose.yaml up -d
mvn clean package spring-boot:run
docker exec -it docker_mysql_1 mysql -u db_user --password=db_pw
docker exec -it docker_mysql_1 mysqldump -u db_user -p -d springboot24