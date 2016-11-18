package defpackage;

enum mfl extends mfi {
    mfl(String str, int i) {
        super(str, 2);
    }

    public boolean a(Object obj) {
        return obj == null;
    }

    public String toString() {
        return "Predicates.isNull()";
    }
}
