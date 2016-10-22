package defpackage;

/* renamed from: mjb */
final class mjb extends mjw<Object, Object> {
    static final mjb a;
    private static final long serialVersionUID = 0;

    static {
        a = new mjb();
    }

    private Object readResolve() {
        return a;
    }

    private mjb() {
        super(mmv.b, 0);
    }
}
