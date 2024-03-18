<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/03/2024
  Time: 4:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="offset-md-3">
            <div class="mb-3">
                <lable>Ten</lable>
                <input type="text">
                <button class="btn btn-success">Sreach</button>
            </div>

            <div class="mb-3">
                <a href="/giang-vien/view-add" class="btn btn-success">Add</a>
                <a href="/giang-vien/giang-vien-nu" class="btn btn-success">Giang Vien Nu</a>

            </div>

            <table class="table">
                <thead>
                <tr>
                    <th>STT</th>
                    <th>Mã </th>
                    <th>Tên </th>
                    <th>Tuổi </th>
                    <th>Địa chỉ</th>
                    <th>Giới tính</th>
                    <th>Action</th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="s" >
                    <tr>
                        <td>STT</td>
                        <td>${s.id}</td>
                        <td>${s.ma}</td>
                        <td>${s.ten}</td>
                        <td>${s.tuoi}</td>
                        <td>${s.gioiTinh}</td>
                        <td>${s.diaChi}</td>
                        <td><a href="/giang-vien/detail" class="btn btn-secondary">Detail</a></td>
                        <td><a href="/giang-vien/view-update" class="btn btn-secondary">Edit</a></td>
                        <td><a href="/giang-vien/remove?id=${s.id}" class="btn btn-secondary">Remove</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</body>
</html>
