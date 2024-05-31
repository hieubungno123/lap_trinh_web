<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="utf-8">
    <title>Quản Lý Thông Tin Sinh Viên</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            padding: 20px;
        }
        h4 {
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .btn-group button {
            margin-right: 5px;
        }
        td {
        color: black;
        }
    </style>
</head>
<body>
<%
    String formtitle = "QUẢN LÝ THÔNG TIN PHIM";
%>
<div class="container">
    <h4 class="text-center"><%= formtitle %></h4>
    <form method="post" action='adminMovie'>
        <div class="form-group">
            <label for="parmaphim">Mã Phim</label>
            <input type="text" class="form-control" id="parmaphim" name="parmaphim" value=''>
        </div>
        <div class="form-group">
            <label for="partenphim">Tên Phim</label>
            <input type="text" class="form-control" id="partenphim" name='partenphim' value=''>
        </div>
        <div class="form-group">
            <label for="parthoiluong">Phút</label>
            <input type="text" class="form-control" id="parthoiluong" name='parthoiluong' value=''>
        </div>
        <div class="form-group">
            <label for="parlinkphim">Link phim</label>
            <input type="text" class="form-control" id="parlinkphim" name='parlinkphim' value=''>
        </div>
        <div class="form-group">
            <label for="parmota">Mô tả</label>
            <input type="text" class="form-control" id="parmota" name='parmota' value=''>
        </div>
        <div class="form-group">
            <label for="parnhasanxuat">Nhà sản xuất</label>
            <input type="text" class="form-control" id="parnhasanxuat" name='parnhasanxuat' value=''>
        </div>
        <div class="form-group">
		    <label for="partheloai">Thể loại</label>
		    <select class="form-control" id="partheloai" name="partheloai">
		        <option value="">Chọn thể loại</option>
		        <option value="PhimBo">PhimBo</option>
		        <option value="PhimLe">PhimLe</option>
		        <option value="PhimChieuRap">PhimChieuRap</option>
		    </select>
		</div>

        <div class="btn-group">
            <button type="submit" class="btn btn-primary" name="action" value="create">Create</button>
            <button type="submit" class="btn btn-warning" name="action" value="modify">Modify</button>
            <button type="submit" class="btn btn-danger" name="action" value="delete">Delete</button>
        </div>
    </form>

    <table class="table table-bordered table-striped mt-4">
        <thead>
            <tr>
                <th>Mã phim</th>
                <th>Tên phim</th>
                <th>Thời lượng</th>
                <th>Link phim</th>
                <th>Mô tả</th>
                <th>Nhà sản xuất</th>
                <th>Thể loại</th>
                <!-- Add other column headers as needed -->
            </tr>
        </thead>
        <tbody>
            <%-- <c:forEach var="student" items="${students}"> --%>
            <tr>
                <td>${movies.maPhim}</td>
                <td>${movies.tenPhim}</td>
                <td>${movies.thoiLuong}</td>
                <td>${movies.linkPhim}</td>
                <td>${movies.moTa}</td>
                <td>${movies.nhaSanXuat}</td>
                <td>${movies.theLoai}</td>
                <!-- Add other columns as needed -->
            </tr>
            <%-- </c:forEach> --%>
        </tbody>
    </table>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>