package HelloWorld;

public class Camel_case {
	public static String Camelcase(String str)
	{
		str = str.substring(0, 1).toUpperCase()
			+ str.substring(1);

		StringBuilder builder = new StringBuilder(str);

		for (int i = 0; i < builder.length(); i++) {
			if (builder.charAt(i) == '_') {

				builder.deleteCharAt(i);
				builder.replace(
					i, i + 1,
					String.valueOf(
						Character.toUpperCase(
							builder.charAt(i))));
			}
		}
		return builder.toString();
	}
	public static void main(String[] args)
	{
		String str = "a brown fox jumped";
		str = Camelcase(str);
		System.out.println(str);
	}
}
//	public static void main(String[] args) {
//		        String inp = "a brown fox jumped";
//
//		        System.out.println("Original String: " + inp);
//		    
//		        String[] words = inp.split("\\s+");
//
//		        StringBuilder camelCase = new StringBuilder();
//		        for (int i = 0; i < words.length; i++) {
//		            String word = words[i];
//		            if (i == 0) {
//		                camelCase.append(word.toLowerCase());
//		            } else {
//		                camelCase.append(word.substring(0, 1).toUpperCase())
//		                                 .append(word.substring(1).toLowerCase());
//		            }
//		        }
//
//		        System.out.println(camelCase.toString());
//		    }
//	}



