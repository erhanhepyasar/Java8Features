package javaeight.c.methodreference;

interface Parser {
	String parse(String str);
}

class StringParser {

	public String convert(String s) {
		if (s.length() <= 3) {
			s = s.toUpperCase();
		} else {
			s = s.toLowerCase();
		}

		return s;
	}

}

class MyPrinter {
	public void print(String str, final Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class Demo {

	public static void main(final String[] args) {
		final StringParser sp = new StringParser();
		final String str = "Erh";
		final MyPrinter mp = new MyPrinter();
		mp.print(str, sp::convert);

	}

}
