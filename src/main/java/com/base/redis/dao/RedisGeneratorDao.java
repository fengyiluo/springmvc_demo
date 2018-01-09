/**
 * com.gmq.tech.com
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package com.base.redis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;

/**
 * redis 对象持久化层操作
 * @author admin
 * @version $Id RedisGeneratorDao.java, v 0.1 2017-11-12 20:26 admin Exp $$
 */
public class RedisGeneratorDao<K extends Serializable, V extends Serializable> {
    @Autowired
    protected RedisTemplate<K, V> redisTemplate;

    /**
     * Getter method for property <tt>redisTemplate</tt>.
     *
     * @return property value of redisTemplate
     */
    public RedisTemplate<K, V> getRedisTemplate() {
        return redisTemplate;
    }

    /**
     * Setter method for property <tt>redisTemplate</tt>.
     *
     * @param redisTemplate value to be assigned to property redisTemplate
     */
    public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
