package p000;

import android.content.Context;
import android.graphics.Bitmap;

final class grr implements bnq {
    private final Context f15982a;
    private final bhl f15983b;

    public grr(Context context, bhl bhl) {
        this.f15982a = context;
        this.f15983b = bhl;
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (z && gkt != null) {
            Bitmap d;
            if (grm.m18337a(this.f15982a)) {
                d = gkt.m17897d();
            } else {
                d = gkt.m17898e();
            }
            this.f15983b.mo550a(new grl((String) bnn.m5506l(), d));
        }
    }
}
