package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public final class gtb implements Creator<GoogleSignInAccount> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.m1970b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = gwb.m2288l(parcel, a);
                    break;
                case 4:
                    str3 = gwb.m2288l(parcel, a);
                    break;
                case 5:
                    str4 = gwb.m2288l(parcel, a);
                    break;
                case 6:
                    uri = (Uri) gwb.m1578a(parcel, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = gwb.m2288l(parcel, a);
                    break;
                case 8:
                    j = gwb.m2227h(parcel, a);
                    break;
                case 9:
                    str6 = gwb.m2288l(parcel, a);
                    break;
                case 10:
                    list = gwb.m2089c(parcel, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = gwb.m2288l(parcel, a);
                    break;
                case 12:
                    str8 = gwb.m2288l(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
