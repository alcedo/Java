package jdbcv2;

import java.util.List;

import com.shubham.basic.OptimizeDisplayAssignment;

/**
 * This class is also known as POJO or JavaBeans used to collect data from DEPT database 
 * @version 1.0
 * @author singhals
 *
 */
// POJO..,JavaBean
public class Dept 
{

	private Integer deptno;
	private String dname;
	private String loc;
	
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	public void display(List <Dept> entries)
	{
		int counter=entries.size();
		OptimizeDisplayAssignment.colNames= new String []{"DNUMBER","DNAME","LOC"};
		OptimizeDisplayAssignment.data =new String[counter][OptimizeDisplayAssignment.colNames.length];
		for(int i=0;i<counter;i++)
		{
			OptimizeDisplayAssignment.data[i]= new String []{Integer.toString(entries.get(i).getDeptno()),entries.get(i).getDname(),entries.get(i).getLoc()};

		}
		//	    System.out.println(OptimizeDisplayAssignment.data.length);
		//	    System.out.println(OptimizeDisplayAssignment.data[0].length);
		OptimizeDisplayAssignment.maxLength();
		OptimizeDisplayAssignment.displayLine('+','-');
		OptimizeDisplayAssignment.displayData('|',' ',OptimizeDisplayAssignment.colNames);
		OptimizeDisplayAssignment.displayLine('+','-');
		//OptimizeDisplayAssignment.data;


		for(int i=0;i<counter;i++)
		{
			OptimizeDisplayAssignment.displayData('|', ' ',OptimizeDisplayAssignment.data[i]);
		}
		OptimizeDisplayAssignment.displayLine('+','-');	
	}
	public Dept() 
	{
		
	}
	public Dept(int deptno, String dname, String loc) 
	{
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() 
	{
		return deptno;
	}

	public void setDeptno(int deptno)
	{
		this.deptno = deptno;
	}

	public String getDname() 
	{
		return dname;
	}

	public void setDname(String dname) 
	{
		this.dname = dname;
	}

	public String getLoc()
	{
		return loc;
	}

	public void setLoc(String loc)
	{
		this.loc = loc;
	}
	
	
}
