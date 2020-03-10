<%--
  Created by IntelliJ IDEA.
  User: piete_8alqa94
  Date: 10/03/2020
  Time: 01:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Les Trois Vallees | Registratie</title>
    <link rel="stylesheet" href="CSS/css.css">
</head>
<body>
<nav class="container teal borderYtoX">

    <ul>
        <li class="sectie">
            <a href="index.html" >Home</a>
        </li>
        <li class="sectie">
            <a href="registratie.jsp" class="selected">Registratie</a>
        </li>
        <li class="sectie">
            <a href="/opdracht_get_post_website_war_exploded/Servlet">Overzicht Leden</a>
        </li>
    </ul>
</nav>

<h1>Welkom, Registreer om lid te worden van de Les Trois Vallees Fanclub</h1>

<form method="POST" action="/opdracht_get_post_website_war_exploded/Servlet" novalidate>
    Naam: <input type="text" name="naam" width="20"/>
    Achternaam: <input type="text" name="achternaam" width="20"/>
        Loginnaam: <input type="text" name="loginnaam" width="25"/>
        Passwoord: <input type="password" name="paswoord" width="30"/>
        Email: <input type="text" name="email" width="50"/>
         Niveau:<select id="niveau" name="niveau">
         <option value="Beginner">Beginner </option>
         <option value="Gemiddeld">Gemiddeld </option>
         <option value="Advanced">Advanced </option>
         <option value="Expert">Expert </option>
     </select>
         <input type="submit" value="Registreer"/>
</form>
</body>
</html>
