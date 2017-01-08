

public class BinarySearch {

	int[] myArr = {21, 32, 48, 61, 77, 82, 93, 105, 113, 127};
	
	int LB = 0;
	int UB = myArr.length;
	int mid;
	public int findIndex(int desired){
		
		while(true){
			mid = (LB + UB)/2;
			
			if(myArr[mid] < desired){
				LB = mid + 1;
			} else if(myArr[mid] > desired){
				UB = mid - 1;
				
			} else if(myArr[mid] == desired){
				break;
			}
		}
		
		return mid;
		
	}
	
	
}
