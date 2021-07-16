package mapa;

public class Data {

  private Integer day;
  private Integer month;
  private Integer year;

  public Data(Integer day, Integer month, Integer year) {

    if ( validarData(day,month,year) ) {
      this.day = day;
      this.month = month;
      this.year = year;
    }

  }

  public boolean validarData(Integer day, Integer month, Integer year) {

    if( (month<1 && month >12) || (day<1 && day>31) ||  (year <= 0) ) {
      System.out.println("Valores para dia, mês ou ano são inválidos.");
    } else {
      boolean flag = false;
      if(month == 4 || month==6 || month == 9 || month==11){
        if(day<=30) {
          flag = true;
        } else flag = false;  
      }

      if(month == 1 || month==3 || month == 5 || month==7 || month==8 || month==10 || month==12){
        if(day<=31){
          flag = true;
        }else{
         flag = false;
        }
      }

      if(month ==2){
        if(year %4 ==0){
          if(day<=29){
            flag = true;
          }else{
            flag = false;
          }
        } else {
          if(day<=28){
            flag = true;
          }else{
            flag = false;
          }
        }
      }

      if(flag){
        return true;
      }else{
        return false;
      }
    }
  }
  
}


// Sexta de Manhã

package mapa;




public final class Data {
    
    public static void main(String[] args) {
//       System.out.println("Valores para dia, mês ou ano são inválidos.");
       Data verifica = new Data(21,12,1600);

    }
    

  public Integer day;
  public Integer month;
  public Integer year;

  public Data(Integer day, Integer month, Integer year) {
    System.out.println("Valores" + month);
    if ( validarData(day,month,year) ) {
     
      System.out.println("Valores opaa" + month);
    }
    
    System.out.println("Valores ok");

  }

    /**
     *
     * @param day
     * @param month
     * @param year
     * @return
     */
    public  boolean validarData(Integer day, Integer month, Integer year) {
    
    System.out.println(" inválidos." + month + " " + day + " " + year);
              
    if( (month < 1 || month > 12) || (day < 1 || day > 31) ||  (year <= 1500 ) ) {
      
        System.out.println("Valores para dia, mês ou ano são inválidos.");
        return false;
      
    } else {
      boolean flag = false;
      if(month == 4 || month==6 || month == 9 || month==11){
          flag = day<=30;  
      }

      if(month == 1 || month==3 || month == 5 || month==7 || month==8 || month==10 || month==12){
          flag = day<=31;
      }
      
                    System.out.println(" inválidos." + month + " " + day + " " + year);

      if(month ==2){
        if(year %4 ==0){
            flag = day<=29;
        } else {
            flag = day<=28;
        }
      }
                    System.out.println(" inválidos." + month + " " + day + " " + year);

                  return flag;
    }
  }
  
}