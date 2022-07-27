<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

<link rel="stylesheet" href="style.css">

<title>Where's the Weather?</title>
</head>
<body>

<form class = "form" action= "/weatherResult" method="post">
	
	<label for="latitude">Enter Latitude: </label>
	<input type="text" name="latitude" placeholder= "latitude">
	
	<label for="longitude">Enter Longitude: </label>
	<input type="text" name="longitude" placeholder= "longitude">
	
	<input class="button" type="submit" value="Submit">
	

</form>

</body>
</html>