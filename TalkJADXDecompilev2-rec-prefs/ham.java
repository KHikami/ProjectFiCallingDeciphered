package p000;

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

public final class ham implements Creator<GoogleHelp> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        int i = 0;
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        boolean z = false;
        boolean z2 = false;
        List list = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        Uri uri = null;
        List list2 = null;
        int i4 = 0;
        ThemeSettings themeSettings = null;
        List list3 = null;
        boolean z3 = false;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        int i5 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 2:
                    str = gwb.m2288l(parcel, a);
                    break;
                case 3:
                    account = (Account) gwb.m1578a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    bundle = gwb.m2304n(parcel, a);
                    break;
                case 5:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 6:
                    z2 = gwb.m2114c(parcel, a);
                    break;
                case 7:
                    list = gwb.m2347s(parcel, a);
                    break;
                case 10:
                    bundle2 = gwb.m2304n(parcel, a);
                    break;
                case 11:
                    bitmap2 = (Bitmap) gwb.m1578a(parcel, a, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = gwb.m2288l(parcel, a);
                    break;
                case 15:
                    uri = (Uri) gwb.m1578a(parcel, a, Uri.CREATOR);
                    break;
                case 16:
                    list2 = gwb.m2089c(parcel, a, OverflowMenuItem.CREATOR);
                    break;
                case wi.dK /*17*/:
                    i4 = gwb.m2189f(parcel, a);
                    break;
                case wi.dH /*18*/:
                    list3 = gwb.m2089c(parcel, a, OfflineSuggestion.CREATOR);
                    break;
                case wi.dL /*19*/:
                    bArr = gwb.m2319o(parcel, a);
                    break;
                case 20:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                case 21:
                    i3 = gwb.m2189f(parcel, a);
                    break;
                case 22:
                    z3 = gwb.m2114c(parcel, a);
                    break;
                case wi.f29038do /*23*/:
                    errorReport = (ErrorReport) gwb.m1578a(parcel, a, ErrorReport.CREATOR);
                    break;
                case wi.dz /*25*/:
                    themeSettings = (ThemeSettings) gwb.m1578a(parcel, a, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 31:
                    togglingData = (TogglingData) gwb.m1578a(parcel, a, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = gwb.m2189f(parcel, a);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) gwb.m1578a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = gwb.m2288l(parcel, a);
                    break;
                case 35:
                    bitmap = (Bitmap) gwb.m1578a(parcel, a, Bitmap.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
