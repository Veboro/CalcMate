public class Calculator {

    public int addNumber(int firstNumberArabic, int secondNumberArabic){
        return firstNumberArabic+secondNumberArabic;
    }

    public int subtractNumber(int firstNumberArabic, int secondNumberArabic){
        return firstNumberArabic - secondNumberArabic;
    }

    public int multiplyNumber(int firstNumberArabic, int secondNumberArabic){
        return firstNumberArabic*secondNumberArabic;
    }

    public int divideNumber(int firstNumberArabic, int secondNumberArabic){
        return firstNumberArabic/secondNumberArabic;
    }

    public String toRoman(int number)
    {
        StringBuilder br=new StringBuilder("");
        while(number!=0)
        {
            if(number>=100)
            {
                br.append("C");
                number-=100;
            }
            if(number>=90)
            {
                br.append("XC");
                number-=90;
            }
            if(number>=50)
            {
                br.append("L");
                number-=50;
            }
            if(number>=40)
            {
                br.append("XL");
                number-=40;
            }
            if(number>=10)
            {
                br.append("X");
                number-=10;
            }
            if(number>=9)
            {
                br.append("IX");
                number-=9;
            }
            if(number>=5)
            {
                br.append("V");
                number-=5;
            }
            if(number>=4)
            {
                br.append("IV");
                number-=4;
            }
            if(number>=1)
            {
                br.append("I");
                number-=1;
            }
        }
        return br.toString();
    }


}
