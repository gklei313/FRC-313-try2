/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //Drive Train controllers
    public static int krightMotor1=4;
    public static int krightMotor2=5;
    public static int krightMotor3=6;
    public static int kleftMotor1=1;
    public static int kleftMotor2=2;
    public static int kleftMotor3=3;
    
    //Driver/operator controllers 
    public static int DriverControllerPort = 0;
    public static int OperatorControllerPort = 1;
    public static int leftDriverstick = 1;
    public static int rightDriverstick = 5;

    //Succiboi subsystem
    public static int succiTalonSRX = 10; //change later 
    public static int piston1Forward = 0;
    public static int piston1Aft = 1;
    public static int reverse = 1;
    public static int forward = 0;

    //storagewarsubsytem
    public static int storageSRX1=10;// change later when know what it is
    public static int storageSRX2=10;// change later when know what it is
}




