import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public final class csi implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        Scope[] scopeArr = null;
        Account account = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    account = (Account) buf.a(parcel, a, Account.CREATOR);
                    break;
                case rl.e /*3*/:
                    scopeArr = (Scope[]) buf.b(parcel, a, Scope.CREATOR);
                    break;
                case rl.f /*4*/:
                    str = buf.k(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RecordConsentRequest(i, account, scopeArr, str);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecordConsentRequest[i];
    }
}
