package model;

public class User {

	private String name;
	private String date;
	private String pass;
	private String job;
	private String e_mail;
	private String credit_Limit;
	private String address;
	private String interest;
	public User(String n, String d, String p,String j, String e, String c,String a, String i) {
		super();
		this.name = n;
		this.date = d;
		this.pass = p;
		this.job = j;
		this.e_mail = e;
		this.credit_Limit =c;
		this.address = a;
		this.interest =i;
	}
	public User(String e_m,String password){
		e_mail=e_m;
		pass=password;
		
	}
	public User()
	{
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getCredit_Limit() {
		return credit_Limit;
	}
	public void setCredit_Limit(String credit_Limit) {
		this.credit_Limit = credit_Limit;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
}
