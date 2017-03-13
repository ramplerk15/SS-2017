package at.fhj.swd;

import java.rmi.Naming;

class RegistryManager{
	public static void main(String[] args){
		System.out.println("I am the registry manager!");
		try{
			ServerImpl srvobj = new ServerImpl();
			Naming.rebind("Gamer", srvobj);
			System.out.println("Object 'Gamer' is registered!");
			Naming.bind("Tom", srvobj);
			Naming.bind("Maxi", srvobj);
			Naming.bind("Melanie", srvobj);
			Naming.bind("Sophia", srvobj);
			Naming.bind("Bernhard", srvobj);
			Naming.bind("Luise", srvobj);
			System.out.println("Testusers are registered!");
			
			String[]out=Naming.list("Gamer");
			for(int i=0; i<out.length;i++){
//			for(int i=out.length-1; i<=0;i--){
				String [] s=out[i].split("/");
				System.out.println(s[3]);
				srvobj.setUser(s[3]);
			}
		}catch(Exception e){
			e.printStackTrace();
		};
	}
}
