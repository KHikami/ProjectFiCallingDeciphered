package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* renamed from: anb */
final class anb implements and {
    private static final String[] a;
    private final ContentResolver b;
    private final Context c;

    static {
        a = new String[]{"_id", "number", "voicemail_uri", "presentation", "subscription_component_name", "subscription_id", "transcription", "countryiso", "date"};
    }

    anb(Context context, ContentResolver contentResolver) {
        this.c = context;
        this.b = contentResolver;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public final java.util.List a(int r16) {
        /*
        r15 = this;
        r0 = r15.c;
        r1 = "android.permission.READ_CALL_LOG";
        r0 = defpackage.buf.c(r0, r1);
        if (r0 != 0) goto L_0x0013;
    L_0x000a:
        r0 = "CallLogNotifHelper";
        r1 = "No READ_CALL_LOG permission, returning null for calls lookup.";
        android.util.Log.w(r0, r1);
        r0 = 0;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = "%s = 1 AND %s = ?";
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = "new";
        r1[r2] = r3;
        r2 = 1;
        r3 = "type";
        r1[r2] = r3;
        r3 = java.lang.String.format(r0, r1);
        r0 = 1;
        r4 = new java.lang.String[r0];
        r0 = 0;
        r1 = java.lang.Integer.toString(r16);
        r4[r0] = r1;
        r0 = r15.b;	 Catch:{ RuntimeException -> 0x009f }
        r1 = android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL;	 Catch:{ RuntimeException -> 0x009f }
        r2 = a;	 Catch:{ RuntimeException -> 0x009f }
        r5 = "date DESC";
        r13 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x009f }
        r12 = 0;
        if (r13 != 0) goto L_0x0046;
    L_0x003f:
        if (r13 == 0) goto L_0x0044;
    L_0x0041:
        r13.close();	 Catch:{ RuntimeException -> 0x009f }
    L_0x0044:
        r0 = 0;
        goto L_0x0012;
    L_0x0046:
        r0 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r0.<init>();	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
    L_0x004b:
        r1 = r13.moveToNext();	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        if (r1 == 0) goto L_0x00af;
    L_0x0051:
        r1 = 2;
        r1 = r13.getString(r1);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r2 = android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL;	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r3 = 0;
        r4 = r13.getLong(r3);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r2 = android.content.ContentUris.withAppendedId(r2, r4);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        if (r1 != 0) goto L_0x00aa;
    L_0x0063:
        r3 = 0;
    L_0x0064:
        r1 = new anc;	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r4 = 1;
        r4 = r13.getString(r4);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r5 = 3;
        r5 = r13.getInt(r5);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r6 = 4;
        r6 = r13.getString(r6);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r7 = 5;
        r7 = r13.getString(r7);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r8 = 6;
        r8 = r13.getString(r8);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r9 = 7;
        r9 = r13.getString(r9);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r10 = 8;
        r10 = r13.getLong(r10);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        r0.add(r1);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        goto L_0x004b;
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0093 }
    L_0x0093:
        r1 = move-exception;
        r14 = r1;
        r1 = r0;
        r0 = r14;
    L_0x0097:
        if (r13 == 0) goto L_0x009e;
    L_0x0099:
        if (r1 == 0) goto L_0x00bb;
    L_0x009b:
        r13.close();	 Catch:{ Throwable -> 0x00b6 }
    L_0x009e:
        throw r0;	 Catch:{ RuntimeException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        r0 = "CallLogNotifHelper";
        r1 = "Exception when querying Contacts Provider for calls lookup";
        android.util.Log.w(r0, r1);
        r0 = 0;
        goto L_0x0012;
    L_0x00aa:
        r3 = android.net.Uri.parse(r1);	 Catch:{ Throwable -> 0x0091, all -> 0x00bf }
        goto L_0x0064;
    L_0x00af:
        if (r13 == 0) goto L_0x0012;
    L_0x00b1:
        r13.close();	 Catch:{ RuntimeException -> 0x009f }
        goto L_0x0012;
    L_0x00b6:
        r2 = move-exception;
        r1.addSuppressed(r2);	 Catch:{ RuntimeException -> 0x009f }
        goto L_0x009e;
    L_0x00bb:
        r13.close();	 Catch:{ RuntimeException -> 0x009f }
        goto L_0x009e;
    L_0x00bf:
        r0 = move-exception;
        r1 = r12;
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: anb.a(int):java.util.List");
    }
}
