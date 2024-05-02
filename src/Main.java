public class Main {
    public static void main(String [] args){
        //Unica instancia de clase cocinero, usando Singleton.
        CocineroBigMac cocineroBigMac = CocineroBigMac.getInstance();

        //Seteando atributos de burguer1
        cocineroBigMac.setTEspecialidad("Pollo");
        cocineroBigMac.setLechuga(true);
        cocineroBigMac.setTomate(true);
        cocineroBigMac.setCebolla(false);
        cocineroBigMac.setQueso(false);

        System.out.println("Hamburguesa cliente 1");
        System.out.println(cocineroBigMac.build().toString());
        System.out.println("\n");

        cocineroBigMac.newHamburguesa();
        cocineroBigMac.setTEspecialidad("Res");
        cocineroBigMac.setLechuga(false);
        cocineroBigMac.setTomate(true);
        cocineroBigMac.setCebolla(true);
        cocineroBigMac.setQueso(true);

        System.out.println("Hamburguesa cliente 2");
        System.out.println(cocineroBigMac.build().toString());
        System.out.println("\n");


        cocineroBigMac.newHamburguesa();
        cocineroBigMac.setTEspecialidad("Tocino");
        cocineroBigMac.setLechuga(true);
        cocineroBigMac.setTomate(true);
        cocineroBigMac.setCebolla(true);
        cocineroBigMac.setQueso(true);

        System.out.println("Hamburguesa cliente 3");
        System.out.println(cocineroBigMac.build().toString());
    }
}
