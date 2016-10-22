package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;

/* compiled from: PG */
/* renamed from: apw */
public final class apw extends aqu {
    Resources C;
    private aup E;

    public apw(Context context) {
        super(context);
        this.C = context.getResources();
        d();
        b(5, true);
        this.E = new aup(context);
    }

    protected final boolean a(boolean z) {
        boolean z2 = z || this.D;
        return b(5, z2);
    }

    protected final void a(View view, int i, Cursor cursor, int i2) {
        super.a(view, i, cursor, i2);
        adr adr = (adr) view;
        adr.setTag(aq.g, null);
        int color = this.C.getColor(cob.ae);
        adr.d().setTextColor(color);
        adr.c().setTextColor(color);
        String k = k(i2);
        String g = buf.g(this.v);
        this.E.a(new apx(this, adr), k, g);
    }
}
