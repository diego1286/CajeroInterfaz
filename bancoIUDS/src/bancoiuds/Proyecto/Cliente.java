package bancoiuds.Proyecto;

public class Cliente {

    private int id;
    private String Nombre;
    private String apellido;
    private int numCard;
    private int pin;
    private double saldo;
    private int intentos;

    public Cliente() {
    }// se crea por que cuando se crea uno no vacio se elimina este vacio

    public Cliente(int id, String Nombre, String apellido, int numCard, int pin, double saldo, int intentos) {
        this.id = id;
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.numCard = numCard;
        this.pin = pin;
        this.saldo = saldo;
        this.intentos = intentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", Nombre=" + Nombre + ", apellido=" + apellido + ", numCard=" + numCard + ", pin=" + pin + ", saldo=" + saldo + ", intentos=" + intentos + '}';
    }
    
    
    
    

}
