import java.util.ArrayList;
import java.util.Collections;
class P14_ArrayStudents{
	private String name;
	private int studentNum;
	P14_ArrayStudents(String name, int sNum) {
	  this.name = name;
	  this.studentNum = sNum;
	}
	public String getName(){
	  return name;
	}
	public static void main(String[] args){
		ArrayList<String> studentNameList = new ArrayList<String>();
		P14_ArrayStudents s1 = new P14_ArrayStudents("KBK", 201611059);
		P14_ArrayStudents s2 = new P14_ArrayStudents("KBD", 201611051);
		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		Collections.sort(studentNameList);
		System.out.println(studentNameList);
	}
}