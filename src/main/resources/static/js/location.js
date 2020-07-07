$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(location,status){
			$('#id').val(location.id);
			$('#addressedit').val(location.address);
			$('#cityedit').val(location.city);
			$('#countryedit').val(location.country);
			$('#descriptionedit').val(location.description);
			$('#detailsedit').val(location.details);
		});
		
		$('#editModal').modal();
	});
	
	
	$('table #deleteButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		$('#confirmDeleteButton').attr('href',href);
		
		$('#deleteModal').modal(); 
	});
	
}
);
	