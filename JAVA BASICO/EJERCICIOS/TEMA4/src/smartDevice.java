import java.lang.reflect.Array;
import java.util.Arrays;

public class smartDevice {
    String nombreDispositivo;
    String fabricante;
    String sistemaOperativo;
    String color;
    Integer year;
    String batery;
    boolean ram;
    boolean apps;


    public smartDevice() {

    }

    public smartDevice(String nombreDispositivo, String fabricante, String sistemaOperativo, String color, Integer year, boolean ram, boolean apps) {
        this.nombreDispositivo = nombreDispositivo;
        this.fabricante = fabricante;
        this.sistemaOperativo = sistemaOperativo;
        this.color = color;
        this.year = year;
        this.ram = ram;
        this.apps = apps;
    }

    public static void main(String[] args) {

    smartWacht Mykronoz = new smartWacht();
    Mykronoz.nombreDispositivo = "MYKRONOZ";
    Mykronoz.fabricante = "ZeTime";
    Mykronoz.sistemaOperativo = "ANDROID";
    Mykronoz.color = "Negro";
    Mykronoz.year = 2020;
    Mykronoz.batery = "1000 Amp";
    Mykronoz.ram = false;
    Mykronoz.apps = true;
    Mykronoz.isWaterResist = true;


        System.out.println("Características del smarwatch seleccionado: ");
        System.out.println("NOMBRE: " + Mykronoz.nombreDispositivo);
        System.out.println("FABRICANTE: " + Mykronoz.fabricante);
        System.out.println("SISTEMA OPERATIVO: " + Mykronoz.sistemaOperativo);
        System.out.println("RESISTENCIA AGUA: " + Mykronoz.isWaterResist);


        // smartphone Model Create
        smartPhone redmiNode = new smartPhone();
        redmiNode.nombreDispositivo = "Redmi Node 8";
        redmiNode.fabricante = "Xiaomi";
        redmiNode.sistemaOperativo = "ANDROID";
        redmiNode.color = "gris";
        redmiNode.batery = "5000 Amp";
        redmiNode.ram = true;
        redmiNode.videoGames = new String[]{"COD", "POOL", "FREE FIRE"};
        redmiNode.auriculares = true;

        System.out.println("Características del SmartPhone seleccionado :");
        System.out.println("Nombre: " + redmiNode.nombreDispositivo);
        System.out.println("Fabricante: " + redmiNode.fabricante);
        System.out.println("SistemaOperativo: " + redmiNode.sistemaOperativo);
        System.out.println("Color: " + redmiNode.color);
        System.out.println("Batería: " + redmiNode.batery);
        System.out.println("Tiene RAM: " + redmiNode.ram);
        System.out.println("JUEGOS: " + Arrays.toString(redmiNode.videoGames));
        System.out.println("Entrada Auriculares: " + redmiNode.auriculares);
    }






}