package WDD.testjava;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		System.out.print("<");
		int j;
		List list = new ArrayList();
		for (int i = 101; i < 200; i++) {//��������
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				list.add(i);
			}
		}
		for (int i = 0; i < list.size(); i++) {//��������
			System.out.print(list.get(i));
			if (i == list.size() - 1) {
				break;
			}
			System.out.print(",");
		}
		System.out.print(">");
	}
	}
		


