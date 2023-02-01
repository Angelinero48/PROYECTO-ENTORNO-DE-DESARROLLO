package com.Angel.Luis.Proyecto.ParkingManager.user;

import org.springframework.stereotype.Controller;

import org.springframework.web.blind.annotation.GetMapping;

@Controller
public class UserController {

  private UserRepository repository = new UserRepository();

  @GetMapping("/usuarios")
  public String dispalyUsers(Model model){
    model.addAttribute("usuarios", repository.getAll());
    return "listausuarios";
  }
}