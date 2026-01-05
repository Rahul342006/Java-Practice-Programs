// java package for calculator,Scitific calculator,Hybrid calculator

package Calculator;
class Calc{
    Double num , num1 , num2;
    Calc(Double number){
        this.num=number;
    }
    Calc(Double num1 , Double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public Double addition(){
        return num1+num2;
    }
    public Double subraction(){
        return num1-num2;
    }
    public Double multiplication(){
        return num1*num2;
    }
    public Double division(){
        if(num2==0){
            return null;
        }
        else{
            return num1/num2;
        }
    }
}
interface SciCalc{
    public Double power();
    public Double squareroot();
    public Double log();
    public Double factorial(Double num);
    public Double trignomentary(int ch);
}
class HybridCalc extends Calc implements SciCalc{
    HybridCalc(Double num){
        super(num);
    }
    HybridCalc(Double num1 , Double num2){
        super(num1 , num2);
    }
    public Double power(){
        return Math.pow(num,num);
    }
    public Double squareroot(){
        return Math.sqrt(num);
    }
    public Double log(){
        return Math.log(num);
    }
    public Double factorial(Double num){
        if(num==0){
            return 1.0;
        }
        else{
            return num * factorial(num-1.0);
        }
    }
    public Double trignomentary(int ch){
        switch(ch){
            case 1:
                return Math.sin(Math.toRadians(num));
            case 2:
                return Math.cos(Math.toRadians(num));
            case 3:
                return Math.tan(Math.toRadians(num));
            default:
                return 0.0;
        }
    }
    
}
