package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

public final class ahi extends hv<ahk> implements ahj {
    private String f789f;
    private Bitmap f790g;

    public /* synthetic */ void mo210a(Object obj) {
        m1313b((ahk) obj);
    }

    public /* synthetic */ void mo212b(Object obj) {
        m1311a((ahk) obj);
    }

    public /* synthetic */ Object mo213d() {
        return m1314h();
    }

    public ahi(Context context, String str) {
        super(context);
        this.f789f = str;
    }

    public void mo211a(String str) {
        this.f789f = str;
    }

    private ahk m1314h() {
        ahk ahk = new ahk();
        Context o = m1286o();
        if (!(o == null || this.f789f == null)) {
            try {
                ahk = ahn.m1340a(o.getContentResolver(), Uri.parse(this.f789f), agp.f645b);
                if (ahk.f792b != null) {
                    ahk.f792b.setDensity(160);
                }
            } catch (UnsupportedOperationException e) {
                ahk.f793c = 1;
            }
        }
        return ahk;
    }

    private void m1311a(ahk ahk) {
        Bitmap bitmap = ahk != null ? ahk.f792b : null;
        if (!m1290s()) {
            Bitmap bitmap2 = this.f790g;
            this.f790g = bitmap;
            if (m1288q()) {
                super.mo212b((Object) ahk);
            }
            if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                ahi.m1312a(bitmap2);
            }
        } else if (bitmap != null) {
            ahi.m1312a(bitmap);
        }
    }

    protected void mo214i() {
        if (this.f790g != null) {
            ahk ahk = new ahk();
            ahk.f793c = 0;
            ahk.f792b = this.f790g;
            m1311a(ahk);
        }
        if (m1297z() || this.f790g == null) {
            m1293v();
        }
    }

    protected void mo215j() {
        m1292u();
    }

    private void m1313b(ahk ahk) {
        super.mo210a(ahk);
        if (ahk != null) {
            ahi.m1312a(ahk.f792b);
        }
    }

    protected void mo216k() {
        super.mo216k();
        mo215j();
        if (this.f790g != null) {
            ahi.m1312a(this.f790g);
            this.f790g = null;
        }
    }

    private static void m1312a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
