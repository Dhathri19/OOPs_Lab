//Program to execute continue in JAVA.
class Continue{
    public static void main(String args[]){
        for(int i = 0; i <= 20; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
//Continue statement will just skip rest of the loop.