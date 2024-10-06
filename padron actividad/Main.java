public class Main {
    public static void main(String[] args){
        Habitante habitante1 = new Habitante();
        
        habitante1.setNombre("Juan");
        habitante1.setApellido1("Torres");
        habitante1.setApellido2("Sanz");
        
        System.out.println(habitante1.getNombre());
        System.out.println(habitante1.getApellido1());
        System.out.println(habitante1.getApellido2());
    }
}