/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.caffeine.cache.springboot;

import javax.annotation.Generated;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.CacheLoader;
import com.github.benmanes.caffeine.cache.RemovalListener;
import com.github.benmanes.caffeine.cache.stats.StatsCounter;
import org.apache.camel.component.caffeine.EvictionType;
import org.apache.camel.component.caffeine.cache.CaffeineCacheComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The caffeine-cache component is used for integration with Caffeine Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.caffeine-cache")
public class CaffeineCacheComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the caffeine-cache component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * To configure the default cache action. If an action is set in the message
     * header, then the operation from the header takes precedence.
     */
    private String action;
    /**
     * To configure an already instantiated cache to be used. The option is a
     * com.github.benmanes.caffeine.cache.Cache type.
     */
    private String cache;
    /**
     * To configure a CacheLoader in case of a LoadCache use. The option is a
     * com.github.benmanes.caffeine.cache.CacheLoader type.
     */
    private String cacheLoader;
    /**
     * Configure if a cache need to be created if it does exist or can't be
     * pre-configured.
     */
    private Boolean createCacheIfNotExist = true;
    /**
     * Set the eviction Type for this cache
     */
    private EvictionType evictionType = EvictionType.SIZE_BASED;
    /**
     * Set the expire After Access Time in case of time based Eviction (in
     * seconds)
     */
    private Integer expireAfterAccessTime = 300;
    /**
     * Set the expire After Access Write in case of time based Eviction (in
     * seconds)
     */
    private Integer expireAfterWriteTime = 300;
    /**
     * Set the initial Capacity for the cache
     */
    private Integer initialCapacity = 10000;
    /**
     * To configure the default action key. If a key is set in the message
     * header, then the key from the header takes precedence. The option is a
     * java.lang.Object type.
     */
    private String key;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Set the maximum size for the cache
     */
    private Integer maximumSize = 10000;
    /**
     * Set a specific removal Listener for the cache. The option is a
     * com.github.benmanes.caffeine.cache.RemovalListener type.
     */
    private String removalListener;
    /**
     * Set a specific Stats Counter for the cache stats. The option is a
     * com.github.benmanes.caffeine.cache.stats.StatsCounter type.
     */
    private String statsCounter;
    /**
     * To enable stats on the cache
     */
    private Boolean statsEnabled = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Sets the global component configuration
     */
    private CaffeineConfigurationNestedConfiguration configuration;
    /**
     * The cache key type, default java.lang.Object
     */
    private String keyType;
    /**
     * The cache value type, default java.lang.Object
     */
    private String valueType;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getCacheLoader() {
        return cacheLoader;
    }

    public void setCacheLoader(String cacheLoader) {
        this.cacheLoader = cacheLoader;
    }

    public Boolean getCreateCacheIfNotExist() {
        return createCacheIfNotExist;
    }

    public void setCreateCacheIfNotExist(Boolean createCacheIfNotExist) {
        this.createCacheIfNotExist = createCacheIfNotExist;
    }

    public EvictionType getEvictionType() {
        return evictionType;
    }

    public void setEvictionType(EvictionType evictionType) {
        this.evictionType = evictionType;
    }

    public Integer getExpireAfterAccessTime() {
        return expireAfterAccessTime;
    }

    public void setExpireAfterAccessTime(Integer expireAfterAccessTime) {
        this.expireAfterAccessTime = expireAfterAccessTime;
    }

    public Integer getExpireAfterWriteTime() {
        return expireAfterWriteTime;
    }

    public void setExpireAfterWriteTime(Integer expireAfterWriteTime) {
        this.expireAfterWriteTime = expireAfterWriteTime;
    }

    public Integer getInitialCapacity() {
        return initialCapacity;
    }

    public void setInitialCapacity(Integer initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Integer getMaximumSize() {
        return maximumSize;
    }

    public void setMaximumSize(Integer maximumSize) {
        this.maximumSize = maximumSize;
    }

    public String getRemovalListener() {
        return removalListener;
    }

    public void setRemovalListener(String removalListener) {
        this.removalListener = removalListener;
    }

    public String getStatsCounter() {
        return statsCounter;
    }

    public void setStatsCounter(String statsCounter) {
        this.statsCounter = statsCounter;
    }

    public Boolean getStatsEnabled() {
        return statsEnabled;
    }

    public void setStatsEnabled(Boolean statsEnabled) {
        this.statsEnabled = statsEnabled;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public CaffeineConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            CaffeineConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public static class CaffeineConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.caffeine.CaffeineConfiguration.class;
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         */
        private String action;
        /**
         * To configure an already instantiated cache to be used
         */
        private Cache cache;
        /**
         * To configure a CacheLoader in case of a LoadCache use
         */
        private CacheLoader cacheLoader;
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         */
        private Boolean createCacheIfNotExist = true;
        /**
         * Set the eviction Type for this cache
         */
        private EvictionType evictionType = EvictionType.SIZE_BASED;
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds)
         */
        private Integer expireAfterAccessTime = 300;
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds)
         */
        private Integer expireAfterWriteTime = 300;
        /**
         * Set the initial Capacity for the cache
         */
        private Integer initialCapacity = 10000;
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         */
        private Object key;
        /**
         * The cache key type, default java.lang.Object
         */
        private String keyType;
        /**
         * Set the maximum size for the cache
         */
        private Integer maximumSize = 10000;
        /**
         * Set a specific removal Listener for the cache
         */
        private RemovalListener removalListener;
        /**
         * Set a specific Stats Counter for the cache stats
         */
        private StatsCounter statsCounter;
        /**
         * To enable stats on the cache
         */
        private Boolean statsEnabled = false;
        /**
         * The cache value type, default java.lang.Object
         */
        private String valueType;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Cache getCache() {
            return cache;
        }

        public void setCache(Cache cache) {
            this.cache = cache;
        }

        public CacheLoader getCacheLoader() {
            return cacheLoader;
        }

        public void setCacheLoader(CacheLoader cacheLoader) {
            this.cacheLoader = cacheLoader;
        }

        public Boolean getCreateCacheIfNotExist() {
            return createCacheIfNotExist;
        }

        public void setCreateCacheIfNotExist(Boolean createCacheIfNotExist) {
            this.createCacheIfNotExist = createCacheIfNotExist;
        }

        public EvictionType getEvictionType() {
            return evictionType;
        }

        public void setEvictionType(EvictionType evictionType) {
            this.evictionType = evictionType;
        }

        public Integer getExpireAfterAccessTime() {
            return expireAfterAccessTime;
        }

        public void setExpireAfterAccessTime(Integer expireAfterAccessTime) {
            this.expireAfterAccessTime = expireAfterAccessTime;
        }

        public Integer getExpireAfterWriteTime() {
            return expireAfterWriteTime;
        }

        public void setExpireAfterWriteTime(Integer expireAfterWriteTime) {
            this.expireAfterWriteTime = expireAfterWriteTime;
        }

        public Integer getInitialCapacity() {
            return initialCapacity;
        }

        public void setInitialCapacity(Integer initialCapacity) {
            this.initialCapacity = initialCapacity;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public String getKeyType() {
            return keyType;
        }

        public void setKeyType(String keyType) {
            this.keyType = keyType;
        }

        public Integer getMaximumSize() {
            return maximumSize;
        }

        public void setMaximumSize(Integer maximumSize) {
            this.maximumSize = maximumSize;
        }

        public RemovalListener getRemovalListener() {
            return removalListener;
        }

        public void setRemovalListener(RemovalListener removalListener) {
            this.removalListener = removalListener;
        }

        public StatsCounter getStatsCounter() {
            return statsCounter;
        }

        public void setStatsCounter(StatsCounter statsCounter) {
            this.statsCounter = statsCounter;
        }

        public Boolean getStatsEnabled() {
            return statsEnabled;
        }

        public void setStatsEnabled(Boolean statsEnabled) {
            this.statsEnabled = statsEnabled;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }
    }
}