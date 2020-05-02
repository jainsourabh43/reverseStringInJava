package coreJavaConceptsPkg;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		String s="CAPGEMINI";
		String s1="";
		int len=s.length();
		for(int i=0;i<len;i++) {
			char c=s.charAt(i);
			for(int j=i+1;j<len;j++) {
				if(!(c==s.charAt(j))) {
					if(!s1.contains(Character.toString(c))) {
				s1=s1+s.charAt(i);
				}}
			}
		}
		if(!s1.contains(Character.toString(s.charAt(len-1)))){
			s1=s1+Character.toString(s.charAt(len-1));
			
		}
System.out.println(s1);
	}

}
