package com.abidingtech.waheed.Lecture_11_Abstract_cont;

interface Tax{
    int sTax();
}
class Punjab implements Tax{

    @Override
    public int sTax() {
        return 5000;
    }
}
class HP implements Tax{

    @Override
    public int sTax() {
        return 3000;
    }
}
public class CalculateTax {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        int val=100;
//        String name="Punjab";
//        Class c=Class.forName(name);
//
//        Tax tax= (Tax) c.newInstance();
//        tax.sTax();

        Punjab punjab=new Punjab();
        punjab.sTax();
    }
}
