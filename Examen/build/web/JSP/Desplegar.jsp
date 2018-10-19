<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/main.css" />
        <title>Todos</title>
        <script>
            function consultar(){}
        </script>
    </head>
    <body>
        <header>
        <h1 align="center">Usuarios</h1>
        </header>
        
        <%@page import="java.sql.*,java.io.*" %>
        <%  
            out.println("<br>");
            Connection conexion=null;
            Statement sentencia=null;
            ResultSet resultado=null;
            String url="jdbc:mysql://localhost/Examen";
            String userName="root";
            String password="n0m3l0";
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conexion=DriverManager.getConnection(url, userName, password);
                sentencia=conexion.createStatement();    
                System.out.println("conecta");
            }
            catch(SQLException error){
                out.println(error.toString());
                System.out.println("no conecta");
            }
            try{ 
                out.println("<center>");
                resultado = sentencia.executeQuery("select * from usuarios1");
                out.println("<section>");
                out.println("<article>");
                out.println("<table>");
                out.println("<th>Contraseña</th>");
                out.println("<th>Nombre</th>");
                out.println("<th>Apellido Paterno</th>");
                out.println("<th>Apellido Materno</th>");
                out.println("<th>Escuela</th>");
                out.println("<th>Materia Favorita</th>");
                out.println("<th>Deporte Favorito</th>");
                while(resultado.next()){
                    String contra= resultado.getString("Contraseña");
                    String neim= resultado.getString("Nombre");
                    String apat= resultado.getString("ApellidoPaterno");
                    String amat= resultado.getString("ApellidoMaterno");
                    String esc= resultado.getString("Escuela");
                    String mf= resultado.getString("MateriaFavorita");
                    String df= resultado.getString("DeporteFavorito");
                    out.println("<tr><th>"+contra+"</th>");
                    out.println("<th>"+neim+"</th>");
                    out.println("<th>"+apat+"</th>");
                    out.println("<th>"+amat+"</th>");
                    out.println("<th>"+esc+"</th>");
                    out.println("<th>"+mf+"</th>");
                    out.println("<th>"+df+"</th>");
                    out.println("</article>");
                    out.println("</section>");
                    out.println("/center");
                }
            }
            catch(SQLException error){
                out.println(error.toString()); 
            }
        %>
        <br>
                <a href="index.jsp">Volver</a>
    </body>
</html>

