/*

*  Copyright (C) 2017, University of the Basque Country (UPV/EHU)
*
* Contact for licensing options: <licensing-mcpttclient(at)mcopenplatform(dot)com>
*
* This file is part of MCOP MCPTT Client
*
* This is free software: you can redistribute it and/or modify it under the terms of
* the GNU General Public License as published by the Free Software Foundation, either version 3
* of the License, or (at your option) any later version.
*
* This is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License along
* with this program; if not, write to the Free Software Foundation, Inc.,
* 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/


package org.doubango.ngn.datatype.mcpttloc;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;




@Root(strict=false, name = "tGeographicalAreaChange")
public class TGeographicalAreaChange {

    @Element(required=false,name = "AnyAreaChange")
    protected TEmptyTypeAttribute anyAreaChange;
    @Element(required=false,name = "EnterSpecificAreaType")
    protected TSpecificAreaType enterSpecificAreaType;
    @Element(required=false,name = "ExitSpecificAreaType")
    protected TSpecificAreaType exitSpecificAreaType;
    
    


    public TEmptyTypeAttribute getAnyAreaChange() {
        return anyAreaChange;
    }


    public void setAnyAreaChange(TEmptyTypeAttribute value) {
        this.anyAreaChange = value;
    }


    public TSpecificAreaType getEnterSpecificAreaType() {
        return enterSpecificAreaType;
    }


    public void setEnterSpecificAreaType(TSpecificAreaType value) {
        this.enterSpecificAreaType = value;
    }


    public TSpecificAreaType getExitSpecificAreaType() {
        return exitSpecificAreaType;
    }


    public void setExitSpecificAreaType(TSpecificAreaType value) {
        this.exitSpecificAreaType = value;
    }

}