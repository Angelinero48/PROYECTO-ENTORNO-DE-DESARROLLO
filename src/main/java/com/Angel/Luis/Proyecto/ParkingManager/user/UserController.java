package com.Angel.Luis.Proyecto.ParkingManager.user;

import org.springframework.stereotype.Controller;

import org.springframework.web.blind.annotation.GetMapping;

@Controller
public class UserController {

  private UserRepository repository;

  @GetMapping("/usuarios")
  public String displayUsers(Model model) {
    model.addAttribute("users", repository.findAll());
    return "userlist";
  }
}