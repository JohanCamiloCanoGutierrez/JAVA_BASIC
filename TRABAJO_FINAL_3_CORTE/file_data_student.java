usta.sistemas package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_student {
    / * AUTHOR: Johan Camilo Cano
    DATE: 14/06/2020
    DESCRIPTION: This class creates and displays data from a file d: /students.txt
     * /
    public static boolean f_add_student (String p_name, String p_lastname, String p_faculty) {
        // Description: this method creates a new line in a file d: /students.txt
        boolean result;
        try {
            My file = new file ("d: /students.txt");
            if (myFile.exists ()) {
                // We instantiate the file with TRUE to add new lines.
                FileWriter myFile2 = new FileWriter (myFile, true);
                // Load the file information into memory.
                BufferedWriter dataMyFile = new BufferedWriter (myFile2);
                dataMyFile.write ("\ n" + p_edificio + "|" + p_piso + "|" + p_numero de salon);
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

    Public static string [] [] f_all_data_students () {
        // description: this method returns all data (all lines) from file d: /students.txt
        String [] [] matrix_students;
        String line_text, line_tmp;
        int row = 0, total_lines = 0, separator1, separator2;
        try {
            My file = new file ("d: /students.txt");
            if (myFile.exists ()) {
                MyFile2 scanner = new scanner (myFile);
                while (myFile2.hasNextLine ()) {
                    total_lines ++;
                    myFile2.nextLine ();
                }
                myFile2.close ();
                myFile2 = null;
                matrix_students = new String [total_lines] [3];
                myFile2 = new scanner (myFile);
                while (myFile2.hasNextLine ()) {
                    line_text = myFile2.nextLine ();
                    separator1 = text_line.indexOf ("|");
                    if (separator1! = -1) {// We guarantee that the text line has data.
                        student_array [row] [0] = text_line.substring (0, separator1); // Only the building where the student is headed.
                        tmp_line = text_line.substring (separator1 + 1);
                        separator2 = tmp_line.indexOf ("|");
                        student_array [row] [1] = tmp_line.substring (0, separator2); // Only the floor where the student is going.
                        student_array [row] [2] = tmp_line.substring (separator2 + 1); //. only the room where the student is headed
                        row ++;
                    }
                }
                myFile2.close ();
                return matrix_students;
            } plus {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace ();
            return null;
        }

    }
}