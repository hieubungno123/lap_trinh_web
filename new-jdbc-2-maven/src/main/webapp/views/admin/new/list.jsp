<%@include file="/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sach bai viet</title>
</head>
<body>
	<div class="main-content">
		<form action="<c:url value ='/admin-new'/>" id="formSubmit" method="get" >
		    <div class="main-content-inner">
		        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
		            <ul class="breadcrumb">
		                <li>
		                    <i class="ace-icon fa fa-home home-icon"></i>
		                    <a href="#">Trang chủ</a>
		                </li>
		            </ul><!-- /.breadcrumb -->
		        </div>
		        <div class="page-content">
		            <div class="row" >
		                <div class="col-xs-12">
		                	<div class="row" >
		               			<div class="col-xs-12">
									<div class="table-responsive">
										<table class="table table-striped">
										    <thead>
										      <tr>
										        <th>Ten bai viet</th>
										        <th>Mo ta ngan</th>
										      </tr>
										    </thead>
										    <tbody>
										      <c:forEach var="item" items="${model.listResult}">
										      	<tr>
										      		<td>${item.title}</td>
										      		<td>${item.content}</td>
										      	</tr>
										      </c:forEach>
										      
										        
										    </tbody>
										 </table>
									</div>
								</div>
							</div>
		                </div>
		            </div>
		        </div>
		    </div>
		</form>
	</div>
	<!-- /.main-content -->
	<script >
		/* var totalPages = ${model.totalPage};
		var currentPage = ${model.page};
		var limit = 2;
		$(function () {
			window.pagObj = $('#pagination').twbsPagination({
 				totalPages: totalPages,
				visiblePages: 10,
				startPage: currentPage,
				onPageClick: function (event, page) {
					if (currentPage != page) {
						$('#formSubmit').submit();
						$('#page').val(page);
						$('#maxPageItem').val(limit);
					} 
					/* if (currentPage != page) {
						
						$('#sortName').val('title');
						$('#sortBy').val('desc');
						$('#type').val('list');
						$('#formSubmit').submit();
					} */
				}
			});
		}); */
	</script> 
</body>
</html>