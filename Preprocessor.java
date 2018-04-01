import java.util. Stack;
import java.util.EmptyStackException;

public class Preprocessor
{
    Stack stk;
    String input;
    int length;

    Preprocessor(String s)
    {
	input = s;
	length = input.length();
	stk = new Stack();
    }
	
    boolean isValid()
    {
	int index = 0;
	boolean fail = false;

	try
	{
            while (index < length && !fail)
            {
		char ch = input.charAt(index);
                
		switch (ch) 
                {
                    case Constants.LEFT_PAR:
			stk.push(new Character(ch));
                    break;		
                    case Constants.RIGHT_PAR:
			if((char)stk.peek() == Constants.LEFT_PAR)
                            stk.pop();
                    break;
                    case Constants.LEFT_CURLY:
			stk.push(new Character(ch));
                    break;		
                    case Constants.RIGHT_CURLY:
			if((char)stk.peek() == Constants.LEFT_CURLY)
                            stk.pop();
                    break;
                    case Constants.LEFT_BRACKET:
			stk.push(new Character(ch));
                    break;		
                    case Constants.RIGHT_BRACKET:
			if((char)stk.peek() == Constants.LEFT_BRACKET)
                            stk.pop();
                    break;
                    default:
                    break;
		}
                index++;
            }
	}
        catch (EmptyStackException e) 
	{
            fail = true;
        }
	
        if (stk.empty() && !fail)
            return true;
        else
            return false;
    } 
}
