package Factory;

import Iphone.*;

/**
 * Represents a factory that will build Iphone models.
 * Iphone11Standard and Iphone11Pro are created here.
 */
public class IphoneFactory {
    /**
     * Creates a specific model of Iphone.
     * @param iphoneModel   matches either Iphone11 or Standard.
     * @return  Iphone object that represents one of these models.
     */
    public Iphone makePhone(String iphoneModel) {
        if (iphoneModel.equals(null)){
            return null;
        } else if(iphoneModel.equals("Iphone11Pro")){
            return new Iphone11Pro();
        } else if(iphoneModel.equals("Iphone11Standard")){
            return new Iphone11Standard();
        } else {
            return null;
        }
    }
}
