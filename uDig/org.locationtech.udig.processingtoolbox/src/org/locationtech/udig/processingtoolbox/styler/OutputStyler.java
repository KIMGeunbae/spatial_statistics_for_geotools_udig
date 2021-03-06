/*
 * uDig - User Friendly Desktop Internet GIS client
 * (C) MangoSystem - www.mangosystem.com 
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * (http://www.eclipse.org/legal/epl-v10.html), and the Refractions BSD
 * License v1.0 (http://udig.refractions.net/files/bsd3-v10.html).
 */
package org.locationtech.udig.processingtoolbox.styler;

import org.geotools.styling.Style;

/**
 * Output Styler
 * 
 * @author Minpa Lee, MangoSystem
 * 
 * @source $URL$
 */
public abstract class OutputStyler {

    // OutputStyler styler = OutputStylerFactory.getStyler(source, "LISA");

    protected Object source;

    public OutputStyler(Object source) {
        this.source = source;
    }

    public abstract Style getStyle();

}
