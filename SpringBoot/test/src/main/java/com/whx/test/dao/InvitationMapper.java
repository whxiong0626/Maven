package com.whx.test.dao;

import com.whx.test.bean.Invitation;
import org.springframework.data.repository.CrudRepository;

public interface InvitationMapper extends CrudRepository<Invitation,Integer> {
}
