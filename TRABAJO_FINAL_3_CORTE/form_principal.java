usta.sistemas package;

import javax.swing. *;
import java.awt. *;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    public form_principal () {
        setTitle ("SAC JAVA version 1.0");
        setLayout (new BorderLayout ());
        // Top panel.
        JPanel top_panel = new JPanel ();
        JLabel label_menu = new JLabel ("Main menu", SwingConstants.CENTER);
        label_menu.setFont (new font ("Arial", 0, 20));
        panel_superior.add (label_menu);
        // Left panel.
        JPanel left_panel = new JPanel ();
        left_panel.setLayout (new GridLayout (5, 1));
        // We create the first button.
        JButton form_button1 = new JButton ("New student");
        form_button1.setBounds (0, 0, 100, 30);
        form_button1.addActionListener (new ActionListener () {
            @Cancel
            public void actionPerformed (ActionEvent actionEvent) {
                //
                form_estudent form_estudent1 = new form_estudent ();
            }
        });
        left_panel.add (form_button1);
        // We create the second button.
        JButton form_button2 = new JButton ("List all salones");
        form_button2.setBounds (0, 0, 100, 30);
        button_form2.addActionListener (new ActionListener () {
            @Cancel
            public void actionPerformed (ActionEvent actionEvent) {
                f_open_form_show_all_student (actionEvent);
            }
        });
        left_panel.add (form_button2);
        // We create the third button.
        JButton form_button3 = new JButton ("New room");
        form_button3.setBounds (0, 0, 100, 30);
        button_form3.addActionListener (new ActionListener (list of salons) {
            @Cancel
            public void actionPerformed (ActionEvent actionEvent) {
                form_salones form_docent1 = new form_salones ();
            }
        });
        left_panel.add (form_button3);
        // We create the fourth button.
        JButton form_button4 = new JButton ("List all salones");
        form_button4.setBounds (0, 0, 100, 30);
        form_button4.addActionListener (new ActionListener () {
            @Cancel
            public void actionPerformed (ActionEvent actionEvent) {
                f_open_form_show_all_salones (actionEvent);
            }
        });
        left_panel.add (form_button4);
        // We create the fifth button.
        JButton about_button = new JButton ("About ...");
        boton_acercade.setBounds (0, 0, 100, 30);
        button_about.addActionListener (new ActionListener () {
            @Cancel
            public void actionPerformed (ActionEvent actionEvent) {
                form_about form_about1 = new form_about ();
            }
        });
        panel_izquierdo.add (boton_acercade);
        // We create the bottom panel.
        JPanel bottom_panel = new JPanel ();
        panel_inferior.add (new JLabel ("Created by: Johan Camilo Cano"));
        // Add the panels to the form.
        add (panel_superior, BorderLayout.NORTH);
        add (left_panel, BorderLayout.WEST);
        add (bottom_panel, BorderLayout.SOUTH);

        // General parameters of the forms.
        setVisible (true);
        setResizable (false);
        setBounds (0, 0, 600, 400);
        setLocationRelativeTo (null);
    }

    private null f_abrir_form_show_all_student (java.awt.event.ActionEvent evt) {
        form_show_all_student form_show_all_student1 = new form_show_all_student (this);
    }

    private void f_abrir_form_show_all_salones (java.awt.event.ActionEvent evt) {
        form_show_all_salones form_show_all_salon1 = new form_show_all_salones (this);
    }

}