package com.groupeisi.metier;

import javax.ejb.Stateless;

@Stateless //A mettre obligatoirement
public class HelloImpl implements IHello{
  
	
	public String message() {
	  return "Bienvenue dans JEE EJB session !!!";
  }
	
}
