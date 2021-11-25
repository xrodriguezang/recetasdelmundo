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

package com.cursoliferay.recetasdelmundo.sb.service.persistence;

import com.cursoliferay.recetasdelmundo.sb.model.Instruccion;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the instruccion service. This utility wraps <code>com.cursoliferay.recetasdelmundo.sb.service.persistence.impl.InstruccionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstruccionPersistence
 * @generated
 */
public class InstruccionUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Instruccion instruccion) {
		getPersistence().clearCache(instruccion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Instruccion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Instruccion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Instruccion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Instruccion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Instruccion update(Instruccion instruccion) {
		return getPersistence().update(instruccion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Instruccion update(
		Instruccion instruccion, ServiceContext serviceContext) {

		return getPersistence().update(instruccion, serviceContext);
	}

	/**
	 * Returns all the instruccions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching instruccions
	 */
	public static List<Instruccion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the instruccions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of matching instruccions
	 */
	public static List<Instruccion> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the instruccions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instruccions
	 */
	public static List<Instruccion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instruccions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instruccions
	 */
	public static List<Instruccion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Instruccion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public static Instruccion findByUuid_First(
			String uuid, OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public static Instruccion fetchByUuid_First(
		String uuid, OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public static Instruccion findByUuid_Last(
			String uuid, OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public static Instruccion fetchByUuid_Last(
		String uuid, OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the instruccions before and after the current instruccion in the ordered set where uuid = &#63;.
	 *
	 * @param instruccionId the primary key of the current instruccion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public static Instruccion[] findByUuid_PrevAndNext(
			long instruccionId, String uuid,
			OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByUuid_PrevAndNext(
			instruccionId, uuid, orderByComparator);
	}

	/**
	 * Removes all the instruccions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of instruccions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching instruccions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstruccionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public static Instruccion findByUUID_G(String uuid, long groupId)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public static Instruccion fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the instruccion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public static Instruccion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the instruccion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the instruccion that was removed
	 */
	public static Instruccion removeByUUID_G(String uuid, long groupId)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of instruccions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching instruccions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching instruccions
	 */
	public static List<Instruccion> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of matching instruccions
	 */
	public static List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instruccions
	 */
	public static List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instruccions
	 */
	public static List<Instruccion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Instruccion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public static Instruccion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public static Instruccion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public static Instruccion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public static Instruccion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the instruccions before and after the current instruccion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param instruccionId the primary key of the current instruccion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public static Instruccion[] findByUuid_C_PrevAndNext(
			long instruccionId, String uuid, long companyId,
			OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			instruccionId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the instruccions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of instruccions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching instruccions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the instruccions where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @return the matching instruccions
	 */
	public static List<Instruccion> findByrecetaId(long recetaId) {
		return getPersistence().findByrecetaId(recetaId);
	}

	/**
	 * Returns a range of all the instruccions where recetaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param recetaId the receta ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of matching instruccions
	 */
	public static List<Instruccion> findByrecetaId(
		long recetaId, int start, int end) {

		return getPersistence().findByrecetaId(recetaId, start, end);
	}

	/**
	 * Returns an ordered range of all the instruccions where recetaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param recetaId the receta ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instruccions
	 */
	public static List<Instruccion> findByrecetaId(
		long recetaId, int start, int end,
		OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().findByrecetaId(
			recetaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instruccions where recetaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param recetaId the receta ID
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instruccions
	 */
	public static List<Instruccion> findByrecetaId(
		long recetaId, int start, int end,
		OrderByComparator<Instruccion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByrecetaId(
			recetaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public static Instruccion findByrecetaId_First(
			long recetaId, OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByrecetaId_First(
			recetaId, orderByComparator);
	}

	/**
	 * Returns the first instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public static Instruccion fetchByrecetaId_First(
		long recetaId, OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().fetchByrecetaId_First(
			recetaId, orderByComparator);
	}

	/**
	 * Returns the last instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion
	 * @throws NoSuchInstruccionException if a matching instruccion could not be found
	 */
	public static Instruccion findByrecetaId_Last(
			long recetaId, OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByrecetaId_Last(
			recetaId, orderByComparator);
	}

	/**
	 * Returns the last instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instruccion, or <code>null</code> if a matching instruccion could not be found
	 */
	public static Instruccion fetchByrecetaId_Last(
		long recetaId, OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().fetchByrecetaId_Last(
			recetaId, orderByComparator);
	}

	/**
	 * Returns the instruccions before and after the current instruccion in the ordered set where recetaId = &#63;.
	 *
	 * @param instruccionId the primary key of the current instruccion
	 * @param recetaId the receta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public static Instruccion[] findByrecetaId_PrevAndNext(
			long instruccionId, long recetaId,
			OrderByComparator<Instruccion> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByrecetaId_PrevAndNext(
			instruccionId, recetaId, orderByComparator);
	}

	/**
	 * Removes all the instruccions where recetaId = &#63; from the database.
	 *
	 * @param recetaId the receta ID
	 */
	public static void removeByrecetaId(long recetaId) {
		getPersistence().removeByrecetaId(recetaId);
	}

	/**
	 * Returns the number of instruccions where recetaId = &#63;.
	 *
	 * @param recetaId the receta ID
	 * @return the number of matching instruccions
	 */
	public static int countByrecetaId(long recetaId) {
		return getPersistence().countByrecetaId(recetaId);
	}

	/**
	 * Caches the instruccion in the entity cache if it is enabled.
	 *
	 * @param instruccion the instruccion
	 */
	public static void cacheResult(Instruccion instruccion) {
		getPersistence().cacheResult(instruccion);
	}

	/**
	 * Caches the instruccions in the entity cache if it is enabled.
	 *
	 * @param instruccions the instruccions
	 */
	public static void cacheResult(List<Instruccion> instruccions) {
		getPersistence().cacheResult(instruccions);
	}

	/**
	 * Creates a new instruccion with the primary key. Does not add the instruccion to the database.
	 *
	 * @param instruccionId the primary key for the new instruccion
	 * @return the new instruccion
	 */
	public static Instruccion create(long instruccionId) {
		return getPersistence().create(instruccionId);
	}

	/**
	 * Removes the instruccion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion that was removed
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public static Instruccion remove(long instruccionId)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().remove(instruccionId);
	}

	public static Instruccion updateImpl(Instruccion instruccion) {
		return getPersistence().updateImpl(instruccion);
	}

	/**
	 * Returns the instruccion with the primary key or throws a <code>NoSuchInstruccionException</code> if it could not be found.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion
	 * @throws NoSuchInstruccionException if a instruccion with the primary key could not be found
	 */
	public static Instruccion findByPrimaryKey(long instruccionId)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchInstruccionException {

		return getPersistence().findByPrimaryKey(instruccionId);
	}

	/**
	 * Returns the instruccion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param instruccionId the primary key of the instruccion
	 * @return the instruccion, or <code>null</code> if a instruccion with the primary key could not be found
	 */
	public static Instruccion fetchByPrimaryKey(long instruccionId) {
		return getPersistence().fetchByPrimaryKey(instruccionId);
	}

	/**
	 * Returns all the instruccions.
	 *
	 * @return the instruccions
	 */
	public static List<Instruccion> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the instruccions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @return the range of instruccions
	 */
	public static List<Instruccion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the instruccions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of instruccions
	 */
	public static List<Instruccion> findAll(
		int start, int end, OrderByComparator<Instruccion> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instruccions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstruccionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instruccions
	 * @param end the upper bound of the range of instruccions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of instruccions
	 */
	public static List<Instruccion> findAll(
		int start, int end, OrderByComparator<Instruccion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the instruccions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of instruccions.
	 *
	 * @return the number of instruccions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InstruccionPersistence getPersistence() {
		return _persistence;
	}

	private static volatile InstruccionPersistence _persistence;

}