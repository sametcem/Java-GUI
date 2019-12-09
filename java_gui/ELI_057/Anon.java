package java_gui.ELI_057;

// ELI-Anon/Anon.java

interface BiIntOperator {
    int apply(int i, int j);
}

class AddAndMult implements BiIntOperator {
    int seed;
    AddAndMult(int seed) { this.seed = seed; }
    AddAndMult()         { this(1);          }
    @Override
    public int apply(int i, int j) { return seed*(i + j); }
}

class MultAndAdd implements BiIntOperator {
    int seed;
    MultAndAdd(int seed) { this.seed = seed; }
    MultAndAdd()         { this(1);          }
    @Override
    public int apply(int i, int j) { return seed + i*j; }
}

public class Anon {
    public static void main(String[] args) {
        BiIntOperator[] opers = {
                // objects of concrete classes
                // implementing an interface
                new AddAndMult(2),
                new MultAndAdd(5),
                // object of anonymous class
                // implementing an interface
                new BiIntOperator() {
                    @Override
                    public int apply(int i, int j) {
                        return i*i + j*j;
                    }
                },
                // object of anonymous class
                // extending a 'normal' class
                new MultAndAdd(3) {
                    @Override
                    public int apply(int i, int j) {
                        return seed*(i*i + j*j);
                    }
                }
        };
        int a = 1, b = 2;
        for (BiIntOperator op : opers)
            System.out.print(op.apply(a,b) + " ");
        System.out.println();
    }
}

