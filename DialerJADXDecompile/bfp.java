import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class bfp {
    private static final Map k;
    public final ContentResolver a;
    public final boolean b;
    public boolean c;
    public Cursor d;
    public boolean e;
    public int f;
    public Uri g;
    public boolean h;
    public String i;
    public boolean j;
    private final int l;
    private final String m;

    static {
        Map hashMap = new HashMap();
        k = hashMap;
        hashMap.put(Integer.valueOf(0), "X-AIM");
        k.put(Integer.valueOf(1), "X-MSN");
        k.put(Integer.valueOf(2), "X-YAHOO");
        k.put(Integer.valueOf(6), "X-ICQ");
        k.put(Integer.valueOf(7), "X-JABBER");
        k.put(Integer.valueOf(3), "X-SKYPE-USERNAME");
        new String[1][0] = "_id";
    }

    public bfp(Context context, int i, boolean z) {
        this(context, i, null, true);
    }

    private bfp(Context context, int i, String str, boolean z) {
        this(context.getContentResolver(), i, null);
    }

    private bfp(ContentResolver contentResolver, int i, String str) {
        boolean z = true;
        this.i = "No error";
        this.j = true;
        this.l = i;
        this.a = contentResolver;
        this.b = bfr.n(i);
        if (TextUtils.isEmpty(str)) {
            str = "UTF-8";
        }
        if (bfr.b(i) && "UTF-8".equalsIgnoreCase(str)) {
            z = false;
        }
        if (this.b || r0) {
            if (!"SHIFT_JIS".equalsIgnoreCase(str)) {
                if (TextUtils.isEmpty(str)) {
                    this.m = "SHIFT_JIS";
                } else {
                    this.m = str;
                }
            }
            this.m = str;
        } else {
            if (TextUtils.isEmpty(str)) {
                this.m = "UTF-8";
            }
            this.m = str;
        }
        String str2 = this.m;
        new StringBuilder(String.valueOf(str2).length() + 18).append("Use the charset \"").append(str2).append("\"");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(long r10, java.lang.reflect.Method r12) {
        /*
        r9 = this;
        r6 = 0;
        r7 = new java.util.HashMap;
        r7.<init>();
        r1 = r9.g;	 Catch:{ all -> 0x0066 }
        r0 = 1;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x0066 }
        r0 = 0;
        r2 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0066 }
        r4[r0] = r2;	 Catch:{ all -> 0x0066 }
        if (r12 == 0) goto L_0x00a0;
    L_0x0014:
        r0 = 0;
        r2 = 5;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r3 = 0;
        r5 = r9.a;	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r2[r3] = r5;	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r3 = 1;
        r2[r3] = r1;	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r1 = 2;
        r3 = "contact_id=?";
        r2[r1] = r3;	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r1 = 3;
        r2[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r1 = 4;
        r3 = 0;
        r2[r1] = r3;	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r0 = r12.invoke(r0, r2);	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r0 = (android.content.EntityIterator) r0;	 Catch:{ IllegalArgumentException -> 0x0044, IllegalAccessException -> 0x006e, InvocationTargetException -> 0x0090 }
        r1 = r0;
    L_0x0033:
        if (r1 != 0) goto L_0x00af;
    L_0x0035:
        r0 = "VCardComposer";
        r2 = "EntityIterator is null";
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x0116 }
        r0 = "";
        if (r1 == 0) goto L_0x0043;
    L_0x0040:
        r1.close();
    L_0x0043:
        return r0;
    L_0x0044:
        r0 = move-exception;
        r1 = "VCardComposer";
        r2 = "IllegalArgumentException has been thrown: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x0066 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0066 }
        r3 = r0.length();	 Catch:{ all -> 0x0066 }
        if (r3 == 0) goto L_0x0060;
    L_0x0057:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x0066 }
    L_0x005b:
        android.util.Log.e(r1, r0);	 Catch:{ all -> 0x0066 }
        r1 = r6;
        goto L_0x0033;
    L_0x0060:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0066 }
        r0.<init>(r2);	 Catch:{ all -> 0x0066 }
        goto L_0x005b;
    L_0x0066:
        r0 = move-exception;
        r1 = r6;
    L_0x0068:
        if (r1 == 0) goto L_0x006d;
    L_0x006a:
        r1.close();
    L_0x006d:
        throw r0;
    L_0x006e:
        r0 = move-exception;
        r1 = "VCardComposer";
        r2 = "IllegalAccessException has been thrown: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x0066 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0066 }
        r3 = r0.length();	 Catch:{ all -> 0x0066 }
        if (r3 == 0) goto L_0x008a;
    L_0x0081:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x0066 }
    L_0x0085:
        android.util.Log.e(r1, r0);	 Catch:{ all -> 0x0066 }
        r1 = r6;
        goto L_0x0033;
    L_0x008a:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0066 }
        r0.<init>(r2);	 Catch:{ all -> 0x0066 }
        goto L_0x0085;
    L_0x0090:
        r0 = move-exception;
        r1 = "VCardComposer";
        r2 = "InvocationTargetException has been thrown: ";
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x0066 }
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0066 }
        r1 = "InvocationTargetException has been thrown";
        r0.<init>(r1);	 Catch:{ all -> 0x0066 }
        throw r0;	 Catch:{ all -> 0x0066 }
    L_0x00a0:
        r0 = r9.a;	 Catch:{ all -> 0x0066 }
        r2 = 0;
        r3 = "contact_id=?";
        r5 = 0;
        r0 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0066 }
        r1 = android.provider.ContactsContract.RawContacts.newEntityIterator(r0);	 Catch:{ all -> 0x0066 }
        goto L_0x0033;
    L_0x00af:
        r0 = r1.hasNext();	 Catch:{ all -> 0x0116 }
        if (r0 != 0) goto L_0x00d8;
    L_0x00b5:
        r0 = "VCardComposer";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0116 }
        r3 = 52;
        r2.<init>(r3);	 Catch:{ all -> 0x0116 }
        r3 = "Data does not exist. contactId: ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0116 }
        r2 = r2.append(r10);	 Catch:{ all -> 0x0116 }
        r2 = r2.toString();	 Catch:{ all -> 0x0116 }
        android.util.Log.w(r0, r2);	 Catch:{ all -> 0x0116 }
        r0 = "";
        if (r1 == 0) goto L_0x0043;
    L_0x00d3:
        r1.close();
        goto L_0x0043;
    L_0x00d8:
        r0 = r1.hasNext();	 Catch:{ all -> 0x0116 }
        if (r0 == 0) goto L_0x0119;
    L_0x00de:
        r0 = r1.next();	 Catch:{ all -> 0x0116 }
        r0 = (android.content.Entity) r0;	 Catch:{ all -> 0x0116 }
        r0 = r0.getSubValues();	 Catch:{ all -> 0x0116 }
        r2 = r0.iterator();	 Catch:{ all -> 0x0116 }
    L_0x00ec:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0116 }
        if (r0 == 0) goto L_0x00d8;
    L_0x00f2:
        r0 = r2.next();	 Catch:{ all -> 0x0116 }
        r0 = (android.content.Entity.NamedContentValues) r0;	 Catch:{ all -> 0x0116 }
        r3 = r0.values;	 Catch:{ all -> 0x0116 }
        r0 = "mimetype";
        r4 = r3.getAsString(r0);	 Catch:{ all -> 0x0116 }
        if (r4 == 0) goto L_0x00ec;
    L_0x0102:
        r0 = r7.get(r4);	 Catch:{ all -> 0x0116 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0116 }
        if (r0 != 0) goto L_0x0112;
    L_0x010a:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0116 }
        r0.<init>();	 Catch:{ all -> 0x0116 }
        r7.put(r4, r0);	 Catch:{ all -> 0x0116 }
    L_0x0112:
        r0.add(r3);	 Catch:{ all -> 0x0116 }
        goto L_0x00ec;
    L_0x0116:
        r0 = move-exception;
        goto L_0x0068;
    L_0x0119:
        if (r1 == 0) goto L_0x011e;
    L_0x011b:
        r1.close();
    L_0x011e:
        r1 = new bfn;
        r0 = r9.l;
        r2 = r9.m;
        r1.<init>(r0, r2);
        r0 = "vnd.android.cursor.item/name";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r1.b(r0);
        r0 = "vnd.android.cursor.item/nickname";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r2.c(r0);
        r0 = "vnd.android.cursor.item/phone_v2";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r2.a(r0, r6);
        r0 = "vnd.android.cursor.item/email_v2";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r2.d(r0);
        r0 = "vnd.android.cursor.item/postal-address_v2";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r2.e(r0);
        r0 = "vnd.android.cursor.item/organization";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r2.h(r0);
        r0 = "vnd.android.cursor.item/website";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2.g(r0);
        r0 = r9.l;
        r2 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r0 = r0 & r2;
        if (r0 != 0) goto L_0x018c;
    L_0x0181:
        r0 = "vnd.android.cursor.item/photo";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r1.i(r0);
    L_0x018c:
        r0 = "vnd.android.cursor.item/note";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r1.j(r0);
        r0 = "vnd.android.cursor.item/contact_event";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r2.k(r0);
        r0 = "vnd.android.cursor.item/im";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r2.f(r0);
        r0 = "vnd.android.cursor.item/sip_address";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2 = r2.m(r0);
        r0 = "vnd.android.cursor.item/relation";
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r2.l(r0);
        r0 = r1.toString();
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfp.a(long, java.lang.reflect.Method):java.lang.String");
    }

    public final void a() {
        b();
        this.j = true;
    }

    public final void b() {
        if (this.d != null) {
            try {
                this.d.close();
            } catch (SQLiteException e) {
                String str = "VCardComposer";
                String str2 = "SQLiteException on Cursor#close(): ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.d = null;
        }
    }

    protected final void finalize() {
        try {
            if (!this.j) {
                Log.e("VCardComposer", "finalized() is called before terminate() being called");
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }
}
