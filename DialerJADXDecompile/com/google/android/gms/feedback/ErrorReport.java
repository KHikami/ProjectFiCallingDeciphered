package com.google.android.gms.feedback;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import ckh;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ErrorReport implements SafeParcelable {
    public static final Creator CREATOR;
    public int A;
    public String B;
    public String C;
    public String D;
    public Bundle E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public String J;
    public String K;
    public int L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    @Deprecated
    public String R;
    public String S;
    public BitmapTeleporter T;
    public String U;
    public FileTeleporter[] V;
    public String[] W;
    public boolean X;
    public String Y;
    public ThemeSettings Z;
    public final int a;
    public LogOptions aa;
    public String ab;
    public boolean ac;
    public Bundle ad;
    public List ae;
    @SuppressLint({"NewApi"})
    public ApplicationErrorReport b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String[] r;
    public String[] s;
    public String[] t;
    public String u;
    public String v;
    public byte[] w;
    public int x;
    public int y;
    public int z;

    static {
        CREATOR = new ckh();
    }

    public ErrorReport() {
        this.b = new ApplicationErrorReport();
        this.a = 9;
    }

    @TargetApi(14)
    public ErrorReport(int i, ApplicationErrorReport applicationErrorReport, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i4, int i5, int i6, int i7, String str16, String str17, String str18, Bundle bundle, boolean z, int i8, int i9, boolean z2, String str19, String str20, int i10, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List list) {
        this.b = new ApplicationErrorReport();
        this.a = i;
        this.b = applicationErrorReport;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = i3;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.p = str12;
        this.q = str13;
        this.r = strArr;
        this.s = strArr2;
        this.t = strArr3;
        this.u = str14;
        this.v = str15;
        this.w = bArr;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = i7;
        this.B = str16;
        this.C = str17;
        this.D = str18;
        this.E = bundle;
        this.F = z;
        this.G = i8;
        this.H = i9;
        this.I = z2;
        this.J = str19;
        this.K = str20;
        this.L = i10;
        this.M = str21;
        this.N = str22;
        this.O = str23;
        this.P = str24;
        this.Q = str25;
        this.R = str26;
        this.S = str27;
        this.T = bitmapTeleporter;
        this.U = str28;
        this.V = fileTeleporterArr;
        this.W = strArr4;
        this.X = z3;
        this.Y = str29;
        this.Z = themeSettings;
        this.aa = logOptions;
        this.ab = str30;
        this.ac = z4;
        this.ad = bundle2;
        this.ae = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, i, false);
        buf.a(parcel, 3, this.c, false);
        buf.d(parcel, 4, this.d);
        buf.a(parcel, 5, this.e, false);
        buf.a(parcel, 6, this.f, false);
        buf.a(parcel, 7, this.g, false);
        buf.a(parcel, 8, this.h, false);
        buf.a(parcel, 9, this.i, false);
        buf.a(parcel, 10, this.j, false);
        buf.a(parcel, 11, this.k, false);
        buf.d(parcel, 12, this.l);
        buf.a(parcel, 13, this.m, false);
        buf.a(parcel, 14, this.n, false);
        buf.a(parcel, 15, this.o, false);
        buf.a(parcel, 17, this.q, false);
        buf.a(parcel, 16, this.p, false);
        buf.a(parcel, 19, this.s, false);
        buf.a(parcel, 18, this.r, false);
        buf.a(parcel, 21, this.u, false);
        buf.a(parcel, 20, this.t, false);
        buf.a(parcel, 23, this.w, false);
        buf.a(parcel, 22, this.v, false);
        buf.d(parcel, 25, this.y);
        buf.d(parcel, 24, this.x);
        buf.d(parcel, 27, this.A);
        buf.d(parcel, 26, this.z);
        buf.a(parcel, 29, this.C, false);
        buf.a(parcel, 28, this.B, false);
        buf.a(parcel, 31, this.E, false);
        buf.a(parcel, 30, this.D, false);
        buf.d(parcel, 34, this.H);
        buf.a(parcel, 35, this.I);
        buf.a(parcel, 32, this.F);
        buf.d(parcel, 33, this.G);
        buf.d(parcel, 38, this.L);
        buf.a(parcel, 39, this.M, false);
        buf.a(parcel, 36, this.J, false);
        buf.a(parcel, 37, this.K, false);
        buf.a(parcel, 42, this.P, false);
        buf.a(parcel, 43, this.Q, false);
        buf.a(parcel, 40, this.N, false);
        buf.a(parcel, 41, this.O, false);
        buf.a(parcel, 46, this.T, i, false);
        buf.a(parcel, 47, this.U, false);
        buf.a(parcel, 44, this.R, false);
        buf.a(parcel, 45, this.S, false);
        buf.a(parcel, 51, this.Y, false);
        buf.a(parcel, 50, this.X);
        buf.a(parcel, 49, this.W, false);
        buf.a(parcel, 48, this.V, i, false);
        buf.a(parcel, 55, this.ac);
        buf.a(parcel, 54, this.ab, false);
        buf.a(parcel, 53, this.aa, i, false);
        buf.a(parcel, 52, this.Z, i, false);
        buf.c(parcel, 57, this.ae, false);
        buf.a(parcel, 56, this.ad, false);
        buf.v(parcel, c);
    }
}
