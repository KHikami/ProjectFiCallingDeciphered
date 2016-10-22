public final class kgi {
    private final String a;
    private kgj b;
    private kgj c;
    private boolean d;

    public kgi(String str) {
        this.b = new kgj();
        this.c = this.b;
        this.a = str;
    }

    public String toString() {
        boolean z = this.d;
        StringBuilder append = new StringBuilder(32).append(this.a).append('{');
        String str = "";
        kgj kgj = this.b.c;
        while (kgj != null) {
            if (!z || kgj.b != null) {
                append.append(str);
                str = ", ";
                if (kgj.a != null) {
                    append.append(kgj.a).append('=');
                }
                append.append(kgj.b);
            }
            kgj = kgj.c;
        }
        return append.append('}').toString();
    }

    public kgi a(String str, Object obj) {
        kgj kgj = new kgj();
        this.c.c = kgj;
        this.c = kgj;
        kgj.b = obj;
        kgj.a = (String) bc.a((Object) str);
        return this;
    }
}
