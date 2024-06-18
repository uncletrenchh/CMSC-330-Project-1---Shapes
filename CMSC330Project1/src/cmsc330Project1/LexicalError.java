package cmsc330Project1;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: This class that defines a lexical error
 */

class LexicalError extends Exception {

	private static final long serialVersionUID = 1L;

	// Constructor that creates a lexical error object given the line number and
    public LexicalError(int line, String description) {
        super("Lexical Error on Line: " + line + " " + description);
    }
}
