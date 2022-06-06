
package com.example.portafolio

class Calculs()
{
 fun sum(val num1:Int,val num2:Int):Int{
     return  num1+num2;
 }
    fun res(val num1:Int,val num2:Int):Int{
        return  num1-num2;
    }
    fun mult(val num1:Int,val num2:Int):Double{
        return  num1*num2;
    }
    fun div(val num1:Int,val num2:Int):Double{
        if(num2!=0)
            return  num1/num2;
        else
            return -1;
    }
}