package Persistence;

import Entidades.EntityBase;

public interface Repository<T extends EntityBase> {

    T find(int id);

    T add(T entity);

    T update(T entity);

    T delete(int id);

    T delete(T entity);

    void commit();
}
