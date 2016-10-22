package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: agp */
abstract class agp {
    public abstract String a();

    public abstract List a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet);

    agp() {
    }

    protected final ahm a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, boolean z, String str, String str2, int i, int i2, agb agb, agb agb2) {
        String str3;
        if (Log.isLoggable("BaseAccountType", 3)) {
            str3 = "Adding DataKind: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
        }
        ahm ahm = new ahm(str, i, i2, true);
        ahm.i = str2;
        ahm.f = agb;
        ahm.h = agb2;
        ahm.l = new ArrayList();
        if (!z) {
            ahm.j = agf.a(attributeSet, "maxOccurs", -1);
            if (ahm.i != null) {
                ahm.k = new ArrayList();
                a(xmlPullParser, attributeSet, ahm, true);
                if (ahm.k.size() == 0) {
                    str3 = ahm.b;
                    throw new afx(new StringBuilder(String.valueOf(str3).length() + 33).append("Kind ").append(str3).append(" must have at least one type").toString());
                }
            }
            a(xmlPullParser, attributeSet, ahm, false);
        }
        return ahm;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, defpackage.ahm r9, boolean r10) {
        /*
        r6 = this;
        r0 = r7.getDepth();
    L_0x0004:
        r1 = r7.next();
        r2 = 1;
        if (r1 == r2) goto L_0x00ce;
    L_0x000b:
        r2 = 3;
        if (r1 != r2) goto L_0x0014;
    L_0x000e:
        r2 = r7.getDepth();
        if (r2 <= r0) goto L_0x00ce;
    L_0x0014:
        r2 = r7.getDepth();
        r3 = 2;
        if (r1 != r3) goto L_0x0004;
    L_0x001b:
        r1 = r0 + 1;
        if (r2 != r1) goto L_0x0004;
    L_0x001f:
        r1 = r7.getName();
        r2 = "Type";
        r2 = r2.equals(r1);
        if (r2 == 0) goto L_0x00b2;
    L_0x002b:
        if (r10 == 0) goto L_0x0087;
    L_0x002d:
        r1 = r9.k;
        r2 = "type";
        r2 = defpackage.agf.a(r8, r2);
        r3 = r6.a(r8, r2);
        if (r3 != 0) goto L_0x0079;
    L_0x003b:
        r0 = new afx;
        r1 = r9.b;
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + 34;
        r5 = java.lang.String.valueOf(r1);
        r5 = r5.length();
        r4 = r4 + r5;
        r3.<init>(r4);
        r4 = "Undefined type '";
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = "' for data kind '";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = "'";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0079:
        r2 = "maxOccurs";
        r4 = -1;
        r2 = defpackage.agf.a(r8, r2, r4);
        r3.c = r2;
        r1.add(r3);
        goto L_0x0004;
    L_0x0087:
        r0 = new afx;
        r1 = r9.b;
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 22;
        r2.<init>(r3);
        r3 = "Kind ";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = " can't have types";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00b2:
        r2 = new afx;
        r3 = "Unknown tag: ";
        r0 = java.lang.String.valueOf(r1);
        r1 = r0.length();
        if (r1 == 0) goto L_0x00c8;
    L_0x00c0:
        r0 = r3.concat(r0);
    L_0x00c4:
        r2.<init>(r0);
        throw r2;
    L_0x00c8:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x00c4;
    L_0x00ce:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: agp.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, ahm, boolean):void");
    }

    protected afz a(AttributeSet attributeSet, String str) {
        return null;
    }

    protected static void a(ahm ahm) {
        if (ahm.j != 1) {
            String str = ahm.b;
            throw new afx(new StringBuilder(String.valueOf(str).length() + 32).append("Kind ").append(str).append(" must have 'overallMax=\"1\"'").toString());
        }
    }
}
