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

import com.cursoliferay.recetasdelmundo.sb.model.Receta;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the receta service. This utility wraps <code>com.cursoliferay.recetasdelmundo.sb.service.persistence.impl.RecetaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RecetaPersistence
 * @generated
 */
public class RecetaUtil {

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
	public static void clearCache(Receta receta) {
		getPersistence().clearCache(receta);
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
	public static Map<Serializable, Receta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Receta> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Receta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Receta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Receta update(Receta receta) {
		return getPersistence().update(receta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Receta update(Receta receta, ServiceContext serviceContext) {
		return getPersistence().update(receta, serviceContext);
	}

	/**
	 * Returns all the recetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching recetas
	 */
	public static List<Receta> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the recetas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @return the range of matching recetas
	 */
	public static List<Receta> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the recetas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the recetas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Receta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first receta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByUuid_First(
			String uuid, OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first receta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByUuid_First(
		String uuid, OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByUuid_Last(
			String uuid, OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByUuid_Last(
		String uuid, OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the recetas before and after the current receta in the ordered set where uuid = &#63;.
	 *
	 * @param recetaId the primary key of the current receta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public static Receta[] findByUuid_PrevAndNext(
			long recetaId, String uuid,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByUuid_PrevAndNext(
			recetaId, uuid, orderByComparator);
	}

	/**
	 * Removes all the recetas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of recetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching recetas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the receta where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRecetaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByUUID_G(String uuid, long groupId)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the receta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the receta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the receta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the receta that was removed
	 */
	public static Receta removeByUUID_G(String uuid, long groupId)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of recetas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching recetas
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the recetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching recetas
	 */
	public static List<Receta> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the recetas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @return the range of matching recetas
	 */
	public static List<Receta> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the recetas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the recetas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Receta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the recetas before and after the current receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param recetaId the primary key of the current receta
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public static Receta[] findByUuid_C_PrevAndNext(
			long recetaId, String uuid, long companyId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByUuid_C_PrevAndNext(
			recetaId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the recetas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of recetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching recetas
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the recetas where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching recetas
	 */
	public static List<Receta> findBycompanyId(long companyId) {
		return getPersistence().findBycompanyId(companyId);
	}

	/**
	 * Returns a range of all the recetas where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @return the range of matching recetas
	 */
	public static List<Receta> findBycompanyId(
		long companyId, int start, int end) {

		return getPersistence().findBycompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the recetas where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findBycompanyId(
		long companyId, int start, int end,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().findBycompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the recetas where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findBycompanyId(
		long companyId, int start, int end,
		OrderByComparator<Receta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBycompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first receta in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findBycompanyId_First(
			long companyId, OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findBycompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first receta in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchBycompanyId_First(
		long companyId, OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchBycompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findBycompanyId_Last(
			long companyId, OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findBycompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchBycompanyId_Last(
		long companyId, OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchBycompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the recetas before and after the current receta in the ordered set where companyId = &#63;.
	 *
	 * @param recetaId the primary key of the current receta
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public static Receta[] findBycompanyId_PrevAndNext(
			long recetaId, long companyId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findBycompanyId_PrevAndNext(
			recetaId, companyId, orderByComparator);
	}

	/**
	 * Removes all the recetas where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeBycompanyId(long companyId) {
		getPersistence().removeBycompanyId(companyId);
	}

	/**
	 * Returns the number of recetas where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching recetas
	 */
	public static int countBycompanyId(long companyId) {
		return getPersistence().countBycompanyId(companyId);
	}

	/**
	 * Returns all the recetas where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching recetas
	 */
	public static List<Receta> findByC_G(long companyId, long groupId) {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	 * Returns a range of all the recetas where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @return the range of matching recetas
	 */
	public static List<Receta> findByC_G(
		long companyId, long groupId, int start, int end) {

		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the recetas where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findByC_G(
		long companyId, long groupId, int start, int end,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().findByC_G(
			companyId, groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the recetas where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findByC_G(
		long companyId, long groupId, int start, int end,
		OrderByComparator<Receta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_G(
			companyId, groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByC_G_First(
			long companyId, long groupId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByC_G_First(
			companyId, groupId, orderByComparator);
	}

	/**
	 * Returns the first receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByC_G_First(
		long companyId, long groupId,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchByC_G_First(
			companyId, groupId, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByC_G_Last(
			long companyId, long groupId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByC_G_Last(
			companyId, groupId, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByC_G_Last(
		long companyId, long groupId,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchByC_G_Last(
			companyId, groupId, orderByComparator);
	}

	/**
	 * Returns the recetas before and after the current receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param recetaId the primary key of the current receta
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public static Receta[] findByC_G_PrevAndNext(
			long recetaId, long companyId, long groupId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByC_G_PrevAndNext(
			recetaId, companyId, groupId, orderByComparator);
	}

	/**
	 * Removes all the recetas where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 */
	public static void removeByC_G(long companyId, long groupId) {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	 * Returns the number of recetas where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching recetas
	 */
	public static int countByC_G(long companyId, long groupId) {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	 * Returns all the recetas where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the matching recetas
	 */
	public static List<Receta> findByC_G_U(
		long companyId, long groupId, long userId) {

		return getPersistence().findByC_G_U(companyId, groupId, userId);
	}

	/**
	 * Returns a range of all the recetas where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @return the range of matching recetas
	 */
	public static List<Receta> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end) {

		return getPersistence().findByC_G_U(
			companyId, groupId, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the recetas where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().findByC_G_U(
			companyId, groupId, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the recetas where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching recetas
	 */
	public static List<Receta> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end,
		OrderByComparator<Receta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByC_G_U(
			companyId, groupId, userId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first receta in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByC_G_U_First(
			long companyId, long groupId, long userId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByC_G_U_First(
			companyId, groupId, userId, orderByComparator);
	}

	/**
	 * Returns the first receta in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByC_G_U_First(
		long companyId, long groupId, long userId,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchByC_G_U_First(
			companyId, groupId, userId, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByC_G_U_Last(
			long companyId, long groupId, long userId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByC_G_U_Last(
			companyId, groupId, userId, orderByComparator);
	}

	/**
	 * Returns the last receta in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByC_G_U_Last(
		long companyId, long groupId, long userId,
		OrderByComparator<Receta> orderByComparator) {

		return getPersistence().fetchByC_G_U_Last(
			companyId, groupId, userId, orderByComparator);
	}

	/**
	 * Returns the recetas before and after the current receta in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param recetaId the primary key of the current receta
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public static Receta[] findByC_G_U_PrevAndNext(
			long recetaId, long companyId, long groupId, long userId,
			OrderByComparator<Receta> orderByComparator)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByC_G_U_PrevAndNext(
			recetaId, companyId, groupId, userId, orderByComparator);
	}

	/**
	 * Removes all the recetas where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 */
	public static void removeByC_G_U(
		long companyId, long groupId, long userId) {

		getPersistence().removeByC_G_U(companyId, groupId, userId);
	}

	/**
	 * Returns the number of recetas where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the number of matching recetas
	 */
	public static int countByC_G_U(long companyId, long groupId, long userId) {
		return getPersistence().countByC_G_U(companyId, groupId, userId);
	}

	/**
	 * Returns the receta where createDate = &#63; and modifiedDate = &#63; or throws a <code>NoSuchRecetaException</code> if it could not be found.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @return the matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public static Receta findByC_M(Date createDate, Date modifiedDate)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByC_M(createDate, modifiedDate);
	}

	/**
	 * Returns the receta where createDate = &#63; and modifiedDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByC_M(Date createDate, Date modifiedDate) {
		return getPersistence().fetchByC_M(createDate, modifiedDate);
	}

	/**
	 * Returns the receta where createDate = &#63; and modifiedDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchByC_M(
		Date createDate, Date modifiedDate, boolean useFinderCache) {

		return getPersistence().fetchByC_M(
			createDate, modifiedDate, useFinderCache);
	}

	/**
	 * Removes the receta where createDate = &#63; and modifiedDate = &#63; from the database.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @return the receta that was removed
	 */
	public static Receta removeByC_M(Date createDate, Date modifiedDate)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().removeByC_M(createDate, modifiedDate);
	}

	/**
	 * Returns the number of recetas where createDate = &#63; and modifiedDate = &#63;.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @return the number of matching recetas
	 */
	public static int countByC_M(Date createDate, Date modifiedDate) {
		return getPersistence().countByC_M(createDate, modifiedDate);
	}

	/**
	 * Caches the receta in the entity cache if it is enabled.
	 *
	 * @param receta the receta
	 */
	public static void cacheResult(Receta receta) {
		getPersistence().cacheResult(receta);
	}

	/**
	 * Caches the recetas in the entity cache if it is enabled.
	 *
	 * @param recetas the recetas
	 */
	public static void cacheResult(List<Receta> recetas) {
		getPersistence().cacheResult(recetas);
	}

	/**
	 * Creates a new receta with the primary key. Does not add the receta to the database.
	 *
	 * @param recetaId the primary key for the new receta
	 * @return the new receta
	 */
	public static Receta create(long recetaId) {
		return getPersistence().create(recetaId);
	}

	/**
	 * Removes the receta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta that was removed
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public static Receta remove(long recetaId)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().remove(recetaId);
	}

	public static Receta updateImpl(Receta receta) {
		return getPersistence().updateImpl(receta);
	}

	/**
	 * Returns the receta with the primary key or throws a <code>NoSuchRecetaException</code> if it could not be found.
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public static Receta findByPrimaryKey(long recetaId)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getPersistence().findByPrimaryKey(recetaId);
	}

	/**
	 * Returns the receta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta, or <code>null</code> if a receta with the primary key could not be found
	 */
	public static Receta fetchByPrimaryKey(long recetaId) {
		return getPersistence().fetchByPrimaryKey(recetaId);
	}

	/**
	 * Returns all the recetas.
	 *
	 * @return the recetas
	 */
	public static List<Receta> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the recetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @return the range of recetas
	 */
	public static List<Receta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the recetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of recetas
	 */
	public static List<Receta> findAll(
		int start, int end, OrderByComparator<Receta> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the recetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of recetas
	 */
	public static List<Receta> findAll(
		int start, int end, OrderByComparator<Receta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the recetas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of recetas.
	 *
	 * @return the number of recetas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RecetaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile RecetaPersistence _persistence;

}