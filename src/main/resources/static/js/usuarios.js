// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios()
  $('#usuarios').DataTable();
});


async function cargarUsuarios(){
  const request = await fetch('usuario/1234', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const usuario = await request.json();
  console.log(usuario);
}