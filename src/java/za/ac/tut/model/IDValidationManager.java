package za.ac.tut.model;


public class IDValidationManager implements IDValidationInterface{
   
    private String idNumber;
    public IDValidationManager(String idNumber) {
        this.idNumber = idNumber;
        
    }

    @Override
    public String determineDateOfBirth() {
        
        String dateOfBirth = "";
        String date = idNumber.substring(0, 6);
        String month = "";
        
        switch(date.substring(2, 4)){
            case "01":
                month = "January";
                break;
            case "02":
                month = "Februry";
                break;
            case "03":
                month = "March";
                break;
            case "04":
                month = "April";
                break;
            case "05":
                month = "May";
                break;
            case "06":
                month = "June";
                break;
            case "07":
                month = "July";
                break;
            case "08":
                month = "August";
                break;
            case "09":
                month = "September";
                break;
            case "10":
                month = "October";
                break;
            case "11":
                month = "November";
                break;
            case "12":
                month = "December";
                break;
        }
        int yy = Integer.parseInt(date.substring(0, 2));
        int year = 2000;
        
        if(yy > 24 && yy <= 99){
            year = 1900 + yy;
        }else{
            year += yy;
        }
    
        dateOfBirth = date.substring(2, 4) + " " + month + " " + year;
                
        return dateOfBirth;
        
    }

    @Override
    public String determineGender() {
       
        String gender = "";
        int genderNum = Integer.parseInt(idNumber.substring(6, 10));
        if(genderNum >= 0 && genderNum <= 4999){
            gender = "Female";
        }else{
            gender = "Male";
        }
    
        return gender;
    
    }

    @Override
    public String determineCitizenshipStatus() {
        
        String citizenship = "";
        int c = 0;
        if( c == 0){
            citizenship = "SA Citizen";
        }else{
            citizenship = "Permanent Resident";
        }
    
        return citizenship;
    }

    @Override
    public String verificationOutcome() {
        
        int sum = 0;
        int doubledNum = 0;
        //int [] idNum = new int[14];
        
        for(int i = 1; i <= idNumber.length(); i++){
            
            int idNum = Integer.parseInt(idNumber.substring(i-1, i));
            
            if(i%2 == 0 && i != 1){
                
                doubledNum = idNum + idNum;
                
                if(doubledNum > 9){
                    doubledNum = doubledNum%9;
                }
                
                idNum = doubledNum;
            }
            
            sum += idNum;
            System.out.println(sum);
        }
        
        //
        String validateIDOutcome = "";
        if(sum%10 == 0){
            validateIDOutcome = "valid!";
            
        }else{
            validateIDOutcome = "not valid!";
        }
    
        return validateIDOutcome;
    }

    @Override
    public String validateId() {
        
        String page = "verificationOutcome.jsp";
        
        if(idNumber.length() != 13){
            page = "details.jsp";
        }
        
        return page;
    }
    
}
