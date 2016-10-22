package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;

/* compiled from: PG */
/* renamed from: adl */
public abstract class adl extends adh {
    private CharSequence y;

    protected final /* synthetic */ View a(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup) {
        return b(context, i, cursor, i2, viewGroup);
    }

    public adl(Context context) {
        super(context);
        this.y = context.getText(buf.fI);
    }

    protected final adr b(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup) {
        adr b = super.b(context, i, cursor, i2, viewGroup);
        b.w = this.y;
        b.k = this.h;
        b.v = this.i;
        b.u = this.s;
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void a(defpackage.adr r9, android.database.Cursor r10) {
        /*
        r8 = 93;
        r7 = 91;
        r6 = -1;
        r1 = 0;
        r5 = 10;
        r0 = r10.getColumnCount();
        if (r0 <= r5) goto L_0x001a;
    L_0x000e:
        r0 = "snippet";
        r2 = r10.getColumnName(r5);
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x001e;
    L_0x001a:
        r9.b(r1);
    L_0x001d:
        return;
    L_0x001e:
        r3 = r10.getString(r5);
        r0 = r10.getExtras();
        r2 = "deferred_snippeting";
        r2 = r0.getBoolean(r2);
        if (r2 == 0) goto L_0x00b8;
    L_0x002e:
        r2 = "deferred_snippeting_query";
        r2 = r0.getString(r2);
        r0 = "display_name";
        r0 = r10.getColumnIndex(r0);
        if (r0 < 0) goto L_0x00f9;
    L_0x003c:
        r0 = r10.getString(r0);
    L_0x0040:
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 != 0) goto L_0x004c;
    L_0x0046:
        r4 = android.text.TextUtils.isEmpty(r2);
        if (r4 == 0) goto L_0x0050;
    L_0x004c:
        r9.b(r1);
        goto L_0x001d;
    L_0x0050:
        r2 = r2.toLowerCase();
        r2 = defpackage.buf.i(r2);
        r4 = android.text.TextUtils.isEmpty(r0);
        if (r4 != 0) goto L_0x0092;
    L_0x005e:
        r0 = r0.toLowerCase();
        r4 = defpackage.adr.a;
        r0 = r4.matcher(r0);
        r4 = new java.util.ArrayList;
        r4.<init>();
    L_0x006d:
        r5 = r0.find();
        if (r5 == 0) goto L_0x007b;
    L_0x0073:
        r5 = r0.group();
        r4.add(r5);
        goto L_0x006d;
    L_0x007b:
        r4 = r4.iterator();
    L_0x007f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0092;
    L_0x0085:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r0 = r0.startsWith(r2);
        if (r0 != 0) goto L_0x004c;
    L_0x0091:
        goto L_0x007f;
    L_0x0092:
        r0 = defpackage.buf.a(r3, r2);
        r2 = r0.b;
        if (r2 == 0) goto L_0x004c;
    L_0x009a:
        r1 = r9.getResources();
        r2 = defpackage.buf.dm;
        r1 = r1.getInteger(r2);
        r2 = r0.b;
        r2 = r2.length();
        if (r2 <= r1) goto L_0x00b5;
    L_0x00ac:
        r2 = r0.b;
        r0 = r0.a;
        r1 = defpackage.adr.a(r2, r0, r1);
        goto L_0x004c;
    L_0x00b5:
        r1 = r0.b;
        goto L_0x004c;
    L_0x00b8:
        if (r3 == 0) goto L_0x00f6;
    L_0x00ba:
        r0 = 0;
        r2 = r3.length();
        r4 = r3.indexOf(r7);
        if (r4 == r6) goto L_0x004c;
    L_0x00c5:
        r1 = r3.lastIndexOf(r5, r4);
        if (r1 == r6) goto L_0x00cd;
    L_0x00cb:
        r0 = r1 + 1;
    L_0x00cd:
        r1 = r3.lastIndexOf(r8);
        if (r1 == r6) goto L_0x00f4;
    L_0x00d3:
        r1 = r3.indexOf(r5, r1);
        if (r1 == r6) goto L_0x00f4;
    L_0x00d9:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
    L_0x00de:
        if (r0 >= r1) goto L_0x00ee;
    L_0x00e0:
        r4 = r3.charAt(r0);
        if (r4 == r7) goto L_0x00eb;
    L_0x00e6:
        if (r4 == r8) goto L_0x00eb;
    L_0x00e8:
        r2.append(r4);
    L_0x00eb:
        r0 = r0 + 1;
        goto L_0x00de;
    L_0x00ee:
        r1 = r2.toString();
        goto L_0x004c;
    L_0x00f4:
        r1 = r2;
        goto L_0x00d9;
    L_0x00f6:
        r1 = r3;
        goto L_0x004c;
    L_0x00f9:
        r0 = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: adl.a(adr, android.database.Cursor):void");
    }

    public final void a(int i, Cursor cursor) {
        super.a(i, cursor);
        if (cursor != null && cursor.moveToFirst()) {
            int i2 = cursor.getInt(7) == 1 ? 1 : 0;
            if (i2 != 0) {
                cursor.moveToNext();
            }
            cursor.moveToFirst();
            if (i2 != 0) {
                int i3 = buf.gP;
                SectionIndexer sectionIndexer = this.w;
                if (sectionIndexer != null) {
                    aea aea = (aea) sectionIndexer;
                    String string = this.a.getString(i3);
                    if (aea.a == null) {
                        return;
                    }
                    if (aea.a.length <= 0 || !string.equals(aea.a[0])) {
                        String[] strArr = new String[(aea.a.length + 1)];
                        int[] iArr = new int[(aea.b.length + 1)];
                        strArr[0] = string;
                        iArr[0] = 0;
                        for (int i4 = 1; i4 <= aea.b.length; i4++) {
                            strArr[i4] = aea.a[i4 - 1];
                            iArr[i4] = aea.b[i4 - 1] + 1;
                        }
                        aea.a = strArr;
                        aea.b = iArr;
                        aea.c++;
                    }
                }
            }
        }
    }

    protected final String[] a(boolean z) {
        int i = this.d;
        if (z) {
            if (i == 1) {
                return adm.c;
            }
            return adm.d;
        } else if (i == 1) {
            return adm.a;
        } else {
            return adm.b;
        }
    }
}
