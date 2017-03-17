/**
    Богданов Степан № 7
    
1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
7 **** Прочитать 8 главу книги Майк МакГрата Java Программирование для начинающих и сделать примеры из этой главы.* Объектно-ориентированное программирование на Java
 */
public class OOP {

    public static void main(String[] args) {

        Cat cat[] = new Cat[3];
        cat[0] = new Cat("Barsik", 30);
        cat[1] = new Cat("Murzik", 30);
        cat[2] = new Cat("Pushok", 45);
        Plate plate = new Plate(100);
        for (Cat c : cat) 
            System.out.println(c);          // prints info of cats
        System.out.println(plate);
        cat[0].eat(plate);                  // cat eating (can be in loop)
        cat[1].eat(plate);
        cat[2].eat(plate);
        System.out.println(plate);          // print info of plate after eating
        for (Cat c : cat) 
            System.out.println(c);          // prints info of cats
        plate.addFood(10);                  // add food to the plate
        System.out.println(plate);
        cat[2].eat(plate);                  
        System.out.println(cat[2]);
        System.out.println(plate);
        
    }
}