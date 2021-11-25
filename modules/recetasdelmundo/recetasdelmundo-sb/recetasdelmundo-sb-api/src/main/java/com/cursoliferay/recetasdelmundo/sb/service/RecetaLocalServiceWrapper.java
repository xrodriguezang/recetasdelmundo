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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RecetaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RecetaLocalService
 * @generated
 */
public class RecetaLocalServiceWrapper
	implements RecetaLocalService, ServiceWrapper<RecetaLocalService> {

	public RecetaLocalServiceWrapper(RecetaLocalService recetaLocalService) {
		_recetaLocalService = recetaLocalService;
	}

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
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta addReceta(
		com.cursoliferay.recetasdelmundo.sb.model.Receta receta) {

		return _recetaLocalService.addReceta(receta);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _recetaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new receta with the primary key. Does not add the receta to the database.
	 *
	 * @param recetaId the primary key for the new receta
	 * @return the new receta
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta createReceta(
		long recetaId) {

		return _recetaLocalService.createReceta(recetaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _recetaLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta deleteReceta(
			long recetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _recetaLocalService.deleteReceta(recetaId);
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
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta deleteReceta(
		com.cursoliferay.recetasdelmundo.sb.model.Receta receta) {

		return _recetaLocalService.deleteReceta(receta);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _recetaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _recetaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _recetaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _recetaLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _recetaLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _recetaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _recetaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _recetaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta fetchByC_M(
		java.util.Date d1, java.util.Date d2) {

		return _recetaLocalService.fetchByC_M(d1, d2);
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta fetchReceta(
		long recetaId) {

		return _recetaLocalService.fetchReceta(recetaId);
	}

	/**
	 * Returns the receta matching the UUID and group.
	 *
	 * @param uuid the receta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta
		fetchRecetaByUuidAndGroupId(String uuid, long groupId) {

		return _recetaLocalService.fetchRecetaByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta findByC_M(
			java.util.Date d1, java.util.Date d2)
		throws com.cursoliferay.recetasdelmundo.sb.exception.
			NoSuchRecetaException {

		return _recetaLocalService.findByC_M(d1, d2);
	}

	@Override
	public java.util.List<com.cursoliferay.recetasdelmundo.sb.model.Receta>
		findBycompanyId(
			long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.cursoliferay.recetasdelmundo.sb.model.Receta>
					orderByComparator) {

		return _recetaLocalService.findBycompanyId(
			companyId, start, end, orderByComparator);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _recetaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _recetaLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _recetaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _recetaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _recetaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the receta with the primary key.
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta
	 * @throws PortalException if a receta with the primary key could not be found
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta getReceta(
			long recetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _recetaLocalService.getReceta(recetaId);
	}

	/**
	 * Returns the receta matching the UUID and group.
	 *
	 * @param uuid the receta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching receta
	 * @throws PortalException if a matching receta could not be found
	 */
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta
			getRecetaByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _recetaLocalService.getRecetaByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.cursoliferay.recetasdelmundo.sb.model.Receta>
		getRecetas(int start, int end) {

		return _recetaLocalService.getRecetas(start, end);
	}

	/**
	 * Returns all the recetas matching the UUID and company.
	 *
	 * @param uuid the UUID of the recetas
	 * @param companyId the primary key of the company
	 * @return the matching recetas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.cursoliferay.recetasdelmundo.sb.model.Receta>
		getRecetasByUuidAndCompanyId(String uuid, long companyId) {

		return _recetaLocalService.getRecetasByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.cursoliferay.recetasdelmundo.sb.model.Receta>
		getRecetasByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.cursoliferay.recetasdelmundo.sb.model.Receta>
					orderByComparator) {

		return _recetaLocalService.getRecetasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of recetas.
	 *
	 * @return the number of recetas
	 */
	@Override
	public int getRecetasCount() {
		return _recetaLocalService.getRecetasCount();
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
	@Override
	public com.cursoliferay.recetasdelmundo.sb.model.Receta updateReceta(
		com.cursoliferay.recetasdelmundo.sb.model.Receta receta) {

		return _recetaLocalService.updateReceta(receta);
	}

	@Override
	public RecetaLocalService getWrappedService() {
		return _recetaLocalService;
	}

	@Override
	public void setWrappedService(RecetaLocalService recetaLocalService) {
		_recetaLocalService = recetaLocalService;
	}

	private RecetaLocalService _recetaLocalService;

}