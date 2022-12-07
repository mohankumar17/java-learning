package com.corejava.version.j8;

@FunctionalInterface
interface Add {
	public int add(int a, int b);
}

@FunctionalInterface
interface Message {
	public void msg(String s);
}

public class LamdasDemo {

	public static void main(String[] args) {

		Add ans = (int a, int b) -> {
			return a + b;
		};

		System.out.println(ans.add(3, 7));

		Message m = (String s) -> {
			System.out.println(s);
		};
		m.msg("Hello Lambda");
	}

}
