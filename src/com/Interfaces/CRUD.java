package com.Interfaces;

public interface CRUD <T>{
    public boolean create(T object);
    public T read(Integer ID);
    public boolean update(Integer ID, T newobject);
    public boolean delete(Integer ID);
}
