package pl.piomin.services.grpc.account;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(myAtoi("   -432323232322"));
	}
	public static int myAtoi(String s) {
        int n=0;
        Character firstchar=null;
        int len=s.length();
        boolean isNegative = false;
        int index =0;
        for(char c : s.toCharArray())
        {	if(c==' ')
        		index++;
        else
        	break;
       
        }
        if (index < len) {
            
            if (s.charAt(index) == '-') {
              isNegative = true;
              ++index;
            } else if (s.charAt(index) == '+'){
                ++index;
            }
            
          }
        if(!checkIfDigit(s.charAt(index)) && s.charAt(index)!='-' && s.charAt(index)!='+')
        	return 0;	
        while (index < len && checkIfDigit(s.charAt(index)))
        {
        	 int digit = s.charAt(index) - '0';
        	if(n>(Integer.MAX_VALUE / 10) || (n == (Integer.MAX_VALUE / 10) && digit>7))
        		return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        	
        		
        	
             
        	 n = (n * 10) + digit;
        		
        			 
        		      ++index;
        	
        		
        }
        	return 	isNegative ? -n : n;
        
    }
	private static boolean checkIfDigit(char c) {
		try {
		Integer.parseInt(String.valueOf(c));
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
}
