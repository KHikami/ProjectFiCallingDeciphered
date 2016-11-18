package p000;

final class enp {
    final boolean f11887a;
    final enu f11888b;

    private enp(enu enu) {
        this(enu, false);
    }

    private enp(enu enu, boolean z) {
        this.f11888b = enu;
        this.f11887a = z;
    }

    public static enp m14149a(String str) {
        if (str.length() != 0) {
            return new enp(new enu(str));
        }
        throw new IllegalArgumentException("separator may not be empty or null");
    }

    public enp m14150a() {
        return new enp(this.f11888b, true);
    }

    public Iterable<String> m14151a(CharSequence charSequence) {
        return new enr(this, charSequence);
    }
}
