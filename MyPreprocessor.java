class MyPreprocessor
{
    public static void main(String[] arg)
    {
	//"program" example to test the preprocessor
	String s[] = {"(this input {is} correct)"};
		
	//looping through program
        for (int i = 0; i < s.length; i++)
	{
            Preprocessor p = new Preprocessor(s[i]);
            
            if (p.isValid())
            {
		System.out.println("Input: " + s[i] + "\n\nThe input has passed"
                        + " the preprocessing");	
            }
            else
                System.out.println("Input has failed preprocessing");
        }		
    }
}
