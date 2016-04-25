<%--
  Created by IntelliJ IDEA.
  User: aliabbasjaffri
  Date: 18/04/2016
  Time: 1:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>
      Hello World.
  </h1>
  <form action="/json/ctofservice/reply" method="post" >
    Enter Celsius Value <input type="text" name="val">
    <input type="submit" value="Get Farenheit Value" />
  </form>

  <form action="/json/ftocservice/reply" method="post" >
      Enter Farenheit Value <input type="text" name="val">
      <input type="submit" value="Get Celsius Value" />
  </form>
  </body>
</html>
