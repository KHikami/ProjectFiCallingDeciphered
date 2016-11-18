package defpackage;

import android.content.Context;

abstract class fgg<R extends esx, S extends evz> extends czj<R, S> {
    public final int d;
    private final Context e;
    private final fgh f;
    private final int g;

    public fgg(Context context, int i, fgh fgh, int i2) {
        this.e = context;
        this.d = i;
        this.f = fgh;
        this.g = i2;
    }

    protected void a(fiu fiu) {
        super.a(fiu);
        if (this.f != null) {
            this.f.a();
        }
    }

    protected void a(Exception exception) {
        super.a(exception);
        if (this.f != null) {
            this.f.b();
        }
    }

    public String a() {
        return this.e.getResources().getString(this.g);
    }

    public void b() {
    }

    public void c() {
    }
}
