<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <meta charset="ISO-8859-1">
    <title>DMV App</title>
</head>
<body>
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="/">Dashboard</a>
</nav>
<div class="container">
    <h2>New License</h2>
    <form:form action="/ninjas" method="POST" modelAttribute="ninja">
        <div class="form-group">
            <form:label path="dojo">Dojo</form:label>
            <form:errors path="dojo"/>
            <form:select class="form-control" path="dojo">
                <c:forEach items="${dojo}" var="d">
                    <form:option value="${ d.id }">${ d.name }</form:option>
                </c:forEach>
            </form:select>
        </div>
        <div class="form-group">
            <form:label path="firstName">firstName</form:label>
            <form:errors path="firstName"/>
            <form:input class="form-control" path="firstName"/>
        </div>

        <div class="form-group">
            <form:label path="lastName">lastName</form:label>
            <form:errors path="lastName"/>
            <form:input class="form-control" path="lastName"/>
        </div>

        <div class="form-group">
            <form:label path="age">age</form:label>
            <form:errors path="age"/>
            <form:input class="form-control" path="age"/>
        </div>



        <button>Add Ninja</button>
    </form:form>
</div>
</body>
</html>