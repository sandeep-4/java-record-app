$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(vechileType,status){
			$('#id').val(vechileType.id);
			$('#descriptionedit').val(vechileType.description);
			$('#detailsedit').val(vechileType.details);
		});
		
		$('#editModal').modal();
	});
	
	
$('table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(vechileType,status){
			$('#idDetails').val(vechileType.id);
			$('#descriptionDetails').val(vechileType.description);
			$('#detailsDetails').val(vechileType.details);
			$('#lastModifiedByDetails').val(vechileType.lastModifiedBy);
			$('#lastModifiedDateDetails').val(vechileType.lastModifiedDate);
			
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