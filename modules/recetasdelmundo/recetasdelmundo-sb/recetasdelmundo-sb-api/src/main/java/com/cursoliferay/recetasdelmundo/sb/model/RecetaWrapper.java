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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Receta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Receta
 * @generated
 */
public class RecetaWrapper
	extends BaseModelWrapper<Receta> implements ModelWrapper<Receta>, Receta {

	public RecetaWrapper(Receta receta) {
		super(receta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("recetaId", getRecetaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombre", getNombre());
		attributes.put("descripcion", getDescripcion());
		attributes.put("numeroComensales", getNumeroComensales());
		attributes.put("aptaCeliacos", isAptaCeliacos());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long recetaId = (Long)attributes.get("recetaId");

		if (recetaId != null) {
			setRecetaId(recetaId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Integer numeroComensales = (Integer)attributes.get("numeroComensales");

		if (numeroComensales != null) {
			setNumeroComensales(numeroComensales);
		}

		Boolean aptaCeliacos = (Boolean)attributes.get("aptaCeliacos");

		if (aptaCeliacos != null) {
			setAptaCeliacos(aptaCeliacos);
		}
	}

	@Override
	public Receta cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the apta celiacos of this receta.
	 *
	 * @return the apta celiacos of this receta
	 */
	@Override
	public boolean getAptaCeliacos() {
		return model.getAptaCeliacos();
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return model.getAvailableLanguageIds();
	}

	/**
	 * Returns the company ID of this receta.
	 *
	 * @return the company ID of this receta
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this receta.
	 *
	 * @return the create date of this receta
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	@Override
	public String getDefaultLanguageId() {
		return model.getDefaultLanguageId();
	}

	/**
	 * Returns the descripcion of this receta.
	 *
	 * @return the descripcion of this receta
	 */
	@Override
	public String getDescripcion() {
		return model.getDescripcion();
	}

	/**
	 * Returns the group ID of this receta.
	 *
	 * @return the group ID of this receta
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	@Override
	public java.util.List<Instruccion> getInstruccionList() {
		return model.getInstruccionList();
	}

	/**
	 * Returns the modified date of this receta.
	 *
	 * @return the modified date of this receta
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre of this receta.
	 *
	 * @return the nombre of this receta
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the localized nombre of this receta in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized nombre of this receta
	 */
	@Override
	public String getNombre(java.util.Locale locale) {
		return model.getNombre(locale);
	}

	/**
	 * Returns the localized nombre of this receta in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized nombre of this receta. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getNombre(java.util.Locale locale, boolean useDefault) {
		return model.getNombre(locale, useDefault);
	}

	/**
	 * Returns the localized nombre of this receta in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized nombre of this receta
	 */
	@Override
	public String getNombre(String languageId) {
		return model.getNombre(languageId);
	}

	/**
	 * Returns the localized nombre of this receta in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized nombre of this receta
	 */
	@Override
	public String getNombre(String languageId, boolean useDefault) {
		return model.getNombre(languageId, useDefault);
	}

	@Override
	public String getNombreCurrentLanguageId() {
		return model.getNombreCurrentLanguageId();
	}

	@Override
	public String getNombreCurrentValue() {
		return model.getNombreCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized nombres of this receta.
	 *
	 * @return the locales and localized nombres of this receta
	 */
	@Override
	public Map<java.util.Locale, String> getNombreMap() {
		return model.getNombreMap();
	}

	/**
	 * Returns the numero comensales of this receta.
	 *
	 * @return the numero comensales of this receta
	 */
	@Override
	public int getNumeroComensales() {
		return model.getNumeroComensales();
	}

	/**
	 * Returns the primary key of this receta.
	 *
	 * @return the primary key of this receta
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the receta ID of this receta.
	 *
	 * @return the receta ID of this receta
	 */
	@Override
	public long getRecetaId() {
		return model.getRecetaId();
	}

	/**
	 * Returns the user ID of this receta.
	 *
	 * @return the user ID of this receta
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this receta.
	 *
	 * @return the user name of this receta
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this receta.
	 *
	 * @return the user uuid of this receta
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this receta.
	 *
	 * @return the uuid of this receta
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this receta is apta celiacos.
	 *
	 * @return <code>true</code> if this receta is apta celiacos; <code>false</code> otherwise
	 */
	@Override
	public boolean isAptaCeliacos() {
		return model.isAptaCeliacos();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	 * Sets whether this receta is apta celiacos.
	 *
	 * @param aptaCeliacos the apta celiacos of this receta
	 */
	@Override
	public void setAptaCeliacos(boolean aptaCeliacos) {
		model.setAptaCeliacos(aptaCeliacos);
	}

	/**
	 * Sets the company ID of this receta.
	 *
	 * @param companyId the company ID of this receta
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this receta.
	 *
	 * @param createDate the create date of this receta
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descripcion of this receta.
	 *
	 * @param descripcion the descripcion of this receta
	 */
	@Override
	public void setDescripcion(String descripcion) {
		model.setDescripcion(descripcion);
	}

	/**
	 * Sets the group ID of this receta.
	 *
	 * @param groupId the group ID of this receta
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	@Override
	public void setInstruccionList(
		java.util.List<Instruccion> instruccionList) {

		model.setInstruccionList(instruccionList);
	}

	/**
	 * Sets the modified date of this receta.
	 *
	 * @param modifiedDate the modified date of this receta
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre of this receta.
	 *
	 * @param nombre the nombre of this receta
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the localized nombre of this receta in the language.
	 *
	 * @param nombre the localized nombre of this receta
	 * @param locale the locale of the language
	 */
	@Override
	public void setNombre(String nombre, java.util.Locale locale) {
		model.setNombre(nombre, locale);
	}

	/**
	 * Sets the localized nombre of this receta in the language, and sets the default locale.
	 *
	 * @param nombre the localized nombre of this receta
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setNombre(
		String nombre, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setNombre(nombre, locale, defaultLocale);
	}

	@Override
	public void setNombreCurrentLanguageId(String languageId) {
		model.setNombreCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized nombres of this receta from the map of locales and localized nombres.
	 *
	 * @param nombreMap the locales and localized nombres of this receta
	 */
	@Override
	public void setNombreMap(Map<java.util.Locale, String> nombreMap) {
		model.setNombreMap(nombreMap);
	}

	/**
	 * Sets the localized nombres of this receta from the map of locales and localized nombres, and sets the default locale.
	 *
	 * @param nombreMap the locales and localized nombres of this receta
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setNombreMap(
		Map<java.util.Locale, String> nombreMap,
		java.util.Locale defaultLocale) {

		model.setNombreMap(nombreMap, defaultLocale);
	}

	/**
	 * Sets the numero comensales of this receta.
	 *
	 * @param numeroComensales the numero comensales of this receta
	 */
	@Override
	public void setNumeroComensales(int numeroComensales) {
		model.setNumeroComensales(numeroComensales);
	}

	/**
	 * Sets the primary key of this receta.
	 *
	 * @param primaryKey the primary key of this receta
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the receta ID of this receta.
	 *
	 * @param recetaId the receta ID of this receta
	 */
	@Override
	public void setRecetaId(long recetaId) {
		model.setRecetaId(recetaId);
	}

	/**
	 * Sets the user ID of this receta.
	 *
	 * @param userId the user ID of this receta
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this receta.
	 *
	 * @param userName the user name of this receta
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this receta.
	 *
	 * @param userUuid the user uuid of this receta
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this receta.
	 *
	 * @param uuid the uuid of this receta
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected RecetaWrapper wrap(Receta receta) {
		return new RecetaWrapper(receta);
	}

}