package at.fhj.swd;

import java.io.Serializable;
import java.rmi.Naming;

class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		System.out.println("Hello, I am a Client!");
		try{
			ServerIF fb = (ServerIF)Naming.lookup("rmi://localhost/Gamer");
			System.out.println("I was created by '"+fb.getAuthor()+"'!");
			System.out.println("\nHighscores:");
			
			StringBuilder sb= new StringBuilder();
			for(Gamer g: fb.getHighScores()){
				sb.append(g.toString()).append("\n");
			}
			System.out.println(sb.toString());
			System.out.println("DONE");
		}catch(Exception e){
			e.printStackTrace();
		};
	}
}
