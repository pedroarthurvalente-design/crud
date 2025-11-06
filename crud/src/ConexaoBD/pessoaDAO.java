package ConexaoBD;
import App.*;
import java.sql.PreparedStatement;


public class pessoaDAO {

    public void cadastrarPessoa(Usuario usuario){

        String sql = "Insert INTO pessoa (nome,cpf,genero,peso,altura) VALUES (?,?,?,?,?)";
        PreparedStatement ps =null;
        try {
            
            ps = Conexao.conexaoDB().prepareStatement(sql);
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        

    }
        
}
