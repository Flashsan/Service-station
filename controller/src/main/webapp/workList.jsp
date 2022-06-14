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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <c:import url="header.jsp"/>
    <title>Work List</title>
</head>
<body>
<caption><h2>List of Work List</h2></caption>
<div class="addButton">
    <a href="addWorkList">ADD NEW WORK LIST</a>
</div>

<form action="listWorkList" method="get">
    <table class="table table-hover">
        <thread>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Coast</th>
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </tr>
        </thread>
        <tbody>
        <c:forEach var="listWorkList" items="${listWorkList}">
            <tr>
                <td><c:out value="${listWorkList.id}"/></td>
                <td><c:out value="${listWorkList.name}"/></td>
                <td><c:out value="${listWorkList.coast}"/></td>
                <td><a href="editOrder?orderId=${listAdministrator.id}">EDIT</a></td>
                <i class="bi bi-trash">
                    <td><a href="deleteCar?carId=${listCar.id}">DELETE</a></td>
                </i>


            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
<footer>
    <jsp:include page="footer.jsp"/>
</footer>
</html>






