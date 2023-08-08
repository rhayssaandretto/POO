/*
 Crie  uma classe abstrata com o nome Transportadora.
 Crie duas classes que herdam Transportadora (TransporteNautico e TransporteTerrestre).
 Crie um método abstrato na classe Transportadora com o nome calculaFrete, recebendo dois parâmetros inteiros ( altura e largura ).
 A transportadora Náutica deverá retornar 10% da soma dos dois parâmetros.
 A transportadora Terrestre deverá retornar 20% da divisão dos dois parâmetros.
 Imprimir no console o resultado instanciando a classe no método main
*/
public class Main {
    public static void main(String[] args) {
        TransporteNautico freteNautico = new TransporteNautico();   // tipo, nome, classe
        // freteNautico é uma variável do tipo TransporteNautico que recebe TransporteNautico
        TransporteTerrestre freteTerrestre = new TransporteTerrestre();

        System.out.println("Frete náutico: " + freteNautico.calculaFrete(50,100));
        System.out.println("Frete terrestre: " + freteTerrestre.calculaFrete(70,80));
    }
}