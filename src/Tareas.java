public class Tareas {

    private String codigo;
    private String titulo;
    private double horas;
    private boolean completada;

    public Tareas(String codigo, String titulo, double horas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horas = horas;
        this.completada = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHoras() {
        return horas;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completar() {
        completada = true;
    }
}