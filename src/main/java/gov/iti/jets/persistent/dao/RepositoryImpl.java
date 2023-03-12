package gov.iti.jets.persistent.dao;

import java.util.List;

import gov.iti.jets.persistent.dao.interfaces.Repository;
import jakarta.persistence.EntityManager;

public class RepositoryImpl<E, K> implements Repository<E, K> {

    private EntityManager _entityManager;
    private Class<E> type;


    public RepositoryImpl(){}

    public RepositoryImpl(Class<E> e) {
        _entityManager = EntityHandler.getEntityManager();
        type = e;
    }

    @Override
    public E create(E e) {

        try {
            _entityManager.getTransaction().begin();
            _entityManager.persist(e);
            _entityManager.getTransaction().commit();
        } catch (Exception ex) {
            _entityManager.getTransaction().rollback();
            throw ex;
        }
       
        return e;
    }

    @Override
    public E find(K id) {
        E ew = _entityManager.find(type, id);
        return ew;
    }

    @Override
    public List<E> findAll() {

        List<E> list =(List<E>) _entityManager.createQuery("FROM "+ type.getName() +" ").getResultList();
            

        return list;
    }

    @Override
    public boolean remove(E e) {
        try {
            _entityManager.getTransaction().begin();
            _entityManager.remove(e);
            _entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            _entityManager.getTransaction().rollback();
            throw ex;
        }

        return true;
    }

    @Override
    public E update(E e) {
        try {
            _entityManager.getTransaction().begin();
            _entityManager.merge(e);
            _entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            _entityManager.getTransaction().rollback();
            throw ex;
        }
        return e;
    }

}
