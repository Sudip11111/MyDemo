<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="student.do" modelAttribute="student">
	
        ID: <form:input path="id" />

		<br>
		<br>	
	
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />

		<br>
		<br>
	
		Country:
		
		<form:select path="country">

			<form:options items="${student.countryOptions}" />

		</form:select>

		<br>
		<br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br>
		<br>

		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br>
		<br>
		<tr>
			<td colspan="2"><input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" /> <input
				type="submit" name="action" value="Delete" /> <input type="submit"
				name="action" value="Search" /></td>
		</tr>
		<table border="1">
			<th>ID</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Country</th>
			<th>Favourite Programming Language</th>
			<th>Operating System Preferred</th>



			<c:forEach items="${studentList}" var="student">
				<tr>
					<td>${student.id}</td>
					<td>${student.firstName}</td>
					<td>${student.lastName}</td>
					<td>${student.country}</td>
					<td>${student.favoriteLanguage}</td>
					<td>${student.operatingSystems}</td>


				</tr>
			</c:forEach>
		</table>


	</form:form>


</body>

</html>












