package cn.redis;

import redis.clients.jedis.Jedis;

/**
 * @Auther:haha
 * @Date:2021/2/24 - 02 - 24 20:48
 * @Description:cn.redis
 * @Version: 1.0
 */
public class RedisJava {
    public static void main(String[] args) {
        //连接redis服务
        Jedis jedis =new Jedis("localhost",6379);//远程linux地址 默认端口 为 6379

        //密码
        jedis.auth("1234");

        //保存数据
        jedis.set("address","zjg");

        String name=jedis.get("address");

        System.out.println("地址"+name);
    }
}
