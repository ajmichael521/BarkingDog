

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        //returns True(the dog is barking and also the time is less than 8 as the condition states)
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
         if(hourOfDay < 0 || hourOfDay > 23){
             return false;
         }
          if(barking == true && hourOfDay < 8 || hourOfDay > 22){
              return true;

          } else {
              return false;
          }

    }
}
