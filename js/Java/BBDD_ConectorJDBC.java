package js.Java;

import java.sql.*;

public class BBDD_ConectorJDBC {

    public static void main(String[] args) {
        
        try{
             //1. CREAR CONEXION
            
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/geopet","root","virginia1");
            
            System.out.println("CONEXION EXITOSA!! \n");
            
            // 2. CREAR OBJETO STATEMENT
            
            Statement miStatement = miConexion.createStatement();
            
            // 3. EJECUTAR SQL
                        
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM CLIENTE");
            
            // 4. RECORRER EL RESULTSET
            
            while(miResultSet.next()){
                
                System.out.println(miResultSet.getInt("idCliente") + " " + miResultSet.getString("Nombre") + " " + miResultSet.getString("Apellido") + "  " + miResultSet.getInt("CorreoElectronico")+ "  " + miResultSet.getInt("contrasena")+ "  " + miResultSet.getInt("Telefono"));
            }
        }catch (Exception e){
            
            System.out.println("No conecta!!");
            
            e.printStackTrace();
                
        }    
        
    }
    
}
