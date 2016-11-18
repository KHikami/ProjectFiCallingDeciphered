package defpackage;

final class mjb extends mjw<Object, Object> {
    static final mjb a = new mjb();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    private mjb() {
        super(mmv.b, 0);
    }
}
