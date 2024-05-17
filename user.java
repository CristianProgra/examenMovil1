package users;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


//Atributos encapsulados con el modificador private
public class user {
    Scanner sc = new Scanner(System.in);
    private int id;

    private String name;

    private String lastName;

    private  String phone;

    private  String email;

    private  String password;

    // Constructor de la clase
    // El constructor es el encargado de crear el objeto
    // Es el metodo de la clase que permite instaciar el objeto e inicializar
    // los atributos de acuerdo a la logica de negocios.

    public user(){

    }

    // Getter ans Setter

    public int getId(){

        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // metodo propio

    List<ArrayList<Object>> usuarios = new ArrayList<>();
    ArrayList<Object> usuario = new ArrayList<Object>();


    public void crearUsuario(){
        System.out.println( "Crear el ID del usuario");
        id = (sc.nextInt());
        sc.nextLine(); // salto de linea
        usuario.add(id);

        System.out.println("Nombre ");
        name = sc.nextLine();
        usuario.add(name);

        System.out.println("apellido");
        lastName = sc.nextLine();
        usuario.add(lastName);

        System.out.println("telefono");
        phone = sc.nextLine();
        usuario.add(phone);

        System.out.println("correo");
        email = sc.nextLine();
        usuario.add(email);

        System.out.println("Ingrese contraseña");
        password = sc.nextLine();
        usuario.add(password);

        usuarios.add(usuario);
    }

    public void printUser(){

        for (Object item : usuario){
            System.out.println(item);

        }
        public void printUsers(){
            for(Object item : usuarios){
                System.out.println(item);
            }
        }

    }
}




