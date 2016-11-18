package defpackage;

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
        int b = gwb.b(parcel);
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
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    str = gwb.l(parcel, a);
                    break;
                case 3:
                    str2 = gwb.l(parcel, a);
                    break;
                case 4:
                    str3 = gwb.l(parcel, a);
                    break;
                case 5:
                    str4 = gwb.l(parcel, a);
                    break;
                case 6:
                    uri = (Uri) gwb.a(parcel, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = gwb.l(parcel, a);
                    break;
                case 8:
                    j = gwb.h(parcel, a);
                    break;
                case 9:
                    str6 = gwb.l(parcel, a);
                    break;
                case 10:
                    list = gwb.c(parcel, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = gwb.l(parcel, a);
                    break;
                case 12:
                    str8 = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
