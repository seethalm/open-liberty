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
package com.ibm.ws.test.client.stub;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-09-04T15:11:57.281+08:00
 * Generated source version: 2.6.2
 *
 */
@WebServiceClient(name = "ImageServiceImplService",
                  wsdlLocation = "http://localhost:8010/webServiceRefFeatures/ImageServiceImplService?wsdl",
                  targetNamespace = "http://jaxws.service/")
public class ImageServicePropertyImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://jaxws.service/", "ImageServiceImplService");
    public final static QName ImageServiceImplPort = new QName("http://jaxws.service/", "ImageServiceImplPort");
    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ImageServicePropertyImplService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8010/webServiceRefFeatures/ImageServiceImplService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ImageServicePropertyImplService.class.getName()).log(java.util.logging.Level.INFO,
                                                                                                    "Can not initialize the default wsdl from {0}", "wsdl.xml");
        }
        WSDL_LOCATION = url;
    }

    public ImageServicePropertyImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ImageServicePropertyImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageServicePropertyImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *         returns ImageService
     */
    @WebEndpoint(name = "ImageServiceImplPort")
    public ImageService getImageServiceImplPort() {
        return super.getPort(ImageServiceImplPort, ImageService.class);
    }

    /**
     *
     * @param features
     *                     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in the <code>features</code> parameter will have their
     *                     default
     *                     values.
     * @return
     *         returns ImageService
     */
    @WebEndpoint(name = "ImageServiceImplPort")
    public ImageService getImageServiceImplPort(WebServiceFeature... features) {
        return super.getPort(ImageServiceImplPort, ImageService.class, features);
    }

}
