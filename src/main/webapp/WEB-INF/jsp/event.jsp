<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Events Page</title>
</head>
<body>
<form:form commandName ="event" >
<label for="textinput1">Nom :</label>
<form:input path="nom"/><br/>
<label for="textinput2">Prenom :</label>
<form:input path="prenom"/><br/>
<input type ="submit" class="btn" value="Enter event"/>
</form:form><br/>
<h1>${event.getNom()}</h1>
</body>
</html>