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

package com.cursoliferay.recetasdelmundo.sb.service.http;

import com.cursoliferay.recetasdelmundo.sb.service.RecetaServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>RecetaServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RecetaServiceSoap
 * @generated
 */
public class RecetaServiceHttp {

	public static com.cursoliferay.recetasdelmundo.sb.model.Receta addReceta(
		HttpPrincipal httpPrincipal,
		com.cursoliferay.recetasdelmundo.sb.model.Receta receta) {

		try {
			MethodKey methodKey = new MethodKey(
				RecetaServiceUtil.class, "addReceta",
				_addRecetaParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, receta);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.cursoliferay.recetasdelmundo.sb.model.Receta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.cursoliferay.recetasdelmundo.sb.model.Receta addReceta(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				RecetaServiceUtil.class, "addReceta",
				_addRecetaParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.cursoliferay.recetasdelmundo.sb.model.Receta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.cursoliferay.recetasdelmundo.sb.model.Receta addReceta(
		HttpPrincipal httpPrincipal,
		java.util.Map<java.util.Locale, String> nombre, String descripcion) {

		try {
			MethodKey methodKey = new MethodKey(
				RecetaServiceUtil.class, "addReceta",
				_addRecetaParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nombre, descripcion);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.cursoliferay.recetasdelmundo.sb.model.Receta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.cursoliferay.recetasdelmundo.sb.model.Receta getReceta(
			HttpPrincipal httpPrincipal, long recetaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				RecetaServiceUtil.class, "getReceta",
				_getRecetaParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, recetaId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.cursoliferay.recetasdelmundo.sb.model.Receta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.cursoliferay.recetasdelmundo.sb.model.Receta createReceta(
			HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				RecetaServiceUtil.class, "createReceta",
				_createRecetaParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.cursoliferay.recetasdelmundo.sb.model.Receta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RecetaServiceHttp.class);

	private static final Class<?>[] _addRecetaParameterTypes0 = new Class[] {
		com.cursoliferay.recetasdelmundo.sb.model.Receta.class
	};
	private static final Class<?>[] _addRecetaParameterTypes1 = new Class[] {};
	private static final Class<?>[] _addRecetaParameterTypes2 = new Class[] {
		java.util.Map.class, String.class
	};
	private static final Class<?>[] _getRecetaParameterTypes3 = new Class[] {
		long.class
	};
	private static final Class<?>[] _createRecetaParameterTypes4 =
		new Class[] {};

}