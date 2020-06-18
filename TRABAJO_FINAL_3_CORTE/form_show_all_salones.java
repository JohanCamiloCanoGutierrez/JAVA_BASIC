package usta.sistemas;

import javax.swing. *;
import java.awt. *;

public class form_show_all_docent extends JDialog {
    / * AUTHOR: Johan Camilo Cano
    DATE: 06/14/2020
    DESCRIPTION: This class show all data of file d: /salones.txt
    * /
    public form_show_all_salones (java.awt.Frame parent) {
        super (parent, true);
        setLayout (new BorderLayout ());
        // Top panel.
        JPanel panel_superior = new JPanel ();
        JLabel label_menu = new JLabel ("List of salons", SwingConstants.CENTER);
        label_menu.setFont (new Font ("Arial", 0, 20));
        panel_superior.add (label_menu);
        // Central panel.
        String [] columnsNames = {"building", "floor", "rooms", "room number"};
        file_data_salones file_data_salon1 = new file_data_salones ();
        JTable data_table = new JTable (file_data_salon1.f_all_data_salones (), columnsNames);
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
        pack (); // modal

    }
}