package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bht */
public final class bht implements bem {
    private final Context a;
    private final bja b;

    public bht(Context context, bja bja) {
        this.a = (Context) Objects.requireNonNull(context);
        this.b = (bja) Objects.requireNonNull(bja);
    }

    public final void a(ayo ayo) {
        int i = 0;
        dem det = new det();
        det.a = buf.a(this.a, ayo);
        det.d = buf.a(this.a, 1028, ayo.a, ayo.u);
        this.b.a(new bqj(det), 1028);
        if (!TextUtils.isEmpty(buf.c(ayo.b))) {
            if (bjb.a(buf.c(ayo.b), this.a.getSharedPreferences(this.a.getPackageName(), 0)) == 0) {
                i = 1;
            }
            if (det.a.c == 1 && r0 != 0) {
                dem dca = new dca();
                dca.a = buf.b(this.a, ayo);
                bja bja = this.b;
                bja.a.a(new bqj(dca)).a();
            }
        }
    }
}
