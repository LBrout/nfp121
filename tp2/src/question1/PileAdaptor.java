package question1;

public class PileAdaptor implements PileI{

    public StackI stack;

    PileAdaptor(StackI stack) {
        this.stack = stack;
    }

    @Override
    public void empiler(Object o) {
        this.stack.push(o);
    }

    @Override
    public Object depiler() {
        this.stack.pop();
        return this.stack;
    }

    @Override
    public boolean estVide() {
        return this.stack.isEmpty();
    }
}
