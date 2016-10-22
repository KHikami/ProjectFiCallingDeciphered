package com.google.android.gms.feedback;

import android.annotation.TargetApi;
import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import cki;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class FeedbackOptions implements SafeParcelable {
    public static final Creator CREATOR;
    public final int a;
    public String b;
    public Bundle c;
    public String d;
    public ApplicationErrorReport e;
    public String f;
    public BitmapTeleporter g;
    public String h;
    public ArrayList i;
    public boolean j;
    public ThemeSettings k;
    public LogOptions l;

    static {
        CREATOR = new cki();
    }

    @TargetApi(14)
    public FeedbackOptions() {
        this(3, null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null);
    }

    public FeedbackOptions(int i, String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, ArrayList arrayList, boolean z, ThemeSettings themeSettings, LogOptions logOptions) {
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

    @TargetApi(14)
    public final CrashInfo a() {
        return this.e == null ? null : this.e.crashInfo;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 5, this.d, false);
        buf.a(parcel, 6, this.e, i, false);
        buf.a(parcel, 7, this.f, false);
        buf.a(parcel, 8, this.g, i, false);
        buf.a(parcel, 9, this.h, false);
        buf.c(parcel, 10, this.i, false);
        buf.a(parcel, 11, this.j);
        buf.a(parcel, 12, this.k, i, false);
        buf.a(parcel, 13, this.l, i, false);
        buf.v(parcel, c);
    }

    public static /* synthetic */ FeedbackOptions a(FeedbackOptions feedbackOptions, Bitmap bitmap) {
        if (bitmap != null) {
            feedbackOptions.g = new BitmapTeleporter(bitmap);
        }
        return feedbackOptions;
    }
}
