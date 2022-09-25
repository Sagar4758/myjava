import java.util.*;
public class replace {

	public static void main(String[] args) 
	 {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String real=new String();
          System.out.println("enter the string");
          real=sc.nextLine();
           String[] edit=real.split("\\s+");
           int last=0;
            for(int i=0;i<edit.length;i++)
                {
        	         
                     last=edit[i].length();
                     edit[i]=edit[i].charAt(last-1)+edit[i].substring(1,last);
                }
            for(int i=0;i<edit.length;i++)
                 {
                     System.out.print(edit[i]+" ");
                 }
      
	 }
                     }

