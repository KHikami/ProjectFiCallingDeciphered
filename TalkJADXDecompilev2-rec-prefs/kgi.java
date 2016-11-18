package p000;

public final class kgi {
    private final String f21646a;
    private kgj f21647b = new kgj();
    private kgj f21648c = this.f21647b;
    private boolean f21649d;

    public kgi(String str) {
        this.f21646a = str;
    }

    public String toString() {
        boolean z = this.f21649d;
        StringBuilder append = new StringBuilder(32).append(this.f21646a).append('{');
        String str = "";
        kgj kgj = this.f21647b.f21652c;
        while (kgj != null) {
            if (!z || kgj.f21651b != null) {
                append.append(str);
                str = ", ";
                if (kgj.f21650a != null) {
                    append.append(kgj.f21650a).append('=');
                }
                append.append(kgj.f21651b);
            }
            kgj = kgj.f21652c;
        }
        return append.append('}').toString();
    }

    public kgi m25769a(String str, Object obj) {
        kgj kgj = new kgj();
        this.f21648c.f21652c = kgj;
        this.f21648c = kgj;
        kgj.f21651b = obj;
        kgj.f21650a = (String) bc.m4799a((Object) str);
        return this;
    }
}
