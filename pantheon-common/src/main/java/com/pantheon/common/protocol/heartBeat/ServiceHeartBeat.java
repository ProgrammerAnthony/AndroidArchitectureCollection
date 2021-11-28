/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * $Id: DeleteTopicRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
package com.pantheon.common.protocol.heartBeat;


import com.pantheon.remoting.CommandCustomHeader;
import com.pantheon.remoting.annotation.CFNotNull;
import com.pantheon.remoting.exception.RemotingCommandException;
import com.pantheon.remoting.protocol.RemotingSerializable;

public class ServiceHeartBeat extends RemotingSerializable {
//todo add producer and consumer
    private String clientId;
    private String serviceName;
    private String serviceInstanceIp;
    private Integer serviceInstancePort;


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceInstanceIp() {
        return serviceInstanceIp;
    }

    public void setServiceInstanceIp(String serviceInstanceIp) {
        this.serviceInstanceIp = serviceInstanceIp;
    }

    public Integer getServiceInstancePort() {
        return serviceInstancePort;
    }

    public void setServiceInstancePort(Integer serviceInstancePort) {
        this.serviceInstancePort = serviceInstancePort;
    }
}