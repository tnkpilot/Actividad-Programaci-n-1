import java.util.ArrayList;
public class OficinaPadron
{
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>();
    
    public void annadir(Habitante habitante) {
        habitantesPadron.add(habitante);
    }
    
    public ArrayList<Habitante> getHabitantesPadron() {
        return habitantesPadron;
    }
    
    public int calcularNumeroHabitantes() {
        return habitantesPadron.size();
    }
}
