public class HomeWork1 {
    public static void main(String[] args) {
        Virogenie (40f,23f,2f,10f);
        Proveriay2(20,5);
        Proverka(2,5,4);
        Slovo("Dmitri");
    }
    public static float Virogenie(float a,float b,float c,float d){
           float result= a * (b + (c / d));
        System.out.println(result);
           return result;
    }
    public static boolean Proveriay2(int a,int b){
        boolean  result2 = a-b==20;
        System.out.println(result2);
         return result2;
    }
    public static void Proverka(int a, int b, int c){
        if ((a-b)*c>=0){
            System.out.println("Pologitelno");
        }else{
            System.out.println("Otricatelno");
        }
    }
    public static void Slovo(String name){
        System.out.println("hello"+ name);
    }

}
