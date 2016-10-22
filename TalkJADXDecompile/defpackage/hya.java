package defpackage;

import android.net.Uri;

/* renamed from: hya */
public final class hya {
    private final Uri a;
    private final hxz b;

    private hya(hxw hxw) {
        this.a = hxw.a();
        this.b = hya.b((hxw) hxw.f());
    }

    public static hya a(hxw hxw) {
        if (hxw != null) {
            return new hya(hxw);
        }
        throw new IllegalStateException("provided dataItem is null");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.hxz b(defpackage.hxw r6) {
        /*
        r2 = 0;
        r0 = r6.b();
        if (r0 != 0) goto L_0x0019;
    L_0x0007:
        r0 = r6.c();
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0019;
    L_0x0011:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.";
        r0.<init>(r1);
        throw r0;
    L_0x0019:
        r0 = r6.b();
        if (r0 != 0) goto L_0x0025;
    L_0x001f:
        r0 = new hxz;
        r0.<init>();
    L_0x0024:
        return r0;
    L_0x0025:
        r3 = new java.util.ArrayList;	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r3.<init>();	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r0 = r6.c();	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r4 = r0.size();	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r1 = r2;
    L_0x0033:
        if (r1 >= r4) goto L_0x00f1;
    L_0x0035:
        r0 = r6.c();	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r5 = java.lang.Integer.toString(r1);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r0 = r0.get(r5);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r0 = (defpackage.hxx) r0;	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        if (r0 != 0) goto L_0x00e1;
    L_0x0045:
        r0 = new java.lang.IllegalStateException;	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r3 = java.lang.String.valueOf(r6);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r4 = new java.lang.StringBuilder;	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r5 = java.lang.String.valueOf(r3);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r5 = r5.length();	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r5 = r5 + 64;
        r4.<init>(r5);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r5 = "Cannot find DataItemAsset referenced in data at ";
        r4 = r4.append(r5);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r1 = r4.append(r1);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r4 = " for ";
        r1 = r1.append(r4);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r1 = r1.append(r3);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r1 = r1.toString();	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r0.<init>(r1);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        throw r0;	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
    L_0x0076:
        r0 = move-exception;
    L_0x0077:
        r1 = r6.a();
        r1 = java.lang.String.valueOf(r1);
        r3 = r6.b();
        r2 = android.util.Base64.encodeToString(r3, r2);
        r2 = java.lang.String.valueOf(r2);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r1);
        r4 = r4.length();
        r4 = r4 + 50;
        r5 = java.lang.String.valueOf(r2);
        r5 = r5.length();
        r4 = r4 + r5;
        r3.<init>(r4);
        r4 = "Unable to parse datamap from dataItem. uri=";
        r3 = r3.append(r4);
        r1 = r3.append(r1);
        r3 = ", data=";
        r1 = r1.append(r3);
        r1.append(r2);
        r1 = new java.lang.IllegalStateException;
        r2 = r6.a();
        r2 = java.lang.String.valueOf(r2);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + 44;
        r3.<init>(r4);
        r4 = "Unable to parse datamap from dataItem.  uri=";
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x00e1:
        r0 = r0.a();	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r0 = com.google.android.gms.wearable.Asset.a(r0);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r3.add(r0);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0033;
    L_0x00f1:
        r0 = r6.b();	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r0 = defpackage.hce.a(r0);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r1 = new hcd;	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r1.<init>(r0, r3);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        r0 = defpackage.gwb.a(r1);	 Catch:{ hcp -> 0x0076, NullPointerException -> 0x0104 }
        goto L_0x0024;
    L_0x0104:
        r0 = move-exception;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: hya.b(hxw):hxz");
    }

    public Uri a() {
        return this.a;
    }

    public hxz b() {
        return this.b;
    }
}
