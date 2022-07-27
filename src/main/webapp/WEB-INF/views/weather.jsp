<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Look, it's the weather!</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link rel="stylesheet" href="style.css">

</head>
<body>
Current Temperature in <br>
 <c:out value = "${weather.location.areaDescription}: "/>
 <c:out value = "${weather.currentObservation.latitude} , "/>
 <c:out value = "${weather.currentObservation.longitude}"/>
<div class= "current-temp"> 
<h1><c:out value = "${weather.currentObservation.temp}"/></h1>
<c:out value= "${weather.currentObservation.weather}"/>
</div>
 <br>
 Date and Time: <c:out value = "${weather.currentObservation.date}"/>
 <br>
 
 <div class= "table">
 <h2>Future forecast</h2>
<br> 
 
<table class= table>
	<thead>
			<th> 	</th>
	<c:forEach var= "time" items="${weather.time.startPeriodName}">
			<th><c:out value= "${time}" /></th>
		<!-- <th>Type</th>
			<th>Score</th>
			<th>Possible Points</th>
		 -->
		</c:forEach>
	</thead>
	  <tbody>
			<tr>
			 	<td>Temperature</td>
			 	<c:forEach var = "i" begin = "0" end = "${fn:length (weather.time.tempLabel)}" step= "1">
      				<td>
      					<c:out value= "${weather.time.tempLabel[i]}" />:
      					<c:out value="${weather.data.temperature[i]}"/>
      				</td>
      		
      			</c:forEach>

			</tr>
			<tr>
				<td>Weather</td>
				<c:forEach var = "i" begin = "0" end = "${fn:length (weather.time.tempLabel)}" step= "1">
					<td>
						<c:out value= "${weather.data.weather[i]}"/>
					</td>
      			</c:forEach>
			
			</tr>
			
		
		
	
	</tbody>


</table>
</div>

</body>
</html>