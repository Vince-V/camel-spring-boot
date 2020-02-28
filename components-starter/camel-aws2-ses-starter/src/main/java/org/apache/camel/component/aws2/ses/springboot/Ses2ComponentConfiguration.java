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
package org.apache.camel.component.aws2.ses.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.component.aws2.ses.Ses2Component;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import software.amazon.awssdk.core.Protocol;
import software.amazon.awssdk.services.ses.SesClient;

/**
 * The aws2-ses component is used for sending emails with Amazon's SES service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws2-ses")
public class Ses2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws2-ses component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * To use the AmazonSimpleEmailService as the client. The option is a
     * software.amazon.awssdk.services.ses.SesClient type.
     */
    private String amazonSESClient;
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
     * To define a proxy host when instantiating the SES client
     */
    private String proxyHost;
    /**
     * To define a proxy port when instantiating the SES client
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the SES client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * The region in which SES client needs to work
     */
    private String region;
    /**
     * List of reply-to email address(es) for the message, override it using
     * 'CamelAwsSesReplyToAddresses' header.
     */
    private List<String> replyToAddresses;
    /**
     * The email address to which bounce notifications are to be forwarded,
     * override it using 'CamelAwsSesReturnPath' header.
     */
    private String returnPath;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * The subject which is used if the message header 'CamelAwsSesSubject' is
     * not present.
     */
    private String subject;
    /**
     * List of destination email address. Can be overriden with 'CamelAwsSesTo'
     * header.
     */
    private List<String> to;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * The AWS SES default configuration
     */
    private Ses2ConfigurationNestedConfiguration configuration;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAmazonSESClient() {
        return amazonSESClient;
    }

    public void setAmazonSESClient(String amazonSESClient) {
        this.amazonSESClient = amazonSESClient;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getReplyToAddresses() {
        return replyToAddresses;
    }

    public void setReplyToAddresses(List<String> replyToAddresses) {
        this.replyToAddresses = replyToAddresses;
    }

    public String getReturnPath() {
        return returnPath;
    }

    public void setReturnPath(String returnPath) {
        this.returnPath = returnPath;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Ses2ConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            Ses2ConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public static class Ses2ConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws2.ses.Ses2Configuration.class;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * To use the AmazonSimpleEmailService as the client
         */
        private SesClient amazonSESClient;
        /**
         * The sender's email address.
         */
        private String from;
        /**
         * To define a proxy host when instantiating the SES client
         */
        private String proxyHost;
        /**
         * To define a proxy port when instantiating the SES client
         */
        private Integer proxyPort;
        /**
         * To define a proxy protocol when instantiating the SES client
         */
        private Protocol proxyProtocol = Protocol.HTTPS;
        /**
         * The region in which SES client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id()
         */
        private String region;
        /**
         * List of reply-to email address(es) for the message, override it using
         * 'CamelAwsSesReplyToAddresses' header.
         */
        private List replyToAddresses;
        /**
         * The email address to which bounce notifications are to be forwarded,
         * override it using 'CamelAwsSesReturnPath' header.
         */
        private String returnPath;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * The subject which is used if the message header 'CamelAwsSesSubject'
         * is not present.
         */
        private String subject;
        /**
         * List of destination email address. Can be overriden with
         * 'CamelAwsSesTo' header.
         */
        private List to;

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public SesClient getAmazonSESClient() {
            return amazonSESClient;
        }

        public void setAmazonSESClient(SesClient amazonSESClient) {
            this.amazonSESClient = amazonSESClient;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public Protocol getProxyProtocol() {
            return proxyProtocol;
        }

        public void setProxyProtocol(Protocol proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public List getReplyToAddresses() {
            return replyToAddresses;
        }

        public void setReplyToAddresses(List replyToAddresses) {
            this.replyToAddresses = replyToAddresses;
        }

        public String getReturnPath() {
            return returnPath;
        }

        public void setReturnPath(String returnPath) {
            this.returnPath = returnPath;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public List getTo() {
            return to;
        }

        public void setTo(List to) {
            this.to = to;
        }
    }
}