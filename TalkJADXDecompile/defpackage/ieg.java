package defpackage;

import android.content.Context;

/* renamed from: ieg */
public class ieg implements idy {
    guj a;
    iet b;

    public ieg(Context context) {
        this.a = new guj(context);
        this.b = new iet();
    }

    public idy a(idw<? extends Object> idw__extends_java_lang_Object) {
        this.a.a(this.b.a((idw) idw__extends_java_lang_Object));
        return this;
    }

    public idy a(iea iea) {
        this.a.a(this.b.a(iea));
        return this;
    }

    public idy a(ieb ieb) {
        this.a.a(this.b.a(ieb));
        return this;
    }

    public ieg(Context context, byte b) {
        this(context);
    }

    public idx a() {
        return new ieu(this.a.b(), this.b, (byte) 0);
    }
}
