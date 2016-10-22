import android.content.Context;
import android.graphics.Bitmap;

final class grr implements bnq {
    private final Context a;
    private final bhl b;

    public grr(Context context, bhl bhl) {
        this.a = context;
        this.b = bhl;
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (z && gkt != null) {
            Bitmap d;
            if (grm.a(this.a)) {
                d = gkt.d();
            } else {
                d = gkt.e();
            }
            this.b.a(new grl((String) bnn.l(), d));
        }
    }
}
