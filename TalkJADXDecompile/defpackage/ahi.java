package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: ahi */
public final class ahi extends hv<ahk> implements ahj {
    private String f;
    private Bitmap g;

    public /* synthetic */ void a(Object obj) {
        b((ahk) obj);
    }

    public /* synthetic */ void b(Object obj) {
        a((ahk) obj);
    }

    public /* synthetic */ Object d() {
        return h();
    }

    public ahi(Context context, String str) {
        super(context);
        this.f = str;
    }

    public void a(String str) {
        this.f = str;
    }

    private ahk h() {
        ahk ahk = new ahk();
        Context o = o();
        if (!(o == null || this.f == null)) {
            try {
                ahk = ahn.a(o.getContentResolver(), Uri.parse(this.f), agp.b);
                if (ahk.b != null) {
                    ahk.b.setDensity(160);
                }
            } catch (UnsupportedOperationException e) {
                ahk.c = 1;
            }
        }
        return ahk;
    }

    private void a(ahk ahk) {
        Bitmap bitmap = ahk != null ? ahk.b : null;
        if (!s()) {
            Bitmap bitmap2 = this.g;
            this.g = bitmap;
            if (q()) {
                super.b((Object) ahk);
            }
            if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                ahi.a(bitmap2);
            }
        } else if (bitmap != null) {
            ahi.a(bitmap);
        }
    }

    protected void i() {
        if (this.g != null) {
            ahk ahk = new ahk();
            ahk.c = 0;
            ahk.b = this.g;
            a(ahk);
        }
        if (z() || this.g == null) {
            v();
        }
    }

    protected void j() {
        u();
    }

    private void b(ahk ahk) {
        super.a(ahk);
        if (ahk != null) {
            ahi.a(ahk.b);
        }
    }

    protected void k() {
        super.k();
        j();
        if (this.g != null) {
            ahi.a(this.g);
            this.g = null;
        }
    }

    private static void a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
