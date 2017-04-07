package answer;

import java.util.*;

public class Resolve {
		    public static int lengthOfLongestSubstring(String s) {  
		        Map<Character,Integer> map=new HashMap <Character,Integer>();  
		        int maxLength=0;  
		        int now=0;  
		        for(int i=0;i<s.length();i++){  
		            if(map.containsKey(s.charAt(i))){  
		                now=Math.max(map.get(s.charAt(i))+1,now);  
		                if((i-now+1)>maxLength){  
		                    maxLength=i-now+1;    
		                }  
		            }else{  
		                if((i-now+1)>maxLength){  
		                    maxLength=i-now+1;  
		                }  
		            }  
		            map.put(s.charAt(i), i);  
		        }  
		        return maxLength;  
		    }  
		    public static void main(String[] args) {  
		        // TODO Auto-generated method stub  
		        Scanner s = new Scanner(System.in);  
		        String str =s.next();
                 //test:2 abababab
		        System.out.println(lengthOfLongestSubstring(str));  
		    }  
}
