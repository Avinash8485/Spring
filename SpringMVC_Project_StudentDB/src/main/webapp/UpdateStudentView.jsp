<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "com.jsp.springmvc.studentdb.entity.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%Student student = (Student) request.getAttribute("studentObject"); %>

<h1>Enter Student Details</h1>
 <form action="update-student" method="post">
 <input type="number" value="<%= student.getStudentId() %>" name="studentId" readonly="readonly"><br>
 <input type="text" value="<%= student.getStudentName() %>" name="studentName"><br>
 <input type="email" value="<%= student.getStudentEmail() %>" name="studentEmail"><br>
 <input type="number" value="<%= student.getStudentAge() %>" name="studentAge"><br>
 <input type="text" value="<%= student.getStudentCourse() %>" name="studentCourse"><br>
 <input type="submit" value="UPDATE">
 </form>

</body>
</html>