package com.Interfaces;

public interface CRUD{
    public void create(Object object);
    public Object read(Integer ID);
    public boolean update(Integer ID, Object newobject);
    public boolean delete(Integer ID);
}
