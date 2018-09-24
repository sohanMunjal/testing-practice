package tp;

public class test {
	/*
	int puzzel(int n){
		int result;
		if (n==1)
		return 1;
		
		result = puzzel(n-1) * n;
		System.out.println(result);
		return result;
		}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*test f = new test();
		System.out.println(" puzzel of 6 is = " + f.puzzel(6));*/
		int result;
		int x ;
		x = 1 ;
		result = 0;
		while (x <= 10) {
		if (x%2 == 0) result += x ;
		++x ;
		}
	}

}
