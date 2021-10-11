# 什么是redis

Redis 是完全开源免费的，是一个高性能的key-value内存数据库，读的速度是110000次/s,写的速度是81000次/s  

它有以下三个特点：

Redis不仅仅支持简单的key-value类型的数据，同时还提供list，set，zset，hash等数据结构的存储。

Redis支持数据的持久化，可以将内存中的数据保存在磁盘中，重启的时候可以再次加载进行使用。

Redis的所有操作都是原子性的，意思就是要么成功执行要么失败完全不执行 。

Redis还支持 publish/subscribe, 通知, key 过期等特性 。



## 安装

**下载地址：**https://redis.io/download。

Redis 支持 32 位和 64 位。这个需要根据你系统平台的实际情况选择，这里我们下载 **Redis-x64-xxx.zip**压缩包到 C 盘，解压后，将文件夹重新命名为 **redis**。

启动服务器，并且使用客户端程序连接服务器

通过命令 info 查看所有的信息

通过命令 config get * 查看所有配置信息



## 数据类型

Redis支持五种数据类型：string（字符串），hash（哈希），list（列表），set（集合）及zset(有序集合)

通过简单的命令

Set key 

设置值

Get key

得到值

Keys 规则

得到指定规则的key

Del key

删除key 



## 字符串命令

SET key value 

设置指定 key 的值 

GET key 

获取指定 key 的值。 

GETRANGE key start end 

返回 key 中字符串值的子字符 
 GETSET key value
 将给定 key 的值设为 value ，并返回 key 的旧值(old value)。

MGET key1 [key2..]
 获取所有(一个或多个)给定 key 的值。

SETEX key seconds value
 将值 value 关联到 key ，并将 key 的过期时间设为 seconds (以秒为单位)。

SETNX key value
 只有在 key 不存在时设置 key 的值。 

SETRANGE key offset value
 用 value 参数覆写给定 key 所储存的字符串值，从偏移量 offset 开始。 

STRLEN key
 返回 key 所储存的字符串值的长度。 

MSET key value [key value ...]
同时设置一个或多个 key-value 对。 

MSETNX key value [key value ...] 
 同时设置一个或多个 key-value 对，当且仅当所有给定 key 都不存在。 

PSETEX key milliseconds value
 这个命令和 SETEX 命令相似，但它以毫秒为单位设置 key 的生存时间。

INCR key
 将 key 中储存的数字值增一。 

INCRBY key increment
 将 key 所储存的值加上给定的增量值（increment） 。 

DECR key
 将 key 中储存的数字值减一。 

DECRBY key decrement
 key 所储存的值减去给定的减量值（decrement） 。 

APPEND key value
 如果 key 已经存在并且是一个字符串， APPEND 命令将 指定value 追加到改 key 原来的值（value）的末尾。



## hash命令

HMSET key name bwf

设置一个键为name值为bwf

HGET key field 
 获取存储在哈希表中指定字段的值。

HKEYS key 
 获取所有哈希表中的字段 

HLEN key 
 获取哈希表中字段的数量

HDEL key field1 [field2] 
 删除一个或多个哈希表字段

HGETALL key 
 获取在哈希表中指定 key 的所有字段和值

HMSET key field1 value1 [field2 value2 ] 
 同时将多个 field-value (域-值)对设置到哈希表 key 中。

HSETNX key field value 
 只有在字段 field 不存在时，设置哈希表字段的值。 

HVALS key 
 获取哈希表中所有值



## list命令

RPUSH key value1 

在列表中添加值

LSET key index value 
 通过索引设置列表元素的值

LINSERT key BEFORE|AFTER pivot value 
 在列表的元素前或者后插入元素 

LINDEX key index 
 通过索引获取列表中的元素 

LPUSH key value1 
 将一个值插入到列表头部

LRANGE key start stop 
 获取列表指定范围内的元素 -1为所有值

LPOP key 
 移出并获取列表的第一个元素 

RPOP key 
 移除并获取列表最后一个元素 

RPOPLPUSH source destination 
 移除列表的最后一个元素，并将该元素添加到另一个列表并返回 

LREM key count value 
 移除列表元素 

BLPOP key1 [key2 ] timeout 
 移出并获取列表的第一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止。

BRPOP key1 [key2 ] timeout 
 移出并获取列表的最后一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止。



## set命令

SADD key member1 [member2] 
向集合添加一个或多个成员 

SCARD key 
 获取集合的成员数 

SMEMBERS key 
 返回集合中的所有成员 

SRANDMEMBER key [count] 
 返回集合中一个或多个随机数

SREM key member1 [member2] 
 移除集合中一个或多个成员 

SPOP key 
 移除并返回集合中的一个随机元素

SDIFF key1 [key2]



## 有序set命令

ZREVRANGE key start stop [WITHSCORES] 
 返回有序集中指定区间内的成员，通过索引，分数从高到底

ZREVRANGEBYSCORE key max min [WITHSCORES] 
 返回有序集中指定分数区间内的成员，分数从高到低排序 

ZREVRANK key member 
 返回有序集合中指定成员的排名，有序集成员按分数值递减(从大到小)排序

ZSCORE key member 
 返回有序集中，成员的分数值 
 ZUNIONSTORE destination numkeys key [key ...] 
 计算给定的一个或多个有序集的并集，并存储在新的 key 中

ZINTERSTORE destination numkeys key [key ...] 
 计算给定的一个或多个有序集的交集并将结果集存储在新的有序集合 key 中 



## 服务器命令

CLIENT LIST 
 获取连接到服务器的客户端连接列表 
 CLIENT KILL [ip:port] [ID client-id] 
 关闭客户端连接
 CONFIG SET parameter value 
 修改 redis 配置参数，无需重启
 DBSIZE 
 返回当前数据库的 key 的数量

DEBUG SEGFAULT 
 让 Redis 服务崩溃

FLUSHALL 
 删除所有数据库的所有key
 FLUSHDB 
 删除当前数据库的所有key

LASTSAVE 
 返回最近一次 Redis 成功将数据保存到磁盘上的时间，以 UNIX 时间戳格式表示

SAVE 
 同步保存数据到硬盘 

BGSAVE 
 在后台异步保存当前数据库的数据到磁盘



# jedis的使用

~~~java
public class RedisJava { public static void main(String[] args) { 
//连接本地的 Redis 服务 
Jedis jedis = new Jedis("localhost"); 
System.out.println("连接成功"); 
//查看服务是否运行 
System.out.println("服务正在运行: "+jedis.ping()); 
} 
} 

~~~

API操作参考命令部分



对象的保存操作

序列化

~~~java
 public static byte [] serialize(Object obj){
        ObjectOutputStream obi=null;
        ByteArrayOutputStream bai=null;
        try {
            bai=new ByteArrayOutputStream();
            obi=new ObjectOutputStream(bai);
            obi.writeObject(obj);
            byte[] byt=bai.toByteArray();
            return byt;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
~~~



反序列化

~~~java
public static Object unserizlize(byte[] byt){
        ObjectInputStream oii=null;
        ByteArrayInputStream bis=null;
        bis=new ByteArrayInputStream(byt);
        try {
            oii=new ObjectInputStream(bis);
            Object obj=oii.readObject();
            return obj;
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    
        
        return null;
    }
~~~



