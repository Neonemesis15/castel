/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.castel.dao;

import com.mycompany.castel.model.Usuario;
import com.mycompany.castel.model.Vendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author SABADO-MANHANA
 */
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO {
     public List<Usuario> list() {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        return criteria.list();
    }

    public Usuario get(Long id) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id", id));
        return (Usuario) criteria.uniqueResult();
    }

    public void save(Usuario t) {
        this.getSession().save(t);
    }

    public void update(Usuario t) {
        this.getSession().update(t);
    }

    public void delete(Usuario t) {
        this.getSession().delete(t);
    }
}
