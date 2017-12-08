package _3_LSP.contravarianceOfArguments;

public class SubClass extends SuperClass{

    public String getFormattedNumber(int number) {

        return super.getFormattedNumber((short) number);

    }

    public String getFormattedNumber(byte number) {
        //if number > byte we will get a error
        return super.getFormattedNumber((short) number);

    }
}
