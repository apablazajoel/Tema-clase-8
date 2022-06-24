public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(33);
        int edad = persona.getEdad();
        persona.setNombre("Joel");
        String nombre = persona.getNombre();
        persona.setTelefono("+54 343 54491023");
        String telefono = persona.getTelefono();

        System.out.println("La edad es: " + edad);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El telefono es: " + telefono);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }

    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    public String getTelefono (){
        return this.telefono;
    }
}