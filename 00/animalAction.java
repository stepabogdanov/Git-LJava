/**
1 Создать классы Собака и Кот с наследованием от класса Животное.  
2 Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра 
каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту
(для прыжков). 
3 У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., 
собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.). 
4 При попытке животного выполнить 
одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true) 
5 * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м. 

*/

import java.util.*;

abstract class Animal {
    protected String str;
    protected int run, jump;
	protected double swim;
	protected boolean r, s, j;
    Animal (int run, double swim, int jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
        str = "Animal";
     }
	 
	 boolean run (int r) {
		boolean b;
		if (r > run || r < 0)  
			b = false; 
		else b = true;
		System.out.println(str + " Run: " + b );
		return b;
	}
	
	boolean swim (int s) {
        boolean b;
		if (s > swim || s <0) 
			b = false;
		else b = true;
		System.out.println(str + " Swim: " + b);
		return b;
	}
	
	boolean jump (int j) {
        boolean b;
		if (j > jump || j < 0)  
			b = false; 
		else b = true;
		System.out.println(str + " Jump: " + b);
		return b;
	}
	
	
}
    
class Cat extends Animal {
	Random r = new Random();
	Cat () {
		super(200, -1, 2);
		super.str = "Cat";
		super.run = 200- r.nextInt(50);           // random Cat run from 200 to 150
    }
    
	@Override 
	boolean swim (int s) {
        boolean b = false;
		System.out.println(str + " Swim: " + b);
		return b;
    
	}
}

class Dog extends Animal {
	Random r = new Random();
    Dog () {
	super(500, 0.5, 10);
	super.run = 500 - r.nextInt(100);				//random Dog run from 500 to 400
	super.str = "Dog";
	}
}
    
	
class AnimalAction {
	public static void main (String args[]) {
		int x = 400;
		Cat cat = new Cat ();
		Dog dog1 = new Dog();
		//Random r = new Random();
		//x = x - r.nextInt(100); 
		System.out.println ("X: " + cat.run + " " + dog1.run);
		cat.run(-1);
		cat.swim(5);
		cat.jump(1);
		dog1.run(500);
		dog1.jump(3);
		dog1.swim(7);
		
    }
}
	