<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Trang chủ</title>

 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">  
<link rel="stylesheet" href="css/home.css">


</head>
<body>

	 <header class=" bg-secondary ">
        <nav class="navbar navbar-expand-lg  bg-secondary ">
            <div class="container-fluid text-center  ">

              <a class="navbar-brand text-light" href="index.jsp">Trang chu</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                
                <form class="d-flex" role="search" method="post" action='Movie'>
           			 <input type="text" class="form-control px-2 search" id="maPhim" name='maPhim' value=''>
                  <button type="submit" class="btn0 btn-outline-success" name="action" value="create"><i class="fa-solid fa-magnifying-glass"></i></button>
                </form>
                 <div class=" login m-auto">
                    <a class="login-sub" href="index2.jsp">Admin</a>
                    <a class="login-sub" href="">Dang ky</a>
                </div> 
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
    <main>
        <!-- Phim mới -->
        <section class="movies" id="movies">
            <div class="container bg-secondary">
                <div class="row">
                    <div class="col-lg-10 m-auto">
                        <p>
                        <a class="heading" href="">PHIM LE</a>
                        </p>
                        
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-10 m-auto">
                        <div class="row movie">
                        
							<c:forEach var="movie1" items="${movies1}"> 
					            <div class="col-lg-3">
	                                <div class="box-img">
	                                    <img src="img/avenger-poster.jpg" alt="">
	                                </div>
	                                <h3>${movie1.tenPhim}</h3>
	                                <span> ${movie1.thoiLuong} min | ${movie1.theLoai}</span>
	                                <form method="post" action='Movie'>
	                                	<select class="form-control" id="maPhim" name="maPhim">
									        <option value="${movie1.maPhim}">${movie1.maPhim}</option>
									    </select>
									    <button type="submit" class="btn btn-danger" name="action" value="xemphim">XemPhim</button>
	                                </form>
	                            </div>
					        </c:forEach> 

                        </div>
                    </div>
                </div>
            </div>
            
        </section>

        <!-- PHIM CHIẾU RẠP -->
        <section class="movies" id="movies">
            <div class="container bg-secondary">
                <div class="row">
                    <div class="col-lg-10 m-auto"> 
                        <p>
                            <a class="heading" href="">PHIM CHIÊU RẠP</a>
                        </p>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-10 m-auto">
                        <div class="row movie">

                            <c:forEach var="movie2" items="${movies2}"> 
					            <div class="col-lg-3">
	                                <div class="box-img">
	                                    <img src="img/avenger-poster.jpg" alt="">
	                                </div>
	                                <h3>${movie2.tenPhim}</h3>
	                                <span> ${movie2.thoiLuong} min | ${movie2.theLoai}</span>
	                                <form method="post" action='Movie'>
	                                	<select class="form-control" id="maPhim" name="maPhim">
									        <option value="${movie2.maPhim}">${movie2.maPhim}</option>
									    </select>
									    <button type="submit" class="btn btn-danger" name="action" value="xemphim">XemPhim</button>
	                                </form>
	                            </div>
					        </c:forEach> 
					        
                        </div>
                    </div>
                </div>
            </div>
            
        </section>

        <!-- Phim bộ -->
        <section class="movies" id="movies">
            <div class="container bg-secondary">
                <div class="row">
                    <div class="col-lg-10 m-auto"> 
                        <p>
                            <a class="heading" href="">PHIM BỘ</a>
                        </p>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-10 m-auto">
                        <div class="row movie">
                            
                             <c:forEach var="movie3" items="${movies3}"> 
					            <div class="col-lg-3">
	                                <div class="box-img">
	                                    <img src="img/avenger-poster.jpg" alt="">
	                                </div>
	                                <h3>${movie3.tenPhim}</h3>
	                                <span> ${movie3.thoiLuong} min | ${movie3.theLoai}</span>
	                            	<form method="post" action='Movie'>
	                                	<select class="form-control" id="maPhim" name="maPhim">
									        <option value="${movie3.maPhim}">${movie3.maPhim}</option>
									    </select>
									    <button type="submit" class="btn btn-danger" name="action" value="xemphim">XemPhim</button>
	                                </form>
	                            </div>
					        </c:forEach> 
					        
                        </div>
                    </div>
                </div>
            </div>
            
        </section>

        

    </main>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js"
        integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"
        integrity="sha512-bPs7Ae6pVvhOSiIcyUClR7/q2OAsRiovw4vAkX+zJbw3ShAeeqezq50RIIcIURq7Oa20rW2n2q+fyXBNcU9lrw=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>

<!-- <script th:inline="javascript">
  $(document).ready(function () {
    $(".owl-carousel").owlCarousel({
      items: 4,
      margin: 20,
      loop: true
    });
  });
</script> -->

</body>
</html>