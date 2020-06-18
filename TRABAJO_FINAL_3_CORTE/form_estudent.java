usta.sistemas package;


import javax.swing. *;
import java.awt. *;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form_estudent extends JFrame {

    JTextField text_name, text_lastname, text_salones;

    public form_estudent () {
        setLayout (new BorderLayout ());
        // Top panel
        JPanel top_panel = new JPanel ();
        JLabel label_menu = new JLabel ("New student", SwingConstants.CENTER);
        label_menu.setFont (new font ("Arial", 0, 20));
        panel_superior.add (label_menu);
        // central panel
        JPanel panel_central = new JPanel ();
        panel_central.setLayout (new GridLayout (5, 2));
        panel_central.add (new JLabel (""));
        panel_central.add (new JLabel (""));
        panel_central.add (new JLabel ("building:"));
        panel_central.add (text_building = new JTextField (""));
        panel_central.add (new JLabel ("floor:"));
        panel_central.add (text_piso = new JTextField (""));
        panel_central.add (new JLabel ("rooms:"));
        panel_central.add (room text_number = new JTextField (""));

        // bottom panel
        JPanel bottom_panel = new JPanel ();
        JButton create_button = new JButton ("Create");
        boton_crear.setBounds (0, 0, 100, 50);
        button_create.addActionListener (new ActionListener () {
            @Cancel
            public void actionPerformed (ActionEvent actionEvent) {
                f_create_new_student (actionEvent);
            }
        });
        bottom_panel.add (create_button);

        // Add panels to the form
        add (panel_superior, BorderLayout.NORTH);
        add (panel_central, BorderLayout.CENTER);
        add (bottom_panel, BorderLayout.SOUTH);
        setSize (600, 400);
        setVisible (true);
        setResizable (false);
        setLocationRelativeTo (null);


    }

    public void f_create_new_student (java.awt.event.ActionEvent evt) {
        // Description: This method saves the data in the file.
        end JDialog popup_window = new JDialog (this, "Save data", true);
        if (text_name.getText (). length () <3 ||
                text_lastname.getText (). length () <3 ||
                text_faculty.getText (). length () <3) {
            pop_window.add (new JLabel ("All fields must be a minimum of 3 characters"));
        } plus {
            // We will save in a file
            file_data_student file_data_student1 = new file_data_student ();
            boolean rpta = file_data_student1.f_add_student (text_edificio.getText (), text_piso.getText (), text_number of salon.getText ());
            if (rpta == true) {
                pop_window.add (new JLabel ("DATA SAVED SUCCESSFULLY"));
                text_edificio.setText ("");
                text_piso.setText ("");
                text_numero de salon.setText ("");
            } plus {
                pop_window.add (new JLabel ("The data can NOT be saved in the file d: /students.txt"));
            }
        }
        pop_window.pack ();
        pop_window.setVisible (true);
    }

}