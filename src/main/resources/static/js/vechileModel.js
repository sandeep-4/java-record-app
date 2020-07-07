$('document').ready(function(){ 
	
	$('.table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		$.get(href,function(vechileModal,status){
			$('#id').val(vechileModal.id);
			$('#descrptionedit').val(vechileModal.description);
			$('#detailsedit').val(vechileModal.details);
			
		});
		
		$('#editModal').modal();
	});
	
	
$('.table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(vechileModel,status){
			$('#idDetails').val(vechileModel.id);
			$('#descriptionDetails').val(vechileModel.vechileModelid);
			$('#detailsDetails').val(vechileModel.details);
			$('#lastModifiedByDetails').val(vechileModel.lastModifiedBy);
			$('#lastModifiedDateDetails').val(vechileModel.lastModifiedDate);
			
		});
		$('#detailsModel').modal();
		
	});
	
	
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		$('#confirmDeleteButton').attr('href',href);
		
		$('#deleteModal').modal(); 
	});
	
	
	
	
	
}
 );