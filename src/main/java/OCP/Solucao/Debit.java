package OCP.Solucao;

import OCP.Violacao.AccountTypeEnum;

public abstract class Debit {

    public abstract void drawMoney(Double value, AccountTypeEnum accountType);
}