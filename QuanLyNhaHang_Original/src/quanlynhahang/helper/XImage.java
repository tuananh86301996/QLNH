/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.helper;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author SONY
 */
public class XImage {
    public static void saveImg(File file){
        try{
            Path from = Paths.get(file.getAbsolutePath());
            Path to = Paths.get("src/quanlynhahang/image/"+file.getName().toString());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public static ImageIcon readImg(String name, JLabel lbl){
        ImageIcon icon = new ImageIcon("src/quanlynhahang/image/"+name);
        Image img = icon.getImage();
        return new ImageIcon(img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), img.SCALE_SMOOTH)); 
    }
}
