package defpackage;

import android.net.Uri;
import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: arw */
final class arw extends AsyncTask {
    private /* synthetic */ Uri a;
    private /* synthetic */ arx b;
    private /* synthetic */ art c;

    arw(art art, Uri uri, arx arx) {
        this.c = art;
        this.a = uri;
        this.b = arx;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((Uri) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.net.Uri a() {
        /*
        r8 = this;
        r1 = 0;
        r0 = r8.c;
        r2 = r8.a;
        r0 = r0.a(r2);
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = r8.c;
        r2 = r8.a;
        r0 = r0.b(r2);
        if (r0 != 0) goto L_0x0018;
    L_0x0016:
        r0 = r1;
        goto L_0x000b;
    L_0x0018:
        r2 = r8.c;
        r2 = r2.a;
        r3 = defpackage.awg.a;
        r0 = r2.insert(r3, r0);
        if (r0 != 0) goto L_0x0026;
    L_0x0024:
        r0 = r1;
        goto L_0x000b;
    L_0x0026:
        r4 = 0;
        r2 = r8.c;	 Catch:{ IOException -> 0x009f }
        r2 = r2.a;	 Catch:{ IOException -> 0x009f }
        r3 = r8.a;	 Catch:{ IOException -> 0x009f }
        r5 = r2.openInputStream(r3);	 Catch:{ IOException -> 0x009f }
        r2 = r8.c;	 Catch:{ Throwable -> 0x008f, all -> 0x00a6 }
        r2 = r2.a;	 Catch:{ Throwable -> 0x008f, all -> 0x00a6 }
        r6 = r2.openOutputStream(r0);	 Catch:{ Throwable -> 0x008f, all -> 0x00a6 }
        if (r5 == 0) goto L_0x0072;
    L_0x003b:
        if (r6 == 0) goto L_0x0072;
    L_0x003d:
        defpackage.dbv.a(r5, r6);	 Catch:{ Throwable -> 0x0084, all -> 0x00d0 }
        r3 = 1;
        if (r6 == 0) goto L_0x0046;
    L_0x0043:
        r6.close();	 Catch:{ Throwable -> 0x00ce, all -> 0x00ca }
    L_0x0046:
        if (r5 == 0) goto L_0x000b;
    L_0x0048:
        r5.close();	 Catch:{ IOException -> 0x004c, all -> 0x00c7 }
        goto L_0x000b;
    L_0x004c:
        r2 = move-exception;
        r4 = r3;
    L_0x004e:
        r3 = "VoicemailAsyncTaskUtil";
        r5 = "Failed to copy voicemail content to new file: ";
        r2 = r2.toString();	 Catch:{ all -> 0x00b2 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00b2 }
        r6 = r2.length();	 Catch:{ all -> 0x00b2 }
        if (r6 == 0) goto L_0x00c1;
    L_0x0060:
        r2 = r5.concat(r2);	 Catch:{ all -> 0x00b2 }
    L_0x0064:
        android.util.Log.w(r3, r2);	 Catch:{ all -> 0x00b2 }
        if (r4 != 0) goto L_0x0070;
    L_0x0069:
        r2 = r8.c;
        r2 = r2.a;
        r2.delete(r0, r1, r1);
    L_0x0070:
        r0 = r1;
        goto L_0x000b;
    L_0x0072:
        if (r6 == 0) goto L_0x0077;
    L_0x0074:
        r6.close();	 Catch:{ Throwable -> 0x008f, all -> 0x00a6 }
    L_0x0077:
        if (r5 == 0) goto L_0x007c;
    L_0x0079:
        r5.close();	 Catch:{ IOException -> 0x009f }
    L_0x007c:
        r2 = r8.c;
        r2 = r2.a;
        r2.delete(r0, r1, r1);
        goto L_0x0070;
    L_0x0084:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0086 }
    L_0x0086:
        r2 = move-exception;
    L_0x0087:
        if (r6 == 0) goto L_0x008e;
    L_0x0089:
        if (r3 == 0) goto L_0x00a9;
    L_0x008b:
        r6.close();	 Catch:{ Throwable -> 0x00a1, all -> 0x00a6 }
    L_0x008e:
        throw r2;	 Catch:{ Throwable -> 0x008f, all -> 0x00a6 }
    L_0x008f:
        r2 = move-exception;
        r3 = r4;
    L_0x0091:
        throw r2;	 Catch:{ all -> 0x0092 }
    L_0x0092:
        r4 = move-exception;
        r7 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r7;
    L_0x0097:
        if (r5 == 0) goto L_0x009e;
    L_0x0099:
        if (r3 == 0) goto L_0x00bd;
    L_0x009b:
        r5.close();	 Catch:{ Throwable -> 0x00ad }
    L_0x009e:
        throw r2;	 Catch:{ IOException -> 0x009f }
    L_0x009f:
        r2 = move-exception;
        goto L_0x004e;
    L_0x00a1:
        r6 = move-exception;
        r3.addSuppressed(r6);	 Catch:{ Throwable -> 0x008f, all -> 0x00a6 }
        goto L_0x008e;
    L_0x00a6:
        r2 = move-exception;
        r3 = r1;
        goto L_0x0097;
    L_0x00a9:
        r6.close();	 Catch:{ Throwable -> 0x008f, all -> 0x00a6 }
        goto L_0x008e;
    L_0x00ad:
        r5 = move-exception;
        r3.addSuppressed(r5);	 Catch:{ IOException -> 0x009f }
        goto L_0x009e;
    L_0x00b2:
        r2 = move-exception;
    L_0x00b3:
        if (r4 != 0) goto L_0x00bc;
    L_0x00b5:
        r3 = r8.c;
        r3 = r3.a;
        r3.delete(r0, r1, r1);
    L_0x00bc:
        throw r2;
    L_0x00bd:
        r5.close();	 Catch:{ IOException -> 0x009f }
        goto L_0x009e;
    L_0x00c1:
        r2 = new java.lang.String;	 Catch:{ all -> 0x00b2 }
        r2.<init>(r5);	 Catch:{ all -> 0x00b2 }
        goto L_0x0064;
    L_0x00c7:
        r2 = move-exception;
        r4 = r3;
        goto L_0x00b3;
    L_0x00ca:
        r2 = move-exception;
        r4 = r3;
        r3 = r1;
        goto L_0x0097;
    L_0x00ce:
        r2 = move-exception;
        goto L_0x0091;
    L_0x00d0:
        r2 = move-exception;
        r3 = r1;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: arw.a():android.net.Uri");
    }
}
