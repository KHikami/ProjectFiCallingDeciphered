package defpackage;

import android.net.Uri;
import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: aru */
final class aru extends AsyncTask {
    private /* synthetic */ Uri a;
    private /* synthetic */ ary b;
    private /* synthetic */ art c;

    aru(art art, Uri uri, ary ary) {
        this.c = art;
        this.a = uri;
        this.b = ary;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((String) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a() {
        /*
        r6 = this;
        r3 = 0;
        r0 = r6.c;
        r0 = r0.a;
        r1 = r6.a;
        r2 = 1;
        r2 = new java.lang.String[r2];
        r4 = 0;
        r5 = "_data";
        r2[r4] = r5;
        r4 = r3;
        r5 = r3;
        r2 = r0.query(r1, r2, r3, r4, r5);
        r0 = r6.c;	 Catch:{ Throwable -> 0x0033, all -> 0x0049 }
        r0 = defpackage.art.a(r2);	 Catch:{ Throwable -> 0x0033, all -> 0x0049 }
        if (r0 == 0) goto L_0x002d;
    L_0x001d:
        r0 = "_data";
        r0 = r2.getColumnIndex(r0);	 Catch:{ Throwable -> 0x0033, all -> 0x0049 }
        r3 = r2.getString(r0);	 Catch:{ Throwable -> 0x0033, all -> 0x0049 }
        if (r2 == 0) goto L_0x002c;
    L_0x0029:
        r2.close();
    L_0x002c:
        return r3;
    L_0x002d:
        if (r2 == 0) goto L_0x002c;
    L_0x002f:
        r2.close();
        goto L_0x002c;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r1 = move-exception;
        r3 = r0;
        r0 = r1;
    L_0x0038:
        if (r2 == 0) goto L_0x003f;
    L_0x003a:
        if (r3 == 0) goto L_0x0045;
    L_0x003c:
        r2.close();	 Catch:{ Throwable -> 0x0040 }
    L_0x003f:
        throw r0;
    L_0x0040:
        r1 = move-exception;
        r3.addSuppressed(r1);
        goto L_0x003f;
    L_0x0045:
        r2.close();
        goto L_0x003f;
    L_0x0049:
        r0 = move-exception;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: aru.a():java.lang.String");
    }
}
