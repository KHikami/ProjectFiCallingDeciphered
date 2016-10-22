package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* renamed from: auq */
final class auq extends auv {
    private /* synthetic */ auy a;

    auq(aup aup, auy auy) {
        this.a = auy;
    }

    protected final void a(Cursor cursor) {
        auy auy = this.a;
        boolean z = cursor != null && cursor.getCount() > 0;
        auy.a(z);
    }
}
