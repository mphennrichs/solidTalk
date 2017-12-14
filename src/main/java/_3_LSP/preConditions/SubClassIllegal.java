package _3_LSP.preConditions;

public class SubClass extends SuperClass {


    @Override
    public boolean isNiceText(String text) {

        if (text.isEmpty() || text == null || text.length() < 140){
            return false;
        }

        return true;
    }
}
