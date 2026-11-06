/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimage;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author tpm_paucasesnovescif
 */
public class BackgroundImagePropertyEditorSupport extends PropertyEditorSupport
{
    
    BackgroundImagePanel backgroundImagePanel = new BackgroundImagePanel();

    @Override
    public boolean supportsCustomEditor()
    {
        return true;
    }

    @Override
    public Component getCustomEditor()
    {
        return backgroundImagePanel;
    }

    @Override
    public String getJavaInitializationString()
    {
        return super.getJavaInitializationString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValue()
    {
        return backgroundImagePanel.GetSelectedValue();
    }
    
}
