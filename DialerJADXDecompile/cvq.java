import android.app.Application;

/* compiled from: PG */
public final class cvq implements ctv {
    private final Application a;
    private final cxc b;
    private final i c;
    private final cvr d;

    public cvq(Application application, cxc cxc, i iVar, cvr cvr) {
        this.a = (Application) buf.B((Object) application);
        this.b = cxc;
        this.c = null;
        this.d = (cvr) buf.B((Object) cvr);
    }

    public final cvn a() {
        if (this.b != null) {
            return new cvo(this.a, this.b, this.d, cwj.a);
        }
        if (this.c != null) {
            return cvo.a(this.a, this.c, this.d);
        }
        throw new IllegalStateException("Transmitter or transmitter provider is not defined.");
    }
}
