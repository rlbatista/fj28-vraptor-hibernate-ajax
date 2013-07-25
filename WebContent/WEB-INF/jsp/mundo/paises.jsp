<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Curso VRaptor</title>
</head>
<body>
	Capítulo 7.10 Exercicios 4, 5 e 6 <br />
	Com toString da lista <br />
	${stringList}
	<br />	
	<br />
	Com forEach: <br />
	<c:forEach items="${stringList}" var="pais">
		${pais} <br />
	</c:forEach>
</body>
</html>