<div class="curso-liferay-layout" id="main-content" role="main">
	<div class="portlet-layout row">
		<#--Els dos valors han de coincidir column-1-->
		<div class="col-12 col-md-3 portlet-column portlet-column-only" id="column-1">
			${processor.processColumn("column-1", "portlet-column-content portlet-column-content-only")}
		</div>
		<div class="col-12  col-md-3 portlet-column portlet-column-only" id="column-2">
			${processor.processColumn("column-2", "portlet-column-content portlet-column-content-only")}
		</div>
		<div class="col-12 col-md-3 portlet-column portlet-column-only" id="column-3">
			${processor.processColumn("column-3", "portlet-column-content portlet-column-content-only")}
		</div>
		<div class="col-12 col-md-3 portlet-column portlet-column-only" id="column-4">
			${processor.processColumn("column-4", "portlet-column-content portlet-column-content-only")}
		</div>
	</div>
</div>
