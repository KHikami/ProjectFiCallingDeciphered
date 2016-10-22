package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import cko;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

public final class GoogleHelp implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    int f;
    int g;
    boolean h;
    boolean i;
    List j;
    @Deprecated
    Bundle k;
    @Deprecated
    Bitmap l;
    @Deprecated
    byte[] m;
    @Deprecated
    int n;
    @Deprecated
    int o;
    String p;
    Uri q;
    List r;
    @Deprecated
    int s;
    ThemeSettings t;
    List u;
    boolean v;
    ErrorReport w;
    TogglingData x;
    int y;
    PendingIntent z;

    static {
        CREATOR = new cko();
    }

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, int i2, int i3, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap, byte[] bArr, int i4, int i5, String str3, Uri uri, List list2, int i6, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i7, PendingIntent pendingIntent) {
        GoogleHelp googleHelp;
        this.w = new ErrorReport();
        this.a = i;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.z = pendingIntent;
        this.k = bundle2;
        this.l = bitmap;
        this.m = bArr;
        this.n = i4;
        this.o = i5;
        this.p = str3;
        this.q = uri;
        this.r = list2;
        if (this.a < 4) {
            themeSettings = new ThemeSettings();
            themeSettings.b = i6;
            googleHelp = this;
        } else if (themeSettings == null) {
            themeSettings = new ThemeSettings();
            googleHelp = this;
        } else {
            googleHelp = this;
        }
        googleHelp.t = themeSettings;
        this.u = list3;
        this.v = z3;
        this.w = errorReport;
        if (this.w != null) {
            this.w.Y = "GoogleHelp";
        }
        this.x = togglingData;
        this.y = i7;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.app.Activity r4) {
        /*
        r0 = r4.getWindow();	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r0 = r0.getDecorView();	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r1 = r0.getRootView();	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r0 = r1.getWidth();	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r2 = r1.getHeight();	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r3 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r0 = android.graphics.Bitmap.createBitmap(r0, r2, r3);	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r2 = new android.graphics.Canvas;	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r2.<init>(r0);	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
        r1.draw(r2);	 Catch:{ Exception -> 0x0023, Error -> 0x002d }
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
    L_0x0024:
        r1 = "GOOGLEHELP_GoogleHelp";
        r2 = "Get screenshot failed!";
        android.util.Log.w(r1, r2, r0);
        r0 = 0;
        goto L_0x0022;
    L_0x002d:
        r0 = move-exception;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.GoogleHelp.a(android.app.Activity):android.graphics.Bitmap");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c, i, false);
        buf.a(parcel, 4, this.d, false);
        buf.a(parcel, 5, this.h);
        buf.a(parcel, 6, this.i);
        buf.b(parcel, 7, this.j, false);
        buf.a(parcel, 10, this.k, false);
        buf.a(parcel, 11, this.l, i, false);
        buf.a(parcel, 14, this.p, false);
        buf.a(parcel, 15, this.q, i, false);
        buf.d(parcel, 17, this.s);
        buf.c(parcel, 16, this.r, false);
        buf.a(parcel, 19, this.m, false);
        buf.c(parcel, 18, this.u, false);
        buf.d(parcel, 21, this.o);
        buf.d(parcel, 20, this.n);
        buf.a(parcel, 23, this.w, i, false);
        buf.a(parcel, 22, this.v);
        buf.a(parcel, 25, this.t, i, false);
        buf.d(parcel, 29, this.f);
        buf.a(parcel, 28, this.e, false);
        buf.a(parcel, 31, this.x, i, false);
        buf.d(parcel, 30, this.g);
        buf.d(parcel, 32, this.y);
        buf.a(parcel, 33, this.z, i, false);
        buf.v(parcel, c);
    }
}
