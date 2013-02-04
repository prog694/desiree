/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stuy;

/**
 * Port numbers and constants.
 * @author kevin
 */
public class Constants {
    /* USB PORTS */
    public static final int DRIVER_PAD_PORT = 1;
    public static final int OPERATOR_PAD_PORT = 2;
    
    /* PWM OUTPUTS */
    public static final int DRIVETRAIN_LEFT_CHANNEL = 1;
    public static final int DRIVETRAIN_RIGHT_CHANNEL = 2;
    public static final int ACQUIRER_CHANNEL = 5;
    public static final int SHOOTER_CHANNEL = 6;
    public static final int TILTER_CHANNEL = 8;
    public static final int CONVEYOR_CHANNEL = 9;
    public static final int WENCH_CHANNEL = 10;
   
    /* RELAY OUTPUTS */
    public static final int COMPRESSOR_RELAY_CHANNEL = 1;
    public static final int CAMERA_LIGHT = 2;
    public static final int DIRECTION_LIGHT = 3;
    public static final int SIGNAL_LIGHT_A = 4;
    public static final int SIGNAL_LIGHT_B = 5;
    
    /* GPIO */
    public static final int DRIVE_ENCODER_LEFT_A = 1;
    public static final int DRIVE_ENCODER_LEFT_B = 2;
    public static final int DRIVE_ENCODER_RIGHT_A = 3;
    public static final int DRIVE_ENCODER_RIGHT_B = 4;
    public static final int TILT_ENCODER_A = 5;
    public static final int TILT_ENCODER_B = 6;
    public static final int UPPER_CONVEYOR_SENSOR = 9;
    public static final int LOWER_CONVEYOR_SENSOR = 10;
    public static final int PRESSURE_SWITCH_CHANNEL = 11;
    
    public static final int ACCELEROMETER_CHANNEL = 2;
     
    /* ANALOG INPUTS */
    public static final int GYRO_CHANNEL = 1;
    
    /* SHOOTING ANGLES */
    public static final int DUMMY_ANGLE = 69;

    /* The DESarray */
    public static final char DES[] = {'i', 'r', 'e', 'e'};
}
