package at.fhj.swd;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/* client Interface extends "Remote" ! */
public interface ServerIF extends Remote{
	String getAuthor() throws RemoteException;
	String getUser() throws RemoteException;
	void setUser(String u) throws RemoteException;
	List<Gamer> getHighScores()throws RemoteException;
}

