/*
 * -----------------------------------------------------------------------\
 * SilverWare
 *  
 * Copyright (C) 2010 - 2013 the original author or authors.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -----------------------------------------------------------------------/
 */
package org.silverware.microservices;

import org.silverware.microservices.providers.MicroserviceProvider;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Martin Večeřa <marvenec@gmail.com>
 */
public class Context {

   public static final String MICROSERVICE_PROVIDERS_REGISTRY = "silverware.providers.registry";
   public static final String DEPLOYMENT_PACKAGES = "silverware.deploy.packages";

   private final Map<String, Object> properties = new HashMap<>();

   public Context() {
      properties.put(MICROSERVICE_PROVIDERS_REGISTRY, new HashMap<String, MicroserviceProvider>());
   }

   public Map<String, Object> getProperties() {
      return properties;
   }

   @SuppressWarnings("unchecked")
   public Map<String, MicroserviceProvider> getProvidersRegistry() {
      return (Map<String, MicroserviceProvider>) properties.get(MICROSERVICE_PROVIDERS_REGISTRY);
   }
}