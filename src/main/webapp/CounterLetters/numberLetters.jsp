<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (request.getAttribute("wordLength") != null) {
	%>
	<h2><%="La palabra " +request.getAttribute("originalWord") + "contiene " + request.getAttribute("wordLength") + " letras"%></h2>
	<br>
	<%
		} else {
	%>
	<br>
	<%
		}
	%>
	<a href="/CounterLetters/counterView.jsp">Desea conocer el número
		de letras de otra palabra?</a>
	<script>
		function sesionCerrada() {
			if (document.cookie == "")
				document.location = "/";
		}
		setInterval(sesionCerrada, 100);
	</script>
</body>
</html>