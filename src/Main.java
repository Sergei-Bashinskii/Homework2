public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Значение 1:");
        System.out.println(friend);
        friend = friend * 2;
        System.out.println("Значение 2:");
        System.out.println(friend);
        friend = friend / 7;
        System.out.println("Значение 3:");
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Значение 1:");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println("Значение 2:");
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println("Значение 3:");
        System.out.println(frog);
        frog = frog + 4;
        System.out.println("Значение 4:");
        System.out.println(frog);
        System.out.println("Задача 6");
        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("Масса одного боксера - " + weightOneBoxer + " кг.");
        System.out.println("Масса второго боксера - " +weightSecondBoxer + " кг.");
        var totalWeightTwoBoxers = weightOneBoxer + weightSecondBoxer;
        System.out.println("Общий вес двух боксеров = " + totalWeightTwoBoxers + " кг.");
        var differenceWeightTwoBoxers = weightSecondBoxer - weightOneBoxer;
        System.out.println("Разница в весе двух боксеров = " + differenceWeightTwoBoxers + " кг.");
        System.out.println("Задача 7");
        var differenceWeightTwoBoxers1 = weightSecondBoxer - weightOneBoxer;
        var differenceWeightTwoBoxers2 = weightSecondBoxer % weightOneBoxer;
        System.out.println("Первый способ: " + differenceWeightTwoBoxers1 + " кг.");
        System.out.println("Второй способ: " + differenceWeightTwoBoxers2 + " кг.");
        System.out.println("Задача 8");
        var allTime = 640;
        var timeWorks = 8;
        var people = allTime / timeWorks;
        System.out.println("Всего работников в компании - " + people + " человек");
        var dopPeople = people + 94;
        var dopTime = dopPeople * 8;
        System.out.println("Всего работников в компании " + dopPeople+ " человек, то всего " + dopTime + " часов работы может быть поделено между сотрудниками ");
    }
}