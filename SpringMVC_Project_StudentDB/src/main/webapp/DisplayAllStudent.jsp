
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.*"%>
<%@page import= "com.jsp.springmvc.studentdb.entity.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% List<Student>  sList= (List) request.getAttribute("studentList"); %>

<table border="">
<tr >
<th>StudentId</th>
<th>StudentName</th>
<th>StudentEmail</th>
<th>StudentAge</th>
<th>StudentCourse</th>
<th>Update</th>
<th>Delete</th>
</tr>

<% for(Student students : sList) { %>
<tr>
<td><%= students.getStudentId() %></td>
<td><%= students.getStudentName() %></td>
<td><%= students.getStudentEmail() %></td>
<td><%= students.getStudentAge() %></td>
<td><%= students.getStudentCourse() %></td>


<td><a href="find-student-id?studentId=<%=students.getStudentId() %>" >UPDATE</a></td>
<td ><a href="delete-student-id?studentId=<%=students.getStudentId() %>">DELETE</a></td>
</tr>
<%} %>
</table>

</body>
</html>