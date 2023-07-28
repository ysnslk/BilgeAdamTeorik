package com.sosyalmedya.config.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableCaching // Redis üzerinden cacheleme yapabilmek için spring cache i aktif ediyoruz.
@EnableRedisRepositories // Redis repositorylerini kullanabilmek için gerekli anatasyon
public class RedisConfig {
    //  @Value("${myapplication.redis.host}")
    // String redisHost;
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        return new LettuceConnectionFactory((new RedisStandaloneConfiguration("localhost", 6379)));
    }
}
