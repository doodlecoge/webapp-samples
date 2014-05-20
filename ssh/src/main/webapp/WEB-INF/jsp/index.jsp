<%--
  Created by IntelliJ IDEA.
  User: huaiwang
  Date: 5/19/14
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
hello - index

<c:if test="${fn:length(students) gt 0}">
    <table border="1">
        <c:forEach var="student" items="${students}">
            <tr>
                <td><c:out value="${student.id  }"/></td>
                <td><c:out value="${student.name}"/></td>
                <td><c:out value="${student.sex }"/></td>
                <td><c:out value="${student.age }"/></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
