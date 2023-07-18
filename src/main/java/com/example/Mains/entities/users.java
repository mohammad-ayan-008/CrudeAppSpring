package com.example.Mains.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
@Entity
@Table(name="user")
public class users{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  @Column(name="Name")
  private String Name;
  public users(){
    
  }
  public users(Integer id,String Name){
    this.id=id;
    this.Name=Name;
  }
  
  public String getName(){
    return this.Name;
  }
  public void setName(String Name){
    this.Name=Name;
  }
  public Integer getid(){
    return this.id;
  }
  public void setid(Integer id){
    this.id=id;
  }
  
}