import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
public class demo1 {
    public static void main(String[] args) throws Exception {
//        定义发送内容
        String str = "something";
//        实例化Robot类
        Robot robot = new Robot();
//        延时3秒
        robot.delay(3000);
//        实例化Clipboard类
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
//        通过split方法将字符串分割成数组
        String[] authors = str.split(",");
        for (int j = 0; j < 1000; j++){
            for (String str1 : authors) {
                Transferable text = new StringSelection(str1);
                clip.setContents(text, null);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.delay(300);
                robot.keyPress(KeyEvent.VK_ENTER);
            }
        }
    }
}