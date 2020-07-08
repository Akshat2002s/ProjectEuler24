import java.util.*;
public class Lexicographic {
	static ArrayList<Long> num= new ArrayList<Long>();
static void permutation(String prefix, String str) {
	int n= str.length();
	if(n==0) {
		num.add(Long.parseLong(prefix));
	}
	else {
		for(int i=0; i<n; i++)
		permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("","0123456789");
		Collections.sort(num);
		System.out.println(num.get(1000000-1));

	}

}
