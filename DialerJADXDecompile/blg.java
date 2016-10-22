/* compiled from: PG */
final class blg {
    final boolean a;
    final bll b;

    private blg(bll bll) {
        this(bll, false);
    }

    private blg(bll bll, boolean z) {
        this.b = bll;
        this.a = z;
    }

    public static blg a(String str) {
        if (str.length() != 0) {
            return new blg(new bll(str));
        }
        throw new IllegalArgumentException("separator may not be empty or null");
    }

    public final blg a() {
        return new blg(this.b, true);
    }

    public final Iterable a(CharSequence charSequence) {
        return new bli(this, charSequence);
    }
}
