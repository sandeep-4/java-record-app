$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(employeeType,status){
			$('#id').val(employeeType.id);
			$('#descriptionedit').val(employeeType.description);
			$('#detailsedit').val(employeeType.nationality);
		});
		
		$('#editModal').modal();
	});
	
	
$('table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(employeeType,status){
			$('#idDetails').val(employeeType.id);
			$('#descriptionDetails').val(employeeType.employeeTypeid);
			$('#detailsDetails').val(employeeType.details);
			$('#lastModifiedByDetails').val(employeeType.lastModifiedBy);
			$('#lastModifiedDateDetails').val(employeeType.lastModifiedDate);
			
		});
		$('#detailsModel').modal();
		
	});
	
	
	$('table #deleteButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		$('#confirmDeleteButton').attr('href',href);
		
		$('#deleteModal').modal(); 
	});
	
	
	
	
	
}
 );