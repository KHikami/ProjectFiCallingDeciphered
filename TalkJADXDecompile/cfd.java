import android.view.View;
import android.view.View.OnLayoutChangeListener;

final class cfd implements OnLayoutChangeListener {
    final /* synthetic */ cdr a;

    cfd(cdr cdr) {
        this.a = cdr;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        if (i2 <= 0) {
            glk.c("Babel_Conv", "Unexpected compose area view layout. onLayoutChange(v, " + i + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5 + ", " + i6 + ", " + i7 + ", " + i8 + ")", new Object[0]);
        }
        if (this.a.aU == -1 && i2 > 0) {
            this.a.aU = i2;
        }
        if (this.a.aU > 0) {
            if (this.a.getResources().getDimensionPixelSize(gwb.lg) == 0) {
                i9 = 1;
            }
            if (i9 != 0) {
                this.a.aW.a(this.a.aU);
            }
        }
    }
}
