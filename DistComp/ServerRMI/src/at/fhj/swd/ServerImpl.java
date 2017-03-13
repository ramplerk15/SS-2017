package at.fhj.swd;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class ServerImpl extends UnicastRemoteObject implements ServerIF{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String author = "Kerstin Rampler";
	private String user=null;
	private ArrayList<Gamer>gamers=new ArrayList<Gamer>();

	public ServerImpl() throws RemoteException{
		super(); 
	};
	public synchronized void setUser(String u) throws RemoteException{
		user=u;

		Gamer gamer = new Gamer("", "", 0);
		gamer.setName(u);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		
		gamer.setLogin(dateFormat.format(cal.getTime()));		
		gamer.setScore(cal.getWeekYear());
		
		gamers.add(gamer);
	};

	public synchronized String getUser() throws RemoteException{
		return this.user;
	}
	@Override
	public String getAuthor() throws RemoteException {
		return author;
	}
	@Override
	public List<Gamer> getHighScores() throws RemoteException {
		return gamers;
	};
}
