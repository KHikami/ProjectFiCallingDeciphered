package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bfn */
public final class bfn {
    private static final Set g;
    private static final Map r;
    final int a;
    final boolean b;
    final boolean c;
    final boolean d;
    final String e;
    StringBuilder f;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private boolean q;

    static {
        g = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"vnd.android.cursor.item/nickname", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/relation"})));
        Map hashMap = new HashMap();
        r = hashMap;
        hashMap.put(Integer.valueOf(1), Integer.valueOf(0));
        r.put(Integer.valueOf(2), Integer.valueOf(1));
        r.put(Integer.valueOf(3), Integer.valueOf(2));
        r.put(Integer.valueOf(0), Integer.valueOf(3));
    }

    public bfn(int i, String str) {
        String str2;
        bfn bfn;
        boolean z = true;
        this.a = i;
        if (bfr.c(i)) {
            Log.w("vCard", "Should not use vCard 4.0 when building vCard. It is not officially published yet.");
        }
        boolean z2 = bfr.b(i) || bfr.c(i);
        this.h = z2;
        this.k = bfr.d(i);
        this.b = bfr.n(i);
        this.i = bfr.l(i);
        this.j = bfr.m(i);
        this.l = bfr.f(i);
        this.m = bfr.g(i);
        this.c = bfr.h(i);
        this.n = bfr.i(i);
        this.d = bfr.l(i);
        if (bfr.b(i) && "UTF-8".equalsIgnoreCase(str)) {
            z = false;
        }
        this.o = z;
        if (bfr.n(i)) {
            if ("SHIFT_JIS".equalsIgnoreCase(str)) {
                this.p = str;
            } else if (TextUtils.isEmpty(str)) {
                this.p = "SHIFT_JIS";
            } else {
                this.p = str;
            }
            str2 = "CHARSET=SHIFT_JIS";
            bfn = this;
        } else if (TextUtils.isEmpty(str)) {
            this.p = "UTF-8";
            str2 = "CHARSET=UTF-8";
            bfn = this;
        } else {
            this.p = str;
            String str3 = "CHARSET=";
            str2 = String.valueOf(str);
            if (str2.length() != 0) {
                str2 = str3.concat(str2);
                bfn = this;
            } else {
                str2 = new String(str3);
                bfn = this;
            }
        }
        bfn.e = str2;
        this.f = new StringBuilder();
        this.q = false;
        b("BEGIN", "VCARD");
        if (bfr.c(this.a)) {
            b("VERSION", "4.0");
        } else if (bfr.b(this.a)) {
            b("VERSION", "3.0");
        } else {
            if (!bfr.a(this.a)) {
                Log.w("vCard", "Unknown vCard version detected.");
            }
            b("VERSION", "2.1");
        }
    }

    private static boolean b(ContentValues contentValues) {
        return (TextUtils.isEmpty(contentValues.getAsString("data3")) && TextUtils.isEmpty(contentValues.getAsString("data5")) && TextUtils.isEmpty(contentValues.getAsString("data2")) && TextUtils.isEmpty(contentValues.getAsString("data4")) && TextUtils.isEmpty(contentValues.getAsString("data6")) && TextUtils.isEmpty(contentValues.getAsString("data9")) && TextUtils.isEmpty(contentValues.getAsString("data8")) && TextUtils.isEmpty(contentValues.getAsString("data7")) && TextUtils.isEmpty(contentValues.getAsString("data1"))) ? false : true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final android.content.ContentValues a(java.util.List r6) {
        /*
        r5 = this;
        r1 = 0;
        r3 = r6.iterator();
        r2 = r1;
    L_0x0006:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0053;
    L_0x000c:
        r0 = r3.next();
        r0 = (android.content.ContentValues) r0;
        if (r0 == 0) goto L_0x0006;
    L_0x0014:
        r4 = "is_super_primary";
        r4 = r0.getAsInteger(r4);
        if (r4 == 0) goto L_0x0027;
    L_0x001c:
        r4 = r4.intValue();
        if (r4 <= 0) goto L_0x0027;
    L_0x0022:
        if (r0 != 0) goto L_0x004f;
    L_0x0024:
        if (r1 == 0) goto L_0x0049;
    L_0x0026:
        return r1;
    L_0x0027:
        if (r2 != 0) goto L_0x0051;
    L_0x0029:
        r4 = "is_primary";
        r4 = r0.getAsInteger(r4);
        if (r4 == 0) goto L_0x003f;
    L_0x0031:
        r4 = r4.intValue();
        if (r4 <= 0) goto L_0x003f;
    L_0x0037:
        r4 = defpackage.bfn.b(r0);
        if (r4 == 0) goto L_0x003f;
    L_0x003d:
        r2 = r0;
        goto L_0x0006;
    L_0x003f:
        if (r1 != 0) goto L_0x0051;
    L_0x0041:
        r4 = defpackage.bfn.b(r0);
        if (r4 == 0) goto L_0x0051;
    L_0x0047:
        r1 = r0;
        goto L_0x0006;
    L_0x0049:
        r1 = new android.content.ContentValues;
        r1.<init>();
        goto L_0x0026;
    L_0x004f:
        r1 = r0;
        goto L_0x0026;
    L_0x0051:
        r0 = r1;
        goto L_0x0047;
    L_0x0053:
        r0 = r2;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfn.a(java.util.List):android.content.ContentValues");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bfn b(java.util.List r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r0.a;
        r1 = defpackage.bfr.c(r1);
        if (r1 == 0) goto L_0x01ff;
    L_0x000a:
        r0 = r19;
        r1 = r0.b;
        if (r1 != 0) goto L_0x0016;
    L_0x0010:
        r0 = r19;
        r1 = r0.d;
        if (r1 == 0) goto L_0x001d;
    L_0x0016:
        r1 = "vCard";
        r2 = "Invalid flag is used in vCard 4.0 construction. Ignored.";
        android.util.Log.w(r1, r2);
    L_0x001d:
        if (r20 == 0) goto L_0x0025;
    L_0x001f:
        r1 = r20.isEmpty();
        if (r1 == 0) goto L_0x002f;
    L_0x0025:
        r1 = "FN";
        r2 = "";
        r0 = r19;
        r0.b(r1, r2);
    L_0x002e:
        return r19;
    L_0x002f:
        r7 = r19.a(r20);
        r1 = "data3";
        r2 = r7.getAsString(r1);
        r1 = "data5";
        r3 = r7.getAsString(r1);
        r1 = "data2";
        r4 = r7.getAsString(r1);
        r1 = "data4";
        r5 = r7.getAsString(r1);
        r1 = "data6";
        r6 = r7.getAsString(r1);
        r1 = "data1";
        r1 = r7.getAsString(r1);
        r8 = android.text.TextUtils.isEmpty(r2);
        if (r8 == 0) goto L_0x0086;
    L_0x005d:
        r8 = android.text.TextUtils.isEmpty(r4);
        if (r8 == 0) goto L_0x0086;
    L_0x0063:
        r8 = android.text.TextUtils.isEmpty(r3);
        if (r8 == 0) goto L_0x0086;
    L_0x0069:
        r8 = android.text.TextUtils.isEmpty(r5);
        if (r8 == 0) goto L_0x0086;
    L_0x006f:
        r8 = android.text.TextUtils.isEmpty(r6);
        if (r8 == 0) goto L_0x0086;
    L_0x0075:
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 == 0) goto L_0x0085;
    L_0x007b:
        r1 = "FN";
        r2 = "";
        r0 = r19;
        r0.b(r1, r2);
        goto L_0x002e;
    L_0x0085:
        r2 = r1;
    L_0x0086:
        r8 = "data9";
        r8 = r7.getAsString(r8);
        r9 = "data8";
        r9 = r7.getAsString(r9);
        r10 = "data7";
        r10 = r7.getAsString(r10);
        r0 = r19;
        r11 = r0.b(r2);
        r0 = r19;
        r12 = r0.b(r4);
        r0 = r19;
        r13 = r0.b(r3);
        r0 = r19;
        r14 = r0.b(r5);
        r0 = r19;
        r15 = r0.b(r6);
        r0 = r19;
        r0 = r0.f;
        r16 = r0;
        r17 = "N";
        r16.append(r17);
        r16 = android.text.TextUtils.isEmpty(r8);
        if (r16 == 0) goto L_0x00d3;
    L_0x00c7:
        r16 = android.text.TextUtils.isEmpty(r9);
        if (r16 == 0) goto L_0x00d3;
    L_0x00cd:
        r16 = android.text.TextUtils.isEmpty(r10);
        if (r16 != 0) goto L_0x0150;
    L_0x00d3:
        r0 = r19;
        r0 = r0.f;
        r16 = r0;
        r17 = ";";
        r16.append(r17);
        r0 = r19;
        r8 = r0.b(r8);
        r8 = java.lang.String.valueOf(r8);
        r0 = r19;
        r10 = r0.b(r10);
        r10 = java.lang.String.valueOf(r10);
        r0 = r19;
        r9 = r0.b(r9);
        r9 = java.lang.String.valueOf(r9);
        r16 = new java.lang.StringBuilder;
        r17 = java.lang.String.valueOf(r8);
        r17 = r17.length();
        r17 = r17 + 2;
        r18 = java.lang.String.valueOf(r10);
        r18 = r18.length();
        r17 = r17 + r18;
        r18 = java.lang.String.valueOf(r9);
        r18 = r18.length();
        r17 = r17 + r18;
        r16.<init>(r17);
        r0 = r16;
        r8 = r0.append(r8);
        r16 = ";";
        r0 = r16;
        r8 = r8.append(r0);
        r8 = r8.append(r10);
        r10 = ";";
        r8 = r8.append(r10);
        r8 = r8.append(r9);
        r8 = r8.toString();
        r0 = r19;
        r9 = r0.f;
        r10 = "SORT-AS=";
        r9 = r9.append(r10);
        r8 = defpackage.bha.d(r8);
        r9.append(r8);
    L_0x0150:
        r0 = r19;
        r8 = r0.f;
        r9 = ":";
        r8.append(r9);
        r0 = r19;
        r8 = r0.f;
        r8.append(r11);
        r0 = r19;
        r8 = r0.f;
        r9 = ";";
        r8.append(r9);
        r0 = r19;
        r8 = r0.f;
        r8.append(r12);
        r0 = r19;
        r8 = r0.f;
        r9 = ";";
        r8.append(r9);
        r0 = r19;
        r8 = r0.f;
        r8.append(r13);
        r0 = r19;
        r8 = r0.f;
        r9 = ";";
        r8.append(r9);
        r0 = r19;
        r8 = r0.f;
        r8.append(r14);
        r0 = r19;
        r8 = r0.f;
        r9 = ";";
        r8.append(r9);
        r0 = r19;
        r8 = r0.f;
        r8.append(r15);
        r0 = r19;
        r8 = r0.f;
        r9 = "\r\n";
        r8.append(r9);
        r8 = android.text.TextUtils.isEmpty(r1);
        if (r8 == 0) goto L_0x01d6;
    L_0x01af:
        r1 = "vCard";
        r8 = "DISPLAY_NAME is empty.";
        android.util.Log.w(r1, r8);
        r0 = r19;
        r1 = r0.a;
        r1 = defpackage.bfr.e(r1);
        r1 = defpackage.bha.a(r1, r2, r3, r4, r5, r6);
        r0 = r19;
        r1 = r0.b(r1);
        r2 = "FN";
        r0 = r19;
        r0.b(r2, r1);
    L_0x01cf:
        r0 = r19;
        r0.a(r7);
        goto L_0x002e;
    L_0x01d6:
        r0 = r19;
        r1 = r0.b(r1);
        r0 = r19;
        r2 = r0.f;
        r3 = "FN";
        r2.append(r3);
        r0 = r19;
        r2 = r0.f;
        r3 = ":";
        r2.append(r3);
        r0 = r19;
        r2 = r0.f;
        r2.append(r1);
        r0 = r19;
        r1 = r0.f;
        r2 = "\r\n";
        r1.append(r2);
        goto L_0x01cf;
    L_0x01ff:
        if (r20 == 0) goto L_0x0207;
    L_0x0201:
        r1 = r20.isEmpty();
        if (r1 == 0) goto L_0x0236;
    L_0x0207:
        r0 = r19;
        r1 = r0.a;
        r1 = defpackage.bfr.b(r1);
        if (r1 == 0) goto L_0x0225;
    L_0x0211:
        r1 = "N";
        r2 = "";
        r0 = r19;
        r0.b(r1, r2);
        r1 = "FN";
        r2 = "";
        r0 = r19;
        r0.b(r1, r2);
        goto L_0x002e;
    L_0x0225:
        r0 = r19;
        r1 = r0.b;
        if (r1 == 0) goto L_0x002e;
    L_0x022b:
        r1 = "N";
        r2 = "";
        r0 = r19;
        r0.b(r1, r2);
        goto L_0x002e;
    L_0x0236:
        r11 = r19.a(r20);
        r1 = "data3";
        r2 = r11.getAsString(r1);
        r1 = "data5";
        r3 = r11.getAsString(r1);
        r1 = "data2";
        r4 = r11.getAsString(r1);
        r1 = "data4";
        r5 = r11.getAsString(r1);
        r1 = "data6";
        r6 = r11.getAsString(r1);
        r1 = "data1";
        r8 = r11.getAsString(r1);
        r1 = android.text.TextUtils.isEmpty(r2);
        if (r1 == 0) goto L_0x026a;
    L_0x0264:
        r1 = android.text.TextUtils.isEmpty(r4);
        if (r1 != 0) goto L_0x04a2;
    L_0x026a:
        r1 = 5;
        r1 = new java.lang.String[r1];
        r7 = 0;
        r1[r7] = r2;
        r7 = 1;
        r1[r7] = r4;
        r7 = 2;
        r1[r7] = r3;
        r7 = 3;
        r1[r7] = r5;
        r7 = 4;
        r1[r7] = r6;
        r0 = r19;
        r12 = r0.a(r1);
        r0 = r19;
        r1 = r0.c;
        if (r1 != 0) goto L_0x03e3;
    L_0x0288:
        r1 = 1;
        r1 = new java.lang.String[r1];
        r7 = 0;
        r1[r7] = r2;
        r1 = defpackage.bha.b(r1);
        if (r1 == 0) goto L_0x02c4;
    L_0x0294:
        r1 = 1;
        r1 = new java.lang.String[r1];
        r7 = 0;
        r1[r7] = r4;
        r1 = defpackage.bha.b(r1);
        if (r1 == 0) goto L_0x02c4;
    L_0x02a0:
        r1 = 1;
        r1 = new java.lang.String[r1];
        r7 = 0;
        r1[r7] = r3;
        r1 = defpackage.bha.b(r1);
        if (r1 == 0) goto L_0x02c4;
    L_0x02ac:
        r1 = 1;
        r1 = new java.lang.String[r1];
        r7 = 0;
        r1[r7] = r5;
        r1 = defpackage.bha.b(r1);
        if (r1 == 0) goto L_0x02c4;
    L_0x02b8:
        r1 = 1;
        r1 = new java.lang.String[r1];
        r7 = 0;
        r1[r7] = r6;
        r1 = defpackage.bha.b(r1);
        if (r1 != 0) goto L_0x03e3;
    L_0x02c4:
        r1 = 1;
        r7 = r1;
    L_0x02c6:
        r1 = android.text.TextUtils.isEmpty(r8);
        if (r1 != 0) goto L_0x03e7;
    L_0x02cc:
        r1 = r8;
    L_0x02cd:
        r8 = 1;
        r8 = new java.lang.String[r8];
        r9 = 0;
        r8[r9] = r1;
        r0 = r19;
        r13 = r0.a(r8);
        r0 = r19;
        r8 = r0.c;
        if (r8 != 0) goto L_0x03f5;
    L_0x02df:
        r8 = 1;
        r8 = new java.lang.String[r8];
        r9 = 0;
        r8[r9] = r1;
        r8 = defpackage.bha.b(r8);
        if (r8 != 0) goto L_0x03f5;
    L_0x02eb:
        r8 = 1;
        r10 = r8;
    L_0x02ed:
        if (r7 == 0) goto L_0x03f9;
    L_0x02ef:
        r0 = r19;
        r9 = r0.a(r2);
        r0 = r19;
        r8 = r0.a(r4);
        r0 = r19;
        r4 = r0.a(r3);
        r0 = r19;
        r3 = r0.a(r5);
        r0 = r19;
        r2 = r0.a(r6);
        r5 = r4;
        r6 = r8;
        r4 = r3;
        r8 = r9;
        r3 = r2;
    L_0x0312:
        if (r10 == 0) goto L_0x041e;
    L_0x0314:
        r0 = r19;
        r2 = r0.a(r1);
    L_0x031a:
        r0 = r19;
        r9 = r0.f;
        r14 = "N";
        r9.append(r14);
        r0 = r19;
        r9 = r0.b;
        if (r9 == 0) goto L_0x0426;
    L_0x0329:
        if (r12 == 0) goto L_0x033f;
    L_0x032b:
        r0 = r19;
        r3 = r0.f;
        r4 = ";";
        r3.append(r4);
        r0 = r19;
        r3 = r0.f;
        r0 = r19;
        r4 = r0.e;
        r3.append(r4);
    L_0x033f:
        if (r7 == 0) goto L_0x0353;
    L_0x0341:
        r0 = r19;
        r3 = r0.f;
        r4 = ";";
        r3.append(r4);
        r0 = r19;
        r3 = r0.f;
        r4 = "ENCODING=QUOTED-PRINTABLE";
        r3.append(r4);
    L_0x0353:
        r0 = r19;
        r3 = r0.f;
        r4 = ":";
        r3.append(r4);
        r0 = r19;
        r3 = r0.f;
        r3.append(r1);
        r0 = r19;
        r1 = r0.f;
        r3 = ";";
        r1.append(r3);
        r0 = r19;
        r1 = r0.f;
        r3 = ";";
        r1.append(r3);
        r0 = r19;
        r1 = r0.f;
        r3 = ";";
        r1.append(r3);
        r0 = r19;
        r1 = r0.f;
        r3 = ";";
        r1.append(r3);
    L_0x0387:
        r0 = r19;
        r1 = r0.f;
        r3 = "\r\n";
        r1.append(r3);
        r0 = r19;
        r1 = r0.f;
        r3 = "FN";
        r1.append(r3);
        if (r13 == 0) goto L_0x03af;
    L_0x039b:
        r0 = r19;
        r1 = r0.f;
        r3 = ";";
        r1.append(r3);
        r0 = r19;
        r1 = r0.f;
        r0 = r19;
        r3 = r0.e;
        r1.append(r3);
    L_0x03af:
        if (r10 == 0) goto L_0x03c3;
    L_0x03b1:
        r0 = r19;
        r1 = r0.f;
        r3 = ";";
        r1.append(r3);
        r0 = r19;
        r1 = r0.f;
        r3 = "ENCODING=QUOTED-PRINTABLE";
        r1.append(r3);
    L_0x03c3:
        r0 = r19;
        r1 = r0.f;
        r3 = ":";
        r1.append(r3);
        r0 = r19;
        r1 = r0.f;
        r1.append(r2);
        r0 = r19;
        r1 = r0.f;
        r2 = "\r\n";
        r1.append(r2);
    L_0x03dc:
        r0 = r19;
        r0.a(r11);
        goto L_0x002e;
    L_0x03e3:
        r1 = 0;
        r7 = r1;
        goto L_0x02c6;
    L_0x03e7:
        r0 = r19;
        r1 = r0.a;
        r1 = defpackage.bfr.e(r1);
        r1 = defpackage.bha.a(r1, r2, r3, r4, r5, r6);
        goto L_0x02cd;
    L_0x03f5:
        r8 = 0;
        r10 = r8;
        goto L_0x02ed;
    L_0x03f9:
        r0 = r19;
        r9 = r0.b(r2);
        r0 = r19;
        r8 = r0.b(r4);
        r0 = r19;
        r4 = r0.b(r3);
        r0 = r19;
        r3 = r0.b(r5);
        r0 = r19;
        r2 = r0.b(r6);
        r5 = r4;
        r6 = r8;
        r4 = r3;
        r8 = r9;
        r3 = r2;
        goto L_0x0312;
    L_0x041e:
        r0 = r19;
        r2 = r0.b(r1);
        goto L_0x031a;
    L_0x0426:
        if (r12 == 0) goto L_0x043c;
    L_0x0428:
        r0 = r19;
        r1 = r0.f;
        r9 = ";";
        r1.append(r9);
        r0 = r19;
        r1 = r0.f;
        r0 = r19;
        r9 = r0.e;
        r1.append(r9);
    L_0x043c:
        if (r7 == 0) goto L_0x0450;
    L_0x043e:
        r0 = r19;
        r1 = r0.f;
        r7 = ";";
        r1.append(r7);
        r0 = r19;
        r1 = r0.f;
        r7 = "ENCODING=QUOTED-PRINTABLE";
        r1.append(r7);
    L_0x0450:
        r0 = r19;
        r1 = r0.f;
        r7 = ":";
        r1.append(r7);
        r0 = r19;
        r1 = r0.f;
        r1.append(r8);
        r0 = r19;
        r1 = r0.f;
        r7 = ";";
        r1.append(r7);
        r0 = r19;
        r1 = r0.f;
        r1.append(r6);
        r0 = r19;
        r1 = r0.f;
        r6 = ";";
        r1.append(r6);
        r0 = r19;
        r1 = r0.f;
        r1.append(r5);
        r0 = r19;
        r1 = r0.f;
        r5 = ";";
        r1.append(r5);
        r0 = r19;
        r1 = r0.f;
        r1.append(r4);
        r0 = r19;
        r1 = r0.f;
        r4 = ";";
        r1.append(r4);
        r0 = r19;
        r1 = r0.f;
        r1.append(r3);
        goto L_0x0387;
    L_0x04a2:
        r1 = android.text.TextUtils.isEmpty(r8);
        if (r1 != 0) goto L_0x04ee;
    L_0x04a8:
        r1 = "N";
        r0 = r19;
        r0.a(r1, r8);
        r0 = r19;
        r1 = r0.f;
        r2 = ";";
        r1.append(r2);
        r0 = r19;
        r1 = r0.f;
        r2 = ";";
        r1.append(r2);
        r0 = r19;
        r1 = r0.f;
        r2 = ";";
        r1.append(r2);
        r0 = r19;
        r1 = r0.f;
        r2 = ";";
        r1.append(r2);
        r0 = r19;
        r1 = r0.f;
        r2 = "\r\n";
        r1.append(r2);
        r1 = "FN";
        r0 = r19;
        r0.a(r1, r8);
        r0 = r19;
        r1 = r0.f;
        r2 = "\r\n";
        r1.append(r2);
        goto L_0x03dc;
    L_0x04ee:
        r0 = r19;
        r1 = r0.a;
        r1 = defpackage.bfr.b(r1);
        if (r1 == 0) goto L_0x050c;
    L_0x04f8:
        r1 = "N";
        r2 = "";
        r0 = r19;
        r0.b(r1, r2);
        r1 = "FN";
        r2 = "";
        r0 = r19;
        r0.b(r1, r2);
        goto L_0x03dc;
    L_0x050c:
        r0 = r19;
        r1 = r0.b;
        if (r1 == 0) goto L_0x03dc;
    L_0x0512:
        r1 = "N";
        r2 = "";
        r0 = r19;
        r0.b(r1, r2);
        goto L_0x03dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfn.b(java.util.List):bfn");
    }

    final void a(String str, String str2) {
        int i;
        String a;
        if (!this.c) {
            if (!bha.b(str2)) {
                i = 1;
                if (i == 0) {
                    a = a(str2);
                } else {
                    a = b(str2);
                }
                this.f.append(str);
                if (a(str2)) {
                    this.f.append(";");
                    this.f.append(this.e);
                }
                if (i != 0) {
                    this.f.append(";");
                    this.f.append("ENCODING=QUOTED-PRINTABLE");
                }
                this.f.append(":");
                this.f.append(a);
            }
        }
        i = 0;
        if (i == 0) {
            a = b(str2);
        } else {
            a = a(str2);
        }
        this.f.append(str);
        if (a(str2)) {
            this.f.append(";");
            this.f.append(this.e);
        }
        if (i != 0) {
            this.f.append(";");
            this.f.append("ENCODING=QUOTED-PRINTABLE");
        }
        this.f.append(":");
        this.f.append(a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void a(android.content.ContentValues r12) {
        /*
        r11 = this;
        r10 = 32;
        r7 = 1;
        r6 = 0;
        r0 = "data9";
        r2 = r12.getAsString(r0);
        r0 = "data8";
        r1 = r12.getAsString(r0);
        r0 = "data7";
        r0 = r12.getAsString(r0);
        r3 = r11.d;
        if (r3 == 0) goto L_0x0026;
    L_0x001a:
        r2 = defpackage.bha.e(r2);
        r1 = defpackage.bha.e(r1);
        r0 = defpackage.bha.e(r0);
    L_0x0026:
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 == 0) goto L_0x007c;
    L_0x002c:
        r3 = android.text.TextUtils.isEmpty(r1);
        if (r3 == 0) goto L_0x007c;
    L_0x0032:
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 == 0) goto L_0x007c;
    L_0x0038:
        r0 = r11.b;
        if (r0 == 0) goto L_0x007b;
    L_0x003c:
        r0 = r11.f;
        r1 = "SOUND";
        r0.append(r1);
        r0 = r11.f;
        r1 = ";";
        r0.append(r1);
        r0 = r11.f;
        r1 = "X-IRMC-N";
        r0.append(r1);
        r0 = r11.f;
        r1 = ":";
        r0.append(r1);
        r0 = r11.f;
        r1 = ";";
        r0.append(r1);
        r0 = r11.f;
        r1 = ";";
        r0.append(r1);
        r0 = r11.f;
        r1 = ";";
        r0.append(r1);
        r0 = r11.f;
        r1 = ";";
        r0.append(r1);
        r0 = r11.f;
        r1 = "\r\n";
        r0.append(r1);
    L_0x007b:
        return;
    L_0x007c:
        r3 = r11.a;
        r3 = defpackage.bfr.c(r3);
        if (r3 != 0) goto L_0x00d0;
    L_0x0084:
        r3 = r11.a;
        r3 = defpackage.bfr.b(r3);
        if (r3 == 0) goto L_0x01ed;
    L_0x008c:
        r3 = r11.a;
        r3 = defpackage.bha.a(r3, r2, r1, r0);
        r4 = r11.f;
        r5 = "SORT-STRING";
        r4.append(r5);
        r4 = r11.a;
        r4 = defpackage.bfr.b(r4);
        if (r4 == 0) goto L_0x00b9;
    L_0x00a1:
        r4 = new java.lang.String[r7];
        r4[r6] = r3;
        r4 = r11.a(r4);
        if (r4 == 0) goto L_0x00b9;
    L_0x00ab:
        r4 = r11.f;
        r5 = ";";
        r4.append(r5);
        r4 = r11.f;
        r5 = r11.e;
        r4.append(r5);
    L_0x00b9:
        r4 = r11.f;
        r5 = ":";
        r4.append(r5);
        r4 = r11.f;
        r3 = r11.b(r3);
        r4.append(r3);
        r3 = r11.f;
        r4 = "\r\n";
        r3.append(r4);
    L_0x00d0:
        r3 = r11.m;
        if (r3 == 0) goto L_0x007b;
    L_0x00d4:
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 != 0) goto L_0x0131;
    L_0x00da:
        r3 = r11.k;
        if (r3 == 0) goto L_0x02c4;
    L_0x00de:
        r3 = new java.lang.String[r7];
        r3[r6] = r0;
        r3 = defpackage.bha.b(r3);
        if (r3 != 0) goto L_0x02c4;
    L_0x00e8:
        r4 = r7;
    L_0x00e9:
        if (r4 == 0) goto L_0x02c7;
    L_0x00eb:
        r3 = r11.a(r0);
    L_0x00ef:
        r5 = r11.f;
        r8 = "X-PHONETIC-FIRST-NAME";
        r5.append(r8);
        r5 = new java.lang.String[r7];
        r5[r6] = r0;
        r0 = r11.a(r5);
        if (r0 == 0) goto L_0x010e;
    L_0x0100:
        r0 = r11.f;
        r5 = ";";
        r0.append(r5);
        r0 = r11.f;
        r5 = r11.e;
        r0.append(r5);
    L_0x010e:
        if (r4 == 0) goto L_0x011e;
    L_0x0110:
        r0 = r11.f;
        r4 = ";";
        r0.append(r4);
        r0 = r11.f;
        r4 = "ENCODING=QUOTED-PRINTABLE";
        r0.append(r4);
    L_0x011e:
        r0 = r11.f;
        r4 = ":";
        r0.append(r4);
        r0 = r11.f;
        r0.append(r3);
        r0 = r11.f;
        r3 = "\r\n";
        r0.append(r3);
    L_0x0131:
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x018e;
    L_0x0137:
        r0 = r11.k;
        if (r0 == 0) goto L_0x02cd;
    L_0x013b:
        r0 = new java.lang.String[r7];
        r0[r6] = r1;
        r0 = defpackage.bha.b(r0);
        if (r0 != 0) goto L_0x02cd;
    L_0x0145:
        r3 = r7;
    L_0x0146:
        if (r3 == 0) goto L_0x02d0;
    L_0x0148:
        r0 = r11.a(r1);
    L_0x014c:
        r4 = r11.f;
        r5 = "X-PHONETIC-MIDDLE-NAME";
        r4.append(r5);
        r4 = new java.lang.String[r7];
        r4[r6] = r1;
        r1 = r11.a(r4);
        if (r1 == 0) goto L_0x016b;
    L_0x015d:
        r1 = r11.f;
        r4 = ";";
        r1.append(r4);
        r1 = r11.f;
        r4 = r11.e;
        r1.append(r4);
    L_0x016b:
        if (r3 == 0) goto L_0x017b;
    L_0x016d:
        r1 = r11.f;
        r3 = ";";
        r1.append(r3);
        r1 = r11.f;
        r3 = "ENCODING=QUOTED-PRINTABLE";
        r1.append(r3);
    L_0x017b:
        r1 = r11.f;
        r3 = ":";
        r1.append(r3);
        r1 = r11.f;
        r1.append(r0);
        r0 = r11.f;
        r1 = "\r\n";
        r0.append(r1);
    L_0x018e:
        r0 = android.text.TextUtils.isEmpty(r2);
        if (r0 != 0) goto L_0x007b;
    L_0x0194:
        r0 = r11.k;
        if (r0 == 0) goto L_0x02d6;
    L_0x0198:
        r0 = new java.lang.String[r7];
        r0[r6] = r2;
        r0 = defpackage.bha.b(r0);
        if (r0 != 0) goto L_0x02d6;
    L_0x01a2:
        r1 = r7;
    L_0x01a3:
        if (r1 == 0) goto L_0x02d9;
    L_0x01a5:
        r0 = r11.a(r2);
    L_0x01a9:
        r3 = r11.f;
        r4 = "X-PHONETIC-LAST-NAME";
        r3.append(r4);
        r3 = new java.lang.String[r7];
        r3[r6] = r2;
        r2 = r11.a(r3);
        if (r2 == 0) goto L_0x01c8;
    L_0x01ba:
        r2 = r11.f;
        r3 = ";";
        r2.append(r3);
        r2 = r11.f;
        r3 = r11.e;
        r2.append(r3);
    L_0x01c8:
        if (r1 == 0) goto L_0x01d8;
    L_0x01ca:
        r1 = r11.f;
        r2 = ";";
        r1.append(r2);
        r1 = r11.f;
        r2 = "ENCODING=QUOTED-PRINTABLE";
        r1.append(r2);
    L_0x01d8:
        r1 = r11.f;
        r2 = ":";
        r1.append(r2);
        r1 = r11.f;
        r1.append(r0);
        r0 = r11.f;
        r1 = "\r\n";
        r0.append(r1);
        goto L_0x007b;
    L_0x01ed:
        r3 = r11.i;
        if (r3 == 0) goto L_0x00d0;
    L_0x01f1:
        r3 = r11.f;
        r4 = "SOUND";
        r3.append(r4);
        r3 = r11.f;
        r4 = ";";
        r3.append(r4);
        r3 = r11.f;
        r4 = "X-IRMC-N";
        r3.append(r4);
        r3 = r11.c;
        if (r3 != 0) goto L_0x02ad;
    L_0x020a:
        r3 = new java.lang.String[r7];
        r3[r6] = r2;
        r3 = defpackage.bha.b(r3);
        if (r3 == 0) goto L_0x0228;
    L_0x0214:
        r3 = new java.lang.String[r7];
        r3[r6] = r1;
        r3 = defpackage.bha.b(r3);
        if (r3 == 0) goto L_0x0228;
    L_0x021e:
        r3 = new java.lang.String[r7];
        r3[r6] = r0;
        r3 = defpackage.bha.b(r3);
        if (r3 != 0) goto L_0x02ad;
    L_0x0228:
        r3 = r7;
    L_0x0229:
        if (r3 == 0) goto L_0x02b0;
    L_0x022b:
        r5 = r11.a(r2);
        r4 = r11.a(r1);
        r3 = r11.a(r0);
    L_0x0237:
        r8 = 3;
        r8 = new java.lang.String[r8];
        r8[r6] = r5;
        r8[r7] = r4;
        r9 = 2;
        r8[r9] = r3;
        r8 = r11.a(r8);
        if (r8 == 0) goto L_0x0255;
    L_0x0247:
        r8 = r11.f;
        r9 = ";";
        r8.append(r9);
        r8 = r11.f;
        r9 = r11.e;
        r8.append(r9);
    L_0x0255:
        r8 = r11.f;
        r9 = ":";
        r8.append(r9);
        r8 = android.text.TextUtils.isEmpty(r5);
        if (r8 != 0) goto L_0x02df;
    L_0x0262:
        r8 = r11.f;
        r8.append(r5);
        r5 = r6;
    L_0x0268:
        r8 = android.text.TextUtils.isEmpty(r4);
        if (r8 != 0) goto L_0x0276;
    L_0x026e:
        if (r5 == 0) goto L_0x02be;
    L_0x0270:
        r5 = r6;
    L_0x0271:
        r8 = r11.f;
        r8.append(r4);
    L_0x0276:
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 != 0) goto L_0x0288;
    L_0x027c:
        if (r5 != 0) goto L_0x0283;
    L_0x027e:
        r4 = r11.f;
        r4.append(r10);
    L_0x0283:
        r4 = r11.f;
        r4.append(r3);
    L_0x0288:
        r3 = r11.f;
        r4 = ";";
        r3.append(r4);
        r3 = r11.f;
        r4 = ";";
        r3.append(r4);
        r3 = r11.f;
        r4 = ";";
        r3.append(r4);
        r3 = r11.f;
        r4 = ";";
        r3.append(r4);
        r3 = r11.f;
        r4 = "\r\n";
        r3.append(r4);
        goto L_0x00d0;
    L_0x02ad:
        r3 = r6;
        goto L_0x0229;
    L_0x02b0:
        r5 = r11.b(r2);
        r4 = r11.b(r1);
        r3 = r11.b(r0);
        goto L_0x0237;
    L_0x02be:
        r8 = r11.f;
        r8.append(r10);
        goto L_0x0271;
    L_0x02c4:
        r4 = r6;
        goto L_0x00e9;
    L_0x02c7:
        r3 = r11.b(r0);
        goto L_0x00ef;
    L_0x02cd:
        r3 = r6;
        goto L_0x0146;
    L_0x02d0:
        r0 = r11.b(r1);
        goto L_0x014c;
    L_0x02d6:
        r1 = r6;
        goto L_0x01a3;
    L_0x02d9:
        r0 = r11.b(r2);
        goto L_0x01a9;
    L_0x02df:
        r5 = r7;
        goto L_0x0268;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfn.a(android.content.ContentValues):void");
    }

    public final bfn c(List list) {
        if (this.h) {
            Object obj = null;
        } else {
            if (this.l) {
                int i = 1;
            }
            return this;
        }
        if (list != null) {
            for (ContentValues contentValues : list) {
                Object asString = contentValues.getAsString("data1");
                if (!TextUtils.isEmpty(asString)) {
                    if (obj != null) {
                        a("vnd.android.cursor.item/nickname", contentValues);
                    } else {
                        a("NICKNAME", null, asString);
                    }
                }
            }
        }
        return this;
    }

    public final bfn a(List list, i iVar) {
        Object obj;
        if (list != null) {
            Set hashSet = new HashSet();
            obj = null;
            for (ContentValues contentValues : list) {
                String trim;
                Integer asInteger = contentValues.getAsInteger("data2");
                String asString = contentValues.getAsString("data3");
                Integer asInteger2 = contentValues.getAsInteger("is_primary");
                boolean z = asInteger2 != null ? asInteger2.intValue() > 0 : false;
                String asString2 = contentValues.getAsString("data1");
                if (asString2 != null) {
                    trim = asString2.trim();
                } else {
                    trim = asString2;
                }
                if (!TextUtils.isEmpty(trim)) {
                    int intValue;
                    Object obj2;
                    if (asInteger != null) {
                        intValue = asInteger.intValue();
                    } else {
                        intValue = 1;
                    }
                    if (iVar != null) {
                        asString2 = iVar.b();
                        if (hashSet.contains(asString2)) {
                            obj2 = obj;
                        } else {
                            hashSet.add(asString2);
                            a(Integer.valueOf(intValue), asString, asString2, z);
                        }
                    } else if (intValue == 6 || bfr.k(this.a)) {
                        obj2 = 1;
                        if (!hashSet.contains(trim)) {
                            hashSet.add(trim);
                            a(Integer.valueOf(intValue), asString, trim, z);
                            obj = 1;
                        }
                    } else {
                        List<String> c = bfn.c(trim);
                        if (!c.isEmpty()) {
                            for (String asString22 : c) {
                                if (!hashSet.contains(asString22)) {
                                    String replace = asString22.replace(',', 'p').replace(';', 'w');
                                    if (TextUtils.equals(replace, asString22)) {
                                        StringBuilder stringBuilder = new StringBuilder();
                                        int length = asString22.length();
                                        for (int i = 0; i < length; i++) {
                                            char charAt = asString22.charAt(i);
                                            if (Character.isDigit(charAt) || charAt == '+') {
                                                stringBuilder.append(charAt);
                                            }
                                        }
                                        replace = buf.c(stringBuilder.toString(), bha.a(this.a));
                                    }
                                    if (!(!bfr.c(this.a) || TextUtils.isEmpty(replace) || replace.startsWith("tel:"))) {
                                        String str = "tel:";
                                        replace = String.valueOf(replace);
                                        if (replace.length() != 0) {
                                            replace = str.concat(replace);
                                        } else {
                                            replace = new String(str);
                                        }
                                    }
                                    hashSet.add(asString22);
                                    a(Integer.valueOf(intValue), asString, replace, z);
                                }
                            }
                            obj2 = 1;
                        }
                    }
                    obj = obj2;
                }
            }
        } else {
            obj = null;
        }
        if (obj == null && this.b) {
            a(Integer.valueOf(1), "", "", false);
        }
        return this;
    }

    private static List c(String str) {
        List arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        StringBuilder stringBuilder2 = stringBuilder;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\n' || stringBuilder2.length() <= 0) {
                stringBuilder2.append(charAt);
            } else {
                arrayList.add(stringBuilder2.toString());
                stringBuilder2 = new StringBuilder();
            }
        }
        if (stringBuilder2.length() > 0) {
            arrayList.add(stringBuilder2.toString());
        }
        return arrayList;
    }

    public final bfn d(List list) {
        boolean z;
        if (list != null) {
            Set hashSet = new HashSet();
            z = false;
            for (ContentValues contentValues : list) {
                String asString = contentValues.getAsString("data1");
                if (asString != null) {
                    asString = asString.trim();
                }
                if (!TextUtils.isEmpty(asString)) {
                    Integer asInteger = contentValues.getAsInteger("data2");
                    int intValue = asInteger != null ? asInteger.intValue() : 3;
                    String asString2 = contentValues.getAsString("data3");
                    Integer asInteger2 = contentValues.getAsInteger("is_primary");
                    boolean z2 = asInteger2 != null ? asInteger2.intValue() > 0 : false;
                    if (!hashSet.contains(asString)) {
                        hashSet.add(asString);
                        a(intValue, asString2, asString, z2);
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!z && this.b) {
            a(1, "", "", false);
        }
        return this;
    }

    public final bfn e(List list) {
        if (list == null || list.isEmpty()) {
            if (this.b) {
                this.f.append("ADR");
                this.f.append(";");
                this.f.append("HOME");
                this.f.append(":");
                this.f.append("\r\n");
            }
        } else if (this.b) {
            int intValue;
            ContentValues contentValues;
            ContentValues contentValues2 = null;
            int i = Integer.MAX_VALUE;
            r7 = Integer.MAX_VALUE;
            for (ContentValues contentValues3 : list) {
                ContentValues contentValues32;
                if (contentValues32 != null) {
                    int i2;
                    Integer asInteger = contentValues32.getAsInteger("data2");
                    r1 = (Integer) r.get(asInteger);
                    int intValue2 = r1 != null ? r1.intValue() : Integer.MAX_VALUE;
                    if (intValue2 < r7) {
                        intValue = asInteger.intValue();
                        if (intValue2 == 0) {
                            contentValues = contentValues32;
                            break;
                        }
                        i2 = intValue2;
                    } else {
                        contentValues32 = contentValues2;
                        intValue = i;
                        i2 = r7;
                    }
                    i = intValue;
                    r7 = i2;
                    contentValues2 = contentValues32;
                }
            }
            intValue = i;
            contentValues = contentValues2;
            if (contentValues == null) {
                Log.w("vCard", "Should not come here. Must have at least one postal data.");
            } else {
                a(intValue, contentValues.getAsString("data3"), contentValues, false, true);
            }
        } else {
            for (ContentValues contentValues4 : list) {
                if (contentValues4 != null) {
                    r1 = contentValues4.getAsInteger("data2");
                    r7 = r1 != null ? r1.intValue() : 1;
                    String asString = contentValues4.getAsString("data3");
                    r1 = contentValues4.getAsInteger("is_primary");
                    boolean z = r1 != null ? r1.intValue() > 0 : false;
                    a(r7, asString, contentValues4, z, false);
                }
            }
        }
        return this;
    }

    public final bfn f(List list) {
        if (list != null) {
            for (ContentValues contentValues : list) {
                Integer asInteger = contentValues.getAsInteger("data5");
                if (asInteger != null) {
                    String str = (String) bha.c.get(Integer.valueOf(asInteger.intValue()));
                    if (str != null) {
                        Object asString = contentValues.getAsString("data1");
                        if (asString != null) {
                            asString = asString.trim();
                        }
                        if (!TextUtils.isEmpty(asString)) {
                            int intValue;
                            CharSequence charSequence;
                            Integer asInteger2 = contentValues.getAsInteger("data2");
                            if (asInteger2 != null) {
                                intValue = asInteger2.intValue();
                            } else {
                                intValue = 3;
                            }
                            switch (intValue) {
                                case rl.c /*0*/:
                                    String asString2 = contentValues.getAsString("data3");
                                    if (asString2 == null) {
                                        charSequence = null;
                                        break;
                                    }
                                    String str2 = "X-";
                                    asString2 = String.valueOf(asString2);
                                    if (asString2.length() == 0) {
                                        charSequence = new String(str2);
                                        break;
                                    }
                                    charSequence = str2.concat(asString2);
                                    break;
                                case rq.b /*1*/:
                                    charSequence = "HOME";
                                    break;
                                case rq.c /*2*/:
                                    charSequence = "WORK";
                                    break;
                                default:
                                    charSequence = null;
                                    break;
                            }
                            List arrayList = new ArrayList();
                            if (!TextUtils.isEmpty(charSequence)) {
                                arrayList.add(charSequence);
                            }
                            Integer asInteger3 = contentValues.getAsInteger("is_primary");
                            Object obj = asInteger3 != null ? asInteger3.intValue() > 0 ? 1 : null : null;
                            if (obj != null) {
                                arrayList.add("PREF");
                            }
                            a(str, arrayList, asString);
                        }
                    }
                }
            }
        }
        return this;
    }

    public final bfn g(List list) {
        if (list != null) {
            for (ContentValues asString : list) {
                Object asString2 = asString.getAsString("data1");
                if (asString2 != null) {
                    asString2 = asString2.trim();
                }
                if (!TextUtils.isEmpty(asString2)) {
                    a("URL", null, asString2);
                }
            }
        }
        return this;
    }

    public final bfn h(List list) {
        if (list != null) {
            for (ContentValues contentValues : list) {
                String str;
                boolean z;
                Object asString = contentValues.getAsString("data1");
                if (asString != null) {
                    asString = asString.trim();
                }
                Object asString2 = contentValues.getAsString("data5");
                if (asString2 != null) {
                    asString2 = asString2.trim();
                }
                String asString3 = contentValues.getAsString("data4");
                if (asString3 != null) {
                    asString3 = asString3.trim();
                }
                StringBuilder stringBuilder = new StringBuilder();
                if (!TextUtils.isEmpty(asString)) {
                    stringBuilder.append(asString);
                }
                if (!TextUtils.isEmpty(asString2)) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(';');
                    }
                    stringBuilder.append(asString2);
                }
                String str2 = "ORG";
                boolean z2 = !bha.a(stringBuilder.toString());
                if (this.k) {
                    if (!bha.b(str)) {
                        z = true;
                        a(str2, str, z2, z);
                        if (!TextUtils.isEmpty(asString3)) {
                            str = "TITLE";
                            if (bha.a(asString3)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (this.k) {
                                if (!bha.b(asString3)) {
                                    z = true;
                                    a(str, asString3, z2, z);
                                }
                            }
                            z = false;
                            a(str, asString3, z2, z);
                        }
                    }
                }
                z = false;
                a(str2, str, z2, z);
                if (!TextUtils.isEmpty(asString3)) {
                    str = "TITLE";
                    if (bha.a(asString3)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (this.k) {
                        if (bha.b(asString3)) {
                            z = true;
                            a(str, asString3, z2, z);
                        }
                    }
                    z = false;
                    a(str, asString3, z2, z);
                }
            }
        }
        return this;
    }

    public final bfn i(List list) {
        if (list != null) {
            for (ContentValues contentValues : list) {
                if (contentValues != null) {
                    byte[] asByteArray = contentValues.getAsByteArray("data15");
                    if (asByteArray != null) {
                        String a = bha.a(asByteArray);
                        if (a != null) {
                            Object str = new String(Base64.encode(asByteArray, 2));
                            if (!TextUtils.isEmpty(str)) {
                                c(str, a);
                            }
                        }
                    }
                }
            }
        }
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bfn j(java.util.List r8) {
        /*
        r7 = this;
        r2 = 1;
        r3 = 0;
        if (r8 == 0) goto L_0x005f;
    L_0x0004:
        r0 = r7.j;
        if (r0 == 0) goto L_0x0064;
    L_0x0008:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = r8.iterator();
        r1 = r2;
    L_0x0012:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x003d;
    L_0x0018:
        r0 = r5.next();
        r0 = (android.content.ContentValues) r0;
        r6 = "data1";
        r0 = r0.getAsString(r6);
        if (r0 != 0) goto L_0x0028;
    L_0x0026:
        r0 = "";
    L_0x0028:
        r6 = r0.length();
        if (r6 <= 0) goto L_0x0034;
    L_0x002e:
        if (r1 == 0) goto L_0x0037;
    L_0x0030:
        r1 = r3;
    L_0x0031:
        r4.append(r0);
    L_0x0034:
        r0 = r1;
        r1 = r0;
        goto L_0x0012;
    L_0x0037:
        r6 = 10;
        r4.append(r6);
        goto L_0x0031;
    L_0x003d:
        r1 = r4.toString();
        r0 = new java.lang.String[r2];
        r0[r3] = r1;
        r0 = defpackage.bha.a(r0);
        if (r0 != 0) goto L_0x0060;
    L_0x004b:
        r0 = r2;
    L_0x004c:
        r4 = r7.k;
        if (r4 == 0) goto L_0x0062;
    L_0x0050:
        r4 = new java.lang.String[r2];
        r4[r3] = r1;
        r4 = defpackage.bha.b(r4);
        if (r4 != 0) goto L_0x0062;
    L_0x005a:
        r3 = "NOTE";
        r7.a(r3, r1, r0, r2);
    L_0x005f:
        return r7;
    L_0x0060:
        r0 = r3;
        goto L_0x004c;
    L_0x0062:
        r2 = r3;
        goto L_0x005a;
    L_0x0064:
        r4 = r8.iterator();
    L_0x0068:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x005f;
    L_0x006e:
        r0 = r4.next();
        r0 = (android.content.ContentValues) r0;
        r1 = "data1";
        r5 = r0.getAsString(r1);
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 != 0) goto L_0x0068;
    L_0x0080:
        r0 = new java.lang.String[r2];
        r0[r3] = r5;
        r0 = defpackage.bha.a(r0);
        if (r0 != 0) goto L_0x00a0;
    L_0x008a:
        r0 = r2;
    L_0x008b:
        r1 = r7.k;
        if (r1 == 0) goto L_0x00a2;
    L_0x008f:
        r1 = new java.lang.String[r2];
        r1[r3] = r5;
        r1 = defpackage.bha.b(r1);
        if (r1 != 0) goto L_0x00a2;
    L_0x0099:
        r1 = r2;
    L_0x009a:
        r6 = "NOTE";
        r7.a(r6, r5, r0, r1);
        goto L_0x0068;
    L_0x00a0:
        r0 = r3;
        goto L_0x008b;
    L_0x00a2:
        r1 = r3;
        goto L_0x009a;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfn.j(java.util.List):bfn");
    }

    public final bfn k(List list) {
        if (list != null) {
            String asString;
            String str = null;
            List list2 = null;
            for (ContentValues contentValues : list) {
                if (contentValues != null) {
                    int intValue;
                    String str2;
                    Integer asInteger = contentValues.getAsInteger("data2");
                    if (asInteger != null) {
                        intValue = asInteger.intValue();
                    } else {
                        intValue = 2;
                    }
                    Object obj;
                    if (intValue == 3) {
                        asString = contentValues.getAsString("data1");
                        if (asString != null) {
                            Integer asInteger2 = contentValues.getAsInteger("is_super_primary");
                            Object obj2 = asInteger2 != null ? asInteger2.intValue() > 0 ? 1 : null : null;
                            if (obj2 != null) {
                                break;
                            }
                            Integer asInteger3 = contentValues.getAsInteger("is_primary");
                            obj = asInteger3 != null ? asInteger3.intValue() > 0 ? 1 : null : null;
                            if (obj != null) {
                                str2 = asString;
                            } else {
                                if (str == null) {
                                    str2 = asString;
                                } else {
                                    str2 = str;
                                }
                                str = str2;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (this.l) {
                            a("vnd.android.cursor.item/contact_event", contentValues);
                        }
                        obj = list2;
                    }
                    list2 = str2;
                }
            }
            Object obj3 = list2;
            if (asString != null) {
                a("BDAY", null, asString.trim());
            } else if (str != null) {
                a("BDAY", null, str.trim());
            }
        }
        return this;
    }

    public final bfn l(List list) {
        if (this.l && list != null) {
            for (ContentValues contentValues : list) {
                if (contentValues != null) {
                    a("vnd.android.cursor.item/relation", contentValues);
                }
            }
        }
        return this;
    }

    private void a(int i, String str, String str2, boolean z) {
        CharSequence charSequence = null;
        switch (i) {
            case rl.c /*0*/:
                if (!bha.a(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        if (bha.c(str)) {
                            String str3 = "X-";
                            String valueOf = String.valueOf(str);
                            if (valueOf.length() == 0) {
                                charSequence = new String(str3);
                                break;
                            } else {
                                charSequence = str3.concat(valueOf);
                                break;
                            }
                        }
                    }
                }
                charSequence = "CELL";
                break;
                break;
            case rq.b /*1*/:
                charSequence = "HOME";
                break;
            case rq.c /*2*/:
                charSequence = "WORK";
                break;
            case rl.e /*3*/:
                break;
            case rl.f /*4*/:
                charSequence = "CELL";
                break;
            default:
                Log.e("vCard", "Unknown Email type: " + i);
                break;
        }
        List arrayList = new ArrayList();
        if (z) {
            arrayList.add("PREF");
        }
        if (!TextUtils.isEmpty(charSequence)) {
            arrayList.add(charSequence);
        }
        a("EMAIL", arrayList, str2);
    }

    private void a(Integer num, String str, String str2, boolean z) {
        int i;
        this.f.append("TEL");
        this.f.append(";");
        if (num == null) {
            i = 7;
        } else {
            i = num.intValue();
        }
        ArrayList arrayList = new ArrayList();
        switch (i) {
            case rl.c /*0*/:
                if (!TextUtils.isEmpty(str)) {
                    if (!bha.a(str)) {
                        if (!this.h) {
                            String toUpperCase = str.toUpperCase();
                            if (!bha.b.contains(toUpperCase)) {
                                if (bha.c(str)) {
                                    toUpperCase = "X-";
                                    String valueOf = String.valueOf(str);
                                    arrayList.add(valueOf.length() != 0 ? toUpperCase.concat(valueOf) : new String(toUpperCase));
                                    break;
                                }
                            }
                            arrayList.add(toUpperCase);
                            break;
                        }
                        arrayList.add(str);
                        break;
                    }
                    arrayList.add("CELL");
                    break;
                }
                arrayList.add("VOICE");
                break;
                break;
            case rq.b /*1*/:
                arrayList.addAll(Arrays.asList(new String[]{"HOME"}));
                break;
            case rq.c /*2*/:
                arrayList.add("CELL");
                break;
            case rl.e /*3*/:
                arrayList.addAll(Arrays.asList(new String[]{"WORK"}));
                break;
            case rl.f /*4*/:
                arrayList.addAll(Arrays.asList(new String[]{"WORK", "FAX"}));
                break;
            case rl.g /*5*/:
                arrayList.addAll(Arrays.asList(new String[]{"HOME", "FAX"}));
                break;
            case rl.i /*6*/:
                if (!this.b) {
                    arrayList.add("PAGER");
                    break;
                } else {
                    arrayList.add("VOICE");
                    break;
                }
            case rl.h /*7*/:
                arrayList.add("VOICE");
                break;
            case rl.l /*9*/:
                arrayList.add("CAR");
                break;
            case rl.m /*10*/:
                arrayList.add("WORK");
                z = true;
                break;
            case rl.n /*11*/:
                arrayList.add("ISDN");
                break;
            case rl.k /*12*/:
                z = true;
                break;
            case rk.i /*13*/:
                arrayList.add("FAX");
                break;
            case rk.bY /*15*/:
                arrayList.add("TLX");
                break;
            case rk.bZ /*17*/:
                arrayList.addAll(Arrays.asList(new String[]{"WORK", "CELL"}));
                break;
            case rk.bW /*18*/:
                arrayList.add("WORK");
                if (!this.b) {
                    arrayList.add("PAGER");
                    break;
                } else {
                    arrayList.add("VOICE");
                    break;
                }
            case rk.h /*20*/:
                arrayList.add("MSG");
                break;
        }
        if (z) {
            arrayList.add("PREF");
        }
        if (arrayList.isEmpty()) {
            StringBuilder stringBuilder = this.f;
            Integer valueOf2 = Integer.valueOf(i);
            if (this.b) {
                stringBuilder.append("VOICE");
            } else {
                String str3 = (String) bha.a.get(valueOf2);
                if (str3 != null) {
                    d(str3);
                } else {
                    valueOf = String.valueOf(valueOf2);
                    Log.e("vCard", new StringBuilder(String.valueOf(valueOf).length() + 46).append("Unknown or unsupported (by vCard) Phone type: ").append(valueOf).toString());
                }
            }
        } else {
            n(arrayList);
        }
        this.f.append(":");
        this.f.append(str2);
        this.f.append("\r\n");
    }

    private void c(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PHOTO");
        stringBuilder.append(";");
        if (this.h) {
            stringBuilder.append("ENCODING=B");
        } else {
            stringBuilder.append("ENCODING=BASE64");
        }
        stringBuilder.append(";");
        a(stringBuilder, str2);
        stringBuilder.append(":");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        int length = stringBuilder2.length();
        int i = 73;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            stringBuilder3.append(stringBuilder2.charAt(i3));
            i2++;
            if (i2 > i) {
                stringBuilder3.append("\r\n");
                stringBuilder3.append(" ");
                i = 72;
                i2 = 0;
            }
        }
        this.f.append(stringBuilder3.toString());
        this.f.append("\r\n");
        this.f.append("\r\n");
    }

    public final bfn m(List list) {
        if (this.h) {
            Object obj = null;
        } else {
            if (this.m) {
                int i = 1;
            }
            return this;
        }
        if (list != null) {
            for (ContentValues asString : list) {
                String asString2 = asString.getAsString("data1");
                if (!TextUtils.isEmpty(asString2)) {
                    if (obj != null) {
                        if (asString2.startsWith("sip:")) {
                            if (asString2.length() != 4) {
                                asString2 = asString2.substring(4);
                            }
                        }
                        a("X-SIP", null, asString2);
                    } else {
                        String str;
                        if (!asString2.startsWith("sip:")) {
                            str = "sip:";
                            asString2 = String.valueOf(asString2);
                            asString2 = asString2.length() != 0 ? str.concat(asString2) : new String(str);
                        }
                        if (bfr.c(this.a)) {
                            str = "TEL";
                        } else {
                            str = "IMPP";
                        }
                        a(str, null, asString2);
                    }
                }
            }
        }
        return this;
    }

    private void a(String str, ContentValues contentValues) {
        Object obj = 1;
        if (g.contains(str)) {
            Object asString;
            Collection<String> arrayList = new ArrayList();
            for (int i = 1; i <= 15; i++) {
                asString = contentValues.getAsString("data" + i);
                if (asString == null) {
                    asString = "";
                }
                arrayList.add(asString);
            }
            asString = (!this.o || bha.a((Collection) arrayList)) ? null : 1;
            if (!this.k || bha.a((Collection) arrayList)) {
                obj = null;
            }
            this.f.append("X-ANDROID-CUSTOM");
            if (asString != null) {
                this.f.append(";");
                this.f.append(this.e);
            }
            if (obj != null) {
                this.f.append(";");
                this.f.append("ENCODING=QUOTED-PRINTABLE");
            }
            this.f.append(":");
            this.f.append(str);
            for (String str2 : arrayList) {
                String str22;
                if (obj != null) {
                    str22 = a(str22);
                } else {
                    str22 = b(str22);
                }
                this.f.append(";");
                this.f.append(str22);
            }
            this.f.append("\r\n");
        }
    }

    private void a(String str, List list, String str2) {
        boolean z;
        boolean z2 = !bha.a(str2);
        if (this.k) {
            if (!bha.b(str2)) {
                z = true;
                a(str, list, str2, z2, z);
            }
        }
        z = false;
        a(str, list, str2, z2, z);
    }

    public final void b(String str, String str2) {
        a(str, str2, false, false);
    }

    private void a(String str, String str2, boolean z, boolean z2) {
        a(str, null, str2, z, z2);
    }

    private void a(String str, List list, String str2, boolean z, boolean z2) {
        String a;
        this.f.append(str);
        if (list != null && list.size() > 0) {
            this.f.append(";");
            n(list);
        }
        if (z) {
            this.f.append(";");
            this.f.append(this.e);
        }
        if (z2) {
            this.f.append(";");
            this.f.append("ENCODING=QUOTED-PRINTABLE");
            a = a(str2);
        } else {
            a = b(str2);
        }
        this.f.append(":");
        this.f.append(a);
        this.f.append("\r\n");
    }

    private final void n(List list) {
        Object obj = 1;
        for (String str : list) {
            if (bfr.b(this.a) || bfr.c(this.a)) {
                String d;
                if (bfr.c(this.a)) {
                    d = bha.d(str);
                } else {
                    d = bha.c(str);
                }
                if (!TextUtils.isEmpty(d)) {
                    Object obj2;
                    if (obj != null) {
                        obj2 = null;
                    } else {
                        this.f.append(";");
                        obj2 = obj;
                    }
                    d(d);
                    obj = obj2;
                }
            } else if (bha.b(str)) {
                if (obj != null) {
                    obj = null;
                } else {
                    this.f.append(";");
                }
                d(str);
            }
        }
    }

    private final void d(String str) {
        a(this.f, str);
    }

    private final void a(StringBuilder stringBuilder, String str) {
        if (bfr.c(this.a) || ((bfr.b(this.a) || this.n) && !this.b)) {
            stringBuilder.append("TYPE=");
        }
        stringBuilder.append(str);
    }

    final boolean a(String... strArr) {
        if (!this.o) {
            return false;
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (!bha.a(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes;
        int i;
        int i2;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            bytes = str.getBytes(this.p);
            i = 0;
            i2 = 0;
        } catch (UnsupportedEncodingException e) {
            String str2 = this.p;
            Log.e("vCard", new StringBuilder(String.valueOf(str2).length() + 44).append("Charset ").append(str2).append(" cannot be used. Try default charset").toString());
            bytes = str.getBytes();
            i = 0;
            i2 = 0;
        }
        while (i2 < bytes.length) {
            stringBuilder.append(String.format("=%02X", new Object[]{Byte.valueOf(bytes[i2])}));
            i2++;
            i += 3;
            if (i >= 67) {
                stringBuilder.append("=\r\n");
                i = 0;
            }
        }
        return stringBuilder.toString();
    }

    final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case rk.i /*13*/:
                    if (i + 1 < length && str.charAt(i) == '\n') {
                        break;
                    }
                case rl.m /*10*/:
                    stringBuilder.append("\\n");
                    break;
                case ',':
                    if (!this.h) {
                        stringBuilder.append(charAt);
                        break;
                    }
                    stringBuilder.append("\\,");
                    break;
                case ';':
                    stringBuilder.append('\\');
                    stringBuilder.append(';');
                    break;
                case '\\':
                    if (this.h) {
                        stringBuilder.append("\\\\");
                        break;
                    }
                case '<':
                case '>':
                    if (!this.b) {
                        stringBuilder.append(charAt);
                        break;
                    }
                    stringBuilder.append('\\');
                    stringBuilder.append(charAt);
                    break;
                default:
                    stringBuilder.append(charAt);
                    break;
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        if (!this.q) {
            if (this.b) {
                b("X-CLASS", "PUBLIC");
                b("X-REDUCTION", "");
                b("X-NO", "");
                b("X-DCM-HMN-MODE", "");
            }
            b("END", "VCARD");
            this.q = true;
        }
        return this.f.toString();
    }

    private void a(int i, String str, ContentValues contentValues, boolean z, boolean z2) {
        bfo bfo;
        boolean z3;
        boolean z4;
        String a;
        String str2;
        String asString = contentValues.getAsString("data5");
        String asString2 = contentValues.getAsString("data6");
        String asString3 = contentValues.getAsString("data4");
        String asString4 = contentValues.getAsString("data7");
        String asString5 = contentValues.getAsString("data8");
        String asString6 = contentValues.getAsString("data9");
        String asString7 = contentValues.getAsString("data10");
        String[] strArr = new String[]{asString, asString2, asString3, asString4, asString5, asString6, asString7};
        boolean z5;
        if (bha.d(strArr)) {
            asString = contentValues.getAsString("data1");
            if (TextUtils.isEmpty(asString)) {
                bfo = null;
            } else {
                String b;
                StringBuilder stringBuilder;
                if (this.k) {
                    if (!bha.b(asString)) {
                        z5 = true;
                        z3 = bha.a(asString);
                        if (z5) {
                            b = b(asString);
                        } else {
                            b = a(asString);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(";");
                        stringBuilder.append(b);
                        stringBuilder.append(";");
                        stringBuilder.append(";");
                        stringBuilder.append(";");
                        stringBuilder.append(";");
                        stringBuilder.append(";");
                        bfo = new bfo(z5, z3, stringBuilder.toString());
                    }
                }
                z5 = false;
                if (bha.a(asString)) {
                }
                if (z5) {
                    b = b(asString);
                } else {
                    b = a(asString);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(";");
                stringBuilder.append(b);
                stringBuilder.append(";");
                stringBuilder.append(";");
                stringBuilder.append(";");
                stringBuilder.append(";");
                stringBuilder.append(";");
                bfo = new bfo(z5, z3, stringBuilder.toString());
            }
        } else {
            String a2;
            String a3;
            z5 = this.k && !bha.b(strArr);
            if (bha.a(strArr)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (TextUtils.isEmpty(asString4)) {
                if (TextUtils.isEmpty(asString2)) {
                    asString4 = "";
                } else {
                    asString4 = asString2;
                }
            } else if (!TextUtils.isEmpty(asString2)) {
                asString4 = new StringBuilder((String.valueOf(asString4).length() + 1) + String.valueOf(asString2).length()).append(asString4).append(" ").append(asString2).toString();
            }
            if (z5) {
                a2 = a(asString);
                a3 = a(asString3);
                a = a(asString4);
                asString3 = a(asString5);
                asString = a(asString6);
                asString4 = a(asString7);
            } else {
                a2 = b(asString);
                a3 = b(asString3);
                a = b(asString4);
                asString3 = b(asString5);
                asString = b(asString6);
                asString4 = b(asString7);
                b(asString2);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(a2);
            stringBuilder2.append(";");
            stringBuilder2.append(";");
            stringBuilder2.append(a3);
            stringBuilder2.append(";");
            stringBuilder2.append(a);
            stringBuilder2.append(";");
            stringBuilder2.append(asString3);
            stringBuilder2.append(";");
            stringBuilder2.append(asString);
            stringBuilder2.append(";");
            stringBuilder2.append(asString4);
            bfo = new bfo(z5, z4, stringBuilder2.toString());
        }
        if (bfo != null) {
            z3 = bfo.a;
            z4 = bfo.b;
            str2 = bfo.c;
        } else if (z2) {
            z3 = false;
            z4 = false;
            str2 = "";
        } else {
            return;
        }
        List arrayList = new ArrayList();
        if (z) {
            arrayList.add("PREF");
        }
        switch (i) {
            case rl.c /*0*/:
                if (!TextUtils.isEmpty(str)) {
                    if (bha.c(str)) {
                        a = "X-";
                        asString = String.valueOf(str);
                        arrayList.add(asString.length() != 0 ? a.concat(asString) : new String(a));
                        break;
                    }
                }
                break;
            case rq.b /*1*/:
                arrayList.add("HOME");
                break;
            case rq.c /*2*/:
                arrayList.add("WORK");
                break;
            case rl.e /*3*/:
                break;
            default:
                Log.e("vCard", "Unknown StructuredPostal type: " + i);
                break;
        }
        this.f.append("ADR");
        if (!arrayList.isEmpty()) {
            this.f.append(";");
            n(arrayList);
        }
        if (z4) {
            this.f.append(";");
            this.f.append(this.e);
        }
        if (z3) {
            this.f.append(";");
            this.f.append("ENCODING=QUOTED-PRINTABLE");
        }
        this.f.append(":");
        this.f.append(str2);
        this.f.append("\r\n");
    }
}
