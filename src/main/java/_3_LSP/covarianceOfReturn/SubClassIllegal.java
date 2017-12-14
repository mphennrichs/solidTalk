package _3_LSP.covarianceOfReturn;

public class SubClass extends SuperClass {

    public int getFormattedNumber(short number) {

        return super.plusOne(number);

    }

    public long getFormattedNumber(byte number) {
        //if number > byte we will get a error
        return super.plusOne((short) number);

    }
}
