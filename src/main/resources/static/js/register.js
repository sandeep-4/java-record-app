$('document').ready(function(){
	
	var password=document.getElementById("password")
	
	var confirmPassword=document.getElementById("confirmPassword");
	
	function validatePassword(){
		if(password.value==confirmPassword.value){
			confirmPassword.setCustomValidity('');
		}
		else{
			confirmPassword.setCustomValidity("Password dont match");
			
		}
	}
	password.onchange=validatePassword;
	confirmPassword.onkeyup=validatePassword;
	
});