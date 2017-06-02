<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
	<center>
		<h1>Hello World Program Develoved By</h1>
		<h2>${firstName}&nbsp;${lastName}</h2>
		<h2></h2>

		<table>
			<c:forEach var="dataMap" items="${dataMaps}">
       		Name : ${dataMap.name} &  
       		City : ${dataMap.city}<br />
       		
				<br />

				<c:set var="listData" value="${dataMap.listData}"></c:set>
				Let's see how to iterate List<br />
				<c:forEach var="data" items="${listData}" varStatus="count">
				${count.count}: ${data}
				<br />
				</c:forEach>
			</c:forEach>
		</table>

	</center>
</body>
</html>
