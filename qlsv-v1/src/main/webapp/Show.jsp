<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="/common/taglib.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="">
		<tr>
			<th>MASV</th>
			<th>TENSV</th>
			<th>GENDER</th>
			<th>DOB</th>
		</tr>
		
		<c:forEach items="${lists} var="x">
			<tr>
				<td>${x.maSV}</td>
				<td>${x.name}</td>
				<td>${x.gender}</td>
				<td>${x.dob}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>