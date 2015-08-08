package com.itesm.avril.listfragment;

public class Perro {
  private String nombre, raza, peso, caracteristicas;

  public Perro(String nombre, String raza, String peso, String caracteristicas) {
    super();
    this.nombre = nombre;
    this.raza = raza;
    this.peso = peso;
    this.caracteristicas = caracteristicas;
  }

  public String getPeso() {
    return peso;
  }

  public void setPeso(String peso) {
    this.peso = peso;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(String caracteristicas) {
    this.caracteristicas = caracteristicas;
  }
}


