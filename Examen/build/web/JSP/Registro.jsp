<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Registro 1</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            Connection conexion = null;
            Statement sentencia = null;
            ResultSet resultado = null;
            String url="jdbc:mysql://localhost/Examen";
            String user="root";
            String password="n0m3l0";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                sentencia = conexion.createStatement();
                System.out.println("Conectado1");
            }
            catch(Exception e){
                System.out.println("No hay conexion");
            }
        %>
        <%
            String Nombre = request.getParameter("Nombre");
            String ApellidoPaterno = request.getParameter("ApellidoPaterno");
            String ApellidoMaterno = request.getParameter("ApellidoMaterno");
            String Escuela = request.getParameter("Escuela");
            String MateriaFavorita = request.getParameter("MateriaFavorita");
            String DeporteFavorito = request.getParameter("DeporteFavorito");
            String contra = request.getParameter("Contraseña");
            String contra2 = request.getParameter("Contraseña2");
            System.out.println("2");
            try{
                System.out.println("2.1");
                    System.out.println("3");
                    sentencia.executeUpdate("insert into usuarios1 (Nombre, ApellidoPaterno, Escuela, MateriaFavorita, DeporteFavorito) values('"+Nombre+"','"+ApellidoPaterno+"','"+ApellidoMaterno+"','"+Escuela+"','"+MateriaFavorita+"','"+DeporteFavorito+",'"+contra+"'');");
                    out.println("<script>alert('Usuario registrado')</script>");
                    try{
                        System.out.println("4");
                        try{
                            System.out.println("5");
                        Class.forName("com.mysql.jdbc.Driver");
                        conexion = DriverManager.getConnection(url, user, password);
                        sentencia = conexion.createStatement();
                        System.out.println("Conectado");
                    }
                    catch(Exception e){
                        System.out.println("Sin conexion");
                    }
                        System.out.println("6");
                    resultado = sentencia.executeQuery("select * from usuarios1 where usuario = '"+Nombre+"' and contra = '"+contra+"'");
                    int contador = 0;
                    while(resultado.next()){
                        System.out.println("7");
                        contador++;
                    }
                    if(contador == 1){
                        System.out.println("8");
                        HttpSession sesion = request.getSession(true);
                        sesion.setAttribute("usuario", Nombre);
                        response.sendRedirect("Desplegar.jsp");
                    }
                    else{
                        System.out.println("9");
                        if(contador != 1){
                            System.out.println("10");
                        try{
                            System.out.println("11");
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            out.println("<title>Servlet Login</title>");            
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<script>alert('Usuario o contraseña incorrectos')</script>");
                            out.println("<script>window.location='index.jsp'</script>");
                            out.println("</body>");
                            out.println("</html>");
                            }
                        catch(Exception e){
                    System.out.println("Error en la conexion");
                }
                        HttpSession sesion = request.getSession(false);
                    }
                        }
                }catch(Exception e){
                    System.out.println("Error en la conexion");
                }
            }catch(Exception e){
                out.println("<script>alert('Registro fallido')</script>");
                out.println("<script>window.location='index.jsp'</script>");
            }
        %>
    </body>
</html>