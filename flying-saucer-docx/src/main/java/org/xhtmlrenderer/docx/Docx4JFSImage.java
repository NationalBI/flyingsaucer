/*
 * {{{ header & license
 * Copyright (c) 2007 Wisconsin Court System
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.xhtmlrenderer.docx;


//import org.xhtmlrenderer.extend.FSImage;
//import com.lowagie.text.Image;

public class Docx4JFSImage { 
//    implements FSImage, Cloneable {
    
    byte[] image;
    public byte[] getBytes() {
        return image;
    }
    
    public Docx4JFSImage(byte[] bytes) {
        image = bytes;
    }

//    public int getWidth() {
//        throw new NotImplementedException();
//    }
//
//    public int getHeight() {
//        throw new NotImplementedException();
//    }
//
//    public void scale(int width, int height) {
//        throw new NotImplementedException();
//    }
//
//    public Image getImage() {
//        throw new NotImplementedException();
//    }
//
//    public Object clone() {
//        throw new NotImplementedException();
//    }
    
    

}