package _2_OCP.Solution;

import _2_OCP.Violation.AccountTypeEnum;

public abstract class Debit {

    public abstract void drawMoney(Double value, AccountTypeEnum accountType);
}