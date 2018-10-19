<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>Registro</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
	</head>
	<body>

			<header id="header" class="alt">
				<div class="inner">
					<h1>Registro</h1>
				</div>
			</header>

			<div id="wrapper">

					<section id="intro" class="main">
						<article>
                                                        <form method="post" action="registrousuarios1.jsp">
                                                            <span>
                                                                <input type="text" name="Nombre" id="Nombre" class="slide-up">
                                                                <label for="Nombre">Nombre</label>
                                                            </span>
                                                            <br><br>
                                                            <span>
                                                                <input type="text" name="ApellidoPaterno" id="ApellidoPaterno" class="slide-up">
                                                                <label for="ApellidoPaterno">Apellido Paterno</label>
                                                            </span>
                                                            <br><br>
                                                            <span>
                                                                <input type="text" name="ApellidoMaterno" id="ApellidoMaterno" class="slide-up">
                                                                <label for="ApellidoMaterno">Apellido Materno</label>
                                                            </span>
                                                            <br><br>
                                                            <span>
                                                                <input type="text" name="Escuela" id="Escuela" class="slide-up">
                                                                <label for="Escuela">Escuela</label>
                                                            </span>
                                                            <br><br>
                                                            <span>
                                                            <input type="text" name="MateriaFavorita" id="MateriaFavorita" class="slide-up">
                                                            <label for="MateriaFavorita">Materia Favorita</label>
                                                            </span>
                                                            <br><br>
                                                            <span>
                                                            <input type="text" name="DeporteFavorito" id="DeporteFavorito" class="slide-up">
                                                            <label for="DeporteFavorito">Deporte Favorito</label>
                                                            </span>
                                                            <br><br>
                                                            <span>
                                                            <input type="password" name="Contra" id="Contra" class="slide-up">
                                                            <label for="Contraseña">Contraseña</label>
                                                            </span>
                                                            <br><br>
                                                            <span>
                                                            <input type="password" name="Contra2" id="Contra2" class="slide-up">
                                                            <label for="Contraseña2">Repetir Contraseña</label>
                                                            </span>
                                                            <br><br>
                                                            <input type="submit" value="Registrarme" class="nop">
                                                        </form>
                                                    </div> 
                                                </article>
					</section>
			</div>
	</body>
