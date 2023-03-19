public class Ejercicios_tema_8 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Gabriel");
        persona.setEdad(40);
        persona.setTelefono(1150596666);
        
        System.out.println("Mi nombre es "+ persona.nombre);
    }

    //Creamos la clase Persona, con sus setters y getters
    class Persona {
        private String nombre;
        private Integer edad;
        private Integer telefono;

        public void setNombre (String nombre){
            this.nombre = nombre;
        }
        public void setEdad (Integer edad){
            this.edad = edad;
        }
        public void setTelefono (Integer telefono){
            this.telefono = telefono;
        }

        public String getNombre(){
            return this.nombre;
        }
        public Integer getEdad(){
            return this.edad;
        }
        public Integer getTelefono(){
            return this.telefono;
        }
    }

    @Override
    public String toString() {
        return "Ejercicios_tema_8 []";
    }
}