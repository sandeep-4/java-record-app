$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(employee,status){
			$('#id').val(employee.id);
			$('#firstnameEdit').val(employee.firstname);
			$('#lastnameEdit').val(employee.lastname);
			$('#usernameEdit').val(employee.username);
			$('#jobtitleEdit').val(employee.jobtitle);
			
		});
		
		$('#editModal').modal();
	});
	
	
$('table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(employee,status){
			
			$('#idDetails').val(employee.id);
			$('#firstnameDetails').val(employee.firstname);
			$('#lastnameDetails').val(employee.lastname);
			$('#usernameDetails').val(employee.username);
			$('#jobtitleDetails').val(employee.jobtitle);
			
			$('#createdByDetails').val(employee.createdBy);
			$('#createdDateDetails').val(employee.createdDate);
			
			
			$('#lastModifiedByDetails').val(employee.lastModifiedBy);
			$('#lastModifiedDateDetails').val(employee.lastModifiedDate);
			
		});
		$('#detailsModel').modal();
		
	});
	
	
	$('table #deleteButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		$('#confirmDeleteButton').attr('href',href);
		
		$('#deleteModal').modal(); 
	});
	
	
	
	$('table #photoButton').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		$('#photoModal #employeePhoto').attr('src',href);
	
		$('#photoModal').modal();
		
	});
	
}
 );