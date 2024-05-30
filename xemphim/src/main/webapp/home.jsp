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
<!-- <link rel="stylesheet" href="./assests/css/style.css">
 -->
<style>
	@import url("https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap");

* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}

body {
    font-family: "Roboto", sans-serif;
    background-color: #02080f;
}

img {
    max-width: 100%;
    display: block;
    margin: auto;
}

a {
    text-decoration: none;
}

ul {
    list-style-type: none;
}

/* Header style */
.header {
    height: 60px;
    background-color: #2d2d2d;
    border-bottom: 1px solid #181818;
}

.logo img {
    width: 120px;
}

.menu .active {
    color: #da966e!important;
}

.menu .has-sub-menu {
    position: relative;
}

.menu .has-sub-menu .sub-menu {
    position: absolute;
    top: 100%;
    left: 0;
    width: 600px;
    background: #2d2d2d;
    overflow: hidden;
    padding: 10px;
}

main .heading-title {
    font-size: 24px;
    color: #da966e;
}

/*Movie item*/
.movie-item {
    margin-bottom: 32px;
    position: relative;
}

.movie-item .movie-media {
    position: relative;
    display: block;
    height: 250px;
}

.movie-item .media-cover {
    width: 100%;
    height: 100%;
    background-size: cover;
    background-repeat: no-repeat;
    background-position: 50% 50%;
    background-color: #101010;
    overflow: hidden;
    border-radius: 6px;
}

.movie-item .play-btn {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    z-index: 2;
    opacity: 0;
    background-image: url(https://khoaiphim.com/image/play66.png);
    background-repeat: no-repeat, repeat;

    width: 60px;
    height: 60px;
    border-radius: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
    cursor: pointer;
    transition: all 0.3s;
}

.movie-item .movie-media:hover .play-btn {
    opacity: 1;
}

.movie-item .movie-caption {
    margin-top: 10px;
}

.movie-item .movie-caption .movie-titlesub {
    font-size: 12px;
    max-height: 19.2px;
    overflow: hidden;
    color: #b5b5be;
}

.movie-item .movie-caption .movie-titlesub:hover {
    color: #f5c518;
}

.movie-item .movie-caption a {
    display: block;
}

.movie-item .movie-caption .movie-title {
    font-size: 14px;
    max-height: 42.4px;
    overflow: hidden;
    font-weight: 600;
    color: #fff;
}

.movie-item .movie-caption .movie-title:hover {
    color: #f5c518;
}

#film-poster img {
    width: 350px;
    height: 450px;
    object-fit: cover;
}

.star-icon {
    color: #f5c518;
}

/*Search phim*/
.form-filter .filter-item {
    float: left;
    color: #959595;
    font-size: 12px;
    margin: 0 5px 0 0;
}

.form-filter .filter-item .form-control {
    width: 140px;
    margin: 0 5px 0 0;
    padding: 3px;
    font-size: 12px;
    height: 28px;
    background: #383838;
    box-shadow: none;
    border: none;
    color: #fafafa;
    outline: none;
    border-radius: 0;
}

.form-filter .btn {
    padding: 5.5px 8px;
    font-size: 12px;
    font-weight: bold;
    background: #666;
    color: #fff;
    border: none;
    outline: none;
    border-radius: 0;
}

.pagination ul li {
    margin: 3px;
    display: inline-block;
}

.pagination ul li a {
    color: #fff;
    border: 1px solid #4c4c4c;
    background: #3a3a3a;
    padding: 7px 11px;
    font-weight: bold;
    font-size: 13px;
}

.pagination ul li a.current {
    border-color: #ff6901;
    color: #ff9601;
}
</style>
</head>
<body>

	 <header class="header">
    <div class="h-100 container">
        <div class="h-100 d-flex justify-content-start align-items-center">
            <div class="logo">
                <a th:href="@{/}">
                    <img src="https://motchill.co/motchill.png?v1.0.2" alt="logo">
                </a>
            </div>
            <div class="menu h-100 d-flex">
                <ul class="d-flex align-items-center mb-0">
                    <li class="h-100">
                        <a class="h-100 d-flex align-items-center text-white text-uppercase ms-3"
                           >Trang
                            chủ</a>
                    </li>
                    <li class="h-100">
                        <a class="h-100 d-flex align-items-center text-white text-uppercase ms-3"
                           >Phim
                            bộ</a>
                    </li>
                    <li class="h-100">
                        <a class="h-100 d-flex align-items-center text-white text-uppercase ms-3"
                           >Phim lẻ</a>
                    </li>
                    <li class="h-100">
                        <a class="h-100 d-flex align-items-center text-white text-uppercase ms-3"
                           >Phim chiếu rạp</a>
                    </li>
                    <li class="h-100">
                        <a class="h-100 d-flex align-items-center text-white text-uppercase ms-3"
                           >Tìm kiếm phim</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</header>

<main class="py-5">
  <div class="container">
    <h2 class="heading-title mb-4 fw-normal">Phim hot</h2>
    <div class="owl-carousel">
      <div th:each="film : ${hotFilmList}">
        <div class="movie-item">
          <a th:href="@{/phim/{id} (id=${film.id})}" class="movie-media">
            <div class="play-btn">
            </div>
            <div class="media media-cover"
                 th:style="|background-image: url(${film.poster});|">
            </div>
          </a>
          <div class="movie-caption">
            <a th:href="@{/phim/{id} (id=${film.id})}" class="movie-title" th:text="${film.title}">
              Vén Màn Tội Ác</a>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="container">
    <h2 class="heading-title mb-4 fw-normal">Phim mới gần đây</h2>
    <div class="row">
      <div class="col-lg-2" th:each="film : ${newFilmList}">
        <div class="movie-item">
          <a th:href="@{/phim/{id} (id=${film.id})}" class="movie-media">
            <div class="play-btn">
            </div>
            <div class="media media-cover"
                 th:style="|background-image: url(${film.poster});|">
            </div>
          </a>
          <div class="movie-caption">
            <a th:href="@{/phim/{id} (id=${film.id})}" class="movie-title" th:text="${film.title}">
              Vén Màn Tội Ác</a>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="container">
    <h2 class="heading-title mb-4 fw-normal">Phim lẻ gần đây</h2>
    <div class="row">
      <div class="col-lg-2" th:each="film : ${featureFilmList}">
        <div class="movie-item">
          <a th:href="@{/phim/{id} (id=${film.id})}" class="movie-media">
            <div class="play-btn">
            </div>
            <div class="media media-cover"
                 th:style="|background-image: url(${film.poster});|">
            </div>
          </a>
          <div class="movie-caption">
            <a th:href="@{/phim/{id} (id=${film.id})}" class="movie-title" th:text="${film.title}">
              Vén Màn Tội Ác</a>
          </div>
        </div>
      </div>
    </div>
  </div>
</main>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js"
        integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"
        integrity="sha512-bPs7Ae6pVvhOSiIcyUClR7/q2OAsRiovw4vAkX+zJbw3ShAeeqezq50RIIcIURq7Oa20rW2n2q+fyXBNcU9lrw=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>

<script th:inline="javascript">
  $(document).ready(function () {
    $(".owl-carousel").owlCarousel({
      items: 4,
      margin: 20,
      loop: true
    });
  });
</script>

</body>
</html>