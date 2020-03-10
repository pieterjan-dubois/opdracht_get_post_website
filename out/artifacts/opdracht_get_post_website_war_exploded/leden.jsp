<%@ page import="domain.model.Registratie" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: piete_8alqa94
  Date: 10/03/2020
  Time: 03:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Les Trois Vallees | Overzicht leden</title>
    <link rel="stylesheet" href="CSS/css.css">
</head>
<body>
<nav class="container teal borderYtoX">

    <ul>
        <li class="sectie">
            <a href="index.html" >Home</a>
        </li>
        <li class="sectie">
            <a href="registratie.jsp">Registratie</a>
        </li>
        <li class="sectie">
            <a href="leden.jsp" class="selected">Overzicht Leden</a>
        </li>
    </ul>
</nav>
<h1><b>Dit zijn alle leden van de fanclub Les Trois vallees</b></h1>
<tbody>

<% ArrayList<Registratie> leden = (ArrayList) request.getAttribute("leden");
    String result="";
    for(Registratie R:leden){
        result = result + "<tr> <th>" + R.getNaam() +"</th> \n" + "<th>" + R.getAchternaam() + "</th> \n" + "<th>"
                + R.getLoginnaam() + "</th> \n" + "<th>" + R.getEmail() + "</th> \n" + "<th>" + R.getNiveau()+"</th> \n";
    }
%>
<%=result%>
</tbody>
</body>
</html>


