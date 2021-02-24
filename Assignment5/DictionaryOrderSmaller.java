package Assignment5;

import java.util.Scanner;

public class DictionaryOrderSmaller {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		permutation(str,str,"");
	

	}
	public static void permutation(String str,String cs,String ans){
		if(str.length()==0){
	        if(ans.compareTo(cs)>0){
	            System.out.println(ans);
	        }
	       //System.out.println(ans);
	        return;
	    }
	    
	    for(int i=0;i<str.length();i++){
	        String ros=str.substring(0,i)+str.substring(i+1);
	        permutation(ros,cs,ans+str.charAt(i));
	    }
    }
}