public class LeavesBobWorker implements Runnable{
    @Override
    public void run() {
        Turtle bob = new Turtle();
        bob.penColor("green");
        bob.setDirection(270);
        bob.forward(30);
        bob.setDirection(210);
        bob.forward(20);
        bob.setDirection(270);
        bob.forward(10);
        bob.setDirection(330);
        bob.forward(20);
        bob.setDirection(270);
        bob.forward(30);

        bob.setDirection(90);
        bob.forward(30);
        bob.setDirection(150);
        bob.forward(20);
        bob.setDirection(90);
        bob.forward(10);
        bob.setDirection(30);
        bob.forward(20);
        bob.setDirection(90);
        bob.forward(30);
    }
}
