package OopConcepts;

public class Insert_Element_In_Array {
		
	public static void insert (int pos,int a[], int num) {
		if(pos<0||pos> a.length) {
			System.out.println("Invalid position"); }
		else {
			for(int i=0;i<a.length;i++) {
				if(i==pos-1) {
					a[i]=num;
				}				
				}
			
			}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50,60,70};
		int p=5;
		insert(p,ar,77);

	}

}
