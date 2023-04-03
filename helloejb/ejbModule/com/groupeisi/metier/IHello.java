package com.groupeisi.metier;

import javax.ejb.Local;

@Local   //A mettre obligatoirement
public interface IHello {

	public String message();
}
