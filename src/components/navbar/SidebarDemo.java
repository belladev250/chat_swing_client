package components.navbar;

import javax.swing.*;
import java.io.IOException;

public class SidebarDemo extends JPanel {
    public SidebarDemo() throws IOException {
        JPanel body = new NewPage();
        new Layout(body);
    }
}