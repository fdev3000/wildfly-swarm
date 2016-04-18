/**
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.swarm.resourceadapters;

import java.io.File;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.container.LibraryContainer;
import org.jboss.shrinkwrap.api.container.ManifestContainer;
import org.jboss.shrinkwrap.api.container.ResourceAdapterContainer;
import org.jboss.shrinkwrap.api.container.ResourceContainer;
import org.wildfly.swarm.config.resource.adapters.ResourceAdapter;
import org.wildfly.swarm.config.resource.adapters.ResourceAdapterConsumer;

/**
 * @author Ralf Battenfeld
 */
public interface RARArchive extends Archive<RARArchive>, ManifestContainer<RARArchive>, LibraryContainer<RARArchive>, ResourceContainer<RARArchive>, ResourceAdapterContainer<RARArchive> {

    RARArchive resourceAdapter(final String key, final ResourceAdapterConsumer consumer);

    RARArchive resourceAdapter(final ResourceAdapter ra);

    RARArchive resourceAdapter(final File ironjacamarFile);
}