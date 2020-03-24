package com.zjj.zjjservice;


import com.zjj.zjjdao.dao.DaoPeople;
import com.zjj.zjjentity.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private DaoPeople daoPeople;

	public People findPeopleById(int id){
		People people = daoPeople.getById(id);
		return people;
	}


}
