class MyPreprocessor
{
    public static void main(String[] arg)
    {
	String s[] = {"(this input {is} correct)"};
		             
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
