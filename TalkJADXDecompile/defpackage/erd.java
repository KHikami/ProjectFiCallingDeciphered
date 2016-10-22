package defpackage;

import android.content.Context;
import android.database.Cursor;

/* renamed from: erd */
final class erd extends bok {
    final /* synthetic */ etx c;
    final /* synthetic */ Object d;
    final /* synthetic */ erb e;

    erd(erb erb, Context context, jcf jcf, int i, String str, etx etx, Object obj) {
        this.e = erb;
        this.c = etx;
        this.d = obj;
        super(context, jcf, i, str);
    }

    protected void a(Cursor cursor) {
        synchronized (this.e.a) {
            esn a = this.e.a(this.b, true);
            a.a(cursor);
            this.e.a(a, this.b, this.c, this.d);
        }
    }
}
