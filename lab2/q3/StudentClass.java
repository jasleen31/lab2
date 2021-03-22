//I am adding through git
class StudentClass
{
int StudentAge;	//state

public void setAge(int age){
StudentAge = age;
}
public int getAge(){
System.out.println("Student's age is : "+ StudentAge);
return StudentAge;
}
public static void main(String args[]){
//object creation
StudentClass S1 = new StudentClass();
S1.setAge(18);
S1.getAge();
}
}
//Modifying again