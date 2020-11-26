package org.vermeg.bookstore.interfaces;

import java.util.List;

import org.vermeg.bookstore.model.Achat;



public interface AchatInterface {
	
	public List<Achat> getAllAchats(long orderid);
	
	public Achat getAchat(int orderid);
	
	public Achat addAchat(Achat achat);
	
	public void updateAchat(Achat achat);
	
	public void deleteAchat(int id);
	
	

}
