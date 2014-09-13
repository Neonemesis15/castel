/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.castel.dao;

import com.mycompany.castel.model.Vendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author SABADO-MANHANA
 */
public class VendedorDAOH extends BaseHibernateDAO implements VendedorDAO{
      public List<Vendedor> list() {
        Criteria criteria = this.getSession().createCriteria(Vendedor.class);
        return criteria.list();
    }

    public Vendedor get(Long id) {
        Criteria criteria = this.getSession().createCriteria(Vendedor.class);
        criteria.add(Restrictions.eq("id", id));
        return (Vendedor) criteria.uniqueResult();
    }

    public void save(Vendedor t) {
        this.getSession().save(t);
    }

    public void update(Vendedor t) {
        this.getSession().update(t);
    }

    public void delete(Vendedor t) {
        this.getSession().delete(t);
    }
}
