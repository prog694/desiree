/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stuy.util;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Class for the Logitech Dual Action 2 Gamepad. Does not work with the Logitech
 * Gamepad F310 (the one with the colorful buttons and analog triggers).
 * @author kevin
 */
public class Gamepad extends Joystick {
    public Gamepad(int port) {
        super(port);
    }
    
    public double getLeftX() {
        return getRawAxis(1);
    }
    
    public double getLeftY() {
        return getRawAxis(2);
    }
    
    public double getRightX() {
        return getRawAxis(3);
    }
    
    public double getRightY() {
        return getRawAxis(4);
    }
    
    public double getDPadX() {
        return getRawAxis(5);
    }
    
    public double getDPadY() {
        return getRawAxis(6);
    }
}