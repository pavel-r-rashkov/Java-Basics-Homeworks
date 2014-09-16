
public class Problem03FullHouse {

	public static void main(String[] args) {
		int count = 0;
		char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", 
				"9", "10", "J", "Q", "K", "A"};
		
		for (int f1 = 0; f1 < faces.length; f1++) {
			
			for (int f2 = f1 + 1; f2 < faces.length; f2++) {
				
				for (int s1 = 0; s1 < suits.length; s1++) {
					
					for (int s2 = s1 + 1; s2 < suits.length; s2++) {
										
						for (int s3 = s2 + 1; s3 < suits.length; s3++) {
							
							for (int ss1 = 0; ss1 < suits.length; ss1++) {
								
								for (int ss2 = ss1 + 1; ss2 < suits.length; ss2++) {
									count += 2;
									System.out.printf("(%1$s%3$s %1$s%4$s %1$s%5$s %2$s%6$s %2$s%7$s)"
											, faces[f1], faces[f2], suits[s1], suits[s2], suits[s3], suits[ss1], suits[ss2]);
									System.out.printf("(%1$s%3$s %1$s%4$s %1$s%5$s %2$s%6$s %2$s%7$s)"
											, faces[f2], faces[f1], suits[s1], suits[s2], suits[s3], suits[ss1], suits[ss2]);
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println(count + " full houses");
	}

}
