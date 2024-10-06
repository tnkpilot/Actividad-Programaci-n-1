import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class Comprobación {
   public static void realizarComprobacion(){
    
    Habitante habitante1 = new Habitante("Juan", "Torres", "Sanz");
    Habitante habitante2 = new Habitante("Marta", "Sergio", "Ramos");
    
    OficinaPadron padron = new OficinaPadron();
    
    padron.annadir(habitante1);
    padron.annadir(habitante2);
    
    ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
    for (Habitante habitante : habitantes) {
        System.out.println(habitante.getNombre() + " " +
        habitante.getApellido1() + " " +
        habitante.getApellido2());
    }
    
    System.out.println("El número total de habitantes es " + padron.calcularNumeroHabitantes());
}
}
