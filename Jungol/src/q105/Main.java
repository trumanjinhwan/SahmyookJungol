package q105;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"Seoul", " 10,312,545", "+91,375", " Pusan", "3,567,910","+5,868", "Incheon","2,758,296","+64,888","Daegu", "2,511,676",
						"+17,230", "Gwangju", "1,454,636", "+29,774"};
		
		for (int i = 0; i < arr.length; i++) {
			if((i + 1) % 3 == 0 ) {
				System.out.printf("%15s\n", arr[i]);
			}
			else {
				System.out.printf("%15s", arr[i]);
			}
			
			//안녕하세요
			
			
		}
	}
}

