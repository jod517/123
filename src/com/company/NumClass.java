package com.company;

public class NumClass  {
    private long num ;

    public NumClass() {
    }

    public static class Builder {
        private NumClass numClass;

        public Builder(){
            numClass = new NumClass();
        }
        public Builder setNum(long num){
            numClass.num = num;
            return this;
        }
        public NumClass build(){
            NumClass result = numClass;
            numClass = new NumClass();
            return result;
        }
    }
}
