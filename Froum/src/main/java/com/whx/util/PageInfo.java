package com.whx.util;

import java.io.Serializable;
import java.util.List;

public class PageInfo<T> implements Serializable {
    private int pageNum=1;
    private int pageSize=3;
    private int total;
    private int pages;
    private List<T> list;

    public PageInfo() {
        super();
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        if (total > 0) {
            this.total = total;
            // 获取总页数
            this.pages = (total % pageSize == 0) ? (total / pageSize) : (total
                    / pageSize + 1);
        }
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public List<T> getList() {
        return list;
    }
    public void setList(List<T> list) {
        this.list = list;
    }


}
