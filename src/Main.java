import javax.swing.*;

public class Main {
    public static void main (String[] args){
        //JOptionPane.showMessageDialog(null,"message","title",JOptionPane.ERROR_MESSAGE);
        //String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        //JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"รับหรือป่าว","ถามเธอ",JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักนะจุ้บ ๆ");
        }else{
            JOptionPane.showMessageDialog(null,"จำไว้เลย");
        }
    }
}