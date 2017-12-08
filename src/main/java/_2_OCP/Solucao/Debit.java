package _2_OCP.Solucao;

import _2_OCP.Violacao.AccountTypeEnum;

public abstract class Debit {

    public abstract void drawMoney(Double value, AccountTypeEnum accountType);
}