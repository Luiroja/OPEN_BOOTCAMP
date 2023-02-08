public class Main {
    public static void main(String[] args) {
        Main objeto = new Main();
        objeto.totalPrice(100.00);

    }

    void totalPrice(double price) {
        double iva = price* 0.18;
        double resultado = iva + price;
        System.out.println("El precio total a pagar es " + resultado);
    }
}