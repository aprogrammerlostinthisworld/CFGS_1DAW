<html>
<head>
	<title>
	<h1>Tabla<h1>
	</title>
</head>
<body>
	<h1>Tabla</h1>

	<table border=1>

		<? for(i=1; i<=10; i++) { 	
		echo '<tr>';
			for(j=1; j<=10; j++){
			echo "<td>".j."</td>";			
			}
		echo '</tr>';
		} ?>
	</table>
	<?
	echo "Este hola est&aacute; escrito en php"
	?>
</body>
</html>
