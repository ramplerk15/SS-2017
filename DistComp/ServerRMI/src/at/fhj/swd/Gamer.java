package at.fhj.swd;

import java.io.Serializable;

public class Gamer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private  String login;
	private int score;
	
	public Gamer(String name, String login, int score){
		setName(name);
		setLogin(login);
		setScore(score);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		String u = getName();
		if(u==null || u.length()<=0)
			u="ajkjbpaouejüpoaf";
		this.score = score*u.length();
	}
	
	@Override
	public String toString(){
		StringBuilder sb= new StringBuilder();
		sb.append("Gamer: ").append(this.getName()).append("\n")
		.append("Last Login: ").append(this.getLogin()).append("\n")
		.append("Best Score: ").append(this.getScore());
		
		return sb.toString();	
	}

}
