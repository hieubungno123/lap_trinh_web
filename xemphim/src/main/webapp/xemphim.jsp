<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="utf-8">
    <title>Xem phim</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/home.css">
	
</head>
<body>
	
	
    <header class=" bg-secondary ">
        <nav class="navbar navbar-expand-lg  bg-secondary ">
            <div class="container-fluid text-center  ">

              <a class="navbar-brand text-light" href="index.jsp"> <i class="fa-solid fa-film"></i> Trang chu</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                
                <form class="d-flex" role="search">
                  <input class="px-2 search" type="search" placeholder="Search" aria-label="Search">
                  <button class="btn0 btn-outline-success" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                </form>
                <!-- <div class=" login m-auto">
                    <a class="login-sub" href="index2.jsp">Admin</a>
                    <a class="login-sub" href="">Dang ky</a>
                </div> -->

              </div>
              
            </div>
          </nav>

          <nav class="navbar navbar-expand-lg bg-secondary">
            <div class="container-fluid">             
                <ul class="navbar-nav m-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                      <a class="nav-link" href="#">TRANG CHỦ</a>
                    </li>
 
                    <li class="nav-item">
                      <a class="nav-link" href="#">THỂ LOẠI</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">PHIM BỘ</a>
                    </li>
  
                    <li class="nav-item">
                      <a class="nav-link" href="#">PHIM LẺ</a>
                    </li>
  
                    <li class="nav-item">
                      <a class="nav-link" href="#">PHIM CHIẾU RẠP</a>
                    </li>
                  </ul>
            </div>
          </nav>
    </header>

    <!-- Main content -->
    <div class="container mt-4">
        <div class="row">
            <div class="col-md-8 offset-md-2">
                <div class="embed-responsive embed-responsive-16by9">
                    <iframe width="560" height="315" src="${movies.linkPhim}" title="YouTube video player" 
                    frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
                </div>
                <div class="mt-4">
                    <h2>${movies.tenPhim}</h2>
                    <p>${movies.moTa}</p>
                </div>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer class="bg-dark text-white text-center py-3 mt-4">
        <p>&copy; 2024 Trang xem phim. All rights reserved.</p>
    </footer>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
