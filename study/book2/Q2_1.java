package study.book2;

public class Q2_1 {

	public static void main(String[] args) {
//		Q2();
//		Q3();
		int[] a = {1,2,3};
		int[] b = {4,5,6};
//		copy(a,b);
		rcopy(a,b);
	}
	
	static void Q2() {
		int[] n = {5,10,73,2,-5,42};
		int temp = 0;

		for(int a=0;a<n.length;a++) {
			System.out.print(n[a]+" ");
		}
		System.out.println();
		
		for(int i=0; i<n.length/2; i++) {
			System.out.printf("n[%d]와 a[%d]를 교환합니다.%n",i,n.length-1-i);

			temp=n[i];
			n[i] = n[(n.length)-1-i];
			n[(n.length)-1-i] = temp;
			for(int a=0;a<n.length;a++) {
				System.out.print(n[a]+" ");
			}
			System.out.println();
		}
		System.out.println("역순 정렬을 마쳤습니다.");
		
	}
	
	static int Q3() {
		int[] n = {5,10,73,2,-5,42};
		int sum = 0;
		
		for(int i=0;i<n.length;i++) {
			sum+=n[i];
		}
		
		System.out.println(sum);
		
		return sum;
	}
	
	static void copy(int[]a, int[]b) {
//		a=b;

		
		
		for(int i=0; i<a.length; i++) {
			a[i] = b[i];
			System.out.println("a " + a[i]);
			System.out.println("b " + b[i]);
		}
		System.out.println(a);
		System.out.println(b);
	}
	
	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			a[i] = b[b.length-1-i];
			System.out.println("a " + a[i]);
			System.out.println("b " + b[i]);
		}
	}
	

}
