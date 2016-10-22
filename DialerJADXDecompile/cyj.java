/* compiled from: PG */
final class cyj extends cyi {
    private /* synthetic */ String b;
    private /* synthetic */ cyi c;

    cyj(cyi cyi, cyi cyi2, String str) {
        this.c = cyi;
        this.b = str;
        super(cyi2);
    }

    final CharSequence a(Object obj) {
        return obj == null ? this.b : this.c.a(obj);
    }

    public final cyi a(String str) {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
