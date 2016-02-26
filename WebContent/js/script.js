/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// on load function
/**
 * @author atef
 * this method is used to send request to server and recieve response from it again.
 * @returns {undefined}
 */
window.onload=function(){
    var pageForms=document.forms;
  for(var i=0;i<pageForms.length;i++){
      pageForms[i].onsubmit=function(){
          
   
          var productId = this.productId.value;
          
          
          // here i will send the request
          $.post('AddToShoppingCart', { productId : productId}, function(data) {
                 alert( "Data Loaded: " + data );
            });
          return false;
      };
  }  
};
