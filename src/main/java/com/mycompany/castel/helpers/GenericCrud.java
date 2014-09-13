/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.castel.helpers;

import java.util.List;

/**
 *
 * @author SABADO-MANHANA
 */
public interface GenericCrud<T> {

    public List<T> list();

    public T get(Long id);

    public void save(T t);

    public void update(T t);

    public void delete(T t);
}
