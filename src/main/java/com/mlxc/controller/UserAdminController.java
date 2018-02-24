package com.mlxc.controller;

import com.mlxc.utils.ResultModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAdminController {

    @PostMapping("/register")
    public ResultModel register() {
        ResultModel resultModel = new ResultModel();

        return resultModel;
    }

    @PostMapping("/login")
    public ResultModel login() {
        ResultModel resultModel = new ResultModel();


        return resultModel;
    }


}
