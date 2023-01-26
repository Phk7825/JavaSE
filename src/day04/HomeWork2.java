package day04;

public class HomeWork2 {
	public static void main(String[] args) {
		int[][] array = new int [7][7];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i*7 + j +1;
				System.out.print(array[i][j] +" ");
			}			
			System.out.println();
		}
		for(int i= 0; i < 14; i++) {
			if(i<7) {
				for(int j = 0; j < i+1; j++) {
					if(i%2 <1) {  //ÀÎµ¦½º Â¦¼ö
					System.out.print(array[i-j][j]+" ");
			}else{  //ÀÎµ¦½º È¦¼ö
				System.out.print(array[j][i-j]+" ");
		}
				}
	}else {
		for(int j=0;j <13 - i; j++) {
			if(i%2< 1 ) { //ÀÎµ¦½º Â¦¼ö
				System.out.print(array[6-j][i+j-6]+" ");
			}else {  //ÀÎµ¦½º È¦¼ö
				System.out.print(array[i+j-6][6-j]+" ");
			}
		}
	}
	System.out.println();
		}
	}
}

			
