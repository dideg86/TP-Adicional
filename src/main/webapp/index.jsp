<!doctype html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

	<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <title>TP Adicional!</title>
  </head>
  <body>
    
    <div class="container">
    	<div class="jumbotron">
    		<center><strong><h1>Bienvenido a Pizzeria</strong></h1>
    		<img src="https://www.pinclipart.com/picdir/big/85-850231_1-of-star-wars-r2d2-logo-clipart.png"> 
    		<h3><i>TP Adicional - por Diego Javier Degracia</i></h3> </center>
    	</div>
    	<br>
    	<form action="pizzeria" method="post">
    	<div class="thumbnail">
    		<input type="text" name="nombre" placeholder="Ingresa tu nombre"
    				class="form-control"/>
    		<br>
    		<select name="pizza">
    			<option>Muzzarella </option>
    			<option>Napolitana </option>
    			<option>Jamon </option>
    			<option>Fugazzeta </option>
    			<option>Calabresa </option>
    		</select>
    		<small id="text" class="text-muted visible">
            Elige la pizza deseada.
            </small>
    		<br>
    		<br>
    		<input type="submit" name="bt" value="Enviar"
    				class="form-control btn btn-primary"/>
    		<br>
    		<br>
    		
    	</div>    
    	</form>
    	
  		<strong>
    	<%
    	
    		String error = (String) request.getAttribute("error");
    		String mensaje = (String) request.getAttribute("mensaje");
    		
    		if (error == null) {
    			error = "";
    		}
    		if (mensaje == null) {
    			mensaje = "";
    		}

    		out.println(error);
    		out.println(mensaje);
		    	
    	%>
    	</strong>
    	
    		<br>
    		<br>
    	    <a href="detalles.jsp">Ver detalle de los sabores</a>
    </div>
  </body>
</html>