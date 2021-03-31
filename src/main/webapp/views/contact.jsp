<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
</head>
<body>
	<h2>Contact Info</h2>

	<form:form action="saveContact?contactId=${contact_Info.contactId }" method="POST" modelAttribute="contact_Info">


    <font color="violet"> ${succMsg }</font>

		<table>


			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>


			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>


			<tr>
				<td>Contact Number:</td>
				<td><form:input path="Phno" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>


	</form:form>
<a href="view-contacts">View All Contacts</a>

</body>
</html>