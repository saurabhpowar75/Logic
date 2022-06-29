package important;

import java.util.HashMap;

public class PC {

	public static void main(String[] args) 
	{

		String st="gghhyyuuoplk";
	    char[] s=	st.toCharArray();
	    
	    HashMap<Character, Integer> h=new HashMap<Character, Integer>();
	    
	    for(char l:s)
	    {
	    	if(h.containsKey(l))
	    	{
	    		h.put(l, h.get(l)+1);
	    	}
	    	else
	    	{
	    		h.put(l, 1);
	    	}
	    }
	    System.out.println(h+" ");

}
}