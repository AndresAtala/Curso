public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso();

        Alumno alumno1 = new Alumno("Andres", "Atala", 20788802-8, 2078802820);
        Alumno alumno2 = new Alumno("Jose", "González", 98765432-4, 207653219);
        Alumno alumno3 = new Alumno("Alexis", "Sánchez", 45678901-5, 2067890121);

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        curso.agregarAlumno(alumno3);

        curso.eliminarAlumnoPorRut(98765432-4);

        curso.mostrarAlumnos();


        curso.modificarDatosAlumno(alumno1, "Arturo", "vidal", 20834508-9, 2083458920);

        // Buscar un alumno por rut
        Alumno alumnoEncontrado = curso.buscarAlumnoPorRut(20788802-8);

        if (alumnoEncontrado != null) {
            System.out.println("El alumno encontrado es: " + alumnoEncontrado);
        } else {
            System.out.println("El alumno no fue encontrado");
        }
        curso.mostrarAlumnos();
    }
}
