public class If_else2{
    public static void main(String[] args) {
        double valu1=100.5d;
        double valu2=40.5d;
        double result=0.0d;
        char opCode='d';

        if(opCode == 'a')
            result = valu1+valu2;
        else if (opCode == 's')
            result = valu1-valu2;
        else if (opCode== 'm')
            result= valu1*valu2;
            else if (opCode== 'd')
            result= valu1/valu2;
        else
            result=0.0d;
        System.out.println(result);

    }
}