package com.bhanu.factoryMethodPattern;

public class BillCreator {
	public Bill getBillObj(String billType){  
        if(billType == null){  
         return null;  
        }  
      if(billType.equalsIgnoreCase("DOMESTIC")) {  
             return new DomesticBill();  
           }   
       else if(billType.equalsIgnoreCase("COMMERCIAL")){  
            return new CommercialBill();  
        }   
  return null;  
}  

}
