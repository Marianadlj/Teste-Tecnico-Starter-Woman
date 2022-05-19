package Desafio2;

public class HospedagemVIP extends Hospedagem{
    public HospedagemVIP(float valor) {
        super(valor);
    }
    public float printValor(){
        float valorVip = (float) (getValor() + (getValor() * 0.50));
        return valorVip;
    }
}
