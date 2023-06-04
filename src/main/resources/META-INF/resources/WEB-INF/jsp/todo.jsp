
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<h2>Enter Todo Details</h2>
	<form:form method="post" modelAttribute="todo">

		<fieldset class="mb-3">
			<form:label path="description">Description</form:label>
			<form:errors path="description" cssClass="text-warning" />
			<form:input type="text" path="description" />
		</fieldset>


		<fieldset class="mb-3">
			<form:label path="localDate">Local Date	</form:label>
			<form:errors path="localDate" cssClass="text-warning" />
			<form:input type="text" path="localDate" />
		</fieldset>

		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="done" />
		<input type="submit" class="btn btn-success" />
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>
<script type="text/javascript">
	$('#localDate').datepicker({
		format : 'yyyy-mm-dd'
	});
</script>

