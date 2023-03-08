public class StemSarahWorker implements Runnable{
    @Override
    public void run() {
        Turtle sarah = new Turtle();
        // Draw the stem with Sarah
        sarah.penColor("green");
        sarah.setDirection(270);
        sarah.forward(50);
        sarah.setDirection(225);
        sarah.forward(30);
        sarah.setDirection(270);
        sarah.forward(10);
        sarah.setDirection(315);
        sarah.forward(30);
        sarah.setDirection(270);
        sarah.forward(40);
        sarah.setDirection(225);
        sarah.forward(30);
        sarah.setDirection(270);
        sarah.forward(10);
        sarah.setDirection(315);
        sarah.forward(30);
    }
}
