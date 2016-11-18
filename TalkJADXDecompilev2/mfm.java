package defpackage;

enum mfm extends mfi {
    mfm(String str, int i) {
        super(str, 3);
    }

    public boolean a(Object obj) {
        return obj != null;
    }

    public String toString() {
        return "Predicates.notNull()";
    }
}
