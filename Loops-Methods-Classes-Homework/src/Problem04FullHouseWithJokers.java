
public class Problem04FullHouseWithJokers {

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
										
									for (int c1 = 0; c1 < 2; c1++) {
										for (int c2 = 0; c2 < 2; c2++) {
											for (int c3 = 0; c3 < 2; c3++) {
												for (int c4 = 0; c4 < 2; c4++) {
													for (int c5 = 0; c5 < 2; c5++) {
														String firstCard = (c1 == 1) ? ("*") : (faces[f1] + suits[s1]);
														String secondCard = (c2 == 1) ? ("*") : (faces[f1] + suits[s2]);
														String thirdCard = (c3 == 1) ? ("*") : (faces[f1] + suits[s3]);
														String fourthCard = (c4 == 1) ? ("*") : (faces[f2] + suits[ss1]);
														String fifthCard = (c5 == 1) ? ("*") : (faces[f2] + suits[ss2]);
														System.out.printf("(%1$s %2$s %3$s %4$s %5$s)"
																, firstCard, secondCard, thirdCard, fourthCard, fifthCard);
														System.out.println();
														count++;
														
														firstCard = (c1 == 1) ? ("*") : (faces[f2] + suits[s1]);
														secondCard = (c2 == 1) ? ("*") : (faces[f2] + suits[s2]);
														thirdCard = (c3 == 1) ? ("*") : (faces[f2] + suits[s3]);
														fourthCard = (c4 == 1) ? ("*") : (faces[f1] + suits[ss1]);
														fifthCard = (c5 == 1) ? ("*") : (faces[f1] + suits[ss2]);
														System.out.printf("(%1$s %2$s %3$s %4$s %5$s)"
																, firstCard, secondCard, thirdCard, fourthCard, fifthCard);
														System.out.println();
														count++;
													}
												}
											}
										}
									}			
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
