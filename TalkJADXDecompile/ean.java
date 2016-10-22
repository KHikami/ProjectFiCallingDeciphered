import android.content.Context;
import java.util.Locale;

final class ean extends ecw {
    private final String a;

    ean(Context context, int i, eap eap, int i2, boolean z) {
        super(context, i, eap, false);
        this.a = String.format(Locale.US, "%02d", new Object[]{Integer.valueOf(i2)});
    }

    protected void a() {
        this.w.b(Integer.toString(this.s)).c(this.a);
        super.a();
    }

    protected boolean b() {
        return false;
    }

    protected void c() {
        if (eao.b(this.r)) {
            gwb.a(fde.e(this.s), 1929);
        }
    }
}
