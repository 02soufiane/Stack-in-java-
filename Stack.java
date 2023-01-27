public class Stack{
    String[] array;
    int size;
    int top;

    public Stack(int size){
        this.size=size;
        array= new String[size];
        top=-1;
    }

    public void push(String  element){
        if(top >= size ){
            System.out.println("isFull!");
        }else{
            top+=1;
            array[top]=element;
        }
    }

    public int getTop() {
        return top;
    }

    public void pop(){
        if(top==-1){
            System.out.println("isEmpty!");
        }else{
            String item = array[top];
            top-=1;
            System.out.println(item);
        }
    }

    public static void main(String[] args){
        Stack test = new Stack(3);
        test.push("h1");
        test.push("h2");
        test.push("h3");
        test.pop();
        System.out.println(test.getTop());


    }
