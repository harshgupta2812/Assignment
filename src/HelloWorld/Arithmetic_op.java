package HelloWorld;

public class Arithmetic_op {
	    public static Integer addInt(Integer x, Integer y) {
	        return x + y;
	    }
	    public static Character addChar(Character x, Character y) {
	        return  (char) (x +  y);
	    }
	    public static Boolean addBoolean(Boolean x, Boolean y) {
	        return x && y;
	    }
	    public static Float addFloat(Float x, Float y) {
	        return x + y;
	    }

	    public static void main(String[] args) {
	        Integer resultInt = addInt(5, 10);
	        System.out.println(resultInt);

	        Character resultChar = addChar('H', 'G');
	        System.out.println(resultChar);

	        Boolean resultBoolean = addBoolean(true, false);
	        System.out.println(resultBoolean);

	        Float resultFloat = addFloat(2.5f, 3.5f);
	        System.out.println(resultFloat);
	    }
	}
