package StudentBean;


//student class with getter and setters
public class StudentBean {
	private String name;
	private String id;
	private String age;
	private int phyMarks,mathsMarks,chemMarks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getPhyMarks() {
		return phyMarks;
	}
	public void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getChemMarks() {
		return chemMarks;
	}
	public void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}
	
}
