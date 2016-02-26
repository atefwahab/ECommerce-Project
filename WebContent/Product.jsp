<%-- 
    Document   : Product
    Created on : Feb 20, 2016, 9:37:00 PM
    Author     : atef
--%>

<%@page import="java.util.Vector"%>
<%@page import="dao.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= request.getParameter("value") %></title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        
            
        
         <%
               Vector<Product> products=(Vector<Product>)request.getAttribute("products"); 
            %>
    </head>
    <%@include file="header.jsp" %>
    
    
    
    <!--products-->
    <div class="content_section">
      <h2>Our Products</h2>
      
    
    <!--start of loop-->
        
        <%
            
            for(int i=0;i<products.size();i++){
                
                out.println("<form method=\"post\">");
                
                out.println("<div class=\"product_box margin_r35\">");
                out.println("<h3>"+products.elementAt(i).getName()+"</h3>");
                out.println("<div class=\"image_wrapper\"> <a><img class=\"productsImg\" src=\""+products.elementAt(i).getImagePath()+"\"  /></a> </div>");
                out.println("<p class=\"price\">Price: "+products.elementAt(i).getPrice()+" LE</p>");
                out.println("<a href=\"#\">Detail</a> | <button type=\"submit\">Buy Now</button> </div>");
        
                out.println("<input type=\"hidden\" name=\"productId\" value=\""+products.elementAt(i).getId()+"\"/>");
                out.println("</form>");
                
                
                
//               
                
            }
        %>
        
          <div class="cleaner"></div>

      <!--button view all-->
      <!--<div class="button_01"><a href="#">View All</a></div>-->
    
    </div>
  </div>
  <script src="js/script.js"></script>
        <%@include file="footer.jsp" %>
