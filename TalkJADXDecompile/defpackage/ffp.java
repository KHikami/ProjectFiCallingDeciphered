package defpackage;

/* renamed from: ffp */
public final class ffp extends fhb {
    private final String a;

    public ffp(bko bko, String str) {
        super(bko);
        iil.b("Expected condition to be false", blo.a(str));
        this.a = str;
    }

    public void w_() {
        a(new eue(this.a));
    }
}
