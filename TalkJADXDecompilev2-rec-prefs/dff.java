package p000;

import android.graphics.drawable.Drawable;

final class dff implements azk<Drawable> {
    final /* synthetic */ String f9602a;
    final /* synthetic */ dfd f9603b;

    dff(dfd dfd, String str) {
        this.f9603b = dfd;
        this.f9602a = str;
    }

    public /* bridge */ /* synthetic */ boolean mo1309a(Object obj, Object obj2, azx azx, anq anq, boolean z) {
        return m11587a();
    }

    public boolean mo1308a(aqm aqm) {
        dfd.f9593a.m18079c(this.f9602a);
        String valueOf = String.valueOf(aqm);
        glk.m17981d("Babel_Glide", new StringBuilder(String.valueOf(valueOf).length() + 22).append("Image Loading failed: ").append(valueOf).toString(), new Object[0]);
        ((iih) jyn.m25426a(this.f9603b.f9595b, iih.class)).mo1979a(((jca) jyn.m25426a(this.f9603b.f9595b, jca.class)).mo2317a()).mo1693b().mo1714c(2958);
        return false;
    }

    private boolean m11587a() {
        dfd.f9593a.m18079c(this.f9602a);
        glk.m17970a("Babel_Glide", "Resource is ready.", new Object[0]);
        return false;
    }
}
