
import java.awt.*;

/**
 * Example5Applet
 *
 * This is a template applet for animation.
 * It illustrates how to use a graphics context
 * to draw a sine wave to the screen with little
 * or no flashing.
 *
 * @author Arthur van Hoff
 */
public
class Example5Applet extends java.applet.Applet implements Runnable {
    int frame;
    int delay;
    Thread animator;

    /**
     * Initialize the applet and compute the delay between frames.
     */
    public void init() {
	String str = getParameter("fps");
	int fps = (str != null) ? Integer.parseInt(str) : 10;
	delay = (fps > 0) ? (1000 / fps) : 100;
    }

    /**
     * This method is called when the applet becomes visible on
     * the screen. Create a thread and start it.
     */
    public void start() {
	animator = new Thread(this);
	animator.start();
    }

    /**
     * This method is called by the thread that was created in
     * the start method. It does the main animation.
     */
    public void run() {
	// Remember the starting time
	long tm = System.currentTimeMillis();
	while (Thread.currentThread() == animator) {
	    // Display the next frame of animation.
	    repaint();

	    // Delay depending on how far we are behind.
	    try {
		tm += delay;
		Thread.sleep(Math.max(0, tm - System.currentTimeMillis()));
	    } catch (InterruptedException e) {
		break;
	    }

	    // Advance the frame
	    frame++;
	}
    }

    /**
     * This method is called when the applet is no longer
     * visible. Set the animator variable to null so that the
     * thread will exit before displaying the next frame.
     */
    public void stop() {
	animator = null;
    }

    /**
     * Paint a frame of animation.
     */
    public void paint(Graphics g) {
	update(g);
    }

    /**
     * Paint a frame of animation.
     */

    public double sqr(double x){
	return((x)*(x));
    }
    public void update(Graphics g) {
	Color bg = getBackground();
	Dimension d = getSize();
	int h = d.height / 2;
	for (int x = 0 ; x < d.width ; x++) {
	    int v = 10;
	    int phase1 = (x-v*frame)%d.width + d.width/10;
	    int phase2 = (x+v*frame)%d.width  - d.width/10;
	    double sigma1 = 70.0;
	    // double sigma1 = 70.+100.*frame;
	    double ph1 = sqr(phase1)/(double)(sigma1);
	    double ph2 = sqr(phase2)/(double)(sigma1);
	    int y1 = (int)(10*d.height*Math.exp(-ph1)/Math.sqrt((double)sigma1));
	    int y2 = (int)(10*d.height*Math.exp(-ph2)/Math.sqrt((double)sigma1));

	    int y = (y1 + y2)/2;

	    g.setColor(bg);
	    /*	    g.drawLine(x,0,x,d.height-y1);
	    g.drawLine(x,0,x,d.height-y2);
	    g.setColor(Color.black);
	    g.drawLine(x,d.height-y1,x,d.height);
	    g.setColor(Color.red);
	    g.drawLine(x,d.height-y2,x,d.height);
	    */
	    g.drawLine(x,0,x,d.height-y);
	    g.setColor(Color.red);
	    g.drawLine(x,d.height-y,x,d.height);

	}
    }
}
