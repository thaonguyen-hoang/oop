package designpatterns.adapter.pegs;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(0);
        this.peg = squarePeg;
    }

    @Override
    public double getRadius() {
        return (int) peg.getWidth() * Math.sqrt(2) / 2;
    }
}
