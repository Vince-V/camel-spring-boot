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
package org.apache.camel.component.atomix.client.multimap.springboot;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.annotation.Generated;
import io.atomix.catalyst.transport.Address;
import io.atomix.resource.ReadConsistency;
import org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action;
import org.apache.camel.component.atomix.client.multimap.AtomixMultiMapComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The atomix-multimap component is used to access Atomix's distributed multi
 * map.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.atomix-multimap")
public class AtomixMultiMapComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the atomix-multimap component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * The Atomix instance to use. The option is a io.atomix.Atomix type.
     */
    private String atomix;
    /**
     * The shared component configuration
     */
    private AtomixMultiMapConfigurationNestedConfiguration configuration;
    /**
     * The path to the AtomixClient configuration
     */
    private String configurationUri;
    /**
     * The default action.
     */
    private Action defaultAction = Action.PUT;
    /**
     * The key to use if none is set in the header or to listen for events for a
     * specific key. The option is a java.lang.Object type.
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
     * The nodes the AtomixClient should connect to
     */
    private List<Address> nodes;
    /**
     * The header that wil carry the result.
     */
    private String resultHeader;
    /**
     * The class name (fqn) of the Atomix transport
     */
    private String transportClassName = "io.atomix.catalyst.transport.netty.NettyTransport";
    /**
     * The resource ttl.
     */
    private Long ttl;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * The cluster wide default resource configuration. The option is a
     * java.util.Properties type.
     */
    private String defaultResourceConfig;
    /**
     * The local default resource options. The option is a java.util.Properties
     * type.
     */
    private String defaultResourceOptions;
    /**
     * Sets if the local member should join groups as PersistentMember or not.
     * If set to ephemeral the local member will receive an auto generated ID
     * thus the local one is ignored.
     */
    private Boolean ephemeral = false;
    /**
     * The read consistency level.
     */
    private ReadConsistency readConsistency;
    /**
     * Cluster wide resources configuration.
     */
    private Map<String, Properties> resourceConfigs;
    /**
     * Local resources configurations
     */
    private Map<String, Properties> resourceOptions;

    public String getAtomix() {
        return atomix;
    }

    public void setAtomix(String atomix) {
        this.atomix = atomix;
    }

    public AtomixMultiMapConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            AtomixMultiMapConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getConfigurationUri() {
        return configurationUri;
    }

    public void setConfigurationUri(String configurationUri) {
        this.configurationUri = configurationUri;
    }

    public Action getDefaultAction() {
        return defaultAction;
    }

    public void setDefaultAction(Action defaultAction) {
        this.defaultAction = defaultAction;
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

    public List<Address> getNodes() {
        return nodes;
    }

    public void setNodes(List<Address> nodes) {
        this.nodes = nodes;
    }

    public String getResultHeader() {
        return resultHeader;
    }

    public void setResultHeader(String resultHeader) {
        this.resultHeader = resultHeader;
    }

    public String getTransportClassName() {
        return transportClassName;
    }

    public void setTransportClassName(String transportClassName) {
        this.transportClassName = transportClassName;
    }

    public Long getTtl() {
        return ttl;
    }

    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getDefaultResourceConfig() {
        return defaultResourceConfig;
    }

    public void setDefaultResourceConfig(String defaultResourceConfig) {
        this.defaultResourceConfig = defaultResourceConfig;
    }

    public String getDefaultResourceOptions() {
        return defaultResourceOptions;
    }

    public void setDefaultResourceOptions(String defaultResourceOptions) {
        this.defaultResourceOptions = defaultResourceOptions;
    }

    public Boolean getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
    }

    public ReadConsistency getReadConsistency() {
        return readConsistency;
    }

    public void setReadConsistency(ReadConsistency readConsistency) {
        this.readConsistency = readConsistency;
    }

    public Map<String, Properties> getResourceConfigs() {
        return resourceConfigs;
    }

    public void setResourceConfigs(Map<String, Properties> resourceConfigs) {
        this.resourceConfigs = resourceConfigs;
    }

    public Map<String, Properties> getResourceOptions() {
        return resourceOptions;
    }

    public void setResourceOptions(Map<String, Properties> resourceOptions) {
        this.resourceOptions = resourceOptions;
    }

    public static class AtomixMultiMapConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.atomix.client.multimap.AtomixMultiMapConfiguration.class;
        /**
         * The default action.
         */
        private Action defaultAction = Action.PUT;
        /**
         * The key to use if none is set in the header or to listen for events
         * for a specific key.
         */
        private Object key;
        /**
         * The resource ttl.
         */
        private Long ttl;
        /**
         * The header that wil carry the result.
         */
        private String resultHeader;

        public Action getDefaultAction() {
            return defaultAction;
        }

        public void setDefaultAction(Action defaultAction) {
            this.defaultAction = defaultAction;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Long getTtl() {
            return ttl;
        }

        public void setTtl(Long ttl) {
            this.ttl = ttl;
        }

        public String getResultHeader() {
            return resultHeader;
        }

        public void setResultHeader(String resultHeader) {
            this.resultHeader = resultHeader;
        }
    }
}