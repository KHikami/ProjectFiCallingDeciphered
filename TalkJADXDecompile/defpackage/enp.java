package defpackage;

/* renamed from: enp */
final class enp {
    final boolean a;
    final enu b;

    private enp(enu enu) {
        this(enu, false);
    }

    private enp(enu enu, boolean z) {
        this.b = enu;
        this.a = z;
    }

    public static enp a(String str) {
        if (str.length() != 0) {
            return new enp(new enu(str));
        }
        throw new IllegalArgumentException("separator may not be empty or null");
    }

    public enp a() {
        return new enp(this.b, true);
    }

    public Iterable<String> a(CharSequence charSequence) {
        return new enr(this, charSequence);
    }
}
