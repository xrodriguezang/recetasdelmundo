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

package com.cursoliferay.recetasdelmundo.sb.model.impl;

import com.cursoliferay.recetasdelmundo.sb.model.Receta;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Receta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RecetaCacheModel implements CacheModel<Receta>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RecetaCacheModel)) {
			return false;
		}

		RecetaCacheModel recetaCacheModel = (RecetaCacheModel)object;

		if (recetaId == recetaCacheModel.recetaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, recetaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", recetaId=");
		sb.append(recetaId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", numeroComensales=");
		sb.append(numeroComensales);
		sb.append(", aptaCeliacos=");
		sb.append(aptaCeliacos);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Receta toEntityModel() {
		RecetaImpl recetaImpl = new RecetaImpl();

		if (uuid == null) {
			recetaImpl.setUuid("");
		}
		else {
			recetaImpl.setUuid(uuid);
		}

		recetaImpl.setRecetaId(recetaId);
		recetaImpl.setCompanyId(companyId);
		recetaImpl.setGroupId(groupId);
		recetaImpl.setUserId(userId);

		if (userName == null) {
			recetaImpl.setUserName("");
		}
		else {
			recetaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			recetaImpl.setCreateDate(null);
		}
		else {
			recetaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			recetaImpl.setModifiedDate(null);
		}
		else {
			recetaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombre == null) {
			recetaImpl.setNombre("");
		}
		else {
			recetaImpl.setNombre(nombre);
		}

		if (descripcion == null) {
			recetaImpl.setDescripcion("");
		}
		else {
			recetaImpl.setDescripcion(descripcion);
		}

		recetaImpl.setNumeroComensales(numeroComensales);
		recetaImpl.setAptaCeliacos(aptaCeliacos);

		recetaImpl.resetOriginalValues();

		return recetaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		recetaId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombre = objectInput.readUTF();
		descripcion = objectInput.readUTF();

		numeroComensales = objectInput.readInt();

		aptaCeliacos = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(recetaId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeInt(numeroComensales);

		objectOutput.writeBoolean(aptaCeliacos);
	}

	public String uuid;
	public long recetaId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombre;
	public String descripcion;
	public int numeroComensales;
	public boolean aptaCeliacos;

}