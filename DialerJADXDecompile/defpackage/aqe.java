package defpackage;

import android.view.View;
import com.android.dialer.app.list.PhoneFavoriteSquareTileView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aqe */
public final class aqe {
    public final List a;
    public final aqf b;
    public final int[] c;

    public aqe(aqf aqf) {
        this.a = new ArrayList();
        this.c = new int[2];
        this.b = aqf;
    }

    public final void a(View view, int i, int i2) {
        view.getLocationOnScreen(this.c);
        int i3 = i + this.c[0];
        int i4 = i2 + this.c[1];
        PhoneFavoriteSquareTileView a = this.b.a(i3, i4);
        for (int i5 = 0; i5 < this.a.size(); i5++) {
            ((aqi) this.a.get(i5)).b(i3, i4, a);
        }
    }

    public final void a(int i, int i2, boolean z) {
        int i3 = 0;
        if (z) {
            for (int i4 = 0; i4 < this.a.size(); i4++) {
                ((aqi) this.a.get(i4)).r();
            }
        }
        while (i3 < this.a.size()) {
            ((aqi) this.a.get(i3)).q();
            i3++;
        }
    }

    public final void a(aqi aqi) {
        if (!this.a.contains(aqi)) {
            this.a.add(aqi);
        }
    }
}
