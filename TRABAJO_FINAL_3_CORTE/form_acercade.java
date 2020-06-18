usta.sistemas package;

import javax.swing. *;
import java.awt. *;

public class form_acercade extends JFrame {
    public form_acercade () {
        setLayout (new BorderLayout ());
        // Top panel.
        JPanel top_panel = new JPanel ();
        JLabel label_menu = new JLabel ("About", SwingConstants.CENTER);
        label_menu.setFont (new font ("Arial", 0, 20));
        panel_superior.add (label_menu);
        // Central panel.
        JPanel panel_central = new JPanel ();
        JLabel label_maker = new JLabel ("This software was created by: Johan Camilo Cano", SwingConstants.CENTER);
        JLabel label_maker1 = new JLabel ("camilo studies at Santo Tomás University, studies systems engineering and is in the first semester", SwingConstants.LEFT);
        panel_central.add (label_maker);
        panel_central.add (label_maker1);
        // We add the panels to the form.
        add (panel_superior, BorderLayout.NORTH);
        add (panel_central, BorderLayout.CENTER);
        // Parameters of the form.

        setVisible (true);
        setResizable (false);
        setBounds (0, 0, 800, 400);
        setLocationRelativeTo (null);
    }
}