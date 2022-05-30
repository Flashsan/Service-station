<%--
  Created by IntelliJ IDEA.
  User: Note
  Date: 13.05.2022
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Car</title>
</head>
<body>
<table>
    <caption><h2>List of Car</h2></caption>
    <form action="listCar" method="get">
    <tr>
        <th>Id</th>
        <th>Model</th>
        <th>Color</th>
        <th>Number</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="car" items="${listCar}">
        <tr>
            <td><c:out value="${car.id}"/></td>
            <td><c:out value="${car.model}"/></td>
            <td><c:out value="${car.color}"/></td>
            <td><c:out value="${car.number}"/></td>
        </tr>
    </c:forEach>
</table>
</form>
</body>
</html>






