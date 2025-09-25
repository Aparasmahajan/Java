public class Z {
    class A{
        public static int count=0;
        static int a=99;

        public int getA(){
            return a;
        }
        public static String getCount(){
            int a=2;
            return String.valueOf(count+a);
        }
        int b = 12;
        public A(){
            count ++;
        }
        int getB(){
            return b;
        }
        void setA(int a){
            a = a;
        }
        void setB(int b){
            b = b;
        }
    }
    public class B extends Z.A{
        public void notSetA(int a){
            this.a = a;
        }
        public int getA(){
            System.out.println("get a called");
            return a;
        }
        static {
            System.out.println("static block");
        }
    }
}
