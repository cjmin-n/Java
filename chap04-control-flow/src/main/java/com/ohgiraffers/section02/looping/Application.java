package main.java.com.ohgiraffers.section02.looping;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        A_for a = new A_for();
        // a.testSimpleForStatement();
        // a.testForExample();
        // a.printGugudan();
        // a.testForExample2();
        // a.test();
        // a.wrong();

        B_nestedFor b = new B_nestedFor();
        // b.printGugudanFromTwoToNine();
        // b.printUpgradeGugudan();
        // b.printStars();

        C_while c = new C_while();
        // c.testSimpleWhileStatement();
        // c.testWhileExample();
        // c.testWhileExample2();
        // c.testWhileExample3();

        D_doWhile d = new D_doWhile();
        // d.testSimpleDoWhileStatement();
        d.testDoWhileExample();

    }
}
