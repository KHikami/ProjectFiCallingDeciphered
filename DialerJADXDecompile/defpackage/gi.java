package defpackage;

/* compiled from: PG */
/* renamed from: gi */
public final class gi {
    public int a;
    public fr b;
    public fr c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public final void a(fr frVar) {
        if (this.b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.b != frVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.b = null;
        }
    }

    public final void b(fr frVar) {
        if (this.c == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.c != frVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.c = null;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        buf.a((Object) this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
