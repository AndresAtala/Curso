    import java.util.ArrayList;
    
    public class Curso {
        private ArrayList<Alumno> alumnos;

        public Curso() {
            alumnos = new ArrayList<>();
        }

        public void agregarAlumno(Alumno alumno) {
            if (this.alumnos.contains(alumno)) {
                System.out.println("El alumno ya está en el curso");
            } else {
                this.alumnos.add(alumno);
                System.out.println("El alumno ha sido agregado al curso");
            }
        }

        public void eliminarAlumnoPorRut(int rut) {
            Alumno alumno = buscarAlumnoPorRut(rut);
            if (alumno != null) {
                this.alumnos.remove(alumno);
                System.out.println("El alumno ha sido eliminado del curso");
            } else {
                System.out.println("El alumno no está en el curso");
            }
        }

        public Alumno buscarAlumnoPorRut(int rut) {
            for (Alumno alumno : alumnos) {
                if (alumno.getRut() == rut) {
                    return alumno;
                }
            }
            return null;
        }

        public void modificarDatosAlumno(Alumno alumno, String nombre, String apellido, int rut, long matricula) {
            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.setRut(rut);
            alumno.setMatricula(matricula);
        }

        public void mostrarAlumnos() {
            for (Alumno alumno : alumnos) {
                System.out.println("Nombre: " + alumno.getNombre() + "; " + "apellido: " + alumno.getApellido() + "; " + "rut:  " + alumno.getRut() + "; " + "matricula:  " + alumno.getMatricula());
            }
        }
    }

