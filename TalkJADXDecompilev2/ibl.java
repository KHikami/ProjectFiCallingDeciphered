package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

public final class ibl implements Creator<AncsNotificationParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    i2 = gwb.f(parcel, a);
                    break;
                case 3:
                    str = gwb.l(parcel, a);
                    break;
                case 4:
                    str2 = gwb.l(parcel, a);
                    break;
                case 5:
                    str3 = gwb.l(parcel, a);
                    break;
                case 6:
                    str4 = gwb.l(parcel, a);
                    break;
                case 7:
                    str5 = gwb.l(parcel, a);
                    break;
                case 8:
                    str6 = gwb.l(parcel, a);
                    break;
                case 9:
                    b2 = gwb.d(parcel, a);
                    break;
                case 10:
                    b3 = gwb.d(parcel, a);
                    break;
                case 11:
                    b4 = gwb.d(parcel, a);
                    break;
                case 12:
                    b5 = gwb.d(parcel, a);
                    break;
                case 13:
                    str7 = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AncsNotificationParcelable(i, i2, str, str2, str3, str4, str5, str6, b2, b3, b4, b5, str7);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
