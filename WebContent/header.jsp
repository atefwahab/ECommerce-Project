<%-- 
    Document   : header
    Created on : Feb 22, 2016, 1:47:37 AM
    Author     : dono
--%>


<body>
    <jsp:useBean id="obj" scope="session" class="model.DbConnector"></jsp:useBean>
<div id="wrapper">


<!-- start of menu-->
  <div id="menu">
    <ul>
      <li><a href="index.jsp" class="current">Home</a></li>
      <li><a href="SignUp.jsp">Register</a></li>
    </ul>
    <div class="header_right" style="float:right; padding-top:15px;font-weight: bold; font-size: 15px;">
			<div class="cart box_1">
				<a href="checkout.html">
				<div class="total" style="color:white; font-size:15px;">
					<span class="simpleCart_total">00.0 L.E</span> (<span id="simpleCart_quantity" class="simpleCart_quantity">0</span> items)</div>
					<i class="glyphicon" style="float:right;"> <img src="images/shopping_trolley.png" width="30px" height="30px"/></i></a>
				<p><a href="javascript:;" class="simpleCart_empty" style="color:white; font-size:15px;">Empty Cart</a></p>
				<div class="clearfix"> </div>
			</div>				 
		</div>
  </div>
  <!-- end of menu -->

  <!--start of header bar-->
  <div id="header_bar">
    <div id="header">
      <div class="right"></div>
      <h1><a href="#"> <img src="images/logo.png" alt="" /> <span>Online Store </span> </a></h1>
      
    </div>
      <div style="color: white; text-align: center; float: right">
          
             <%
            
           
     if(request.getSession().getAttribute("attr")== null){
     %>
      <form action="login.jsp" method="get">
         
          <div style="float: right; margin-left:5px;">
        <label>Password</label><br>
        <input type="password" value="" name="pass" class="input_field" style="color: white;
               background: none; font-size: 12px;" />
          </div> <div style="float: right">  
              <label>E-mail</label> <br>
        <input type="text" value="" name="e_mail" size="10" class="input_field" style="color: white;
               background: none; font-size: 12px;" />
          </div><br>
        <!-- go sign up page-->
        <input type="submit" name="login" value="Login" alt="Login" id="submit_btn" />
        
      </form><%
      
          }else if(request.getSession().getAttribute("attr").equals("admin")){
           
      %>
      
      <div style="color: white; font-size: 20px"><br> <span style="color:#FF0066">welcome</span> <%out.println(obj.getNameOfEmail((String)request.getSession().getAttribute("attr")));%></div><br>
    <a href="LogOut" style="background-color: darkgray; font-size: 15px">LogOut</a>
     <a href="admin/admin.jsp" style="background-color: darkgray; font-size: 15px">Admin</a>
      <%
            }else {
       %>
      
    <div style="color: white; font-size: 20px"><br> <span style="color:#FF0066">welcome</span> <%out.println(obj.getNameOfEmail((String)request.getSession().getAttribute("attr")));%></div><br>
    <a href="LogOut" style="background-color: darkgray; font-size: 15px">LogOut</a>
     <a href="ViewProfile.jsp" style="background-color: darkgray; font-size: 15px">View Profile</a>
                <%
    }

     %>
          
      </div>
   
  </div>
  
