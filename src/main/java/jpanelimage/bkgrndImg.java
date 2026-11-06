package jpanelimage;


import java.io.File;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tpm_paucasesnovescif
 */
public class bkgrndImg implements Serializable
{
    private File imageRoute;
    private float opacity;

    public File getImageRoute()
    {
        return imageRoute;
    }

    public void setImageRoute(File imageRoute)
    {
        this.imageRoute = imageRoute;
    }

    public float getOpacity()
    {
        return opacity;
    }

    public void setOpacity(float opacity)
    {
        this.opacity = opacity;
    }

    public bkgrndImg(File imageRoute, float opacity)
    {
        this.imageRoute = imageRoute;
        this.opacity = opacity;
    }
    
    
    
}
