package com.cursoliferay.recetasdelmundo.web.portlet;

import com.cursoliferay.recetasdelmundo.sb.model.Receta;
import com.cursoliferay.recetasdelmundo.sb.service.RecetaLocalService;
import com.cursoliferay.recetasdelmundo.sb.service.RecetaService;
import com.cursoliferay.recetasdelmundo.web.constants.RecetasdelmundoWebPortletKeys;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/**
 * @author amgri
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.cursoliferay",
		// "com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Recetas del mundo",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RecetasdelmundoWebPortletKeys.RECETASDELMUNDOWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RecetasdelmundoWebPortlet extends MVCPortlet {

	/*public void addReceta(ActionRequest actionRequest, ActionResponse actionResponse) {
		// Ajuda per recuperar els paràmetres
		String nombre = ParamUtil.getString(actionRequest, "nombre", "");

		_log.info("Nombre:" + nombre);
	}*/

	/**
	 * Si es localized
	 * @param actionRequest
	 * @param actionResponse
	 */
	public void addReceta(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		//String nombre = ParamUtil.getString(actionRequest, "nombre", "");

		Map<Locale, String> nombre = LocalizationUtil.getLocalizationMap(actionRequest, "nombre");

		Receta receta = null;
		try {
			receta = recetaService.createReceta();
			receta.setNombreMap(nombre);

			recetaService.addReceta(receta);
		} catch (PortalException e) {
			_log.error(e);
		}

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Receta.class.getName(), actionRequest);

		/*
		recetaService.addReceta(nombre, null);
		 */

		_log.info("Nombre:" + nombre.get(LocaleUtil.US));
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		renderRequest.setAttribute(RecetaLocalService.class.getName(), recetaService);

		super.render(renderRequest, renderResponse);
	}

	@Reference
	private RecetaService recetaService;

	// Assigna les següents taules primàries que toquen.
	@Reference
	private CounterLocalService counterLocalService;

	private Log _log = LogFactoryUtil.getLog(this.getClass());


}