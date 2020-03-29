package com.zjj.zjjweb.optisizeIfElse;

public enum RoleEnum implements RoleMethod {
    A{
        @Override
        public void execute(String s) {
            System.out.println("this is a"+"   "+s);
        }
    },
    B{
        @Override
        public void execute(String s) {
            System.out.println("this is B"+"   "+s);
        }
    },
    C{
        @Override
        public void execute(String s) {
            System.out.println("this is c"+"   "+s);
        }
    };
}
