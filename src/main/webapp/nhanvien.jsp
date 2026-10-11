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


<form action="${pageContext.request.contextPath}/admin/nhan-vien/update"
      method="post">

    <!-- ID dùng để Hibernate biết cần update bản ghi nào -->
    <input type="hidden" name="id" value="${nv.id}">
    <input type="text" name="ma" value="${nv.ma}" placeholder="Ma">
    <input type="text" name="ten" value="${nv.ten}" placeholder="Ten">
    <input type="email" name="email" value="${nv.email}" placeholder="Email">
    <input type="text" name="sdt" value="${nv.sdt}" placeholder="SDT">
    <input type="password" name="matKhau" value="${nv.matKhau}" placeholder="Mat khau">
    <input type="text" name="chucVu" value="${nv.chucVu}" placeholder="Chuc vu">
    <input type="number" name="trangThai" value="${nv.trangThai}" placeholder="Trang thai">
    <button type="submit">Cập nhật</button>

</form>


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
                    <a href="/admin/nhan-vien/edit?id=${nv.id}">
                        Sửa
                    </a>

                    <!-- Xóa -->
                    <a href="/admin/nhan-vien/delete?id=${nv.id}"
                       onclick="return confirm('Bạn có chắc muốn xóa?')">
                        Xóa
                    </a>

                    <button type="submit">
                        <a href="/admin/nhan-vien/update?id=${nv.id}"></a>
                        Cap Nhat
                    </button>

                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>