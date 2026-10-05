<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>ma</th>
            <th>ten</th>
            <th>email</th>
            <th>sdt</th>
            <th>matKhau</th>
            <th>chucVu</th>
            <th>trangThai</th>
            <th>action</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.ma}</td>
                <td>${list.ten}</td>
                <td>${list.email}</td>
                <td>${list.sdt}</td>
                <td>${list.matKhau}</td>
                <td>${list.chucVu}</td>
                <td>${list.tranThai}</td>
                <td></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>