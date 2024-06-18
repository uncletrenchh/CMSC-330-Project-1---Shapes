package cmsc330Project1;

/**
 * @author Kelvin Njenga
 * Date: November 14, 2023
 * Description: The enum variable Token is used to pass Token.type from the Lexer to the Parser
 * It is used in the parser to verify correct token has been found
 * Additions:
 * ISOSCELES, OFFSET, PARALLELOGRAM, RADIUS, REGULAR_POLYGON, SIDES, STRING, TEXT
 */

//Enumerated type that defines the list of tokens
enum Token {
 AT, COLOR, COMMA, END, EOF, HEIGHT, IDENTIFIER, ISOSCELES, LEFT_PAREN, NUMBER, OFFSET, PARALLELOGRAM, PERIOD,
 RADIUS, RECTANGLE, REGULAR_POLYGON, RIGHT_PAREN, RIGHT_TRIANGLE, SCENE, SEMICOLON, SIDES, STRING, TEXT, WIDTH
}