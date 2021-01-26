package edu.demo.controller;

import edu.demo.service.UserService;
import edu.nf.beans.annotations.Component;
import edu.nf.beans.annotations.Inject;
import edu.nf.beans.annotations.Scope;

@Component("controller")
public class UserController {

    @Inject(name = "service")
    private UserService service;

    public void add(){
        service.add();
    }
}
