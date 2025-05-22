package constructoresTp7;

public class Persona {
private String nombre;
private int edad;
private String email;


public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNombre() {
	return nombre;
}
public Persona(String nombre) {
	super();
	this.nombre = nombre;
}

public Persona(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}

public Persona(String nombre, int edad, String email) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.email = email;
}

public boolean sosMayor() {
	boolean flag=false;
	if(edad>=18) {
		flag=true;
	}
	return flag;
}

public int repeticionesDeLetra(char letra) {
	int contador=0;
	
	for(int i=0;i<nombre.length();i++) {
		if(Character.toLowerCase(nombre.charAt(i)) == letra)
			contador++;	
	}
	return contador;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
}


}
