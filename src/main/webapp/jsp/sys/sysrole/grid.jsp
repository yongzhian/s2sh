<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>角色列表</title>
</head>
<body>
角色列表<br>
<table border="1">
    <c:choose>
        <c:when test="${! empty list}">

            <c:forEach var="obj" items="${list}" varStatus="objState">
                <tr>
                    <td>${objState.index+1 }</td>
                    <td>${obj.id}</td>
                    <td>${obj.roleCode}</td>
                    <td>${obj.roleName}</td>
                    <td>${obj.createTime}</td>
                    <td>${obj.isValid}</td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td>空列表</td>
            </tr>
        </c:otherwise>
    </c:choose>
</table>
</body>
</html>
