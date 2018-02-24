package com.mlxc.controller;

import com.mlxc.utils.ResultModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @GetMapping("/activities")
    public ResultModel getActivities() {
        ResultModel resultModel = new ResultModel();


        return resultModel;
    }

}
