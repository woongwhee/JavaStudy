package test;

public abstract class testable {
     protected final String functionName;
     public testable(){
         this.functionName=initalizeFunctionName();
     }

    public abstract void execute();

    protected abstract String initalizeFunctionName();
}
