> https://www.cnblogs.com/yui66/p/9728732.html
# docker mysql

    docker pull mysql
    docker run -di --name ginsan_mysql -p 33306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql
    
# in docker 

    docker exec -it ginsan_mysql /bin/bash
# mysql login 

    mysql -u root -p
    
# show mysql version 

    mysql> status;
    
# remote access

    GRANT ALL ON *.* TO 'root'@'%';
    	
    flush privileges