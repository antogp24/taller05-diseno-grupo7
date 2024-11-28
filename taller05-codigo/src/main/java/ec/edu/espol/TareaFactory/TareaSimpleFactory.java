package ec.edu.espol.TareaFactory;

import ec.edu.espol.App.Tarea;
import ec.edu.espol.App.TareaSimple;

public class TareaSimpleFactory implements TareaFactory {
    @Override
    public Tarea crearTarea() {
        return new TareaSimple(null, null, null, null, null);
    }
}
