

public class MultipleLineStringEx {
	public static void main (String[] args) {
		String writeTextStandard	 = "<html>\n" +
	              "      <p>Ciao, hello</p>\n" +
	              "</html>\n";
		String writeTextSmart = """
	              <html>
	                   <p>Ciao, hello</p>
	              </html>
	              """;
		System.out.println(writeTextStandard);
		System.out.println(writeTextSmart);
	}
}
