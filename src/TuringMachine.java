
public class TuringMachine {
    int statenumber=0;
    // Property to store the current position of the pointer
    int pointer;
    // Property to store the input string
    String input;
    // List to store the state objects

    char[][] operations;
    // Constructor to create a new Turing machine and set the number of states
    public TuringMachine(int numStates,char[][] operations) {
        this.pointer = 0;
        this.input = "";
        this.statenumber=numStates;
        this.operations=operations;

    }



    public void processInput() {
            // Set the current state to the first state in the list
        int currentState = 0;
        this.pointer = 1;

            // Loop until an accept or reject state is reached
        while (true) {
                // Get the current character
            char currentChar = this.input.charAt(this.pointer);

                // Look up the next state, character to write, and direction to move the pointer
                // in the state transition table
            int nextState = -1;
            char nextChar = ' ';
            char direction = ' ';
            for (char[] operation : this.operations) {
                if (Character.getNumericValue(operation[0]) == currentState && operation[1] == currentChar) {
                    nextState = Character.getNumericValue(operation[4]);
                    nextChar = operation[3];
                    direction = operation[2];
                    // Change the current state to the next state
                    currentState = nextState;
                    // Update the input string
                    StringBuilder sb = new StringBuilder(this.input);
                    sb.setCharAt(this.pointer , nextChar);
                    this.input = sb.toString();
// Move the pointer in the specified direction
                    if (direction == 'L') {
                        this.pointer--;
                        }
                    else if (direction == 'R') {
                        this.pointer++;
                        }
                        break;
                    }
                }
                if(pointer>=0){
                System.out.println("The input is "+this.input+" and the next state " +
                        "is "+nextState+", and the pointer points to the "+(this.pointer)
                        +" bit of the string:"+this.input.charAt(pointer));
                }
                if (nextState == -1) {
                    System.out.println("Rejected");
                    break;
                }

                if (currentState == statenumber - 1) {
                    // Current state is an accept state
                    System.out.println("Accepted");
                    break;
                }
                else if (currentState == statenumber - 2) {
                    // Current state is a reject state
                    System.out.println("Rejected");
                    break;
                }
            }
        }


}




