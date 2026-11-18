import java.util.ArrayList;

public class Sprint {

    private ArrayList<Tareas> tareas;

    public Sprint() {
        tareas = new ArrayList<>();
    }

    public void crearTarea(String codigo, String titulo, double horas) {


        for (Tareas t : tareas) {
            if (t.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Ya existe una tarea con ese código.");
                return;
            }
        }

        tareas.add(new Tareas(codigo, titulo, horas));
    }

    public void completarTarea(String codigo) {

        for (Tareas t : tareas) {
            if (t.getCodigo().equalsIgnoreCase(codigo)) {
                t.completar();
                System.out.println("Tarea completada.");
                return;
            }
        }

        System.out.println("Tarea no encontrada.");
    }

    public Tareas buscarTarea(String codigo) {

        for (Tareas t : tareas) {
            if (t.getCodigo().equalsIgnoreCase(codigo)) {
                return t;
            }
        }

        return null;
    }

    public int contarCompletadas() {

        int contador = 0;

        for (Tareas t : tareas) {
            if (t.isCompletada()) {
                contador++;
            }
        }

        return contador;
    }

    public double calcularHorasPendientes() {

        double horas = 0;

        for (Tareas t : tareas) {
            if (!t.isCompletada()) {
                horas += t.getHoras();
            }
        }

        return horas;
    }

    public void mostrarTareas() {

        System.out.println("\nTAREAS DEL SPRINT");

        for (Tareas t : tareas) {

            String estado;

            if (t.isCompletada()) {
                estado = "Completada";
            } else {
                estado = "Pendiente";
            }

            System.out.println(
                    "Código: " + t.getCodigo()
                            + "  Título: " + t.getTitulo()
                            + "  Horas: " + t.getHoras()
                            + "  Estado: " + estado
            );
        }
    }
}