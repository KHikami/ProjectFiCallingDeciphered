package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ThemeSettings;

public final class gzb implements Creator<ThemeSettings> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ThemeSettings[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i3 = gwb.f(parcel, a);
                    break;
                case 2:
                    i2 = gwb.f(parcel, a);
                    break;
                case 3:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ThemeSettings(i3, i2, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
