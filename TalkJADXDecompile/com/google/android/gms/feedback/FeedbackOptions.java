package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import gyy;
import java.util.ArrayList;

public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Creator<FeedbackOptions> CREATOR;
    public final int a;
    public String b;
    public Bundle c;
    public String d;
    public ApplicationErrorReport e;
    public String f;
    public BitmapTeleporter g;
    public String h;
    public ArrayList<FileTeleporter> i;
    public boolean j;
    public ThemeSettings k;
    public LogOptions l;

    static {
        CREATOR = new gyy();
    }

    public FeedbackOptions() {
        this(3, null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null);
    }

    public FeedbackOptions(int i, String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, ArrayList<FileTeleporter> arrayList, boolean z, ThemeSettings themeSettings, LogOptions logOptions) {
        this.a = i;
        this.b = str;
        this.c = bundle;
        this.d = str2;
        this.e = applicationErrorReport;
        this.f = str3;
        this.g = bitmapTeleporter;
        this.h = str4;
        this.i = arrayList;
        this.j = z;
        this.k = themeSettings;
        this.l = logOptions;
    }

    public String a() {
        return this.b;
    }

    public Bundle b() {
        return this.c;
    }

    public ThemeSettings c() {
        return this.k;
    }

    public String d() {
        return this.d;
    }

    public CrashInfo e() {
        return this.e == null ? null : this.e.crashInfo;
    }

    public String f() {
        return this.f;
    }

    public BitmapTeleporter g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public ArrayList<FileTeleporter> i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public LogOptions k() {
        return this.l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.a(parcel, 3, this.c, false);
        gwb.a(parcel, 5, this.d, false);
        gwb.a(parcel, 6, this.e, i, false);
        gwb.a(parcel, 7, this.f, false);
        gwb.a(parcel, 8, this.g, i, false);
        gwb.a(parcel, 9, this.h, false);
        gwb.c(parcel, 10, this.i, false);
        gwb.a(parcel, 11, this.j);
        gwb.a(parcel, 12, this.k, i, false);
        gwb.a(parcel, 13, this.l, i, false);
        gwb.v(parcel, c);
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, Bitmap bitmap) {
        if (bitmap != null) {
            feedbackOptions.g = new BitmapTeleporter(bitmap);
        }
        return feedbackOptions;
    }
}
