<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/03/2024
  Time: 5:03 CH
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
<form action="" method="post">
    <div class="mb-3">
        <label >Mã</label>
        <input type="text" class="form-control" name="">
    </div>

    <div class="mb-3">
        <label >Tên</label>
        <input type="text" class="form-control" name="">
    </div>

    <div class="mb-3">
        <label >Tuổi</label>
        <input type="text" class="form-control" name="tuoi">
    </div>

    <div class="mb-3">
        <label class="form-label">Gioi tinh</label>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="gioiTinh" id="Nam" value="Nam">
            <label class="form-check-label">Nam</label>
        </div>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="gioiTinh" id="Nu" value="Nu" checked>
            <label class="form-check-label">Nu</label>
        </div>
    </div>

    <div class="mb-3">
        <label >Địa chỉ</label>
        <input type="text"  class="form-control" name="diaChi">
    </div>
</form>

</body>
</html>
