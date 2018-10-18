/**Creamos la interfaz general de los animales*/
interface Animal{
	/**Creamos el metodo abstracto*/
	public void dice();
}
/**Ahora creamos una clase por cada animal y sobre escribimos 
su metodo para que exprese las caracteristicas especificas de cada 
animal*/

class Dog implements Animal{
	public void dice(){
		System.out.println("\"Woof\"");
	}
}
class Cat implements Animal{
	public void dice(){
		System.out.println("\"Meow\"");
	}
}

class Bird implements Animal{
	public void dice(){
		System.out.println("\"Tweet\"");
	}
}

class Mouse implements Animal{
	public void dice(){
		System.out.println("\"Squeek\"");
	}
}

class Cow implements Animal{
	public void dice(){
		System.out.println("\"Moo\"");
	}
}

class Frog implements Animal{
	public void dice(){
		System.out.println("\"Croak\"");
	}
}

class Elephant implements Animal{
	public void dice(){
		System.out.println("\"Toot\"");
	}
}

class Duck implements Animal{
	public void dice(){
		System.out.println("\"Haz mis patrones de diseño xD\"");
		System.out.println("Es bromi jajaja");
	}
}

class Fish implements Animal{
	public void dice(){
		System.out.println("\"Blub\"");
	}
}

class Seal implements Animal{
	public void dice(){
		System.out.println("\"Ow ow ow\"");
	}
}

