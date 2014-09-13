/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.castel.dao;

import com.mycompany.castel.model.Persona;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author SABADO-MANHANA
 */
public class PersonaDAOH extends BaseHibernateDAO implements PersonaDAO {

    public List<Persona> list() {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        return criteria.list();
    }

    public Persona get(Long id) {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        criteria.add(Restrictions.eq("id", id));
        return (Persona) criteria.uniqueResult();
    }

    public void save(Persona t) {
        this.getSession().save(t);
    }

    public void update(Persona t) {
        this.getSession().update(t);
    }

    public void delete(Persona t) {
        this.getSession().delete(t);
    }
}
