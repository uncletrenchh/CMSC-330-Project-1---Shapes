package cmsc330Project1;

/**
 * @author Kelvin Njenga
 * Date: Nove,ber 14, 2023
 * Description: This class defines the syntax errors
 */

class SyntaxError extends Exception {

	private static final long serialVersionUID = 1L;

    // Constructor that creates a syntax error object given the line number and error
    public SyntaxError(int line, String description) {
        super("Syntax Error on Line: " + line + " " + description);
    }
}
