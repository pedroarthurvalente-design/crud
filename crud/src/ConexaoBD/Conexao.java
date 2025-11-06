package ConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost?3306/banco";
    private static final String user = "root";
    private static final String pass = "Leightght1234";

    private static Connection c;

    public static Connection ConexaoBD(){

        try {
            if(c == null){
                c = DriverManager.getConnection(url, user, pass);
                System.out.println("Conexão criada");
            } else{
                System.out.println("Conexão já feita");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }


}
