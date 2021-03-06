<?php

	// se declara una clase para hacer la conexion con la base de datos
	class Conexion 
	{ 
	
		var $con;
	
		function Conexion() // se definen los datos del servidor de base de datos
		{
			$conection['server'] = "localhost";		// host
			$conection['user'] = "root";			// usuario
			$conection['pass'] = "";				// password
			$conection['base'] = "abm";				// base de datos
		
			// crea la conexion pasandole el servidor , usuario y clave
			$conect = mysql_connect ( $conection['server'], $conection['user'],
			$conection['pass'] );
			
			// si la conexion fue exitosa , selecciona la base
			if ( $conect ) {
				mysql_select_db ( $conection['base'] );			
				$this -> con = $conect;
			}
        }
	
		function getConexion() // devuelve la conexion
		{
			return $this -> con;
		}	
	
		function Close()  // cierra la conexion
		{
			mysql_close( $this -> con );
		}	
	}
	
	// se declara una clase para poder ejecutar las consultas,
	//esta clase llama a la clase anterior
    class sQuery 
    {  
    
    	var $coneccion;
		var $consulta;
		var $resultados;
		
		function sQuery()  // constructor, solo crea una conexion usando la clase "Conexion"
		{
			$this-> coneccion = new Conexion();
		}
		
		// metodo que ejecuta una consulta y la guarda en el atributo $pconsulta
		function executeQuery ($cons)
		{
			$this->consulta =  mysql_query ( $cons,$this -> coneccion -> getConexion() );
			return $this -> consulta;
		}
			
		function getResults()   // retorna la consulta en forma de result.
		{
			return $this -> consulta;
		}
	
		function Close()		// cierra la conexion
		{
			$this -> coneccion -> Close();
		}	
	
		function Clean() // libera la consulta
		{
			mysql_free_result ( $this -> consulta);
		}
	
		function getResultados() // debuelve la cantidad de registros encontrados
		{
			return mysql_affected_rows ( $this -> coneccion -> getConexion() );
		}
	
		function getAffect() // devuelve las cantidad de filas afectadas
		{
			return mysql_affected_rows ( $this -> coneccion -> getConexion() );
		}

   		function fetchAll()
		{
        	$rows=array();
   		
			if ($this -> consulta)
			{
				while ($row = mysql_fetch_array ( $this -> consulta) )
				{
					$rows[] = $row;
				}
			}
			
       		return $rows;
   		}
	}

	class Cliente
	{
		//se declaran los atributos de la clase, que son los atributos del cliente
		var $nombre;
		var $apellido;
		var $fecha;
		Var $peso;
		Var $id;

    	public static function getClientes() 
		{
			$obj_cliente = new sQuery();
			
			// ejecuta la consulta para traer al cliente
			$obj_cliente -> executeQuery ("select * from clientes");
			
			// retorna todos los clientes
			return $obj_cliente -> fetchAll(); 					  	 
		}

		// declara el constructor, si trae el numero de cliente lo busca,
		// si no, trae todos los clientes
		function Cliente($nro = 0)
		{
			if ( $nro != 0)
			{
				$obj_cliente = new sQuery();
				
				// ejecuta la consulta para traer al cliente
				$result = $obj_cliente -> executeQuery ("select * from clientes where id = $nro");
				$row = mysql_fetch_array ($result);
				$this -> id = $row['id'];
				$this -> nombre = $row['nombre'];
				$this -> apellido = $row['apellido'];
				$this -> fecha = $row['fecha_nac'];
				$this -> peso = $row['peso'];
			}
		}
		
		// metodos que devuelven valores
		function getID()
		{
			return $this -> id;
		}
		
		function getNombre()
		{
			return $this -> nombre;
		}
			
		function getApellido()
	 	{
	 		return $this -> apellido;
	 	}
	
		function getFecha()
	 	{
	 		return $this -> fecha;
	 	}
	 	
		function getPeso()
		{
			return $this -> peso;
		}
	 
		// metodos que setean los valores  
		function setNombre ( $val )
	 	{
	 		$this -> nombre = $val;
	 	}
	 	
	 	function setApellido ( $val )
	 	{
	 		$this -> apellido = $val;
	 	}
	 	
		function setFecha ( $val )
	 	{
	 		$this -> fecha = $val;
	 	}
	 	
		function setPeso ( $val )
		{
			$this -> peso = $val;
		}

    	function save()
    	{
        	if( $this -> id )
        	{
        		$this -> updateCliente();
        	} else {
        		$this -> insertCliente();
        	}
   		}
   		
   		// actualiza el cliente cargado en los atributos
		private function updateCliente()	
		{
			$obj_cliente = new sQuery();
			
			$query = "update clientes set nombre =' $this->nombre ', apellido = '$this->apellido
			',fecha_nac=' $this->fecha ', peso = '$this->peso' where id = $this->id";
			
			// ejecuta la consulta para traer al cliente
			$obj_cliente -> executeQuery( $query ); 
			
			// retorna todos los registros afectados
			return $obj_cliente -> getAffect(); 	
	
		}
		
		// inserta el cliente cargado en los atributos
		private function insertCliente()	
		{
			$obj_cliente = new sQuery();
			
			$query = "insert into clientes( nombre, apellido, fecha_nac, peso ) values ('
			$this->nombre', '$this->apellido','$this->fecha','$this->peso')";
			
			// ejecuta la consulta para traer al cliente
			$obj_cliente -> executeQuery( $query );
			
			// retorna todos los registros afectados
			return  $obj_cliente ->  getAffect(); 		
	
		}	
		
		function delete()		// elimina el cliente
		{
			$obj_cliente = new sQuery();
			$query = "delete from clientes where id= $this->id ";
			
			// ejecuta la consulta para  borrar el cliente
			$obj_cliente -> executeQuery($query);

			// retorna todos los registros afectados
			return  $obj_cliente -> getAffect();
		}
	
		function cleanString( $string )
		{
			$string = trim($string);
			$string = mysql_escape_string($string);
			$string = htmlspecialchars($string);
 			return $string;
		}
  	}