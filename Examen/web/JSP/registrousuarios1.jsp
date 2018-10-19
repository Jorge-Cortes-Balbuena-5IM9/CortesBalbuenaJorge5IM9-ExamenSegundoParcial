<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            Connection conexion = null;
            Statement sentencia = null;
            String url="jdbc:mysql://localhost/Examen";
            String user="root";
            String password="n0m3l0";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                sentencia = conexion.createStatement();
                System.out.println("conectado 1");
            }
            catch(Exception e){
                System.out.println("No conectado");
            }
        %>
        <header>
            <h1 align="center"></h1>
        </header>
        <%
            String Nombre = request.getParameter("Nombre");
            String ApellidoPaterno = request.getParameter("ApellidoPaterno");
            String ApellidoMaterno = request.getParameter("ApellidoMaterno");
            String Escuela = request.getParameter("Escuela");
            String MateriaFavorita = request.getParameter("MateriaFavorita");
            String DeporteFavorito = request.getParameter("DeporteFavorito");
            String contra = request.getParameter("Contra");
            String contra2 = request.getParameter("Contra2");
            try{
                //Valuidar contras
                if(contra.equals(contra2))
                {
                    sentencia.executeUpdate("insert into usuarios1 (Nombre,ApellidoPaterno, ApellidoMaterno, Escuela, MateriaFavorita, DeporteFavorito,Contraseña) values('"+Nombre+"','"+ApellidoPaterno+"','"+ApellidoMaterno+"','"+Escuela+"','"+MateriaFavorita+"','"+DeporteFavorito+",'"+contra+"'');");
                    out.println("<script>alert('Usuario registrado')</script>");
                    try{
                        try{
                        Class.forName("com.mysql.jdbc.Driver");
                        conexion = DriverManager.getConnection(url, user, password);
                        sentencia = conexion.createStatement();
                        System.out.println("Si entra");
                    }
                    catch(Exception e){
                        System.out.println("No entra");
                    }
                }catch(Exception e){
                    System.out.println("Error");
                }
                        } 
                //ContraIncorrecta
                else{
                    out.println("<script>alert('Contraseñas incorrectas')</script>");
                    out.println("<script>window.location='usuario.jsp'</script>");
                    System.out.println("No");
                }
            }catch(Exception e){
                out.println("<script>alert('Probablemente esta siendo corrido en otro pc')</script>");
                out.println("<script>window.location='index.jsp'</script>");
            }
        %>
    </body>
</html>