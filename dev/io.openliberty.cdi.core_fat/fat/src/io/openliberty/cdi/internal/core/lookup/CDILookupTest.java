/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.cdi.internal.core.lookup;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import componenttest.annotation.TestServlet;
import componenttest.custom.junit.runner.FATRunner;
import componenttest.topology.impl.LibertyServer;
import io.openliberty.cdi.internal.core.FATSuite;
import io.openliberty.cdi.internal.core.lookup.app.CDILookupTestServlet;

@RunWith(FATRunner.class)
public class CDILookupTest {

    @TestServlet(contextRoot = "cdiLookup", servlet = CDILookupTestServlet.class)
    public static LibertyServer server;

    @BeforeClass
    public static void setup() throws Exception {
        server = FATSuite.server;

        Package appPackage = CDILookupTestServlet.class.getPackage();
        WebArchive war = ShrinkWrap.create(WebArchive.class, "cdiLookup.war")
                                   .addPackage(appPackage)
                                   .addAsWebInfResource(appPackage, "beans.xml", "beans.xml");

        FATSuite.deployApp(server, war);
    }

    @AfterClass
    public static void teardown() throws Exception {
        FATSuite.removeApp(server, "cdiLookup.war");
    }

}
