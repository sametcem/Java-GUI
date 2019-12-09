package java_gui.ELH_054;

// ELH-OutInn/OutInn.java

class Outer {
    private String sOut;

    Outer(String s) {
        sOut = s;
    }

    class Inner {
        private String sInn;

        Inner(String s) {
            sInn = s;
        }

        @Override
        public String toString() {
            return "Inner-" + sInn + " parent " +
                    "Outer-" + Outer.this.sOut; // <- syntax!
            // note that
            // sOut is
            // private!
        }
    }

    public Inner getInner(String i) {
        Inner inn = new Inner(i);
        System.out.println("Creating inner " + inn.sInn);
        return inn;
    }

    @Override
    public String toString() {
        return "Outer-" + sOut;
    }
}

public class OutInn {
    public static void main(String[] args) {
        Outer out1 = new Outer("out1");
        Outer.Inner inn1 = out1.getInner("inn1");
        Outer.Inner inn2 = out1.new Inner("inn2");
        System.out.println(out1);
        System.out.println(inn1);
        System.out.println(inn2);
        System.out.println(out1.getClass().getName());
        System.out.println(inn1.getClass().getName());
        System.out.println(inn2.getClass().getName());
    }
}
