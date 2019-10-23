
package univs.edu.usuario;

import org.hibernate.Session;
import org.hibernate.Transaction;
import univs.edu.util.HibernateUtil;

/**
 *
 * @author LABORATORIO 01
 */
public class UsuarioDAO {
    private Session sessão;
    private Transaction transação;
    
    public void salvar(Usuario usuario){
        sessão = HibernateUtil.getSessionFactory().openSession();
        transação = sessão.beginTransaction();
        sessão.save(usuario);
        transação.commit();
        sessão.close();
    }
}
