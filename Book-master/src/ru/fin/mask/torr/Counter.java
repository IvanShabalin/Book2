package ru.fin.mask.torr;

import jdk.jshell.spi.ExecutionControl;

public class Counter {
    private int minValue;
    private int maxValue;
    private int value;

    public Counter() {
        int minValue = 0;
        int maxValue = 100;

        value = maxValue;
    }

    public Counter(int _minValue, int _maxValue) {
        if (_minValue > _maxValue) {
            throw new RuntimeException("Invalid parameters for the counter");
        }
        minValue = _minValue;
        maxValue = _maxValue;

        value = minValue;
    }

    public Counter(int _minValue, int _maxValue, int _startValue) {
        if (_minValue > _maxValue) {
            throw new RuntimeException("Invalid parameters for the counter");
        }
        if (_minValue < _startValue || _startValue > _maxValue) {
            throw new RuntimeException("Invalid parameters for the counter");
        }
        minValue = _minValue;
        maxValue = _maxValue;

        value = _startValue;
    }

    public void plusvalue() {
        int increseValue = value + 1;
        if (increseValue < maxValue) {
            value = increseValue;
        }
    }

    public void minusvalue() {
        int increseValue = value - 1;
        if (increseValue > minValue) {
            value = increseValue;
        }
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getValue() {
        return value;
    }
}
