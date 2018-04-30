package sikuli_TKB_no_shutdown;
import org.sikuli.script.*;
import java.awt.AWTException;
import java.io.IOException;

/**
 * @author willywangkaa
 *
 */
public class TKB_automate {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		Screen video_screen = new Screen();
		Pattern waring = new Pattern(".\\image\\sleepdialog.PNG");

		
		while( true ) {
			if( video_screen.exists(waring) != null && (video_screen.exists(new Pattern(".\\image\\sleepdialog_button2.PNG")) != null) ) {
				try {
					video_screen.click(new Pattern(".\\image\\sleepdialog_button2.PNG"));
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					video_screen.hover(new Region( 0, 540, 1, 1));
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if( video_screen.exists(new Pattern(".\\image\\endfilmin3hour_counter2.png").exact()) != null ) {
				try {
					video_screen.click(new Pattern(".\\image\\endfilmin3hour_stopbutton.png"));
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					video_screen.hover(new Region( 0, 540, 1, 1));
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
		
		video_screen.type(Key.ESC);
		
		Thread.sleep(1200000);
		
		Runtime runtime = Runtime.getRuntime();
	    @SuppressWarnings("unused")
		Process proc = runtime.exec("shutdown -s -t 0");
	}

}
