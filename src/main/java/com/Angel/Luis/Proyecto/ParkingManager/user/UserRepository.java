package com.Angel.Luis.Proyecto.ParkingManager.user;

import java.util.List;

public class UserRepository{

  private ArrayList<User> usuarios;

  public UserRepository(){
    usuarios = new ArrayList<>();
  }
  public List<User> getAll(){
    this.usuarios.clear();
    this.usuarios.add{new User("lgarsev0112@g.educaand.es","Luis Miguel García Sevilla")}
    return this.usuarios;
  }
}