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

import com.cursoliferay.recetasdelmundo.sb.exception.NoSuchRecetaException;
import com.cursoliferay.recetasdelmundo.sb.model.Receta;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the receta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RecetaUtil
 * @generated
 */
@ProviderType
public interface RecetaPersistence extends BasePersistence<Receta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RecetaUtil} to access the receta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the recetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching recetas
	 */
	public java.util.List<Receta> findByUuid(String uuid);

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
	public java.util.List<Receta> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Receta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public java.util.List<Receta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first receta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the first receta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

	/**
	 * Returns the last receta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the last receta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

	/**
	 * Returns the recetas before and after the current receta in the ordered set where uuid = &#63;.
	 *
	 * @param recetaId the primary key of the current receta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public Receta[] findByUuid_PrevAndNext(
			long recetaId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Removes all the recetas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of recetas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching recetas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the receta where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRecetaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findByUUID_G(String uuid, long groupId)
		throws NoSuchRecetaException;

	/**
	 * Returns the receta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the receta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the receta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the receta that was removed
	 */
	public Receta removeByUUID_G(String uuid, long groupId)
		throws NoSuchRecetaException;

	/**
	 * Returns the number of recetas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching recetas
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the recetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching recetas
	 */
	public java.util.List<Receta> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Receta> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Receta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public java.util.List<Receta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the first receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

	/**
	 * Returns the last receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the last receta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public Receta[] findByUuid_C_PrevAndNext(
			long recetaId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Removes all the recetas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of recetas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching recetas
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the recetas where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching recetas
	 */
	public java.util.List<Receta> findBycompanyId(long companyId);

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
	public java.util.List<Receta> findBycompanyId(
		long companyId, int start, int end);

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
	public java.util.List<Receta> findBycompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public java.util.List<Receta> findBycompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first receta in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findBycompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the first receta in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchBycompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

	/**
	 * Returns the last receta in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findBycompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the last receta in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchBycompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

	/**
	 * Returns the recetas before and after the current receta in the ordered set where companyId = &#63;.
	 *
	 * @param recetaId the primary key of the current receta
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public Receta[] findBycompanyId_PrevAndNext(
			long recetaId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Removes all the recetas where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeBycompanyId(long companyId);

	/**
	 * Returns the number of recetas where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching recetas
	 */
	public int countBycompanyId(long companyId);

	/**
	 * Returns all the recetas where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching recetas
	 */
	public java.util.List<Receta> findByC_G(long companyId, long groupId);

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
	public java.util.List<Receta> findByC_G(
		long companyId, long groupId, int start, int end);

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
	public java.util.List<Receta> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public java.util.List<Receta> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findByC_G_First(
			long companyId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the first receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

	/**
	 * Returns the last receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findByC_G_Last(
			long companyId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the last receta in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public Receta[] findByC_G_PrevAndNext(
			long recetaId, long companyId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Removes all the recetas where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 */
	public void removeByC_G(long companyId, long groupId);

	/**
	 * Returns the number of recetas where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching recetas
	 */
	public int countByC_G(long companyId, long groupId);

	/**
	 * Returns all the recetas where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the matching recetas
	 */
	public java.util.List<Receta> findByC_G_U(
		long companyId, long groupId, long userId);

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
	public java.util.List<Receta> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end);

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
	public java.util.List<Receta> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public java.util.List<Receta> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator,
		boolean useFinderCache);

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
	public Receta findByC_G_U_First(
			long companyId, long groupId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the first receta in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByC_G_U_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public Receta findByC_G_U_Last(
			long companyId, long groupId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Returns the last receta in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByC_G_U_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public Receta[] findByC_G_U_PrevAndNext(
			long recetaId, long companyId, long groupId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Receta>
				orderByComparator)
		throws NoSuchRecetaException;

	/**
	 * Removes all the recetas where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 */
	public void removeByC_G_U(long companyId, long groupId, long userId);

	/**
	 * Returns the number of recetas where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the number of matching recetas
	 */
	public int countByC_G_U(long companyId, long groupId, long userId);

	/**
	 * Returns the receta where createDate = &#63; and modifiedDate = &#63; or throws a <code>NoSuchRecetaException</code> if it could not be found.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @return the matching receta
	 * @throws NoSuchRecetaException if a matching receta could not be found
	 */
	public Receta findByC_M(Date createDate, Date modifiedDate)
		throws NoSuchRecetaException;

	/**
	 * Returns the receta where createDate = &#63; and modifiedDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByC_M(Date createDate, Date modifiedDate);

	/**
	 * Returns the receta where createDate = &#63; and modifiedDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching receta, or <code>null</code> if a matching receta could not be found
	 */
	public Receta fetchByC_M(
		Date createDate, Date modifiedDate, boolean useFinderCache);

	/**
	 * Removes the receta where createDate = &#63; and modifiedDate = &#63; from the database.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @return the receta that was removed
	 */
	public Receta removeByC_M(Date createDate, Date modifiedDate)
		throws NoSuchRecetaException;

	/**
	 * Returns the number of recetas where createDate = &#63; and modifiedDate = &#63;.
	 *
	 * @param createDate the create date
	 * @param modifiedDate the modified date
	 * @return the number of matching recetas
	 */
	public int countByC_M(Date createDate, Date modifiedDate);

	/**
	 * Caches the receta in the entity cache if it is enabled.
	 *
	 * @param receta the receta
	 */
	public void cacheResult(Receta receta);

	/**
	 * Caches the recetas in the entity cache if it is enabled.
	 *
	 * @param recetas the recetas
	 */
	public void cacheResult(java.util.List<Receta> recetas);

	/**
	 * Creates a new receta with the primary key. Does not add the receta to the database.
	 *
	 * @param recetaId the primary key for the new receta
	 * @return the new receta
	 */
	public Receta create(long recetaId);

	/**
	 * Removes the receta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta that was removed
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public Receta remove(long recetaId) throws NoSuchRecetaException;

	public Receta updateImpl(Receta receta);

	/**
	 * Returns the receta with the primary key or throws a <code>NoSuchRecetaException</code> if it could not be found.
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta
	 * @throws NoSuchRecetaException if a receta with the primary key could not be found
	 */
	public Receta findByPrimaryKey(long recetaId) throws NoSuchRecetaException;

	/**
	 * Returns the receta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param recetaId the primary key of the receta
	 * @return the receta, or <code>null</code> if a receta with the primary key could not be found
	 */
	public Receta fetchByPrimaryKey(long recetaId);

	/**
	 * Returns all the recetas.
	 *
	 * @return the recetas
	 */
	public java.util.List<Receta> findAll();

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
	public java.util.List<Receta> findAll(int start, int end);

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
	public java.util.List<Receta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator);

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
	public java.util.List<Receta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Receta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the recetas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of recetas.
	 *
	 * @return the number of recetas
	 */
	public int countAll();

}