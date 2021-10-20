import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JTextField name;
    private JPanel mainPanel;
    private JTextField age;
    private JButton Create;
    private JTextPane output;
    private JTextField height;
    private JTextField weight;
    private JTextField email;
    private JButton getHeight;
    private JLabel outputHeight;
    private JRadioButton DB;
    private JRadioButton filePersistence;
    private JButton savePerson;
    private JLabel outputFile;
    private Person person;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public GUI() {
        Create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                person = new PersonHandler().createPerson(name.getText(), Integer.parseInt(age.getText()), Integer.parseInt(height.getText()),
                        Integer.parseInt(weight.getText()), email.getText());
                output.setText(person.toString());
                System.out.print(person.toString());
            }
        });
        getHeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String height =new PersonHandler().getHeightInInches(person);
                outputHeight.setText(height);
            }
        });
        savePerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persistence persistence = new Persistence().
                if (DB.isSelected()){
                    outputFile.setText("");
                }
            }
        });
    }
}


