package com.stopcoronagame.controller;

import java.awt.event.KeyEvent;

public class HumanController implements Controller {

    private Input input;

    public HumanController(Input input) {
        this.input = input;
    }

    @Override
    public boolean isRequestingUp() {
        return input.isPressed(KeyEvent.VK_W) || input.isPressed(KeyEvent.VK_UP);
    }

    @Override
    public boolean isRequestingDown() {
        return input.isPressed(KeyEvent.VK_S) || input.isPressed(KeyEvent.VK_DOWN);
    }

    @Override
    public boolean isRequestingRight() {
        return input.isPressed(KeyEvent.VK_D) || input.isPressed(KeyEvent.VK_RIGHT);
    }

    @Override
    public boolean isRequestingLeft() {
        return input.isPressed(KeyEvent.VK_A) || input.isPressed(KeyEvent.VK_LEFT);
    }

    @Override
    public boolean isDoingAction() {
        return false;
    }
}
