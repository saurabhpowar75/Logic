package string;


public class PR {

	public static void main(String[] args)
	{
         String s="Be the man Always Be the man";
         
         String []sp=s.split(" ");
         
         for(int i=0;i<sp.length;i++)
         {
        	 for(int j=i+1;j<sp.length;j++)
        	 {
        		 if(sp[i].equals(sp[j]))
        		 {
        			 System.out.println(sp[j]);
        			 
        		 }
        	 }
         }
		
		
		
		
		
		
		
		
		
	}

}
