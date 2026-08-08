package Week4;

class PasswordChecker 
{
    public boolean Length(String pw)
    {
        if(pw.length()>=8)
            return true;
        else
            return false;
    }

    public boolean hasUpperCase(String pw)
    {
        return pw.matches(".*[A-Z].*");
    }

    public boolean hasDigit(String pw)
    {
        return pw.matches(".*[0-9].*");
    }

    public boolean hasSP(String pw)
    {
        return pw.matches(".*[^a-zA-Z0-9].*");
    }

    String strength(String pw)
    {
        int c=0;
        if(Length(pw))
            c++;
        if(hasUpperCase(pw))
            c++;
        if(hasDigit(pw))
            c++;
        if(hasSP(pw))
            c++;

        if(c<=1)
            return "Weak";
        else if(c<=3)
            return "Medium";
        else
            return "Strong";
    }  
}
