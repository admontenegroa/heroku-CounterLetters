<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <style type="text/css">
        body {
            background-color: black;
            color: #00bdde
        }

        h1,
        label,
        p {
            color: #00bdde
        }

        .container-fluid {
            position: relative;
            top: 250px;
            left: 350px;
        }
    </style>
</head>
<body>
	<%
		if (request.getAttribute("wordLength") != null) {
	%>
	<h2><%="La palabra " + request.getAttribute("originalWord") + " contiene "
						+ request.getAttribute("wordLength") + " letras"%></h2>
	<br>
	<%
		} else {
	%>
	<br>
	<%
		}
	%>
	<a href="/CounterLetters/counterView.jsp">Desea conocer el n�mero
		de letras de otra palabra?</a>
	<script type="text/javascript">
		function sesionCerrada() {
			if (document.cookie == "")
				document.location = "/";
		}
		setInterval(sesionCerrada, 100);
	</script>
</body>
</html>