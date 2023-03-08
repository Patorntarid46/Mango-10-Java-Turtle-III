public class PetalsBobWorker implements Runnable{
    @Override
    public void run() {
        Turtle bob = new Turtle();
        // Set the background color
        bob.bgcolor("black");
        // Draw the flower petals with Bob
        bob.penColor("red");
        System.out.println(bob.getDirection() + " : " + bob.getX() + " : " + bob.getY());
        bob.penColor("violet");
        for (int i = 0; i < 18; i++) {
            bob.setDirection(i * 20);
            for (int j = 0; j < 30; j++) {
                bob.forward(j / 10.0);
                bob.left(2);
            }
            bob.setDirection((i + 1) * 20);
            for (int j = 0; j < 30; j++) {
                bob.forward(j / 10.0);
                bob.right(2);
            }
        }

    }
}
