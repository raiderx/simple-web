<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
    @author Pavel Karpukhin
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title> Simple jsp page </title>
    </head>
    <body>
        <h1> Students </h1>
        <div>
            <table>
                <thead>
                    <tr>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="student" items="${students}">
                        <tr>
                            <td></td>
                            <td></td>
                        </tr>
                    </c:forEach>
                    <c:if test="${empty students}">
                        <tr>
                            <td colspan="2"> No data that satisfies filter </td>
                        </tr>
                    </c:if>
                </tbody>
            </table>

        </div>
    </body>
</html>