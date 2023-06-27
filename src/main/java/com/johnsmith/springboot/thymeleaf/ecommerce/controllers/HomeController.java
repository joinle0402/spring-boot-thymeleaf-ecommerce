package com.johnsmith.springboot.thymeleaf.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @GetMapping
    public String redirectToAdminDashboard() {
        return "client/pages/index";
    }
}
