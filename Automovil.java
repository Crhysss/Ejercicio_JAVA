public class Automovil {
    String marca;
    int modelo;
    int motor;
    int numPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    tipoColor color;
    int velActual;
    tipoCombustible combustible;
    tipoAutomovil autot; //auto tipo=autot

    /*this hace referencia al objeto actual
    con el que se está trabajando dentro de una clase,
    se puede diferenciar entre el atributo de la instacia
    (objeto) y cualquier variable del mismo nombre
     */
    /*Constructor, de lo que vi son bloques de codigo con parametros
    despues le das valores a esos parámetros
     */
    public Automovil(String marca, int modelo, int motor, tipoColor color,tipoCombustible combustible, tipoAutomovil autot, int numPuertas,int cantidadAsientos,int velocidadMaxima){
        this.marca=marca;
        this.modelo = modelo;
        this.motor = motor;
        this.color = color;
        this.combustible = combustible;
        this.autot = autot;
        this.numPuertas = numPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
    }
    /*get: obtienen el valor de atributos de la clase
    (de lo que vi en ejemplos, asi se usa generalmente)
    set: se establece un nuevo valor para los atributos
    de la clase (lo mismo la forma que use
    la vi en ejemplos), al parecer tambien se hacian
    para revisar ciertas condiciones
    la verdad sigo sin entender que hacen, pero lo pedia
    el diagrama que mostró :)*/
    public String getMarca(){
        return marca;
    }
    public int getModelo(){
        return modelo;
    }
    public int getMotor(){
        return motor;
    }
    public tipoColor getcolor(){
        return color;
    }
    public tipoCombustible getCombustible(){
        return combustible;
    }
    public tipoAutomovil getAutot(){
        return autot;
    }
    public int getNumPuertas(){
        return numPuertas;
    }
    public int getCantidadAsientos(){
        return cantidadAsientos;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public int getVelActual(){
        return velActual;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(int modelo){
        this.modelo=modelo;
    }
    public void setColor(tipoColor color){
        this.color=color;
    }
    public void setMotor(int motor){
        this.motor=motor;
    }
    public void setCombustible(tipoCombustible combustible){
        this.combustible=combustible;
    }
    public void setAutot(tipoAutomovil autot){
        this.autot=autot;
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas= numPuertas;
    }
    public void setCantidadAsientos(int cantidadAsientos){
        this.cantidadAsientos=cantidadAsientos;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    public void setVelActual(int velActual){
        this.velActual=velActual;

    }
    //metodo pa imprimir
    public void imprimido(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Motor: "+ motor);
        System.out.println("Color: "+ color);
        System.out.println("Combustible: "+ combustible);
        System.out.println("Automovil: "+ autot);
        System.out.println("Numero de puertas: "+ numPuertas);
        System.out.println("Cantidad de asientos: "+ cantidadAsientos);
        System.out.println("Velocidad maxima: "+ velocidadMaxima);
    }


}
