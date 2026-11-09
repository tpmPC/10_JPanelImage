
import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tpm_paucasesnovescif
 */
public class JPanelImage extends JPanel implements Serializable
{
    private BackgroundImage backgroundImage;
    
    public JPanelImage()
    {
        
    }

    public BackgroundImage getImgRoute()
    {
        return backgroundImage;
    }

    public void setImgRoute(BackgroundImage imgRoute)
    {
        this.backgroundImage = imgRoute;
    }

   

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if(backgroundImage != null && backgroundImage.getImageRoute().exists())
        {        
            ImageIcon imageIcon = new ImageIcon(backgroundImage.getImageRoute().getAbsolutePath());
            //Image modifImage = imageIcon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            //g.drawImage(imageIcon.getImage(), 0, 0, null);
            g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }

    
   
    
    
    

    
    
    
}
