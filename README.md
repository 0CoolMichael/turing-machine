# turing-machine
A demo code for turing machine

The test class is the entry point to the program. When constructing a Turing machine, the first parameter is the number of states, and the second parameter, **operations**, is the state transfer graph. Each line in **operations** represents a state transfer. In each row there are five elements. The first element represents the current state, the second element represents the read character, the third element represents the read/write head to the left or right, "R" for right and "L" for left, the fourth element represents the written character, and the fifth element represents the next state.

In addition, in the design of this program, the last state is the accept state and the second last state is the reject state.
