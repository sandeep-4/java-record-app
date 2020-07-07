$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(vechileStatus,status){
			$('#id').val(vechileStatus.id);
			$('#descriptionedit').val(vechileStatus.description);
			$('#detailsedit').val(vechileStatus.details);
		});
		
		$('#editModal').modal();
	});
	
	
$('table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(vechileStatus,status){
			$('#idDetails').val(vechileStatus.id);
			$('#descriptionDetails').val(vechileStatus.vechileStatusid);
			$('#detailsDetails').val(vechileStatus.details);
			$('#lastModifiedByDetails').val(vechileStatus.lastModifiedBy);
			$('#lastModifiedDateDetails').val(vechileStatus.lastModifiedDate);
			
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