package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import java.util.Objects;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bex */
public final class bex extends AsyncTask {
    final Context a;
    private final bey b;
    private final String c;
    private final String d;

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        this.b.a(((Boolean) obj).booleanValue());
    }

    public bex(Context context, bey bey, String str, String str2) {
        this.a = (Context) Objects.requireNonNull(context);
        this.b = (bey) Objects.requireNonNull(bey);
        this.c = str;
        this.d = str2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Boolean a() {
        /*
        r9 = this;
        r5 = 0;
        r7 = 1;
        r8 = 0;
        r2 = r9.c;
        r0 = "number";
        r1 = r9.c;
        r3 = r9.d;
        r1 = android.telephony.PhoneNumberUtils.formatNumberToE164(r1, r3);
        r3 = android.text.TextUtils.isEmpty(r1);
        if (r3 != 0) goto L_0x006a;
    L_0x0015:
        r0 = "normalized_number";
        r3 = r0;
        r6 = r1;
    L_0x0019:
        r0 = r9.a;
        r0 = r0.getContentResolver();
        r1 = r9.a;
        r1 = defpackage.axk.e(r1);
        r2 = new java.lang.String[r7];
        r4 = "_id";
        r2[r8] = r4;
        r3 = java.lang.String.valueOf(r3);
        r4 = " = ?";
        r3 = r3.concat(r4);
        r4 = new java.lang.String[r7];
        r4[r8] = r6;
        r2 = r0.query(r1, r2, r3, r4, r5);
        if (r2 == 0) goto L_0x0050;
    L_0x003f:
        r0 = r2.getCount();	 Catch:{ Throwable -> 0x0052, all -> 0x0068 }
        if (r0 <= 0) goto L_0x0050;
    L_0x0045:
        r0 = r7;
    L_0x0046:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ Throwable -> 0x0052, all -> 0x0068 }
        if (r2 == 0) goto L_0x004f;
    L_0x004c:
        r2.close();
    L_0x004f:
        return r0;
    L_0x0050:
        r0 = r8;
        goto L_0x0046;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0054 }
    L_0x0054:
        r1 = move-exception;
        r5 = r0;
        r0 = r1;
    L_0x0057:
        if (r2 == 0) goto L_0x005e;
    L_0x0059:
        if (r5 == 0) goto L_0x0064;
    L_0x005b:
        r2.close();	 Catch:{ Throwable -> 0x005f }
    L_0x005e:
        throw r0;
    L_0x005f:
        r1 = move-exception;
        r5.addSuppressed(r1);
        goto L_0x005e;
    L_0x0064:
        r2.close();
        goto L_0x005e;
    L_0x0068:
        r0 = move-exception;
        goto L_0x0057;
    L_0x006a:
        r3 = r0;
        r6 = r2;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: bex.a():java.lang.Boolean");
    }
}
