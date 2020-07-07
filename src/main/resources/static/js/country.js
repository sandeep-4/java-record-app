$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(country,status){
			$('#id').val(country.id);
			$('#capitaledit').val(country.capital);
			$('#codeedit').val(country.code);
			$('#continnentedit').val(country.continenet);
			$('#descriptionedit').val(country.description);
			$('#nationalityedit').val(country.nationality);
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