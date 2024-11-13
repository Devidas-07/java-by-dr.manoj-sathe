public class IndexOfElement{
    public static void main(String args[]){
        System.out.println("enter the size of array");
		Scanner scan = new Scanner(System.in);
		int size =scan.nextInt();
		
		//array declaration
		int [] arr = new int [size]; //35,67,12,63,8
		
		//accepting input from user and assigning this value in array
		for(int i=0; i<size; i++) {
			System.out.println("enter "+i+ "th number");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number that you want to check their index");
		int specificNum= scan.nextInt();
        // for(int i=0; i<size; i++){
        //     if(specificNum==arr[i]){
        //         System.out.println("The index of the number that you provide "+i);
        //     }
        // }
    }
}