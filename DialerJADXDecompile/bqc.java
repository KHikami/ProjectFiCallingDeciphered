import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;

public final class bqc implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Account account = null;
        int b = buf.b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    i = buf.e(parcel, a);
                    break;
                case rl.e /*3*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.f /*4*/:
                    account = (Account) buf.a(parcel, a, Account.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountChangeEventsRequest(i2, i, str, account);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }
}
