package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import gwb;
import ham;
import hhw;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class GoogleHelp extends AbstractSafeParcelable {
    public static final Creator<GoogleHelp> CREATOR;
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List<String> j;
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
    List<OverflowMenuItem> r;
    @Deprecated
    int s;
    ThemeSettings t;
    List<OfflineSuggestion> u;
    boolean v;
    ErrorReport w;
    TogglingData x;
    int y;
    PendingIntent z;

    static {
        CREATOR = new ham();
    }

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List<String> list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List<OverflowMenuItem> list2, int i4, ThemeSettings themeSettings, List<OfflineSuggestion> list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent) {
        GoogleHelp googleHelp;
        this.w = new ErrorReport();
        this.a = i;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.z = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (this.a < 4) {
            themeSettings = new ThemeSettings().a(i4);
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
        this.y = i5;
    }

    public GoogleHelp(String str) {
        this(8, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 0, null, new ArrayList(), false, new ErrorReport(), null, 0, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.app.Activity r4) {
        /*
        r0 = r4.getWindow();	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r0 = r0.getDecorView();	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r1 = r0.getRootView();	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r0 = r1.getWidth();	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r2 = r1.getHeight();	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r3 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r0 = android.graphics.Bitmap.createBitmap(r0, r2, r3);	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r2 = new android.graphics.Canvas;	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r2.<init>(r0);	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
        r1.draw(r2);	 Catch:{ Exception -> 0x0023, Error -> 0x0026 }
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
    L_0x0024:
        r0 = 0;
        goto L_0x0022;
    L_0x0026:
        r0 = move-exception;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.GoogleHelp.a(android.app.Activity):android.graphics.Bitmap");
    }

    public Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public GoogleHelp a(int i, String str, Intent intent) {
        this.r.add(new OverflowMenuItem(i, str, intent));
        return this;
    }

    public GoogleHelp a(Account account) {
        this.c = account;
        return this;
    }

    public GoogleHelp a(Uri uri) {
        this.q = uri;
        return this;
    }

    public GoogleHelp a(FeedbackOptions feedbackOptions, File file) {
        this.w = hhw.a(feedbackOptions, file);
        this.w.Y = "GoogleHelp";
        return this;
    }

    public GoogleHelp a(ThemeSettings themeSettings) {
        this.t = themeSettings;
        return this;
    }

    public Uri b() {
        return this.q;
    }

    public TogglingData c() {
        return this.x;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.a(parcel, 3, this.c, i, false);
        gwb.a(parcel, 4, this.d, false);
        gwb.a(parcel, 5, this.h);
        gwb.a(parcel, 6, this.i);
        gwb.b(parcel, 7, this.j, false);
        gwb.a(parcel, 10, this.k, false);
        gwb.a(parcel, 11, this.l, i, false);
        gwb.a(parcel, 14, this.p, false);
        gwb.a(parcel, 15, this.q, i, false);
        gwb.c(parcel, 16, this.r, false);
        gwb.d(parcel, 17, this.s);
        gwb.c(parcel, 18, this.u, false);
        gwb.a(parcel, 19, this.m, false);
        gwb.d(parcel, 20, this.n);
        gwb.d(parcel, 21, this.o);
        gwb.a(parcel, 22, this.v);
        gwb.a(parcel, 23, this.w, i, false);
        gwb.a(parcel, 25, this.t, i, false);
        gwb.a(parcel, 28, this.e, false);
        gwb.a(parcel, 31, this.x, i, false);
        gwb.d(parcel, 32, this.y);
        gwb.a(parcel, 33, this.z, i, false);
        gwb.a(parcel, 34, this.f, false);
        gwb.a(parcel, 35, this.g, i, false);
        gwb.v(parcel, c);
    }
}
