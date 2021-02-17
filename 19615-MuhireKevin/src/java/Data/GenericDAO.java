/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author alice
 */
public class GenericDAO <T>{
    private Class<T> type;

    public GenericDAO(Class<T> type) {
        this.type = type;
    }
    
    Session ss = null;
    
    public  void create(T Obj){
        ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(Obj);
        ss.getTransaction().commit();
        ss.close();
    }
    
    public void update(T Obj){
        ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(Obj);
        ss.getTransaction().commit();
        ss.close();
    }
    public void delete(T Obj){
        ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(Obj);
        ss.getTransaction().commit();
        ss.close();
    }
    
    public T findById(String Id){
        ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        T Obj = (T) ss.get(type, Id);
        ss.getTransaction().commit();
        ss.close();
        return Obj;
    }
    
    public T findByName(String name){
        ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction().commit();
        T Obj = (T) ss.get(type, name);
        ss.getTransaction();
        ss.close();
        return  Obj;
    }
    
    public List<T> findAll(){
        ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        List<T> Obj =  ss.createCriteria(type.getName()).list();
        ss.getTransaction().commit();
        ss.close();
        return Obj;
    }
    
}
