import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class MainClass {

  public static void main(String[] a) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(new JTabbedPaneDemo());
	f.pack();
	f.setTitle("JTabbedPane Demo");
	f.setResizable(false);
    f.setVisible(true);
  }
}

class JTabbedPaneDemo extends JPanel {

    JTabbedPaneDemo() {

    JTabbedPane jtp = new JTabbedPane();
    jtp.addTab("Cities", new CitiesPanel());
    jtp.addTab("Colors", new ColorsPanel());
    jtp.addTab("Days fo the week", new DaysPanel());
    add(jtp);
  }
}

class CitiesPanel extends JPanel {

  public CitiesPanel() {

    JButton b1 = new JButton("New York");
    add(b1);
    JButton b2 = new JButton("London");
    add(b2);
    JButton b3 = new JButton("Hong Kong");
    add(b3);
    JButton b4 = new JButton("Tokyo");
    add(b4);
  }
}

class ColorsPanel extends JPanel {

  public ColorsPanel() {

    JCheckBox cb1 = new JCheckBox("Red");
    add(cb1);
    JCheckBox cb2 = new JCheckBox("Green");
    add(cb2);
    JCheckBox cb3 = new JCheckBox("Blue");
    add(cb3);
  }
}

class DaysPanel extends JPanel {

  public DaysPanel() {

    JComboBox jcb = new JComboBox();
    jcb.addItem("Monday");
    jcb.addItem("Tuesday");
    jcb.addItem("Wednesday");
    jcb.addItem("Trursday");
    jcb.addItem("Friday");
    jcb.addItem("Saturday");
    jcb.addItem("Sunday");
    add(jcb);
  }
}