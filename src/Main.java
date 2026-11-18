public class Main {

    public static void main(String[] args) {

        Sprint sprint = new Sprint();

        sprint.crearTarea("T01", "Login de usuarios", 5);
        sprint.crearTarea("T02", "Registro de usuarios", 4);
        sprint.crearTarea("T03", "Recuperar contraseña", 3);
        sprint.crearTarea("T04", "Panel principal", 8);
        sprint.crearTarea("T05", "Generar reportes", 6);

        sprint.crearTarea("T01", "Otra tarea", 2);

        sprint.completarTarea("T02");
        sprint.completarTarea("T05");

        Tareas tarea = sprint.buscarTarea("T03");

        if (tarea != null) {
            System.out.println("Tarea encontrada: "
                    + tarea.getTitulo());
        }

        System.out.println("Completadas: "
                + sprint.contarCompletadas());

        System.out.println("Horas pendientes: "
                + sprint.calcularHorasPendientes());

        sprint.mostrarTareas();
    }
}