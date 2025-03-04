// Student.java

class Student
{
	private String name;
	private long prn;
	private String batch;
	private String branch;
	private float cgpa;
	
	public Student(String name, long prn, String batch,String branch, float cgpa)
	{
		setName(name);
		setPRN(prn);
		setBatch(batch);
		setBranch(branch);
		setCGPA(cgpa);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPRN(long prn)
	{
		this.prn = prn;
	}
	
	public long getPRN()
	{
		return prn;
	}
	
	public void setBatch(String batch)
	{
		this.batch = batch;
	}
	
	public String getBatch()
	{
		return batch;
	}
	
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	
	public String getBranch()
	{
		return branch;
	}
	
	public void setCGPA(float cgpa)
	{
		this.cgpa = cgpa;
	}
	
	public float getCGPA()
	{
		return cgpa;
	}
	
	public void display()
	{
		System.out.println("Name: "+getName()+" PRN: "+getPRN()+" Branch : "+getBranch()+" Batch : "+getBatch()+" CGPA : "+getCGPA());
	}
}