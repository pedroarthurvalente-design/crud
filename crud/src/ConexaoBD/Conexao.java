package ConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/banco";
    private static final String user = "root";
    private static final String pass = "Leightght1234";

    private static Connection conn;

     public static Connection conexaoDB(){


        try {
            if(conn == null){
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Conexão criada");
                return conn;
            } else{
                System.out.println("Conexão já feita");
                return conn;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }

        

    
   
    }

    public static Object ConexaoDB() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ConexaoDB'");
    }*/


}
