package _3_LSP.preConditions;

public abstract class SuperClass {

    public boolean isNiceText(String text){

        if (text.isEmpty() || text == null){

            return false;
        }

        return true;
    }

}
