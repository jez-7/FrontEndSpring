// Call the dataTables jQuery plugin
$(document).ready(function() {
	cargarJugadores()
  $('#players').DataTable();
});

async function cargarJugadores() {
	
  const rawResponse = await fetch('api/jugador', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
   
  });
  
  const jugadores = await rawResponse.json();
  
  let listadoHTML= '';

for(let jugador of jugadores) {
	
	let botonEliminar = '<a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i> </a>';
	
	let jugadorHtml = '<tr><td>' + jugador.id + '</td><td>' + jugador.nombre + ' ' + jugador.apellido + '</td><td>'
	+ jugador.camiseta + '</td><td>' + jugador.club	+ '</td><td>' + botonEliminar + '</td></tr>';
	
	listadoHTML+=jugadorHtml;
}



document.querySelector('#players tbody').outerHTML=listadoHTML
}