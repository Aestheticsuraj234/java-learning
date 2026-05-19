class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String getMeAPen(int cost){
        if(cost > 10){
            return "Pen";
        }
        else{
            return "Nothing";
        }
    }


}

class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int mul(int a, int b){
        return a * b;
    }
    
    public int div(int a, int b){
        return a / b;
    }

    public int mod(int a, int b){
        return a % b;
    }
    
    public int pow(int a, int b){
        return (int) Math.pow(a, b);
    }

    public int sqrt(int a){
        return (int) Math.sqrt(a);
    }
    
    
}

public class Demo {
    public static void main(String args[]) {
    int nums[] = {3 , 7 , 2 , 4};

    System.out.println(nums[0]);

    int nums3 = new int[4];
    nums3[0] = 3;
    nums3[1] = 7;
    nums3[2] = 2;
    nums3[3] = 4;
    System.out.println(nums3[0]);


    }
}
