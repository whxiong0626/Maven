package com.whx.dao;

import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;

@Repository
public interface BaseMapper<T> {
    public abstract void add(T t);
    public abstract void delete(Serializable id);
    public abstract void update(T t);
    public abstract List<T> findAll();
 /*   public abstract Object findById(Serializable serializable);*/
    public abstract List<T> findAlls(int pageNum,int pageSize);
    public abstract int getTotalCount();
}
