import java.util.Stack;

public class ParenthesesChecker {

    private Stack<Character> parenthesesOpenStack;
    private Stack<Character> parenthesesClosedStack;
    public ParenthesesChecker(){
        this.parenthesesOpenStack = new Stack<>();
        this.parenthesesClosedStack = new Stack<>();

    }



        //write a method called checkParentheses() done
        //takes in a string
        //iterates through each character in the string
        //pushes each bracket or every single character into stack
// on
//if letter = (  push onto stack
//checks each character? if it is
        //puts that string into a stack

        //check each character inside the string


        //returns a boolean

        //return true if the string contains correct pairs of parentheses
        //return false if not

        //situations it would return false
        //more opening or closing brackets of a particular type
        //(), <>, {}, []
        //opening bracket followed by two closing brackets

        //use a stack
        public boolean checkParentheses (String testString) {

            for (int i = 0; i < testString.length(); i++) {
                char c = testString.charAt(i);
                if (c == '(') {
                    parenthesesOpenStack.push(c);
                }

                if (c == ')') {
                    parenthesesClosedStack.push(c);
                }

            }

            if (parenthesesOpenStack.size() == parenthesesClosedStack.size()){
                return true;
            }

            else {
                return false;
            }


        }


}

