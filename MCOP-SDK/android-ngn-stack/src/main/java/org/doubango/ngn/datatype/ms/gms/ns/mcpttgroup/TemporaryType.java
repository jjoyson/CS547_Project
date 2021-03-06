/*
 *
 *   Copyright (C) 2018, University of the Basque Country (UPV/EHU)
 *
 *  Contact for licensing options: <licensing-mcpttclient(at)mcopenplatform(dot)com>
 *
 *  This file is part of MCOP MCPTT Client
 *
 *  This is free software: you can redistribute it and/or modify it under the terms of
 *  the GNU General Public License as published by the Free Software Foundation, either version 3
 *  of the License, or (at your option) any later version.
 *
 *  This is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */




package org.doubango.ngn.datatype.ms.gms.ns.mcpttgroup;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * <p>Clase Java para temporaryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="temporaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constituent-MCPTT-group-IDs" type="{urn:3gpp:ns:mcpttGroupInfo:1.0}constituentMCPTTgroupTypeIDsType"/>
 *         &lt;element name="anyExt" type="{urn:3gpp:ns:mcpttGroupInfo:1.0}anyExtType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Root(strict=false, name = "temporaryType")
public class TemporaryType {

    @Element( required = false, name = " constituent-MCPTT-group-IDs")
    protected ConstituentMCPTTgroupTypeIDsType constituentMCPTTGroupIDs;


    /**
     * Obtiene el valor de la propiedad constituentMCPTTGroupIDs.
     * 
     * @return
     *     possible object is
     *     {@link ConstituentMCPTTgroupTypeIDsType }
     *     
     */
    public ConstituentMCPTTgroupTypeIDsType getConstituentMCPTTGroupIDs() {
        return constituentMCPTTGroupIDs;
    }

    /**
     * Define el valor de la propiedad constituentMCPTTGroupIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstituentMCPTTgroupTypeIDsType }
     *     
     */
    public void setConstituentMCPTTGroupIDs(ConstituentMCPTTgroupTypeIDsType value) {
        this.constituentMCPTTGroupIDs = value;
    }


}
