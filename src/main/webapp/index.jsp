<!doctype html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

	<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <title>Bootstrap!</title>
  </head>
  <body>
    
    <div class="container">
    	<div class="jumbotron">
    		<h1>TP Adicional - Diego Javier Degracia</h1>
    		<h3>Pizzería R2-D2</h3>
    	</div>
    	
    	<form action="control.do" method="post">
    	<div class="thumbnail">
    		<input type="text" name="nombre" placeholder="Tu nombre"
    				class="form-control"/>
    		<br>
    		<input type="text" name="edad" placeholder="Tu edad"
    				class="form-control"/>
    		<br>
    		<input type="submit" name="bt" value="Prueba"
    				class="form-control btn btn-primary"/>
    	</div>    
    	</form>
    </div>
  </body>
</html>
