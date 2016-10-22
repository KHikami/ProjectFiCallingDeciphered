package defpackage;

/* renamed from: bkl */
public final class bkl extends frj {
    private final bko a;
    private final String b;

    public bkl(String str, bko bko) {
        this.a = bko;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public String c() {
        String str = "###";
        String valueOf = String.valueOf(this.b);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
