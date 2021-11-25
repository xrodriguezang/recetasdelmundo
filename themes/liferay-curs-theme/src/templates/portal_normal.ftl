<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${html_title}</title>

	<link src="${css_folder}/critical.css">

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
</head>

<body class="${css_class}">

<h1><@liferay.language key="mitraduccion" /></h1>

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

<h1>${mi_variable}</h1>

<#--Es comença a maqueta a partir d'aquí. Als estils d'amunt no s'ha de tocar per no alterar els altres components de Liferay
    Els identficadors han de definir-se els quins estan aquí dins.
-->
<div class="container-fluid" id="wrapper">

	<#if showHeader>
		true!!!
	<#else>
	    false !!!
	</#if>

	<#--<#if showHeader>-->
		<header id="banner" role="banner">
			<div id="heading">
				<div aria-level="1" class="site-title" role="heading">
					<a class="${logo_css_class}" href="${site_default_url}" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
						<img alt="${logo_description}" height="${site_logo_height}" src="${site_logo}" width="${site_logo_width}" />
					</a>

					<#if show_site_name>
						<span class="site-name" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
							${site_name}
						</span>
					</#if>
				</div>
			</div>

			<#if !is_signed_in>
				<a data-redirect="${is_login_redirect_required?string}" href="${sign_in_url}" id="sign-in" rel="nofollow">${sign_in_text}</a>
			</#if>

			<#if has_navigation && is_setup_complete>
				<#-- Es modifica! -->
				<@liferay.navigation_menu instance_id="header_navigation_menu" default_preferences="" />
			</#if>
		</header>
	<#--</#if>-->

	<section id="content">
		<h2 class="hide-accessible" role="heading" aria-level="1">${the_title}</h2>

		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>

	<#if showFooter>
		<footer id="footer" role="contentinfo">
			<p class="powered-by">
				<@liferay.language key="powered-by" /> <a href="http://www.liferay.com" rel="external">Liferay</a>
			</p>
		</footer>
	</#if>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

<script src="${javascript_folder}/miJs.js"></script>

</body>

</html>