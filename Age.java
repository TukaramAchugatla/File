public class Age {
	void age(int Rohan, int Sid) {
		if (Rohan > 0 && Sid > 0) {
			if (Rohan > Sid) {
				System.out.println("Rohan is Older than Sid");
			} else {
				if (Rohan == Sid) {
					System.out.println("Rohan and Sid age are same");
				} else {
					System.out.println("Sid is Older than Rohan");
				}
			}
		} else {
			System.out.println("Invalid Input");
		}
	}
}
