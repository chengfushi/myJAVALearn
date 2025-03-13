package com.abstract_;

public class Rectangle extends Shape{
    private double _long;
    private double _wide;

    public Rectangle(double _long, double _wide) {
        this._long = _long;
        this._wide = _wide;
    }

    public double get_long() {
        return _long;
    }

    public void set_long(double _long) {
        this._long = _long;
    }

    public double get_wide() {
        return _wide;
    }

    public void set_wide(double _wide) {
        this._wide = _wide;
    }

    @Override
    public double getPerimeter() {
        return 2 * (_long + _wide);
    }

    @Override
    public double getArea() {
        return _long * _wide;
    }
}
