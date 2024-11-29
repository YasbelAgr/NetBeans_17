import javax.swing.JOptionPane;
public class Formulario {
    public static void main(String[] args) {
        String nombre,area,estadoCivil, hijos;
        byte edad,numHijos;
        int sueldo;
        short años;
        nombre = JOptionPane.showInputDialog("Igresa tu nombre");
        edad = Byte.parseByte(JOptionPane.showInputDialog(null, "Igresa tu edad"));
        area = JOptionPane.showInputDialog("Igresa tu area de trabajo");
        sueldo= Integer.parseInt(JOptionPane.showInputDialog(null, "Igresa tu sueldo semanal"));
        años = Short.parseShort(JOptionPane.showInputDialog(null, "Igresa los años que llevas trabajando en la empresa"));
        estadoCivil = JOptionPane.showInputDialog("Igresa tu estado civil");
        hijos = JOptionPane.showInputDialog("Tienes hijos");
        while (!hijos.equals("si")){
            numHijos= Byte.parseByte(JOptionPane.showInputDialog(null, "¿Cuantos hijos tienes?"));
            if (numHijos>=2){
                JOptionPane.showMessageDialog(null, "Por tener ,"+numHijos+" resiviras por dos "
                        + "semanas una cantidadextra del 30% de tu sueldo semanal ");
            }else {
              JOptionPane.showMessageDialog(null, "Por tener ,"+numHijos+" resiviras por dos "
                      + "semanas una cantidadextra del 10% de tu sueldo semanal ");      
            }   
        }
        while (años>=5){
            JOptionPane.showMessageDialog(null,"Por estar trabajando mas de 5 años recibiras un "
                    + " porcentaje extra de tu sueldo semanal de 35% por dos semanas");
            if (años<5){
                JOptionPane.showMessageDialog(null, "Resiviras un porcentaje del 10% extra de tu "
                        + " sueldo semanal por dos semanas");
                
        }
        
        }
    }
    
}
