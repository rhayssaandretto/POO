public class TransporteTerrestre extends Transportadora{
    public double calculaFrete(int altura, int largura) {
        if (altura == 0 && largura == 0) {
            return 0;
        } else {
            return (((double) altura / largura) * 0.2);
        }
    }
}
