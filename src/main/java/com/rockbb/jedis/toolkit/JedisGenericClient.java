package com.rockbb.jedis.toolkit;

import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;
import redis.clients.jedis.params.SetParams;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface JedisGenericClient {

    Object eval(final String script, final int keyCount, final String... params);

    List<String> blpop(int timeout, String key);

    List<String> blpop(int timeout, String... keys);

    List<byte[]> blpop(int timeout, byte[]... keys);

    List<String> brpop(int timeout, String key);

    List<String> brpop(int timeout, String... keys);

    List<byte[]> brpop(int timeout, byte[]... keys);

    Long del(String key);

    Long del(String... keys);

    Long exists(String... keys);

    Boolean exists(String key);

    Long expire(byte[] key, int seconds);

    String get(String key);

    byte[] get(byte[] key);

    Long hdel(String key, String... fields);

    byte[] hget(byte[] key, byte[] field);

    Map<byte[], byte[]> hgetAll(byte[] key);

    Long hlen(byte[] key);

    Long hset(byte[] key, byte[] field, byte[] value);

    Long llen(String key);

    Long lpush(String key, String... strings);

    Long pttl(final String key);

    Long rpush(String key, String... strings);

    ScanResult<byte[]> scan(byte[] cursor);

    ScanResult<byte[]> scan(byte[] cursor, ScanParams params);

    String set(String key, String value);

    String set(byte[] key, byte[] value);

    String set(String key, String value, SetParams params);

    String set(byte[] key, byte[] value, SetParams params);

    String setex(String key, int seconds, String value);

    String setex(byte[] key, int seconds, byte[] value);

    Long sadd(String key, String... members);

    Set<String> smembers(String key);

    Boolean sismember(String key, String member);

    String spop(String key);

    Long srem(String key, String... members);

    Long ttl(final String key);

    Long ttl(byte[] key);

    Long zcard(byte[] key);

    Set<byte[]> zrange(byte[] key, long start, long stop);

    Long zrem(byte[] key, byte[]... members);
}