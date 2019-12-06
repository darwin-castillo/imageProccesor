/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olinimageprocessor.common;

/**
 *
 * @author Jeniffer
 */
public class Const {

    public abstract class TypeNames {

        public static final String TYPE_BANNER = "Banner";
        public static final String TYPE_PRODUCT = "Producto";
        public static final String TYPE__CATEGORIES = "Categories";
    }
    
    public abstract class ImageTypes 
    {
            public abstract class BANNER{
                public static final int width = 1024;
                  public static final int height = 84;
            }
            
             public abstract class PRODUCT{
                public static final int width = 154;
                  public static final int height = 84;
            }
             
              public abstract class CATEGORIES{
                public static final int width = 95;
                  public static final int height = 84;
            }
      
         
         
    }

}
