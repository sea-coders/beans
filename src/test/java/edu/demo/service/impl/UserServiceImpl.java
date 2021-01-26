package edu.demo.service.impl;

import edu.demo.dao.UserDao;
import edu.demo.service.UserService;
import edu.nf.beans.annotations.Component;
import edu.nf.beans.annotations.Inject;
import edu.nf.beans.annotations.Scope;

@Component("service")
public class UserServiceImpl implements UserService{

    @Inject(name = "dao")
    private UserDao dao;

    @Override
    public void add() {
        System.out.println(this);
        dao.save();
    }
}
