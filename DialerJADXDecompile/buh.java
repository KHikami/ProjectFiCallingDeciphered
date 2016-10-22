import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class buh implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Account account = null;
        int b = buf.b(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i3 = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    i2 = buf.e(parcel, a);
                    break;
                case rl.e /*3*/:
                    i = buf.e(parcel, a);
                    break;
                case rl.f /*4*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.g /*5*/:
                    iBinder = buf.l(parcel, a);
                    break;
                case rl.i /*6*/:
                    scopeArr = (Scope[]) buf.b(parcel, a, Scope.CREATOR);
                    break;
                case rl.h /*7*/:
                    bundle = buf.m(parcel, a);
                    break;
                case rl.j /*8*/:
                    account = (Account) buf.a(parcel, a, Account.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetServiceRequest(i3, i2, i, str, iBinder, scopeArr, bundle, account);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
