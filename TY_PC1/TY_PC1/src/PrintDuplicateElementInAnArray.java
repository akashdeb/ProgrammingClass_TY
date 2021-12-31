import java.util.LinkedHashSet;

public class PrintDuplicateElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {3,4,6,4,8,9,4,1,3,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(Integer i :arr) {
			set.add(i);
		}
		System.out.println(set);
		for(Integer num:set) {
			int count=0;
			for(int i=0; i<arr.length; i++) {
				if(num==arr[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(num);
			}
		}
	}

}
