package EX9;

public class EX9 {
	
public static void main(String[] args) {
	
for (int i = 2; i <= 50; i++) {
	int primo = 0;
		
	for (int j = 2; j < i; j++) {
		if (i % j == 0) {
			primo = 1;
			break;
		}
	}
	if (primo == 1) {
		System.out.print(i + " ");
	}
}
}
}

	


