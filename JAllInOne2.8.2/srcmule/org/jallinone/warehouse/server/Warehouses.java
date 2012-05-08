package org.jallinone.warehouse.server;

import org.openswing.swing.server.*;
import java.io.*;
import java.util.*;

import org.openswing.swing.message.receive.java.*;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.message.send.java.LookupValidationParams;

import java.sql.*;
import org.openswing.swing.logger.server.*;
import org.jallinone.warehouse.java.*;
import org.jallinone.system.server.*;

import java.math.*;
import org.jallinone.events.server.*;
import org.jallinone.events.server.*;


/**
 * <p>Title: JAllInOne ERP/CRM application</p>
 * * <p>Description: Bean used to manage warehouses.</p>
 * <p>Copyright: Copyright (C) 2006 Mauro Carniel</p>
 *
 * <p> This file is part of JAllInOne ERP/CRM application.
 * This application is free software; you can redistribute it and/or
 * modify it under the terms of the (LGPL) Lesser General Public
 * License as published by the Free Software Foundation;
 *
 *                GNU LESSER GENERAL PUBLIC LICENSE
 *                 Version 2.1, February 1999
 *
 * This application is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 *       The author may be contacted at:
 *           maurocarniel@tin.it</p>
 *
 * @author Mauro Carniel
 * @version 1.0
 */
@javax.jws.WebService
public interface Warehouses {

  public VOResponse deleteWarehouse(WarehousePK pk,String serverLanguageId,String username) throws Throwable;

  public VOResponse insertWarehouse(WarehouseVO vo,String serverLanguageId,String username,ArrayList companiesList,ArrayList customizedFields) throws Throwable;

  public VOListResponse loadStoredSerialNumbers(GridParams gridPars,String serverLanguageId,String username) throws Throwable;

  public VOResponse loadWarehouse(WarehousePK pk,String serverLanguageId,String username,ArrayList customizedFields) throws Throwable;

  public VOListResponse loadWarehouses(GridParams gridPars,String serverLanguageId,String username,ArrayList companiesList) throws Throwable;

  public VOResponse updateWarehouse(WarehouseVO oldVO,WarehouseVO newVO,String serverLanguageId,String username,ArrayList customizedFields) throws Throwable;

  public VOListResponse validateStoredSerialNumber(LookupValidationParams pars,String serverLanguageId,String username) throws Throwable;

  public VOListResponse validateWarehouseCode(LookupValidationParams pars,String serverLanguageId,String username,ArrayList companiesList) throws Throwable;

  
}

