

/**
 * https://www.baeldung.com/java-sealed-classes-interfaces
 * */

public sealed class Square extends LineShape permits ColorSquare {
	public int side;
}
