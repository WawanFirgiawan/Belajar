import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
int a = in.nextInt();
for (int i=1; i<=a; i++) {
if (i%2 == 0) {
System.out.print("* ");
}
if (i%2 == 0) {
for (int j=2; j<=i; j++) {
System.out.print("* ");
}
}
else {
for (int j=1; j<=i; j++) {
System.out.print(i*j + " ");
}
}
System.out.println("");
}
}
}