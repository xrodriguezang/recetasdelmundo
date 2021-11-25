/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.cursoliferay.recetasdelmundo.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.cursoliferay.recetasdelmundo.sb.service.http.RecetaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RecetaSoap implements Serializable {

	public static RecetaSoap toSoapModel(Receta model) {
		RecetaSoap soapModel = new RecetaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRecetaId(model.getRecetaId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombre(model.getNombre());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setNumeroComensales(model.getNumeroComensales());
		soapModel.setAptaCeliacos(model.isAptaCeliacos());

		return soapModel;
	}

	public static RecetaSoap[] toSoapModels(Receta[] models) {
		RecetaSoap[] soapModels = new RecetaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RecetaSoap[][] toSoapModels(Receta[][] models) {
		RecetaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RecetaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RecetaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RecetaSoap[] toSoapModels(List<Receta> models) {
		List<RecetaSoap> soapModels = new ArrayList<RecetaSoap>(models.size());

		for (Receta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RecetaSoap[soapModels.size()]);
	}

	public RecetaSoap() {
	}

	public long getPrimaryKey() {
		return _recetaId;
	}

	public void setPrimaryKey(long pk) {
		setRecetaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRecetaId() {
		return _recetaId;
	}

	public void setRecetaId(long recetaId) {
		_recetaId = recetaId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public int getNumeroComensales() {
		return _numeroComensales;
	}

	public void setNumeroComensales(int numeroComensales) {
		_numeroComensales = numeroComensales;
	}

	public boolean getAptaCeliacos() {
		return _aptaCeliacos;
	}

	public boolean isAptaCeliacos() {
		return _aptaCeliacos;
	}

	public void setAptaCeliacos(boolean aptaCeliacos) {
		_aptaCeliacos = aptaCeliacos;
	}

	private String _uuid;
	private long _recetaId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombre;
	private String _descripcion;
	private int _numeroComensales;
	private boolean _aptaCeliacos;

}