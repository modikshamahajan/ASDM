package session06;

public class StringBufferDemo 
{
   public static void main(String[] args)
   {
	   StringBuffer sb= new StringBuffer(32);
	   System.out.println(sb);
	   sb.append("Infoway");
	   System.out.println(sb);
	   sb.deleteCharAt(3);
	   System.out.println(sb);
   }
}
