package com.af.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/projectService")
    public String projectServiceFallBack(){
        return "Project service is taking some time. Pls try again";
    }

    @GetMapping("/departmentService")
    public String departmentServiceFallBack(){
        return "Department service is taking some time. Pls try again";
    }


}
