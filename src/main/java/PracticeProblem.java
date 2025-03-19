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
			if(arr[mid] == num){
				low = high + 1;
			}
			else if(arr[mid] < num){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
			binaryCounter++;
		}
		int[] arr2 = new int[] {linearCounter, binaryCounter};
		return arr2;
	}
public static int[] compareStringSearch(String[] arr, String phrase){
	int linearCounter = 0;
	for (int i = 0; i < arr.length; i++){
		linearCounter = i + 1;
		if(arr[i].equals(phrase)){
			i = arr.length;
		}
	}
	
			int binaryCounter = 0;
			int high = arr.length-1;
			int low = 0;
			int mid;
			while(low <= high){
				mid = (low + high)/2;
				if(arr[mid].equals(phrase)){
					low = high + 1;
				}
				else if(arr[mid].compareTo(phrase) < 0){
					low = mid + 1;
				}
				else{
					high = mid - 1;
				}
				binaryCounter++;
			}
			int[] arr2 = new int[] {linearCounter, binaryCounter};
			return arr2;
}
}
