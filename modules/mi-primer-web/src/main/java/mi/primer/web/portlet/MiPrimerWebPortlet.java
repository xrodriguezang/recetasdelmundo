package mi.primer.web.portlet;

import mi.primer.web.constants.MiPrimerWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author amgri
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MiPrimerWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MiPrimerWebPortletKeys.MIPRIMERWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
		// Dins la classe d'herència, li diu amb quina ens quedem.
		// Prové de: public abstract class GenericPortlet implements Portlet, PortletConfig, EventPortlet, ResourceServingPortlet, HeaderPortlet {
)
public class MiPrimerWebPortlet extends MVCPortlet {
}