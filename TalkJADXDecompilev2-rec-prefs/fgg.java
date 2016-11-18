package p000;

import android.content.Context;

abstract class fgg<R extends esx, S extends evz> extends czj<R, S> {
    public final int f12998d;
    private final Context f12999e;
    private final fgh f13000f;
    private final int f13001g;

    public fgg(Context context, int i, fgh fgh, int i2) {
        this.f12999e = context;
        this.f12998d = i;
        this.f13000f = fgh;
        this.f13001g = i2;
    }

    protected void mo1887a(fiu fiu) {
        super.mo1887a(fiu);
        if (this.f13000f != null) {
            this.f13000f.mo1889a();
        }
    }

    protected void mo1888a(Exception exception) {
        super.mo1888a(exception);
        if (this.f13000f != null) {
            this.f13000f.mo1890b();
        }
    }

    public String mo1479a() {
        return this.f12999e.getResources().getString(this.f13001g);
    }

    public void mo1475b() {
    }

    public void mo1476c() {
    }
}
