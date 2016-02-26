<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<link href="css/SignUp.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="css/styles.css" />

<script language="javascript" type="text/javascript" src="js/mootools-1.2.1-core.js"></script>
<script language="javascript" type="text/javascript" src="js/mootools-1.2-more.js"></script>
<script language="javascript" type="text/javascript" src="js/slideitmoo-1.1.js"></script>
<script language="javascript" type="text/javascript">

</script>
</head>
<body>
<div id="wrapper">


<!-- start of menu-->
  <div id="menu">
    <ul>
      <li><a href="index.jsp" class="current">Home</a></li>
    </ul>
  </div>
  <!-- end of menu -->

  <!--start of header bar-->
  <div id="header_bar">
    <div id="header">
      <div class="right"></div>
      <h1><a href="#"> <img src="images/logo.png" alt="" /> <span>Online Store </span> </a></h1>
    </div>
  </div>
  <div class="cleaner"></div>
  
  <form action="submit.jsp" method="get" >
  <br>
  
  <div id="title">
   Name:<br><br><br>
   Birthday:<br><br><br>
   Password:<br><br><br>
   Job:<br><br><br>
   E-mail:<br><br><br>
   Credit Limit:<br><br><br>
   Address:<br><br><br>
   Interest:<br><br><br>
  
  </div>
  <div id="between"></div>
  <div id="input">
  
  <input name="name" type="text"/><br><br><br>
  <input type="text" name="date" /><br><br><br>
  <input type="password" name="pass" /> <br><br><br>
   <input type="text" name="job" /><br><br><br>
   <input type="text" name="e_mail" /><br><br><br>
   <input type="text" name="credit_Limit" /><br><br>
  <input type="text" name="address"/><br><br><br>
  <textarea name="interest" rows="5" cols="22"></textarea><br><br><br>
  
  </div>
  <input type="submit" value="Register" id="submit">
  
  </form>
  
   
   
   
   
   
</div>
</body>
</html>