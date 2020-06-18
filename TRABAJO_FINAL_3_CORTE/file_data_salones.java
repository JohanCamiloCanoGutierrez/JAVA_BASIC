usta.sistemas package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_salones {
    / * AUTHOR: Johan Camilo Cano
    DATE: 14/06/2020
    DESCRIPTION: This class creates and displays data from a file of: /salones.txt
     * /
    public static boolean f_add_student (String p_name, String p_lastname, String p_salon, String p_card) {
        // Description: This method creates a new line in a file d: /salones.txt
        boolean result;
        try {
            MyFile file = new file ("d: /salones.txt");
            if (myFile.exists ()) {
                // We instantiate the file with TRUE to add new lines.
                FileWriter myFile2 = new FileWriter (myFile, true);
                // Load the information from the file.
                BufferedWriter dataMyFile = new BufferedWriter (myFile2);
                dataMyFile.write ("\ n" + p_edificio + "|" + p_piso + "|" + p_salon + "|" + p_numero de salon);
                dataMyFile.close ();
                result = true;
            } plus {
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace ();
            false return;
        }
    }

    Public static string [] [] f_all_data_salones () {
        // description: this method returns all the data (all the lines) from the file d: /salones.txt
        String [] [] matrix_salons;
        String line_text, line_tmp, line_tmp2;
        int row = 0, total_lines = 0, separator1, separator2, separator3;
        try {
            MyFile file = new file ("d: /salones.txt");
            if (myFile.exists ()) {
                Scanner myFile2 = new scanner (myFile);
                while (myFile2.hasNextLine ()) {
                    total_lines ++;
                    myFile2.nextLine ();
                }
                myFile2.close ();
                myFile2 = null;
                matrix_salones = new String [total_lines] [4];
                myFile2 = new scanner (myFile);
                while (myFile2.hasNextLine ()) {
                    line_text = myFile2.nextLine ();
                    separator1 = text_line.indexOf ("|");
                    if (separator1! = -1) {// We guarantee that the text line has data.
                        matrix_salones [row] [0] = linea_texto.substring (0, separator1); // Just the name of the building.
                        tmp_line = text_line.substring (separator1 + 1);
                        separator2 = tmp_line.indexOf ("|");
                        matrix_salones [row] [1] = linea_tmp.substring (0, separator2); // Just the floor.
                        tmp2_line = tmp_line.substring (separator2 + 1);
                        separator3 = tmp2_line.indexOf ("|");
                        matrix_salones [row] [2] = tmp2_line.substring (0, separator3); // Only the room number
                        matrix_salones [row] [3] = linea_tmp2.substring (separador3 + 1); //
                        row ++;
                    }
                }
                myFile2.close ();
                return matrix_salon;
            } plus {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace ();
            return null;
        }

    }
}