
package model;

import javax.swing.JOptionPane;


public class Veiculo {
    private int pesoKg;
    private int maxVelocKmH;
    private float preco;

    public Veiculo(int pesoKg, int maxVelocKmH, float preco) {
        this.pesoKg = pesoKg;
        this.maxVelocKmH = maxVelocKmH;
        this.preco = preco;
    }

    public Veiculo() {
        this(0,0,0);
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getMaxVelocKmH() {
        return maxVelocKmH;
    }

    public void setMaxVelocKmH(int maxVelocKmH) {
        this.maxVelocKmH = maxVelocKmH;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void leitura(){
        setPesoKg(Integer.parseInt(JOptionPane.showInputDialog("Digite o Peso em Kgs:")));
        setMaxVelocKmH(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade maxima em km/h:")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço:")));
    }
    public String paraString(){
        return "Velocidade máxima: "+getMaxVelocKmH()+"\nPeso: "+getPesoKg()+"\nPreço: R$"+getPreco();
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null, paraString());
    }
}
