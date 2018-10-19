<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>Inicio</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
	</head>
	<body>
			<header id="header" class="alt">
				<div class="inner">
					<h1>Inicio</h1>
				</div>
			</header>

			<div id="wrapper">
					<section id="intro" class="main">
						<ul class="actions">
                                                        <form action="registrousuarios.jsp" method="get">
                                                            <input type="submit" name="botonRegistro" value="Crear cuenta" class="noo">
                                                        </form>
                                                        <form action="Login.jsp" method="get">
                                                            <input type="submit" name="botonLogin" value="Iniciar Sesión" class="noo">
                                                        </form>
                                                        <form action="Desplegar.jsp" method="get">
                                                            <input type="submit" name="botonLogin" value="Desplegar Todo" class="noo">
                                                        </form>
						</ul>
					</section>
			</div>
	</body>
