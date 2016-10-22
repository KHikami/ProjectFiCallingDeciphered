import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public final class bpz implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int b = buf.b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str6 = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    str5 = buf.k(parcel, a);
                    break;
                case rl.f /*4*/:
                    str4 = buf.k(parcel, a);
                    break;
                case rl.g /*5*/:
                    str3 = buf.k(parcel, a);
                    break;
                case rl.i /*6*/:
                    uri = (Uri) buf.a(parcel, a, Uri.CREATOR);
                    break;
                case rl.h /*7*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.j /*8*/:
                    j = buf.g(parcel, a);
                    break;
                case rl.l /*9*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.m /*10*/:
                    list = buf.c(parcel, a, Scope.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInAccount(i, str6, str5, str4, str3, uri, str2, j, str, list);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
