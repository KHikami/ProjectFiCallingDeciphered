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

/* renamed from: ham */
public final class ham implements Creator<GoogleHelp> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
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
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.z /*3*/:
                    account = (Account) gwb.a(parcel, a, Account.CREATOR);
                    break;
                case wi.h /*4*/:
                    bundle = gwb.n(parcel, a);
                    break;
                case wi.p /*5*/:
                    z = gwb.c(parcel, a);
                    break;
                case wi.s /*6*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.q /*7*/:
                    list = gwb.s(parcel, a);
                    break;
                case wi.dr /*10*/:
                    bundle2 = gwb.n(parcel, a);
                    break;
                case wi.dB /*11*/:
                    bitmap2 = (Bitmap) gwb.a(parcel, a, Bitmap.CREATOR);
                    break;
                case wi.g /*14*/:
                    str4 = gwb.l(parcel, a);
                    break;
                case wi.dJ /*15*/:
                    uri = (Uri) gwb.a(parcel, a, Uri.CREATOR);
                    break;
                case wi.dI /*16*/:
                    list2 = gwb.c(parcel, a, OverflowMenuItem.CREATOR);
                    break;
                case wi.dK /*17*/:
                    i4 = gwb.f(parcel, a);
                    break;
                case wi.dH /*18*/:
                    list3 = gwb.c(parcel, a, OfflineSuggestion.CREATOR);
                    break;
                case wi.dL /*19*/:
                    bArr = gwb.o(parcel, a);
                    break;
                case wi.k /*20*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.f /*21*/:
                    i3 = gwb.f(parcel, a);
                    break;
                case wi.e /*22*/:
                    z3 = gwb.c(parcel, a);
                    break;
                case wi.do /*23*/:
                    errorReport = (ErrorReport) gwb.a(parcel, a, ErrorReport.CREATOR);
                    break;
                case wi.dz /*25*/:
                    themeSettings = (ThemeSettings) gwb.a(parcel, a, ThemeSettings.CREATOR);
                    break;
                case wi.o /*28*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case 31:
                    togglingData = (TogglingData) gwb.a(parcel, a, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = gwb.f(parcel, a);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) gwb.a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = gwb.l(parcel, a);
                    break;
                case 35:
                    bitmap = (Bitmap) gwb.a(parcel, a, Bitmap.CREATOR);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
