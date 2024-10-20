package principal;

import modelo.TelefonoMovil;

public class Main {
    public static void main(String[] args) {

        TelefonoMovil cel1 = new TelefonoMovil("Y5 Neo", "Huawei", 3, "Negro");
        System.out.println(cel1.getMarca());
        cel1.setMarca("morotola");
        System.out.println(cel1.getMarca());


        System.out.println(cel1);

        String contacto = "Hermano";
        cel1.llamar(contacto);
        cel1.encenderLinterna();


    }
}
