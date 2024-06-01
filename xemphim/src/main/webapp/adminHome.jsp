<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title> Home</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

 <style>
        /* CSS được viết trực tiếp */
        body {
            background-color: #f8f9fa;
        }

        .content-wrapper {
            margin-top: 20px;
            background-color: #fff; /* Màu nền */
            border-radius: 5px; /* Bo góc */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Hiệu ứng bóng */
            padding: 20px; 
        }
        
        .content-header {
            margin-bottom: 20px; /* Khoảng cách với phần nội dung */
        }

        .breadcrumb {
            background-color: #e9ecef;
        }

		.breadcrumb-item {
            font-weight: bold; /* In đậm */
        }
        
        .breadcrumb-item a {
            color: #007bff; /* Màu chữ */
            text-decoration: none; /* Loại bỏ gạch chân */
        }
        
        .breadcrumb-item.active {
            color: #000; /* Màu chữ cho mục hiện tại */
        }
        
        .breadcrumb-item.active:hover {
            text-decoration: underline; /* Gạch chân khi di chuột qua */
        }

        .breadcrumb-item.active:not(:first-child)::before {
            content: "/\00a0"; /* Ký tự ngăn cách */
            color: #000; /* Màu ký tự ngăn cách */
        }
        
        .card-header {
            background-color: #007bff;
            color: #fff;
        }

        .card-header a {
            color: #fff;
            text-decoration: none;
            font-weight: bold;
        }

        .table-responsive {
            overflow-x: auto;
        }
    </style>
        
</head>
<body>
	<div class="content-wrapper">
	    <div class="content-header">
	        <div class="container-fluid">
	            <div class="row mb-2">
	                <div class="col-sm-12">
	                    <ol class="breadcrumb">
	                        <li class="breadcrumb-item">
	                            <a href="index.jsp">Trang chủ</a>
	                        </li>
	                        <li class="breadcrumb-item active">
	                            <a href="index2.jsp">Admin</a>
	                        </li>
	                    </ol>
	                </div>
	            </div>
	        </div>
	    </div>
	
	    <!-- Main content -->
	    <section class="content">
	        <div class="container-fluid">
	            <div class="row">
	                <div class="col-12">
	                    <div class="card">
	                        <div class="card-body">
	                            <div class="row">
	
	                                <div class="col-md-12">
	                                    <div class="card">
	                                        <div class="card-header border-transparent">
	                                            <h3 class="card-title">Danh sách phim</h3>
	                                            <a href="adminMovie.jsp">Cập nhật phim</a>
	                                        </div>
	
	                                        <div class="card-body p-0">
	                                            <div class="table-responsive">
	                                                <table class="table m-0">
	                                                    <thead>
	                                                        <tr>
	                                                            <th>Mã phim</th>
	                                                            <th>Tên phim</th>
	                                                            <th>Phút</th>
	                                                            <th>Link phim</th>
	                                                            <th>Mô tả</th>
	                                                            <th>Nhà sản xuất</th>
	                                                            <th>Thể loại</th>
	                                                        </tr>
	                                                    </thead>
	                                                    <tbody>
	                                                        <c:forEach var="movie" items="${movies}">
		                                                        <tr>
		                                                            <td>${movie.maPhim}</td>
		                                                            <td>${movie.tenPhim}</td>
		                                                            <td>${movie.thoiLuong}</td>
		                                                            <td>${movie.linkPhim}</td>
		                                                            <td>${movie.moTa}</td>
		                                                            <td>${movie.nhaSanXuat}</td>
		                                                            <td>${movie.theLoai}</td>
		                                                        </tr>
	                                                        </c:forEach>
	                                                    </tbody>
	                                                </table>
	                                            </div>
	                                        </div>
	                                    </div>
	                                </div>
	
	                                <%-- <div class="col-md-12">
	                                    <div class="card">
	                                        <div class="card-header border-transparent">
	                                            <h3 class="card-title">User mới nhất</h3>
	                                            Cập nhật User
	                                        </div>
	
	                                        <div class="card-body p-0">
	                                            <div class="table-responsive">
	                                                <table class="table m-0">
	                                                    <thead>
	                                                        <tr>
	                                                            <th>Họ tên</th>
	                                                            <th>Email</th>
	                                                            <th>Số điện thoại</th>
	                                                        </tr>
	                                                    </thead>
	                                                    <tbody>
	                                                        <tr th:each="user : ${latestUsers}">
	                                                            <td>
	                                                                <a th:href="@{/admin/users/{id}/detail (id=${user.id})}" th:text="${user.name}"></a>
	                                                            </td>
	                                                            <td th:text="${user.email}"></td>
	                                                            <td th:text="${user.phone}"></td>
	                                                        </tr>
	                                                    </tbody>
	                                                </table>
	                                            </div>
	                                        </div>
	                                    </div>
	                                </div> --%>
	
	                             
	                                
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </section>
	</div>
		
</body>
</html>