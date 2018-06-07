package com.whx.test.service;

import com.whx.test.bean.Invitation;
import com.whx.test.dao.InvitationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvitationService {
    @Autowired
    private InvitationMapper inv;

    /**
     * 新增
     */
    public void add(Invitation invs){
        inv.save(invs);
    }

    /**
     * 删除
     */
    public void del(Integer id){
        inv.deleteById(id);
    }

    /**
     * 修改
     */
   /* public void update(Invitation invs){
        inv.(invs);
    }*/

    /**
     *查询所有
     */
    public Iterable<Invitation> findALL(){
        return  inv.findAll();
    }



}
