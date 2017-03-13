import java.util.ArrayList;

public class InterfaceOrdi extends InterfaceActive {
	static ArrayList<InterfaceOrdi> list = new ArrayList<InterfaceOrdi>();
	private String dns;
	private String passerelle;

	//*******************
  //** Constructeurs **
  //*******************
	public InterfaceOrdi(){
		super();
		this.passerelle = IP;
		this.dns = IP;
		list.add(this);
	}
	
	public InterfaceOrdi(String name){
		super(name);
		this.passerelle = IP;
		this.dns = IP;
		if(name == "ReadOnly"){
			list.add(this);
		}
	}

	public InterfaceOrdi(String name, String mac, String ip, String mask, String passAdr, String dnsAdr){
		super(name, mac, ip, mask);
		this.passerelle = passAdr;
		this.dns = dnsAdr;
		list.add(this);
	}

	//********************
  //***** Mutateur *****
  //********************
	public void setDns(String dnsAdr){
		this.dns = dnsAdr;
	}

	public void setPasserelle(String passAdr){
		this.passerelle = passAdr;
	}

	public String toString(){
		return super.toString() + "|" + passerelle + "|" + dns;
	}


	//*******************
  //***** Lecture *****
  //*******************
	public String getDns(){
		return this.dns;
	}

	public String getPasserelle(){
		return this.passerelle;
	}
	
	public ArrayList<InterfaceOrdi> getIntOrdiList(){
		return list;
	}
	
	public static String listToString(){
		  String str = "";
		  int i = 0;
		  for(i=0; i < list.size(); i += 1){
		  	if(i > 0){
		  		str += "\n";
		  	}
		  	str += Integer.toString(i+1) + ". " + list.get(i).toString();
		  }
		  return str;
	  }
}
