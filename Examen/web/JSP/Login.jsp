<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>Iniciar Sesion</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>
			<header id="header" class="alt">
				<div class="inner">
					<h1>Login</h1>
				</div>
			</header>
			<div id="wrapper">
                                            <article>
                                                <form method="post" action="../LoginServlet">
                                                <span>
                                                    <input type="text" name="Nombre" id="Nombre" placeholder="Ingresa tu nombre de usuario" class="slide-up">
                                                    <label for="Nombre">Usuario</label>
                                                </span>
                                                    <br>
                                                    <br>
                                                    <span>
                                                    <input type="password" name="password" id="password" placeholder="Ingresa tu contraseña" class="slide-up">
                                                    <label for="password">Contraseña</label>
                                                    </span>
                                                    <br>
                                                    <br>
                                                    <input type="submit" value="Ingresar" class="noo">
                                                </form>
                                                </div>
                                            </article>	
                                        </section>
			</div>
	</body>
