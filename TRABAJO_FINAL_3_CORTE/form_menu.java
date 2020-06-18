usta.sistemas package;

import javax.swing. *;
import java.awt. *;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {
    // is a constructor

    public form_menu () {
        // Software name tag.
        JLabel label_menu = new JLabel ("SAC JAVA version", SwingConstants.CENTER);
        label_menu.setFont (new font ("Arial", 0, 30));
        label_menu.setBounds (0, 10, 600, 50);
        add (label_menu);
        // Label of who created it.
        JLabel label_maker = new JLabel ("Created by: Johan Camilo Cano", SwingConstants.LEFT);
        label_maker.setBounds (5, 300, 590, 20);
        add (label_maker);
        JButton start_button = new JButton ("Start");
        start_button.setBounds (250, 200, 100, 50);
        // Create an action for it when you click on it.
        start_button.addActionListener (new ActionListener () {
            @Cancel
            public void actionPerformed (ActionEvent actionEvent) {
                // Create an instance of the main form.
                form_principal form_principal1 = new form_principal ();
            }
        });
        add (start_button);
        // Properties of the form.
        setLayout (null);
        setVisible (true);
        setResizable (false);
        setBounds (0, 0, 600, 400);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }

}