<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mysql Database Connection using jsp, servlet and tomcat</title>
</head>
<body>
<h1>4Wheel Car Rental</h1>
<h1>Register</h1>

<form action="car" method="Post">
		IC Number :<input type="text" name="custIC"><br><br> 
        Name : <input type="text" name="custName"><br><br>    
        User Name : <input type="text" name="custUname"><br><br>
        Password : <input type="password" name="custPassword"><br><br>
        Email : <input type="text" name="custEmail"><br><br>
        Phone Number : <input type="text" name="custPhoneNum"><br><br>
        Address :<input type="text" name="custAddress"><br><br>
        Upload Driver License :<input type="file" id="myFile" name="fileLicense"><br><br>
  		
		
        <input type="submit" value="Submit"><br>
    </form>
</body>
</html>