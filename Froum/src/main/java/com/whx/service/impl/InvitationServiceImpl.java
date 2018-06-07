package com.whx.service.impl;

import com.whx.bean.Invitation;
import com.whx.dao.InvitationMapper;
import com.whx.service.InvitationService;
import com.whx.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class InvitationServiceImpl implements InvitationService {

    @Autowired
    private InvitationMapper inv;

    @Override
    public void add(Invitation invitation) {

    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public void update(Invitation invitation) {

    }

    @Override
    public List findAll() {
        return  inv.findAll();
    }

    @Override
    public PageInfo<Invitation> findAlls(int pageNum, int pageSize) {
        PageInfo<Invitation> pageInfo = new PageInfo<>();
        // 给pageInfo对象的list集合赋值
        pageInfo.setList(inv.findAlls(pageNum, pageSize));
        return pageInfo;
    }

    @Override
    public int getTotalCount() {

            return inv.getTotalCount();
        }
    }

