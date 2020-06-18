sta.sistemas package;

import javax.swing. *;
import java.awt. *;

public class form_show_all_student extends JDialog {
    / * AUTHOR: Johan Camilo Cano
    DATE: 06/14/2020
    DESCRIPTION: This class shows all the data from the file d: /students.txt
    * /
    public form_show_all_student (java.awt.Frame parent) {
        super (father, true);
        setLayout (new BorderLayout ());
        // Top panel.
        JPanel top_panel = new JPanel ();
        JLabel label_menu = new JLabel ("List of salons", SwingConstants.CENTER);
        label_menu.setFont (new font ("Arial", 0, 20));
        panel_superior.add (label_menu);
        // Central panel.
        String [] columnsNames = {"building", "floor", ""};
        file_data_student file_data_student1 = new file_data_student ();
        JTable data_table = new JTable (file_data_student1.f_all_data_students (), columnsNames);
        data_table.setBounds (10, 50, 590, 300);
        JScrollPane panel_central = new JScrollPane (data_table);
        // We add the two panels to the form.
        add (panel_superior, BorderLayout.NORTH);
        add (panel_central, BorderLayout.CENTER);
        // General parameters of the form.
        setSize (600, 400);
        setVisible (true);
        setResizable (false);
        setLocationRelativeTo (null);
        package (); // modal

    }
}