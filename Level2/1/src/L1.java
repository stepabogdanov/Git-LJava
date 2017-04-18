/** level 2

Lesson 1
@author Bogdanov Stepan

1. Разобраться с имеющимся кодом;
2. Добавить класс Команда, который будет содержать: название команды, массив из 4-х участников (т.е. в конструкторе можно сразу указывать всех участников), метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
3. Добавить класс ПолосаПрепятствий, в котором будут находиться: массив препятствий, метод, который будет просить команду пройти всю полосу;
То есть в итоге должно быть:
public static void main(String[] args) {
Course c = new Course(...);  // Создаем полосу препятствий
Team t1 = new Team(...);     // Создаем первую команду
Team t2 = new Team(...);     // Создаем вторую команду
c.doIt(t1);                  // Просим первую команду пройти полосу
c.doIt(t2);                  // Просим вторую команду пройти полосу
t1.showResults();            // Показываем результаты первой команды
t2.showResults();            // Показываем результаты второй команды
}
*/


class L1 {
    
    public static void main (String[] args) {
        Team team = new Team ("Team #1", new Animal[] {
                new Dog("Pushok"),
                new Duck ("Seraya Sheika"),
                new Horse("Sivyi"),
                new Cat ("Murzik")});
        Team team2 = new Team ("Team #2", new Animal[] {
                new Dog("Tuzik"),
                new Dog ("Jack"),
                new Horse("Kauryi"),
                new Cat ("Marusya")});
        team.getMembersName();

        Course barrier1 = new Course(5,0,5);

        barrier1.getObstacle();

        barrier1.doIt(team);
        team.showResults();
        barrier1.doIt(team2);
        team2.showResults();
        }
    
    
    
}