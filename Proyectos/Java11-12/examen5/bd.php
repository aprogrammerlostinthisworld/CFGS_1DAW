<html>
	<head>
		<title>Mostrar BD</title>
	</head>
	<body>
		<center><table>
			<tr>
				<td>
					<?php
						$servidor = "localhost";
						$usuario = "root";
						$clave = "123456";
						$bd = "ed";
						
						$cont = 0;
						$conexion = mysql_connect ( $servidor, $usuario, $clave );
						
						if ( $conexion != false )
						{
							$conexBD = mysql_select_db ( $bd, $conexion );
							if ( $conexBD != false )
							{
								$select = "select * from alumnos;";
								$consulta = mysql_query ( $select, $conexion );
								$ro = mysql_fetch_row ( $consulta );
								$tam = mysql_num_fields ( $consulta );
								$arra = mysql_fetch_array ( $consulta );
								if ( mysql_num_rows ( $consulta ) > 0 )
								{
									$registro = 1;
									while ( $row = mysql_fetch_row ( $consulta ) )
									{
										$tam = mysql_num_fields ( $consulta );
										$registro++;
										for ( $i = 0; $i < $tam; $i++ )
										{
											$datos[$i] = $row[$i];
										}
										
										$cont++;
									}
									mysql_free_result ( $consulta );
								}
								
							} else {
								?>
									<script language="javascript">
										function tiempo()
										{
											document.location.href="bd.php"
										}
										alert ( "Error al conectar con la base de datos '".$bd );
										setTimeout ( "tiempo();", 3000 );
									</script>
								<?php
							}
							
						} else {
							?>
								<script language="javascript">
									function tiempo()
									{
										document.location.href="bd.php"
									}
									alert ( "Error en la conexion a '".$servidor );
									setTimeout ( "tiempo();", 3000);
								</script>
							<?php
						}
						echo "<h4>Nombre</h4>\t";
					?>
				</td>
				<td><h4>Apellido1</h4></td>
				<td><h4>Apellido2</h4></td>
				<td><h4>Curso</h4></td>
			</tr>
			<tr>
				<?php
					$i = 0;
					while ( $i < $tam )
					{
						echo "<td>".$ro[$i]."</td>";
						$i++;
					}
					
					echo "</tr><tr>";
					
					$i = 0;
					while ( $i < $tam )
					{
						echo "<td>".$arra[$i]."</td>";
						$i++;
					}
					
					echo "</tr><tr>";
					
					$i = 0;
					while ( $i < $tam )
					{
						echo "<td>".$datos[$i]."</td>";
						$i++;
					}
				?>
			</tr>
		</center></table>
	</body>
</html>