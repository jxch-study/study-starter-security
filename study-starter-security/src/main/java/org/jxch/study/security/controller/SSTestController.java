package org.jxch.study.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSTestController {
    @PreAuthorize("hasAuthority('all')")
    @GetMapping("/hello")
    public String hello() {
        return "欢迎访问";
    }
}
