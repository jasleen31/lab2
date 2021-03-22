class Calculator
{
public static void main(String args[])
{
int num1 = Integer.parseInt(args[0]);
String op = args[1];
int num2 = Integer.parseInt(args[2]);
int result;
if(op.equals("+"))
{
result = num1 + num2;
System.out.println(num1+" "+op+" "+num2+" = "+result);
}
else if(op.equals("-"))
{
result = num1 - num2;
System.out.println(num1+" "+op+" "+num2+" = "+result);
}
else if(op.equals("'*'"))
{
result = num1 * num2;
System.out.println(num1+" "+op+" "+num2+" = "+result);
}
else if(op.equals("/"))
{
result = num1 / num2;
System.out.println(num1+" "+op+" "+num2+" = "+result);
}
else
{
System.out.println("Invalid operator");
}
}
}