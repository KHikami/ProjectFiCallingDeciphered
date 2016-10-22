package defpackage;

import android.content.AsyncQueryHandler;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: aup */
public final class aup extends AsyncQueryHandler {
    public static final Map a;
    public final Context b;

    static {
        a = new ConcurrentHashMap();
    }

    public aup(Context context) {
        super(context.getContentResolver());
        this.b = context;
    }

    protected final void onQueryComplete(int i, Object obj, Cursor cursor) {
        if (obj != null) {
            ((auv) obj).a(cursor);
        }
    }

    protected final void onInsertComplete(int i, Object obj, Uri uri) {
        if (obj != null) {
            ((auv) obj).a(uri);
        }
    }

    protected final void onUpdateComplete(int i, Object obj, int i2) {
    }

    protected final void onDeleteComplete(int i, Object obj, int i2) {
        if (obj != null) {
            ((auv) obj).a(i2);
        }
    }

    public final void a(auy auy) {
        if (buf.A(this.b)) {
            String str;
            auq auq = new auq(this, auy);
            Uri a = buf.a(this.b, null);
            String[] strArr = new String[]{buf.q(this.b)};
            if (buf.w(this.b)) {
                str = null;
            } else {
                str = "type=1";
            }
            startQuery(0, auq, a, strArr, str, null, null);
            return;
        }
        auy.a(false);
    }

    public final void a(aux aux, String str, String str2) {
        Integer num = null;
        if (str == null) {
            aux.a(Integer.valueOf(-1));
        } else if (buf.A(this.b)) {
            Integer num2 = (Integer) a.get(str);
            if (num2 == null) {
                String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, str2);
                if (TextUtils.isEmpty(buf.c(this.b, formatNumberToE164, str))) {
                    aux.a(Integer.valueOf(-1));
                    a.put(str, Integer.valueOf(-1));
                } else if (buf.a(this.b)) {
                    startQuery(0, new aur(this, str, aux), buf.a(this.b, null), buf.a(new String[]{buf.q(this.b), buf.r(this.b)}), String.valueOf(a(formatNumberToE164 != null)).concat(" = ?"), new String[]{r8}, null);
                } else {
                    buf.a("Device locked in FBE mode, cannot access blocked number database", new Object[0]);
                    aux.a(Integer.valueOf(-1));
                }
            } else if (aux != null) {
                if (num2.intValue() != -1) {
                    num = num2;
                }
                aux.a(num);
            }
        } else {
            aux.a(null);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(23)
    public final java.lang.Integer a(java.lang.String r10, java.lang.String r11) {
        /*
        r9 = this;
        r2 = -1;
        r4 = 1;
        r6 = 0;
        r5 = 0;
        defpackage.avl.b();
        if (r10 != 0) goto L_0x000a;
    L_0x0009:
        return r5;
    L_0x000a:
        r0 = r9.b;
        r0 = defpackage.buf.A(r0);
        if (r0 == 0) goto L_0x0009;
    L_0x0012:
        r0 = a;
        r0 = r0.get(r10);
        r0 = (java.lang.Integer) r0;
        if (r0 == 0) goto L_0x0024;
    L_0x001c:
        r1 = r0.intValue();
        if (r1 == r2) goto L_0x0009;
    L_0x0022:
        r5 = r0;
        goto L_0x0009;
    L_0x0024:
        r3 = android.telephony.PhoneNumberUtils.formatNumberToE164(r10, r11);
        r0 = r9.b;
        r7 = defpackage.buf.c(r0, r3, r10);
        r0 = android.text.TextUtils.isEmpty(r7);
        if (r0 != 0) goto L_0x0009;
    L_0x0034:
        r0 = r9.b;
        r0 = r0.getContentResolver();
        r1 = r9.b;
        r1 = defpackage.buf.a(r1, r5);
        r2 = 2;
        r2 = new java.lang.String[r2];
        r8 = r9.b;
        r8 = defpackage.buf.q(r8);
        r2[r6] = r8;
        r8 = r9.b;
        r8 = defpackage.buf.r(r8);
        r2[r4] = r8;
        r2 = defpackage.buf.a(r2);
        if (r3 == 0) goto L_0x0088;
    L_0x0059:
        r3 = r4;
    L_0x005a:
        r3 = r9.a(r3);
        r3 = java.lang.String.valueOf(r3);
        r8 = " = ?";
        r3 = r3.concat(r8);
        r4 = new java.lang.String[r4];
        r4[r6] = r7;
        r2 = r0.query(r1, r2, r3, r4, r5);
        if (r2 == 0) goto L_0x0078;
    L_0x0072:
        r0 = r2.getCount();	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        if (r0 != 0) goto L_0x008a;
    L_0x0078:
        r0 = a;	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        r1 = -1;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        r0.put(r10, r1);	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        if (r2 == 0) goto L_0x0009;
    L_0x0084:
        r2.close();
        goto L_0x0009;
    L_0x0088:
        r3 = r6;
        goto L_0x005a;
    L_0x008a:
        r2.moveToFirst();	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        r0 = "_id";
        r0 = r2.getColumnIndex(r0);	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        r0 = r2.getInt(r0);	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        r1 = a;	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        r3 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        r1.put(r10, r3);	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        r5 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x00ab, all -> 0x00c1 }
        if (r2 == 0) goto L_0x0009;
    L_0x00a6:
        r2.close();
        goto L_0x0009;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ad }
    L_0x00ad:
        r1 = move-exception;
        r5 = r0;
        r0 = r1;
    L_0x00b0:
        if (r2 == 0) goto L_0x00b7;
    L_0x00b2:
        if (r5 == 0) goto L_0x00bd;
    L_0x00b4:
        r2.close();	 Catch:{ Throwable -> 0x00b8 }
    L_0x00b7:
        throw r0;
    L_0x00b8:
        r1 = move-exception;
        r5.addSuppressed(r1);
        goto L_0x00b7;
    L_0x00bd:
        r2.close();
        goto L_0x00b7;
    L_0x00c1:
        r0 = move-exception;
        goto L_0x00b0;
        */
        throw new UnsupportedOperationException("Method not decompiled: aup.a(java.lang.String, java.lang.String):java.lang.Integer");
    }

    private final String a(boolean z) {
        if (!buf.w(this.b) || z) {
            return buf.v(this.b);
        }
        return buf.t(this.b);
    }

    public final void a(auw auw, String str, String str2) {
        a(auw, null, str, str2);
    }

    public final void a(auw auw, String str, String str2, String str3) {
        a(auw, buf.a(this.b, str2, str, str3));
    }

    public final void a(auw auw, ContentValues contentValues) {
        a.clear();
        if (buf.A(this.b)) {
            startInsert(0, new aus(this, auw), buf.a(this.b, null), contentValues);
        } else {
            auw.a(null);
        }
    }

    public final void a(auz auz, Integer num) {
        if (num == null) {
            throw new IllegalArgumentException("Null id passed into unblock");
        }
        a(auz, buf.a(this.b, num));
    }

    public final void a(auz auz, Uri uri) {
        a.clear();
        if (buf.A(this.b)) {
            startQuery(0, new aut(this, uri, auz), uri, null, null, null, null);
        } else if (auz != null) {
            auz.a(null);
        }
    }
}
