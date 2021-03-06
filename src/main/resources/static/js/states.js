$('document').ready(function(){ 
	
	$('.table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(state,status){
			$('#id').val(state.id);
			$('#nameedit').val(state.name);
			$('#capitaledit').val(state.capital);
			$('#codeedit').val(state.code);
			
		});
		
		$('#editModal').modal();
	});
	
	
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		$('#confirmDeleteButton').attr('href',href);
		
		$('#deleteModal').modal(); 
	});
	
	
	$('.table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(state,status){
			$('#idDetails').val(state.id);
			$('#countryDetails').val(state.countryid);
			$('#nameDetails').val(state.name);
			$('#detailsDetails').val(state.details);
			$('#lastModifiedByDetails').val(state.lastModifiedBy);
			$('#lastModifiedDateDetails').val(state.lastModifiedDate);
			
		});
		$('#detailsModel').modal();
		
	});
	
	
	
}
 );