public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static int[] compareSearch(int[] arr, int num){
		int linearCounter = 0;
for (int i = 0; i < arr.length; i++){
	linearCounter = i + 1;
	if(arr[i] == num){
		i = arr.length;
	}
}

		int binaryCounter = 0;
		int high = arr.length-1;
		int low = 0;
		int mid;
		while(low <= high){
			mid = (low + high)/2;
			binaryCounter++;
			if(arr[mid] == num){
				low = high + 1;
			}
			else if(arr[mid] < num){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		int[] arr2 = new int[] {linearCounter, binaryCounter};
		return arr2;
	}
public static int[] compareSearchString(String[] arr, String phrase){

}
}
