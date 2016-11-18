package defpackage;

import android.content.Context;
import android.database.Cursor;

final class ere extends bok {
    final /* synthetic */ erb c;

    ere(erb erb, Context context, jcf jcf, int i, String str) {
        this.c = erb;
        super(context, jcf, i, str);
    }

    protected void a(Cursor cursor) {
        synchronized (this.c.a) {
            this.c.a(this.b, true).a(cursor);
        }
    }
}
