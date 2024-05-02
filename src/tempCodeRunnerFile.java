public class Main {
    public static void main(String [] args){
        //Unica instancia de clase cocinero, usando Singleton.
        CocineroBigMac cocineroBigMac = CocineroBigMac.getInstance();

        cocineroBigMac.setTEspecialidad("Pollo");
        cocineroBigMac.setQueso(true);
        cocineroBigMac.setCebolla(true);
        System.out.println("Hamburguesa");
        System.out.println(cocineroBigMac.build().toString());
        System.out.println("\n");

        cocineroBigMac.newHamburguesa();
        cocineroBigMac.setTEspecialidad("Res");
        cocineroBigMac.setQueso(true);
        cocineroBigMac.setLechuga(true);
        System.out.println("Hamburguesa");
        System.out.println(cocineroBigMac.build().toString());
        System.out.println("\n");


        cocineroBigMac.newHamburguesa();
        cocineroBigMac.setTEspecialidad("Tocino");
        cocineroBigMac.setQueso(true);
        cocineroBigMac.setLechuga(true);
        cocineroBigMac.setTomate(true);
        cocineroBigMac.setCebolla(true);
        System.out.println("Hamburguesa");
        System.out.println(cocineroBigMac.build().toString());
    }
}
