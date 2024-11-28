package ec.edu.espol.TareaFactory;

import ec.edu.espol.App.Tarea;
import ec.edu.espol.App.TareaCompleja;

public class TareaComplejaFactory implements TareaFactory {
    @Override
    public Tarea crearTarea() {
        return new TareaCompleja(null, null, null, null, null, null);
    }
}
