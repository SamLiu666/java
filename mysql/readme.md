## 进度

| 创建成绩单 | 完成   2020/4/22 |
| ---------- | ---------------- |
|            |                  |
|            |                  |
|            |                  |



## 操作环境

**ubuntu 18 虚拟机**

## 尝试数据库

```shell
#安装 MySQL 服务端、核心程序
sudo apt-get install mysql-server

#安装 MySQL 客户端
sudo apt-get install mysql-client          

# 进入root
sudo su 

# 启动数据库
sudo service mysql start   

# 进入数据库
sudo service mysql start

show databases;

```

## 创建数据库

```mysql
mysql> CREATE DATABASE mysql_shiyan;
Query OK, 1 row affected (0.00 sec)

mysql> use mysql_shiyan;
Database changed

CREATE TABLE 表的名字
(
列名a 数据类型(数据长度),
列名b 数据类型(数据长度)，
列名c 数据类型(数据长度)
);

show tables;

mysql> SELECT * FROM employee;
Empty set (0.00 sec)

```
**数据类型**

|          |            |                  |                   |
| -------- | ---------- | ---------------- | ----------------- |
| 数据类型 | 大小(字节) | 用途             | 格式              |
| INT      | 4          | 整数             |                   |
| FLOAT    | 4          | 单精度浮点数     |                   |
| DOUBLE   | 8          | 双精度浮点数     |                   |
| ENUM     | --         | 单选,比如性别    | ENUM('a','b','c') |
| SET      | --         | 多选             | SET('1','2','3')  |
| DATE     | 3          | 日期             | YYYY-MM-DD        |
| TIME     | 3          | 时间点或持续时间 | HH:MM:SS          |
| YEAR     | 1          | 年份值           | YYYY              |
| CHAR     | 0~255      | 定长字符串       |                   |
| VARCHAR  | 0~255      | 变长字符串       |                   |
| TEXT     | 0~65535    | 长文本数据       |                   |

**CHAR 和 VARCHAR 的区别:** CHAR 的长度是固定的，而 VARCHAR 的长度是可以变化的，比如，存储字符串 “abc"，对于 CHAR(10)，表示存储的字符将占 10 个字节(包括 7 个空字符)，而同样的 VARCHAR(12) 则只占用4个字节的长度，`增加一个额外字节来存储字符串本身的长度`，12 只是最大值，当你存储的字符小于 12 时，按实际长度存储。

**ENUM和SET的区别:** ENUM 类型的数据的值，必须是定义时枚举的值的其中之一，即单选，而 SET 类型的值则可以多选。

```mysql
# 插入语句
mysql> INSERT INTO employee(id, name, phone) VALUES(01, 'Sam', 111111111);
Query OK, 1 row affected (0.01 sec)
mysql>  INTO employee VALUES(02, 'Peter', 123456789);
Query OK, 1 row affected (0.00 sec)
mysql> INSERT INTO employee(id, name) VALUES(03, 'Rose');

# 查看数据表
mysql> SELECT * FROM employee;
+------+-------+-----------+
| id   | name  | phone     |
+------+-------+-----------+
|    1 | Sam   | 111111111 |
|    2 | Peter | 123456789 |
|    4 | Jack  | 123456789 |
|    3 | Rose  |      NULL |
+------+-------+-----------+
4 rows in set (0.00 sec)
```

## 数据库约束

| 约束类型： | 主键        | 默认值  | 唯一   | 外键        | 非空     |
| ---------- | ----------- | ------- | ------ | ----------- | -------- |
| 关键字：   | PRIMARY KEY | DEFAULT | UNIQUE | FOREIGN KEY | NOT NULL |

**外键** FOREIGN KEY 既能确保数据完整性，也能表现表之间的关系