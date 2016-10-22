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

public final class cki implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
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
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    bundle = buf.m(parcel, a);
                    break;
                case rl.g /*5*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.i /*6*/:
                    applicationErrorReport = (ApplicationErrorReport) buf.a(parcel, a, ApplicationErrorReport.CREATOR);
                    break;
                case rl.h /*7*/:
                    str3 = buf.k(parcel, a);
                    break;
                case rl.j /*8*/:
                    bitmapTeleporter = (BitmapTeleporter) buf.a(parcel, a, BitmapTeleporter.CREATOR);
                    break;
                case rl.l /*9*/:
                    str4 = buf.k(parcel, a);
                    break;
                case rl.m /*10*/:
                    arrayList = buf.c(parcel, a, FileTeleporter.CREATOR);
                    break;
                case rl.n /*11*/:
                    z = buf.c(parcel, a);
                    break;
                case rl.k /*12*/:
                    themeSettings = (ThemeSettings) buf.a(parcel, a, ThemeSettings.CREATOR);
                    break;
                case rk.i /*13*/:
                    logOptions = (LogOptions) buf.a(parcel, a, LogOptions.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FeedbackOptions(i, str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
