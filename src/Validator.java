public class Validator {

    //Method validate type of operation
    public boolean isValidOperation(int userInput){
        if(userInput==1||userInput==2||userInput==3||userInput==4){
            return true;
        } else {
            return false;
        }
    }

    //Method for number validation;
    public boolean isArabicDigit(String digit){
        try {
            Integer digi = Integer.parseInt(digit);
            return true;
        } catch (Exception e){
            return false;
        }
    }


//Method for number convertation from roman to arabic
    public int convertToArabic(String number){
        number.toLowerCase();
        int arabicNumber = 0;
        switch (number){
            case "i":
                arabicNumber=1;
                break;
            case "ii":
                arabicNumber= 2;
            break;
            case "iii":
                arabicNumber= 3;
            break;
            case "iv":
                arabicNumber= 4;
            break;
            case "v":
                arabicNumber= 5;
            break;
            case "vi":
                arabicNumber= 6;
            break;
            case "vii":
                arabicNumber= 7;
                break;
            case "viii":
                arabicNumber= 8;
                break;
            case "ix":
                arabicNumber= 9;
                break;
            case "x":
                arabicNumber= 10;
                break;
                default:
            System.out.println(arabicNumber+ "Не рииська цифра від від І до X");
                    return arabicNumber = 0;
        }
        return arabicNumber;
    }


}
