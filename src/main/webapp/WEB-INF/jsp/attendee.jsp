<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="attendee">
		<label for="textinput1">Nom :</label>
		<form:input path="nom" />
		<br />
		<label for="textinput2">Email :</label>
		<form:input path="email" />
		<br />
		<input type="submit" class="btn" value="Enter attendee" />
	</form:form>
	<br />
</body>
</html>