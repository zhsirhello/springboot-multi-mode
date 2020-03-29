package com.zjj.zjjweb.optisizeIfElse;

/**
 * 诸如if A
 *     else if B
 *     else if C
 */
public class Test {
    public static void main(String[] args){
        RoleEnum.valueOf("A").execute("gogogo");
        RoleEnum.valueOf("B").execute("BBBBB");
    }
}
