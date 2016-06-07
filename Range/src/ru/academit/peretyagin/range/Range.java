package ru.academit.peretyagin.range;

public class Range {

    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getLengthInterval() {
        return Math.abs(this.from - this.to);
    }

    public boolean isInside() {
        return getLengthInterval() >= from && getLengthInterval() <= to;
    }
}
