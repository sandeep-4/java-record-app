$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(invoiceStatus,status){
			$('#id').val(invoiceStatus.id);
			$('#descriptionedit').val(invoiceStatus.description);
			$('#detailsedit').val(invoiceStatus.nationality);
		});
		
		$('#editModal').modal();
	});
	
	
$('table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(invoiceStatus,status){
			$('#idDetails').val(invoiceStatus.id);
			$('#descriptionDetails').val(invoiceStatus.invoiceStatusid);
			$('#detailsDetails').val(invoiceStatus.details);
			$('#lastModifiedByDetails').val(invoiceStatus.lastModifiedBy);
			$('#lastModifiedDateDetails').val(invoiceStatus.lastModifiedDate);
			
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