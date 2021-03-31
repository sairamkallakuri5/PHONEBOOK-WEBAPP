<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<body >

	<h2>View Contacts</h2>

	<script type="text/javascript">
		function confirmDelete() {
			return confirm("Are you sure ,to  delete");

		}
	</script>


	<a href="load-form">Add New Contact</a>
	<br>
	<br>
	<br>
	<table border="1">
		<thead>
			<tr>
				<th>Contact Id :</th>
				<th>Contact Name :</th>
				<th>Contact Email :</th>
				<th>Contact PhNo :</th>
				<th>Actions</th>

			</tr>
		</thead>

		<tbody>
			<c:forEach var="contact_Info" items="${contactInfoList }">

				<tr>
					<td>${contact_Info.contactId }</td>
					<td>${contact_Info.name }</td>
					<td>${contact_Info.email }</td>
					<td>${contact_Info.phno}</td>
					<td><a href="edit?cid=${contact_Info.contactId }">Edit</a> <a
						href="delete?cid=${contact_Info.contactId }" onclick="return confirmDelete()">Delete</a></td>


				</tr>



			</c:forEach>




		</tbody>





	</table>




</body>
</html>