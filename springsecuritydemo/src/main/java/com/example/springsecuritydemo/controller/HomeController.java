package com.example.springsecuritydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('admin')")
    public String printAdmin() {
        return "如果你看见这句话，说明你有管理员角色";
    }

    @RequestMapping("/teacher")
    @PreAuthorize("hasRole('teacher')")
    public String printTeacher() {
        return "如果你看见这句话，说明你有老师角色";
    }

    @RequestMapping("/teacher/write")
    @PreAuthorize("hasAuthority('teacher:write')")
    public String teacherWrite() {
        return "如果你看见这句话，说明你有老师书写的权限";
    }

    @RequestMapping("/student/read")
    @PreAuthorize("@ss.hasPermission('student:read')")
    public String studentRead() {
        return "如果你看见这句话，说明你有学生朗读的权限";
    }
}
