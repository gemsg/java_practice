package OopConcepts;

public class ArrayD {

	public static void main(String[] args) {
		//Delete the element in an array.
		int num=10;
		int arr[]= {10,11,12,13,14,15,16,17,18,19,20};      
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				for(int j=i;j<(arr.length)-1;j++) {
				arr[j]=arr[j+1];
				}
				//set the flag to true as the element is deleted
				flag=true;
				arr[(arr.length)-1]=0;//set the last element to 0;
				break;
							}
		}
		
		if(flag==false) {
			System.out.println("The number to be deleted from the given array is not present");
		}
		else {
			System.out.println("The number is deleted from the given array");
		}
		//print the elements of an array-exclude the last element as it will be 0 and is of no use.
		for(int j=0;j<arr.length-1;j++) {
			System.out.println(arr[j]);
		}
	}

}
