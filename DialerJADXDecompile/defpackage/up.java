package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: up */
public class up extends DataSetObservable {
    static final String a;
    private static final Object j;
    private static final Map k;
    final Object b;
    final List c;
    final List d;
    final Context e;
    final String f;
    boolean g;
    boolean h;
    boolean i;
    private ur l;
    private int m;
    private boolean n;

    static {
        a = up.class.getSimpleName();
        j = new Object();
        k = new HashMap();
    }

    public static up a(Context context, String str) {
        up upVar;
        synchronized (j) {
            upVar = (up) k.get(str);
            if (upVar == null) {
                upVar = new up(context, str);
                k.put(str, upVar);
            }
        }
        return upVar;
    }

    private up(Context context, String str) {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.l = new ur();
        this.m = 50;
        this.g = true;
        this.h = false;
        this.i = true;
        this.n = false;
        this.e = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f = str;
        } else {
            this.f = str + ".xml";
        }
    }

    public final int a() {
        int size;
        synchronized (this.b) {
            d();
            size = this.c.size();
        }
        return size;
    }

    public final ResolveInfo a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.b) {
            d();
            resolveInfo = ((uq) this.c.get(i)).a;
        }
        return resolveInfo;
    }

    public final int a(ResolveInfo resolveInfo) {
        synchronized (this.b) {
            d();
            List list = this.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((uq) list.get(i)).a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final Intent b(int i) {
        synchronized (this.b) {
        }
        return null;
    }

    public final ResolveInfo b() {
        synchronized (this.b) {
            d();
            if (this.c.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((uq) this.c.get(0)).a;
            return resolveInfo;
        }
    }

    public final int c() {
        int size;
        synchronized (this.b) {
            d();
            size = this.d.size();
        }
        return size;
    }

    final void d() {
        int i = 1;
        if (this.g && this.i && !TextUtils.isEmpty(this.f)) {
            this.g = false;
            this.h = true;
            f();
        } else {
            i = 0;
        }
        i |= 0;
        e();
        if (i != 0) {
            notifyChanged();
        }
    }

    final void e() {
        int size = this.d.size() - this.m;
        if (size > 0) {
            this.i = true;
            for (int i = 0; i < size; i++) {
                this.d.remove(0);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
        r9 = this;
        r8 = 1;
        r0 = r9.e;	 Catch:{ FileNotFoundException -> 0x00cb }
        r1 = r9.f;	 Catch:{ FileNotFoundException -> 0x00cb }
        r1 = r0.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x00cb }
        r2 = android.util.Xml.newPullParser();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r0 = "UTF-8";
        r2.setInput(r1, r0);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r0 = 0;
    L_0x0013:
        if (r0 == r8) goto L_0x001d;
    L_0x0015:
        r3 = 2;
        if (r0 == r3) goto L_0x001d;
    L_0x0018:
        r0 = r2.next();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        goto L_0x0013;
    L_0x001d:
        r0 = "historical-records";
        r3 = r2.getName();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r0 = r0.equals(r3);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        if (r0 != 0) goto L_0x004e;
    L_0x0029:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r2 = "Share records file does not start with historical-records tag.";
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
    L_0x0031:
        r0 = move-exception;
        r2 = a;	 Catch:{ all -> 0x00b8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b8 }
        r4 = "Error reading historical recrod file: ";
        r3.<init>(r4);	 Catch:{ all -> 0x00b8 }
        r4 = r9.f;	 Catch:{ all -> 0x00b8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00b8 }
        r3 = r3.toString();	 Catch:{ all -> 0x00b8 }
        android.util.Log.e(r2, r3, r0);	 Catch:{ all -> 0x00b8 }
        if (r1 == 0) goto L_0x004d;
    L_0x004a:
        r1.close();	 Catch:{ IOException -> 0x00c7 }
    L_0x004d:
        return;
    L_0x004e:
        r0 = r9.d;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r0.clear();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
    L_0x0053:
        r3 = r2.next();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        if (r3 == r8) goto L_0x00bf;
    L_0x0059:
        r4 = 3;
        if (r3 == r4) goto L_0x0053;
    L_0x005c:
        r4 = 4;
        if (r3 == r4) goto L_0x0053;
    L_0x005f:
        r3 = r2.getName();	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r4 = "historical-record";
        r3 = r4.equals(r3);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        if (r3 != 0) goto L_0x0092;
    L_0x006b:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r2 = "Share records file not well-formed.";
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        r2 = a;	 Catch:{ all -> 0x00b8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b8 }
        r4 = "Error reading historical recrod file: ";
        r3.<init>(r4);	 Catch:{ all -> 0x00b8 }
        r4 = r9.f;	 Catch:{ all -> 0x00b8 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00b8 }
        r3 = r3.toString();	 Catch:{ all -> 0x00b8 }
        android.util.Log.e(r2, r3, r0);	 Catch:{ all -> 0x00b8 }
        if (r1 == 0) goto L_0x004d;
    L_0x008c:
        r1.close();	 Catch:{ IOException -> 0x0090 }
        goto L_0x004d;
    L_0x0090:
        r0 = move-exception;
        goto L_0x004d;
    L_0x0092:
        r3 = 0;
        r4 = "activity";
        r3 = r2.getAttributeValue(r3, r4);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r4 = 0;
        r5 = "time";
        r4 = r2.getAttributeValue(r4, r5);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r6 = 0;
        r7 = "weight";
        r6 = r2.getAttributeValue(r6, r7);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r6 = java.lang.Float.parseFloat(r6);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r7 = new us;	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r7.<init>(r3, r4, r6);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        r0.add(r7);	 Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x0073 }
        goto L_0x0053;
    L_0x00b8:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00be;
    L_0x00bb:
        r1.close();	 Catch:{ IOException -> 0x00c9 }
    L_0x00be:
        throw r0;
    L_0x00bf:
        if (r1 == 0) goto L_0x004d;
    L_0x00c1:
        r1.close();	 Catch:{ IOException -> 0x00c5 }
        goto L_0x004d;
    L_0x00c5:
        r0 = move-exception;
        goto L_0x004d;
    L_0x00c7:
        r0 = move-exception;
        goto L_0x004d;
    L_0x00c9:
        r1 = move-exception;
        goto L_0x00be;
    L_0x00cb:
        r0 = move-exception;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: up.f():void");
    }
}
