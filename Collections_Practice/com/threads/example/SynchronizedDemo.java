package com.threads.example;

class TablePrint{

public  void printTable(int a){

synchronized(this){

for(int i=1;i<=10;i++){System.out.println(i*a);}

}

try{Thread.sleep(5000);
System.out.println(a+" Table printed ");
}catch(Exception e){}
// }       
}
}


class Tables implements Runnable{
TablePrint print;
int n;
	Tables(TablePrint print,int n){
        this.print=print;
	this.n=n;
        new Thread(this).start();
}

public void run(){
        print.printTable(n);
        }
}



public class SynchronizedDemo{
public static void main(String args[]){
TablePrint print=new TablePrint();

new Tables(print,2);
try{Thread.sleep(100);}catch(Exception e){}
new Tables(print,3);
try{Thread.sleep(100);}catch(Exception e){}
new Tables(print,4);
	}
}
