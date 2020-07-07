$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(jobTitle,status){
			$('#id').val(jobTitle.id);
			$('#descriptionedit').val(jobTitle.description);
			$('#detailsedit').val(jobTitle.nationality);
		});
		
		$('#editModal').modal();
	});
	
	
$('table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(jobTitle,status){
			$('#idDetails').val(jobTitle.id);
			$('#descriptionDetails').val(jobTitle.jobTitleid);
			$('#detailsDetails').val(jobTitle.details);
			$('#lastModifiedByDetails').val(jobTitle.lastModifiedBy);
			$('#lastModifiedDateDetails').val(jobTitle.lastModifiedDate);
			
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