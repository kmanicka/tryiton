
$(document).ready(function(){
	//alert('test');
	 $(".tio").click(openWindow);
	 
});


function openWindow(e) {  
    e.preventDefault();
    var link = $(this);
    var url = link.attr('href'); 
 
    //alert('url is '+url);
    /*
       if ($.browser.msie) {
           window.location = url;
          } else {
            window.open(url);
        }
 */
     //window.open('/public/images/glass1.jpg'
    	//	 		, 'TRY IT ON POPUP', 'top=50,left=200,width=400px,height=500px,location=no,menubar=no,toolbar=no,scrollbars=yes');
     window.open(@{Application.tio()});
}


