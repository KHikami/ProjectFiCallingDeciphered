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

public final class ckh implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
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
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    applicationErrorReport = (ApplicationErrorReport) buf.a(parcel, a, ApplicationErrorReport.CREATOR);
                    break;
                case rl.e /*3*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.f /*4*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rl.g /*5*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.i /*6*/:
                    str3 = buf.k(parcel, a);
                    break;
                case rl.h /*7*/:
                    str4 = buf.k(parcel, a);
                    break;
                case rl.j /*8*/:
                    str5 = buf.k(parcel, a);
                    break;
                case rl.l /*9*/:
                    str6 = buf.k(parcel, a);
                    break;
                case rl.m /*10*/:
                    str7 = buf.k(parcel, a);
                    break;
                case rl.n /*11*/:
                    str8 = buf.k(parcel, a);
                    break;
                case rl.k /*12*/:
                    i3 = buf.e(parcel, a);
                    break;
                case rk.i /*13*/:
                    str9 = buf.k(parcel, a);
                    break;
                case rk.bV /*14*/:
                    str10 = buf.k(parcel, a);
                    break;
                case rk.bY /*15*/:
                    str11 = buf.k(parcel, a);
                    break;
                case rk.bX /*16*/:
                    str12 = buf.k(parcel, a);
                    break;
                case rk.bZ /*17*/:
                    str13 = buf.k(parcel, a);
                    break;
                case rk.bW /*18*/:
                    strArr = buf.q(parcel, a);
                    break;
                case rk.m /*19*/:
                    strArr2 = buf.q(parcel, a);
                    break;
                case rk.h /*20*/:
                    strArr3 = buf.q(parcel, a);
                    break;
                case rk.g /*21*/:
                    str14 = buf.k(parcel, a);
                    break;
                case rk.bE /*22*/:
                    str15 = buf.k(parcel, a);
                    break;
                case rk.bD /*23*/:
                    bArr = buf.n(parcel, a);
                    break;
                case rk.bP /*24*/:
                    i4 = buf.e(parcel, a);
                    break;
                case rk.bO /*25*/:
                    i5 = buf.e(parcel, a);
                    break;
                case rk.k /*26*/:
                    i6 = buf.e(parcel, a);
                    break;
                case rk.q /*27*/:
                    i7 = buf.e(parcel, a);
                    break;
                case rk.n /*28*/:
                    str16 = buf.k(parcel, a);
                    break;
                case 29:
                    str17 = buf.k(parcel, a);
                    break;
                case 30:
                    str18 = buf.k(parcel, a);
                    break;
                case 31:
                    bundle = buf.m(parcel, a);
                    break;
                case 32:
                    z = buf.c(parcel, a);
                    break;
                case 33:
                    i8 = buf.e(parcel, a);
                    break;
                case 34:
                    i9 = buf.e(parcel, a);
                    break;
                case 35:
                    z2 = buf.c(parcel, a);
                    break;
                case 36:
                    str19 = buf.k(parcel, a);
                    break;
                case 37:
                    str20 = buf.k(parcel, a);
                    break;
                case 38:
                    i10 = buf.e(parcel, a);
                    break;
                case 39:
                    str21 = buf.k(parcel, a);
                    break;
                case 40:
                    str22 = buf.k(parcel, a);
                    break;
                case 41:
                    str23 = buf.k(parcel, a);
                    break;
                case 42:
                    str24 = buf.k(parcel, a);
                    break;
                case 43:
                    str25 = buf.k(parcel, a);
                    break;
                case 44:
                    str26 = buf.k(parcel, a);
                    break;
                case 45:
                    str27 = buf.k(parcel, a);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) buf.a(parcel, a, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = buf.k(parcel, a);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) buf.b(parcel, a, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = buf.q(parcel, a);
                    break;
                case 50:
                    z3 = buf.c(parcel, a);
                    break;
                case 51:
                    str29 = buf.k(parcel, a);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) buf.a(parcel, a, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) buf.a(parcel, a, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = buf.k(parcel, a);
                    break;
                case 55:
                    z4 = buf.c(parcel, a);
                    break;
                case 56:
                    bundle2 = buf.m(parcel, a);
                    break;
                case 57:
                    list = buf.c(parcel, a, RectF.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ErrorReport(i, applicationErrorReport, str, i2, str2, str3, str4, str5, str6, str7, str8, i3, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i4, i5, i6, i7, str16, str17, str18, bundle, z, i8, i9, z2, str19, str20, i10, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, list);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
