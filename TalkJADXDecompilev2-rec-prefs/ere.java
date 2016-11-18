package p000;

import android.content.Context;
import android.database.Cursor;

final class ere extends bok {
    final /* synthetic */ erb f12113c;

    ere(erb erb, Context context, jcf jcf, int i, String str) {
        this.f12113c = erb;
        super(context, jcf, i, str);
    }

    protected void mo1936a(Cursor cursor) {
        synchronized (this.f12113c.f12100a) {
            this.f12113c.m14303a(this.b, true).mo1937a(cursor);
        }
    }
}
