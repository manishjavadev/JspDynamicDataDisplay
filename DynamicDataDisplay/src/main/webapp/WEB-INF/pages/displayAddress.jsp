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
<script type="text/javascript">
var url="";
</script>
<body>
	<center>
		<h1>Hello World Program Develoved By</h1>
		<h2>${firstName}&nbsp;${lastName}</h2>
		<h2></h2>

		<table>
			<c:forEach var="country" items="${dataMaps}">
				 &${country.key}=${country.value}
				 <c:set var="salary" scope="session" value="&${country.key}=${country.value}"/>
				 
			</c:forEach>

<BR/>
Salry are : ${salary}

		</table>

	</center>
</body>
</html>
