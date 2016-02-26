/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){

  $("#Edit").click(function(){
    if($("#Edit").val()==="Edit"){
        $("#Edit").val("Save");
        birthday=$("#birth").text();
        password=$("#pass").text();
        job=$("#job").text();
        name=$("#name").text();
        credit=$("#credit").text();
        address=$("#address").text();
        interst=$("#interest").text();
        
        $('#birth').replaceWith( '<input id="inBirth" type="text" value="'+birthday+'" style="text-align:center; font-size:15px; background:#705A6B; color:white;"/>' );
         $('#pass').replaceWith( '<input id="inPass" type="password" value="'+password+'" style="text-align:center; font-size:15px; background:none; color:white;"/>' );
          $('#job').replaceWith( '<input id="inJob" type="text" value="'+job+'" style="text-align:center; font-size:15px; background:none; color:white;"/>' );
           $('#name').replaceWith( '<input id="inName" type="text" value="'+name+'" style="text-align:center; font-size:15px; background:none; color:white;"/>' );
            $('#credit').replaceWith( '<input id="inCredit" type="text" value="'+credit+'" style="text-align:center; font-size:15px; background:none; color:white;"/>' );
             $('#address').replaceWith( '<input id="inAdd" type="text" value="'+address+'" style="text-align:center; font-size:15px; background:none; color:white;"/>' );
              $('#interest').replaceWith( '<input id="inInt" type="text" value="'+interst+'" style="text-align:center; font-size:15px; background:none; color:white;"/>' );
    }else{
        $("#Edit").val("Edit");
        birth=$("#inBirth").val();
        Pass=$("#inPass").val();
        Job=$("#inJob").val();
        Name=$("#inName").val();
        Credit=$("#inCredit").val();
        Add=$("#inAdd").val();
        Interest=$("#inInt").val();
        
       $("#inBirth").replaceWith('<label class="res" id="birth">'+birth+'</label>');
       $("#inPass").replaceWith('<label class="res" id="pass">'+Pass+'</label>');
       $("#inJob").replaceWith('<label class="res" id="job">'+Job+'</label>');
       $("#inName").replaceWith('<label class="res" id="name">'+Name+'</label>');
       $("#inCredit").replaceWith('<label class="res" id="credit">'+Credit+'</label>');
       $("#inAdd").replaceWith('<label class="res" id="address">'+Add+'</label>');
       $("#inInt").replaceWith('<label class="res" id="interest">'+Interest+'</label>');
      
       $.get("ShowProfile?birth="+birth+"&pass="+Pass+"&job="+Job+"&name="+Name+"&credit="+Credit+"&address="+Add+"&interest="+Interest);
            
  
      
    }
    return false;
});  
    
    
    
});



