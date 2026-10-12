<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/admin/nhan-vien/add" method="post">

    <input type="text" name="ma" placeholder="Mã">
    <input type="text" name="ten" placeholder="Tên">
    <input type="email" name="email" placeholder="Email">
    <input type="text" name="sdt" placeholder="SĐT">
    <input type="password" name="matKhau" placeholder="Mật khẩu">
    <input type="text" name="chucVu" placeholder="Chức vụ">
    <input type="number" name="trangThai" placeholder="Trạng thái">

    <button type="submit" onclick="return confirm('Thêm thành công')">Thêm</button>
</form>

<c:if test="${not empty nvEdit}">
    <form action="${pageContext.request.contextPath}/admin/nhan-vien/update" method="post">
        <!-- ID dùng để Hibernate biết cần update bản ghi nào -->
        <input type="hidden" name="id" value="${nvEdit.id}">
        <input type="text" name="ma" value="${nvEdit.ma}" placeholder="Ma">
        <input type="text" name="ten" value="${nvEdit.ten}" placeholder="Ten">
        <input type="email" name="email" value="${nvEdit.email}" placeholder="Email">
        <input type="text" name="sdt" value="${nvEdit.sdt}" placeholder="SDT">
        <input type="password" name="matKhau" value="${nvEdit.matKhau}" placeholder="Mat khau">
        <input type="text" name="chucVu" value="${nvEdit.chucVu}" placeholder="Chuc vu">
        <input type="number" name="trangThai" value="${nvEdit.trangThai}" placeholder="Trang thai">
        <button type="submit">Xác nhận</button>

    </form>
</c:if>

<table border="1" cellpadding="6" cellspacing="6">
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
    <c:forEach items="${list}" var="nv">
        <tr>
            <td>${nv.ma}</td>
            <td>${nv.ten}</td>
            <td>${nv.email}</td>
            <td>${nv.sdt}</td>
            <td>${nv.matKhau}</td>
            <td>${nv.chucVu}</td>
            <td>${nv.trangThai}</td>
            <td>
                <!-- Sửa -->
                <a href="/admin/nhan-vien/edit?id=${nv.id}" style="text-decoration: none">
                    Sửa
                </a>

                <!-- Xóa -->
                <a href="/admin/nhan-vien/delete?id=${nv.id}"
                   onclick="return confirm('Bạn có chắc muốn xóa?')">
                    Xóa
                </a>

            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>