$('document').ready(function(){ 
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		
		var href=$(this).attr('href');
		$.get(href,function(client,status){
			$('#id').val(client.id);
			$('#nameEdit').val(client.name);
			$('#detailsEdit').val(clinet.details);
			$('#websiteEdit').val(clinet.website);
			$('#addressEdit').val(clinet.address);
			$('#stateEdit').val(clinet.state);
			$('#countryEdit').val(clinet.country);
			$('#cityEdit').val(clinet.city);
			$('#phoneEdit').val(clinet.phone);
			$('#mobileEdit').val(clinet.mobile);
			$('#emailEdit').val(clinet.email);
	
		});
		
		$('#editModal').modal();
	});
	
	
$('table #detailsButton').on('click',function(event){
		
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(client,status){
			$('#idDetails').val(client.id);
			$('#descriptionDetails').val(client.vechileMakeid);
			$('#detailsDetails').val(client.details);
			$('#lastModifiedByDetails').val(client.lastModifiedBy);
			$('#lastModifiedDateDetails').val(client.lastModifiedDate);
			
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