/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package org.nhs.app;

// Your code goes here
/*public class App
{
    public static void main(String[] args) {
        for(int number = 1; number <= 5; number++)
        {
            for(int counter = 1; counter <=4; counter++)
            {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}*/

//first
public class App
{
    public static void main(String args[])
    {
        first();
        second();
        third();
    }

    public static void first()
    {
        for(int num = 1; num < 6; num++)
        {
            for(int counter = 1; counter<=num; counter++)
            {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void second()
    {
        for(int num2 = 1; num2 <= 5; num2++)
        {
            for(int dot = 5-num2; dot > 0; dot--)
            {
                System.out.print(".");
            }

            for(int counter2 = num2; counter2 > 0; counter2--)
            {
                System.out.print(num2);
            }
            System.out.println();
        }
    }

    public static void third()
    {
        for(int line =1; line <=5; line++)
        {
            for(int dot1 = 1; dot1 <= (5-line); dot1++)
            {
                System.out.print(".");
            }
            for(int num3 = 1; num3 == 1; num3++)
            {
                System.out.print(line);
            }
            for(int dot2 = 1; dot2 <= (line-1); dot2++)
            {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}


