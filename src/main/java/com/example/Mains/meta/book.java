package com.example.Mains.meta;

public class book{
  private int id;
  private String name;
  
  public book (int id,String name){
    this.id=id;
    this.name=name;
  }
  public book(){
  }
  public int getId(){
    return this.id;
  }
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name=name;
  }
  
  public void setId(int id){
    this.id= id;
  }
}