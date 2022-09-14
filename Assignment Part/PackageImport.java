/*
Name: Rupareliya Abhi K.
Id  : 21CE117
Pr  : Write a java program which shows importing of classes from other user define
      packages.
*/

import Mypack.Demo;
public class PackageImport {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.method();
    }
}
