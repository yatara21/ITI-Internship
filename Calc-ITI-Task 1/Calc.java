public class Calc{
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[2]);
    int result;
    char operator = args[1].charAt(0);
    
    switch (operator){
      case '-':
        result= num1 - num2;  
        break;
        
      case '+':
        result = num1 + num2;  
        break;
      
      case 'x':
        result = num1 * num2;  
        break;
  
      case '/':
        if (num2 == 0) {
          System.out.println("Error: division by zero");
          return;
        }
        result = num1 / num2;  
        break;
        
      default:
        System.out.println("Invalid operator");
        return;
    }
    
    System.out.println("The result is: " + result);
  }
}