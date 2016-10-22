package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

/* renamed from: cko */
public final class cko implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        int i = 0;
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        List list = null;
        Bundle bundle2 = null;
        Bitmap bitmap = null;
        byte[] bArr = null;
        int i4 = 0;
        int i5 = 0;
        String str3 = null;
        Uri uri = null;
        List list2 = null;
        int i6 = 0;
        ThemeSettings themeSettings = null;
        List list3 = null;
        boolean z3 = false;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        int i7 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    account = (Account) buf.a(parcel, a, Account.CREATOR);
                    break;
                case rl.f /*4*/:
                    bundle = buf.m(parcel, a);
                    break;
                case rl.g /*5*/:
                    z = buf.c(parcel, a);
                    break;
                case rl.i /*6*/:
                    z2 = buf.c(parcel, a);
                    break;
                case rl.h /*7*/:
                    list = buf.s(parcel, a);
                    break;
                case rl.m /*10*/:
                    bundle2 = buf.m(parcel, a);
                    break;
                case rl.n /*11*/:
                    bitmap = (Bitmap) buf.a(parcel, a, Bitmap.CREATOR);
                    break;
                case rk.bV /*14*/:
                    str3 = buf.k(parcel, a);
                    break;
                case rk.bY /*15*/:
                    uri = (Uri) buf.a(parcel, a, Uri.CREATOR);
                    break;
                case rk.bX /*16*/:
                    list2 = buf.c(parcel, a, OverflowMenuItem.CREATOR);
                    break;
                case rk.bZ /*17*/:
                    i6 = buf.e(parcel, a);
                    break;
                case rk.bW /*18*/:
                    list3 = buf.c(parcel, a, OfflineSuggestion.CREATOR);
                    break;
                case rk.m /*19*/:
                    bArr = buf.n(parcel, a);
                    break;
                case rk.h /*20*/:
                    i4 = buf.e(parcel, a);
                    break;
                case rk.g /*21*/:
                    i5 = buf.e(parcel, a);
                    break;
                case rk.bE /*22*/:
                    z3 = buf.c(parcel, a);
                    break;
                case rk.bD /*23*/:
                    errorReport = (ErrorReport) buf.a(parcel, a, ErrorReport.CREATOR);
                    break;
                case rk.bO /*25*/:
                    themeSettings = (ThemeSettings) buf.a(parcel, a, ThemeSettings.CREATOR);
                    break;
                case rk.n /*28*/:
                    str2 = buf.k(parcel, a);
                    break;
                case 29:
                    i2 = buf.e(parcel, a);
                    break;
                case 30:
                    i3 = buf.e(parcel, a);
                    break;
                case 31:
                    togglingData = (TogglingData) buf.a(parcel, a, TogglingData.CREATOR);
                    break;
                case 32:
                    i7 = buf.e(parcel, a);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) buf.a(parcel, a, PendingIntent.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleHelp(i, str, account, bundle, str2, i2, i3, z, z2, list, bundle2, bitmap, bArr, i4, i5, str3, uri, list2, i6, themeSettings, list3, z3, errorReport, togglingData, i7, pendingIntent);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
