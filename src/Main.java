public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;          //объявляем и инициализируем переменные
        var cat = 3.6;
        var paper = 763789;
            System.out.println(dog);    //выводим в консоль значения переменных
            System.out.println(cat);
            System.out.println(paper);

        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;      //увеличиваем значение каждой переменной на 4
        cat = cat + 4;
        paper = paper + 4;
            System.out.println(dog);    //выводим в консоль новые значения переменных
            System.out.println(cat);
            System.out.println(paper);

        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
            System.out.println(dog);    //выводим в консоль новые значения переменных
            System.out.println(cat);
            System.out.println(paper);

        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;        //объявляем и инициализируем переменную
            System.out.println(friend);     //выводим в консоль значения переменной
        friend = friend + 2;
            System.out.println(friend);
        friend = friend / 7;
            System.out.println(friend);

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;         //объявляем и инициализируем переменную
            System.out.println(frog);       //выводим в консоль значения переменной
        frog = frog * 10;
            System.out.println(frog);
        frog = frog / 3.5;
            System.out.println(frog);
        frog = frog + 4;
            System.out.println(frog);

        //Задача 6
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;        //объявляем и инициализируем переменную
        var secondBoxerWeight = 82.7;
            System.out.println("Общий вес двух бойцов " + (secondBoxerWeight + firstBoxerWeight) + " кг.");   //выводим в консоль
            System.out.println("Разница между весами бойцов " + (secondBoxerWeight - firstBoxerWeight) + " кг.");

        //Задача 7
        System.out.println("Задача 7");
            System.out.println("Общий вес двух бойцов " + (secondBoxerWeight - firstBoxerWeight) + " кг.");     //первый способ
            System.out.println("Общий вес двух бойцов " + (secondBoxerWeight % firstBoxerWeight) + " кг.");     //второй способ

        //Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursOfWorking = 8;
        var totalWorkers = totalWorkingHours / hoursOfWorking;
        System.out.println("Всего работников в компании " + totalWorkers + " человек.");

        totalWorkers = totalWorkers + 94;
        totalWorkingHours = totalWorkers * hoursOfWorking;
        System.out.println("Если в компании работает " + totalWorkers + " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками.");

    }
}