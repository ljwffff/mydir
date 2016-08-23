/*构造，重写，继承，多态,final,abstract*/
class Test{
    public static void main(String[] args){
        
    }
}

class Animal(){
    private int height;
    private int weight;
    private String name;
    
    void setName(String i){
        this.name = i;
    }
    
    void getName(){
        System.out.println("name = : %s",this.name);
    }
    
    void setHeight(int j){
        this.height = j;
    }
    
    void setWeight(int x){
        this.weight = x;
    }
    
    Animal(String i,int j,int k){
        height = i;
        weight = j;
        name = k;
    }
    
    void run(){
        System.out.println("Animal is running ....");
    }
}

class Dog extends Animal(){
    private String furcolor;
    Dog(String i, int j, int k, String m){
        height = i;
        weight = j;
        name = k;
        furcolor = m;
    }
    
    void run(){
        System.out.println("Dog is running ....");

    }
}