package defpackage;

enum mfk extends mfi {
    mfk(String str, int i) {
        super(str, 1);
    }

    public boolean a(Object obj) {
        return false;
    }

    public String toString() {
        return "Predicates.alwaysFalse()";
    }
}
