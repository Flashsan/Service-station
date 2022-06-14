<%--
  Created by IntelliJ IDEA.
  User: Note
  Date: 13.05.2022
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <!-- Bootstrap CSS -->
   <c:import url="header.jsp"/>
    <title>Administrator</title>
</head>
<body>
<caption><h2>List of Clients</h2></caption>
<div class="addButton">
    <a href="addClient">ADD NEW Client</a>
</div>

<form action="listClient" method="get">
    <table class="table table-hover">
        <thread>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Last name</th>
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </tr>
        </thread>
        <tbody>
        <c:forEach var="listClient" items="${listClient}">
            <tr>
                <td><c:out value="${listClient.id}"/></td>
                <td><c:out value="${listClient.name}"/></td>
                <td><c:out value="${listClient.lastName}"/></td>
                <td><a href="editClient?clientId=${listClient.id}">EDIT</a></td>
                <i class="bi bi-trash">
                    <td><a href="deleteClient?clientId=${listClient.id}">DELETE</a></td>
                </i>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
<footer>
    <jsp:include page="footer.jsp"/>
</footer>
</html>






