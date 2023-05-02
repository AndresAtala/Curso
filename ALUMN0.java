class Alumno {

        private String Nombre, Apellido;
        private int Rut;
        private long Matricula;


        public Alumno(String Nombre, String Apellido, int Rut, long Matricula) {
            this.Nombre = Nombre;
            this.Apellido = Apellido;
            this.Rut = Rut;
            this.Matricula = Matricula;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {

            this.Nombre = nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setApellido(String apellido) {
            this.Apellido = apellido;
        }

        public int getRut() {
            return Rut;
        }

        public void setRut(int rut) {
            this.Rut = rut;
        }

        public long getMatricula() {
            return Matricula;
        }

        public void setMatricula(long Matricula) {
            this.Matricula = Matricula;
        }
        @Override
        public String toString(){
            return Nombre + "" + Apellido + "" + Rut + "" + Matricula;
        }
    }