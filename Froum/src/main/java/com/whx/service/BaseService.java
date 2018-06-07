package com.whx.service;

import com.whx.util.PageInfo;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
    public abstract void add(T t);

    public abstract void delete(Serializable serializable);

    public abstract void update(T t);

    public abstract List findAll();

/*    public abstract T findById(Serializable serializable);*/

    public abstract PageInfo<T> findAlls(int pageNum, int pageSize);

    public abstract int getTotalCount();
}
