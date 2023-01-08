public class test {
    public static void main(String[] args) {
        char[][] operations = new char[][] {
                {'0', 'a', 'R', 'x', '1'},
                {'0', 'x', 'R', 'x', '0'},
                {'1', 'a', 'R', 'a', '1'},
                {'1', 'b', 'R', 'y', '2'},
                {'2', 'b', 'R', 'b', '2'},
                {'2', 'z', 'R', 'z', '2'},
                {'2', 'c', 'R', 'z', '5'},
                {'3', 'y', 'R', 'y', '1'},
                {'3', 'b', 'L', 'b', '3'},
                {'4', 'y', 'L', 'b', '4'},
                {'4', 'x', 'R', 'x', '0'},
                {'4', 'a', 'L', 'a', '4'},
                {'5', 'c', 'L', 'c', '5'},
                {'5', 'z', 'L', 'z', '5'},
                {'5', 'b', 'L', 'b', '3'},
                {'5', 'y', 'L', 'b', '4'},
                {'5', ' ', 'L', ' ', '6'},
                {'6', 'a', 'R', 'a', '7'},
                {'6', 'b', 'R', 'b', '7'},
                {'6', 'x', 'L', 'x', '6'},
                {'6', 'y', 'L', 'y', '6'},
                {'6', 'z', 'L', 'z', '6'},
                {'6', ' ', 'L', ' ', '8'},
        };
        TuringMachine tm = new TuringMachine(9,operations);

// Set the input string
        tm.input=" aabbbcccccc ";


// Process the input string
        tm.processInput();
    }

}
