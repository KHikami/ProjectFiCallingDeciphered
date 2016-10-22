package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: dff */
final class dff implements azk<Drawable> {
    final /* synthetic */ String a;
    final /* synthetic */ dfd b;

    dff(dfd dfd, String str) {
        this.b = dfd;
        this.a = str;
    }

    public /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2, azx azx, anq anq, boolean z) {
        return a();
    }

    public boolean a(aqm aqm) {
        dfd.a.c(this.a);
        String valueOf = String.valueOf(aqm);
        glk.d("Babel_Glide", new StringBuilder(String.valueOf(valueOf).length() + 22).append("Image Loading failed: ").append(valueOf).toString(), new Object[0]);
        ((iih) jyn.a(this.b.b, iih.class)).a(((jca) jyn.a(this.b.b, jca.class)).a()).b().c(2958);
        return false;
    }

    private boolean a() {
        dfd.a.c(this.a);
        glk.a("Babel_Glide", "Resource is ready.", new Object[0]);
        return false;
    }
}
