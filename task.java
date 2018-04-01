import java.util.Scanner;
class task{

    public static int fib(int a){
        {
            if (a < 0) throw new IllegalArgumentException ("less 0");   
            else if (a == 1) return 1;
            else if (a == 2) return 1;        
            else return fib(a - 1) + fib(a - 2);   
         }
    }

    public static int nod(int a, int b){
        if (a == 0) return b;
        else if (b == 0) return a; 
        else return (a >= b) ? nod(a-b,b): nod(a, b - a);
    }

    public static int nok(int a, int b){
        return (a * b) / nod(a,b);
    }

    public static void task1(){
        int cont2; int count = 1;
     Scanner cont1 = new Scanner(System.in);
     System.out.println("vvedite chislo");
     if(cont1.hasNextInt()){
         cont2 = cont1.nextInt(); 
         for (int i = 1; i < cont2; i++){
             for(int j = 1; j < i; j++){
                 if(i % j == 0){
                     count++;
                 }
             }
             if(count == 2)
                System.out.println(i);
             count = 1;
         }
     }   
    }

    public static void task2(){
        int cont2;
        Scanner cont1 = new Scanner(System.in);
        System.out.println("vvedite chislo");
        if(cont1.hasNextInt()){
            cont2 = cont1.nextInt();
            for(int i = 1; i <= cont2; i++){
                System.out.println(fib(i));
            } 
    }
    else throw new IllegalArgumentException ("is not number");
    }

   public static void task3()
    {
        Scanner cont = new Scanner(System.in);
        int a = 0,b = 0,c = 0,d = 0;
        String result;
        
        System.out.println("vvedite koordinati pervogo otrezka");
            for(int i = 0; i <= 1;i++){
                if(cont.hasNextInt()){
                    switch (i){
                        case 0:{ a = cont.nextInt();} break;
                        case 1:{ b = cont.nextInt();} break;
                    }
                }
            }
        System.out.println("vvedite koordinati vtorogo otrezka");
            for(int i = 0; i<= 1; i++){
                if(cont.hasNextInt()){
                    switch (i){
                        case 0:{ c = cont.nextInt();} break;
                        case 1:{ d = cont.nextInt();} break;
                    }
                    }
                }
        if(c < b) {
            result = "peresech : " + c + " " + b;
            System.out.println(result);
            }
       /* else if(a > c) {
            result = "peresech : " + a + " " + c;
            System.out.println(result);
            }*/
        else throw new IllegalArgumentException ("not peresech");
    }

    public static void task4(){
        int x,y;
        String str = "";
        Scanner cont = new Scanner(System.in);
        System.out.println("vvedite dva chisla");
        if(cont.hasNextInt()){
            x = cont.nextInt();
        }
        else throw new IllegalArgumentException ("wrong first number");
        if(cont.hasNextInt()){
            y = cont.nextInt();
        }
        else throw new IllegalArgumentException ("wrong second number");
        str = "NOD: " + nod(x,y);
        System.out.println(str);
        str = "NOK: " + nok(x,y);
        System.out.println(str);
    }

    public static void task5(){
        int left,right,flag;
        Scanner word = new Scanner(System.in);
        String s1;
        System.out.println("vvedite slovo");
        s1 = word.nextLine();
        left = 0; right = (s1.length() - 1); flag = 1;
        while(left <= right) {
            if (s1.charAt(left) == s1.charAt(right)){
                left++; right--;
            }
            else{ 
                flag = 0;
                break;
                }
        }
        if( flag == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void task6(){
        Scanner cont = new Scanner(System.in);
        String s1 = ""; 
        String res_str = "";
        char prom;
        System.out.println("vvedite stroku");
        s1 = cont.nextLine();
        for(int i = 0; i < s1.length();i++){
            prom = s1.charAt(i);
            
            if (!(Character.isDigit(prom))){
                res_str += prom;
            }
        }
        System.out.println(res_str);
    }


    public static void main(String args[])
    {
        int i =Integer.parseInt(args[0]);
        switch(i){
            case 1:
            {
                task1();
            }
            break;
            case 2:
            { 
                task2();
            } 
            break;
            case 3:
            {
                task3();
            }
            break;
            case 4:
            {
                task4();
            }
            break;
            case 5:
            {
                task5();
            }
            break;
            case 6:
            {
               task6();
            }
        }
    }
}