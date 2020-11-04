package oop;

/**
 * 'Click' Counter
 *  Starter code for demonstrating a simple class.
 */
public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("\n*** Counter App ***");

        Counter myCounter = new Counter(10);
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();

        //TODO - add call to reset() that you implement in Counter class
        myCounter.reset();
        myCounter.display();

        //TODO - add call to undo() that you implement in Counter class
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.display();
        myCounter.undo();
        myCounter.undo();
        myCounter.undo();
        myCounter.undo();
        myCounter.undo();
        myCounter.display();

        //TODO
        // Add a JUnit test method to test undo()

        //TODO
        // Create a second Counter object, then
        // click() it once, undo() twice, click(), then display()
        // What count do you expect? - "1"

        Counter secondCounter = new Counter(10);
        secondCounter.click();
        secondCounter.undo();
        secondCounter.undo();
        secondCounter.click();
        secondCounter.display();

    }

}
