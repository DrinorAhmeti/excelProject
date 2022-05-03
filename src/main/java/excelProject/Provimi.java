package excelProject;



public class Provimi {
	private String afati;
	private String name;
	 private  String age;
	 private int num;
	 private int id;
	 private int semestri;
	 
	 
	
	 
	 
	 public int getSemestri() {
		return semestri;
	}
	public void setSemestri(int semestri) {
		this.semestri = semestri;
	}
	public String getAfati() {
		return afati;
	}
	public void setAfati(String afati) {
		this.afati = afati;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	Provimi(){};
	Provimi(int nr,int i){
		num=nr;
		id=i;
	}
	Provimi(int nr,int i,int s){
		num=nr;
		id=i;
		semestri=s;
	}
	Provimi(int nr)
	{

		num=nr;
	};
	public String getName() {
		return name;
	}
	public void  setName(String name) {
		this.name = name;
	}
	public String getAge() {                                    
		return age;
	}
	public void setAge(String i) {
		this.age =i ;
	}

	Provimi(String n,String a){
		name=n;
		age=a;
	}
	Provimi(String afa,String n,String a){
		afati=afa;
		name=n;
		age=a;
	}
	 
	Provimi(String n){
		name=n;
		
	}

}
