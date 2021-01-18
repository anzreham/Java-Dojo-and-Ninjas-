<%--
  Created by IntelliJ IDEA.
  User: great
  Date: 1/13/2021
  Time: 9:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <meta charset="ISO-8859-1">
</head>
<body>
<div class = "container"></div>
<h1>Welcome </h1>

<a href="/dojos/new">New Dojo  </a>
<br />
<a href="/ninjas/new">New Ninja  </a>
<table class="table">
    <thead class="thead-light">
    <tr>
        <th>Name</th>

        <th>Ninja Count</th>
    </tr>
    </thead>

    <tbody>
    <!-- loop through arraylist -->
    <c:forEach items="${dojos}" var="dojo">
        <tr>
            <td><a href="/dojos/${dojo.id}">${dojo.name}</a></td>


            <td> ${dojo.ninjas.size()}</td>
        </tr>

    </c:forEach>

    </tbody>






</table>

</body>
</html>
