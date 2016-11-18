package p000;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

public final class gyy implements Creator<FeedbackOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        int i = 0;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        boolean z = false;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
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
                    bundle = gwb.m2304n(parcel, a);
                    break;
                case 5:
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) gwb.m1578a(parcel, a, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = gwb.m2288l(parcel, a);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) gwb.m1578a(parcel, a, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = gwb.m2288l(parcel, a);
                    break;
                case 10:
                    arrayList = gwb.m2089c(parcel, a, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = gwb.m2114c(parcel, a);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) gwb.m1578a(parcel, a, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) gwb.m1578a(parcel, a, LogOptions.CREATOR);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FeedbackOptions(i, str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
