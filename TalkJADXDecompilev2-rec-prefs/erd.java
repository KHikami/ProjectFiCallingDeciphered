package p000;

import android.content.Context;
import android.database.Cursor;

final class erd extends bok {
    final /* synthetic */ etx f12110c;
    final /* synthetic */ Object f12111d;
    final /* synthetic */ erb f12112e;

    erd(erb erb, Context context, jcf jcf, int i, String str, etx etx, Object obj) {
        this.f12112e = erb;
        this.f12110c = etx;
        this.f12111d = obj;
        super(context, jcf, i, str);
    }

    protected void mo1936a(Cursor cursor) {
        synchronized (this.f12112e.f12100a) {
            esn a = this.f12112e.m14303a(this.b, true);
            a.mo1937a(cursor);
            this.f12112e.m14307a(a, this.b, this.f12110c, this.f12111d);
        }
    }
}
