package polymorphism;

public class main_class {

	public static void main(String[] args) {
		super_class	first[]= new super_class[2];
		first[0]=new first_morphism();
		first[1]=new second_morphism();
		for(int i=0;i<2;i++)
		{
			first[i].first_class();
		}

	}

}
