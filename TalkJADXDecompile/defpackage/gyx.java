package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.List;

/* renamed from: gyx */
public final class gyx implements Creator<ErrorReport> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i3 = 0;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        boolean z2 = false;
        String str19 = null;
        String str20 = null;
        int i10 = 0;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        boolean z3 = false;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        boolean z4 = false;
        Bundle bundle2 = null;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    applicationErrorReport = (ApplicationErrorReport) gwb.a(parcel, a, ApplicationErrorReport.CREATOR);
                    break;
                case wi.z /*3*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.h /*4*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.p /*5*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.s /*6*/:
                    str3 = gwb.l(parcel, a);
                    break;
                case wi.q /*7*/:
                    str4 = gwb.l(parcel, a);
                    break;
                case wi.m /*8*/:
                    str5 = gwb.l(parcel, a);
                    break;
                case wi.n /*9*/:
                    str6 = gwb.l(parcel, a);
                    break;
                case wi.dr /*10*/:
                    str7 = gwb.l(parcel, a);
                    break;
                case wi.dB /*11*/:
                    str8 = gwb.l(parcel, a);
                    break;
                case wi.dM /*12*/:
                    i3 = gwb.f(parcel, a);
                    break;
                case wi.dD /*13*/:
                    str9 = gwb.l(parcel, a);
                    break;
                case wi.g /*14*/:
                    str10 = gwb.l(parcel, a);
                    break;
                case wi.dJ /*15*/:
                    str11 = gwb.l(parcel, a);
                    break;
                case wi.dI /*16*/:
                    str12 = gwb.l(parcel, a);
                    break;
                case wi.dK /*17*/:
                    str13 = gwb.l(parcel, a);
                    break;
                case wi.dH /*18*/:
                    strArr = gwb.q(parcel, a);
                    break;
                case wi.dL /*19*/:
                    strArr2 = gwb.q(parcel, a);
                    break;
                case wi.k /*20*/:
                    strArr3 = gwb.q(parcel, a);
                    break;
                case wi.f /*21*/:
                    str14 = gwb.l(parcel, a);
                    break;
                case wi.e /*22*/:
                    str15 = gwb.l(parcel, a);
                    break;
                case wi.do /*23*/:
                    bArr = gwb.o(parcel, a);
                    break;
                case wi.dA /*24*/:
                    i4 = gwb.f(parcel, a);
                    break;
                case wi.dz /*25*/:
                    i5 = gwb.f(parcel, a);
                    break;
                case wi.dx /*26*/:
                    i6 = gwb.f(parcel, a);
                    break;
                case wi.i /*27*/:
                    i7 = gwb.f(parcel, a);
                    break;
                case wi.o /*28*/:
                    str16 = gwb.l(parcel, a);
                    break;
                case 29:
                    str17 = gwb.l(parcel, a);
                    break;
                case 30:
                    str18 = gwb.l(parcel, a);
                    break;
                case 31:
                    bundle = gwb.n(parcel, a);
                    break;
                case 32:
                    z = gwb.c(parcel, a);
                    break;
                case 33:
                    i8 = gwb.f(parcel, a);
                    break;
                case 34:
                    i9 = gwb.f(parcel, a);
                    break;
                case 35:
                    z2 = gwb.c(parcel, a);
                    break;
                case 36:
                    str19 = gwb.l(parcel, a);
                    break;
                case 37:
                    str20 = gwb.l(parcel, a);
                    break;
                case 38:
                    i10 = gwb.f(parcel, a);
                    break;
                case 39:
                    str21 = gwb.l(parcel, a);
                    break;
                case 40:
                    str22 = gwb.l(parcel, a);
                    break;
                case 41:
                    str23 = gwb.l(parcel, a);
                    break;
                case 42:
                    str24 = gwb.l(parcel, a);
                    break;
                case 43:
                    str25 = gwb.l(parcel, a);
                    break;
                case 44:
                    str26 = gwb.l(parcel, a);
                    break;
                case 45:
                    str27 = gwb.l(parcel, a);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) gwb.a(parcel, a, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = gwb.l(parcel, a);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) gwb.b(parcel, a, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = gwb.q(parcel, a);
                    break;
                case 50:
                    z3 = gwb.c(parcel, a);
                    break;
                case 51:
                    str29 = gwb.l(parcel, a);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) gwb.a(parcel, a, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) gwb.a(parcel, a, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = gwb.l(parcel, a);
                    break;
                case 55:
                    z4 = gwb.c(parcel, a);
                    break;
                case 56:
                    bundle2 = gwb.n(parcel, a);
                    break;
                case 57:
                    list = gwb.c(parcel, a, RectF.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ErrorReport(i, applicationErrorReport, str, i2, str2, str3, str4, str5, str6, str7, str8, i3, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i4, i5, i6, i7, str16, str17, str18, bundle, z, i8, i9, z2, str19, str20, i10, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, list);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
