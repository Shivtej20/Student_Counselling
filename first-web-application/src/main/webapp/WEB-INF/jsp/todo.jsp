<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

	<div class="container">
		<form:form method="post" modelAttribute="todo">
			<fieldset class="form-group">
				<form:label path="studentName">Student_ Name</form:label> 
				<form:input path="studentName" type="text"
					class="form-control" required="required"/>
					<form:errors path="studentName" cssClass="text-warning"/>
				
			</fieldset>
			<fieldset class="form-group">
				<form:label path="rollNumber">Roll_Number</form:label> 
				<form:input path="rollNumber" type="number"
					class="form-control" required="required"/>
					<form:errors path="rollNumber" cssClass="text-warning"/>
				
			</fieldset>
			<fieldset class="form-group">
				<form:label path="phno">Phone_Number</form:label> 
				<form:input path="phno" type="number"
					class="form-control" required="required"/>
					<form:errors path="phno" cssClass="text-warning"/>
				
			</fieldset>

			<fieldset class="form-group">
				<form:label path="checkingDate">Checking Date</form:label> 
				<form:input path="checkingDate" type="text"
					class="form-control" required="required"/>
					<form:errors path="checkingDate" cssClass="text-warning"/>
				
			</fieldset>

			<button type="submit" class="btn btn-success" >Tap here to Add</button>
		</form:form>
	</div>

	<%@ include file="common/footer.jspf"%>
	