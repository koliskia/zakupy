import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;


public class zawartosc extends JPanel implements ActionListener
{
    private JButton button;
    public zawartosc()
    {
        setLayout(null);
        button = new JButton("start");
        button.setBounds(1, 1, 140, 60);
        add(button);
        button.setActionCommand("jeden");
        button.addActionListener(this);
        
        postac.setVisible(false);
    }

        @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand()=="jeden")
        {
            button.setEnabled(false);;
            button.setVisible(false);
            add(new postac());
            //System.out.println("dwa");
            //postac p = new postac();
            postac.setVisible(true);
        }
    }
    
/*
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setFont(new Font("TimesRoman", Font.PLAIN, 80));
        g.drawString("testing", 600, 400);
    }
*/
}
