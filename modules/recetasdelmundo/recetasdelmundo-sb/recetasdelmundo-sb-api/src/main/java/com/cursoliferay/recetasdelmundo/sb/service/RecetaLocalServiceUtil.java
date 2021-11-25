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

package com.cursoliferay.recetasdelmundo.sb.service;

import com.cursoliferay.recetasdelmundo.sb.model.Receta;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Receta. This utility wraps
 * <code>com.cursoliferay.recetasdelmundo.sb.service.impl.RecetaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RecetaLocalService
 * @generated
 */
public class RecetaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.cursoliferay.recetasdelmundo.sb.service.impl.RecetaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the receta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RecetaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param receta the receta
	 * @return the receta that was added
	 */
	public static Receta addReceta(Receta receta) {
		return getService().addReceta(receta);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new receta with the primary key. Does not add the receta to the database.
	 *
	 * @param recetaId the primary key for the new receta
	 * @return the new receta
	 */
	public static Receta createReceta(long recetaId) {
		return getService().createReceta(recetaId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the receta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RecetaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta that was removed
	 * @throws PortalException if a receta with the primary key could not be found
	 */
	public static Receta deleteReceta(long recetaId) throws PortalException {
		return getService().deleteReceta(recetaId);
	}

	/**
	 * Deletes the receta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RecetaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param receta the receta
	 * @return the receta that was removed
	 */
	public static Receta deleteReceta(Receta receta) {
		return getService().deleteReceta(receta);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cursoliferay.recetasdelmundo.sb.model.impl.RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cursoliferay.recetasdelmundo.sb.model.impl.RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Receta fetchByC_M(java.util.Date d1, java.util.Date d2) {
		return getService().fetchByC_M(d1, d2);
	}

	public static Receta fetchReceta(long recetaId) {
		return getService().fetchReceta(recetaId);
	}

	/**
	 * Returns the receta matching the UUID and group.
	 *
	 * @param uuid the receta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public static Receta fetchRecetaByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchRecetaByUuidAndGroupId(uuid, groupId);
	}

	public static Receta findByC_M(java.util.Date d1, java.util.Date d2)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return getService().findByC_M(d1, d2);
	}

	public static List<Receta> findBycompanyId(
		long companyId, int start, int end,
		OrderByComparator<Receta> orderByComparator) {

		return getService().findBycompanyId(
			companyId, start, end, orderByComparator);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the receta with the primary key.
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta
	 * @throws PortalException if a receta with the primary key could not be found
	 */
	public static Receta getReceta(long recetaId) throws PortalException {
		return getService().getReceta(recetaId);
	}

	/**
	 * Returns the receta matching the UUID and group.
	 *
	 * @param uuid the receta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching receta
	 * @throws PortalException if a matching receta could not be found
	 */
	public static Receta getRecetaByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getRecetaByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the recetas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cursoliferay.recetasdelmundo.sb.model.impl.RecetaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @return the range of recetas
	 */
	public static List<Receta> getRecetas(int start, int end) {
		return getService().getRecetas(start, end);
	}

	/**
	 * Returns all the recetas matching the UUID and company.
	 *
	 * @param uuid the UUID of the recetas
	 * @param companyId the primary key of the company
	 * @return the matching recetas, or an empty list if no matches were found
	 */
	public static List<Receta> getRecetasByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getRecetasByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of recetas matching the UUID and company.
	 *
	 * @param uuid the UUID of the recetas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of recetas
	 * @param end the upper bound of the range of recetas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching recetas, or an empty list if no matches were found
	 */
	public static List<Receta> getRecetasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Receta> orderByComparator) {

		return getService().getRecetasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of recetas.
	 *
	 * @return the number of recetas
	 */
	public static int getRecetasCount() {
		return getService().getRecetasCount();
	}

	/**
	 * Updates the receta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RecetaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param receta the receta
	 * @return the receta that was updated
	 */
	public static Receta updateReceta(Receta receta) {
		return getService().updateReceta(receta);
	}

	public static RecetaLocalService getService() {
		return _service;
	}

	private static volatile RecetaLocalService _service;

}