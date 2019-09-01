<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">

<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Inicio de Sesión</title>
<!--
        Ocean Theme
        http://www.templatemo.com/tm-484-ocean
        -->

<!-- load stylesheets -->

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
<!-- Google web font "Open Sans", https://www.google.com/fonts/specimen/Open+Sans -->
<link rel="stylesheet" href="/font-awesome-4.5.0/css/font-awesome.min.css">
<!-- Font Awesome, https://fortawesome.github.io/Font-Awesome/ -->
<link rel="stylesheet" href="/css/bootstrap.min.css">
<!-- Bootstrap style, http://v4-alpha.getbootstrap.com/ -->
<link rel="stylesheet" href="/css/templatemo-style.css">
<!-- Templatemo style -->

</head>

<body>

	<div class="container-fluid">

		<div class="row">

			<section class="tm-section-intro">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
				<div class="tm-wrapper-center">
					<h1 class="tm-section-intro-title">Bienvenido</h1>
					<div>Formulario de Autenticación</div>





					<form action="/CounterLetters/login" method="post">
						<label align="center" for="password">Si desea conocer el
							número de letras que contiene una palabra. Primero debe iniciar
							sesión</label> <input type="password" id="usuario" name="usuario"
							class="form-control" /> <input type="submit" name="submit"
							value="Iniciar Sesion" onclick="sesionIniciada()" />
						<script>
							function sesionIniciada() {
								document.cookie = document
										.getElementById("usuario").value;
							}
						</script>
					</form>
				</div>
			</div>
			</section>

		</div>

		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
				<p class="text-xs-center tm-copyright-text">Andrés Montenegro,
					Luis Cruz, Omar Castro, Erika Daza, José Becerra © (2019)</p>
			</div>
		</div>

	</div>

</body>

</html>