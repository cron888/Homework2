//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задание 5
        var frog =3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задание 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sum = 0.0;
        var dif = 0.0;

        sum = boxer1 + boxer2;
        System.out.println(sum);
        dif = boxer2 - boxer1;
        System.out.println("Разница весов равна: "+ dif);

        //Задание 7
        var ost = 0.0;

        ost = boxer2 % boxer1;

        //Задание 8
        var tsum = 640;
        var supp = 8;
        var allsupp = 0;
        allsupp = tsum / supp;

        System.out.println("Всего работников в компании - " + allsupp + " человек");
        allsupp = allsupp + 94;
        tsum = allsupp * supp;
        System.out.print("Если в компании работает " + allsupp + " человек, то всего " + tsum +
                " часов работы может быть поделено между сотрудниками");



    }
}
