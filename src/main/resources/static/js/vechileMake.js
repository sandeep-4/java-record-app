$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(vechilemake,status){
			$('#id').val(vechilemake.id);
			$('#descriptionEdit').val(vechilemake.descriptionEdit);
			$('#detailsEdit').val(vechilemake.detailsEdit);
		});
		
		$('#editModal').modal();
	});
	
	
$('table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(vechilemake,status){
			$('#idDetails').val(vechilemake.id);
			$('#descriptionDetails').val(vechilemake.vechileMakeid);
			$('#detailsDetails').val(vechilemake.details);
			$('#lastModifiedByDetails').val(vechilemake.lastModifiedBy);
			$('#lastModifiedDateDetails').val(vechilemake.lastModifiedDate);
			
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