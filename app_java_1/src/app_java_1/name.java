package app_java_1;

class name {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int y:arr) {
			System.out.println(y);
		}
	}

}
