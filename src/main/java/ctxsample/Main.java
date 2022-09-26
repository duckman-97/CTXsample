package ctxsample;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		var context=
				new AnnotationConfigApplicationContext(
						ProjectConfig.class);
		
		Parrot x = new Parrot();
		x.setName("KiKi");
		
		Parrot x1 = new Parrot();
		x.setName("Koko");
		
		
		Supplier<Parrot> parrotSupplier= ()->x1;
		
		context.registerBean("parrot1",Parrot.class,parrotSupplier,
				bc->bc.setPrimary(true)
				);
		
		Parrot p = context.getBean(Parrot.class);
		
		//System.out.println(p);             
		System.out.println(p.getName());
		
		
		
		
		
	}

}
