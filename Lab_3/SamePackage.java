class SamePackage{
    public void execute(){
        System.out.println("This is main class using public access modifier");
    }
    /*private void execute(){
        System.out.println("This is main class using private access modifier");
    }
    protected void execute(){
        System.out.println("This is main class using protected access modifier");
    }
    void execute(){
        System.out.println("This is main class using default access modifier");
    }*/
}

class ChildClass extends SamePackage{
        /*protected void execute(){
            System.out.println("This is child class using protected access modifier.");
        }*/

        private void execute(){
            System.out.println("This is child class using private access modifier.");
        }

        /*public void execute(){
            System.out.println("This is child class using public access modifier");
        }*/

        /*void execute(){
            System.out.println("This is child class using default access modifier");
        }*/

        //No access modifier--->Default
        
        public static void main(String args[]){
            SamePackage obj = new ChildClass();
            obj.execute();
        }
}