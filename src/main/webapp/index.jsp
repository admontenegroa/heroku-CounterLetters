<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">

<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style type="text/css">
        body {
            background-color: black;
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
    <title>Inicio de Sesión</title>

</head>

<body>

    <div class="container-fluid">

        <div class="row">

            <section>
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                    <div class="tm-wrapper-center">
                        <h1 class="tm-section-intro-title">Bienvenido</h1>
                        <h1>Formulario de Autenticación</h1>





                        <form action="/CounterLetters/login" method="post">
                            <label>Si desea conocer el
                                número de letras que contiene una palabra. Primero debe iniciar
                                sesión</label>
                            <input type="password" id="usuario" name="usuario" class="form-control" />
                            <input type="submit" name="submit" value="Iniciar Sesion" onclick="sesionIniciada()" />
                            <script type="text/javascript">
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
                    Luis Cruz, Omar Castro, Erika Daza, José Becerra (2019-3)</p>
            </div>
        </div>

    </div>

</body>

</html>