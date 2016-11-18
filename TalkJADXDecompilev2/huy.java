package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.internal.autocomplete.ParcelableLoadContactGroupFieldsOptions;

public final class huy implements Creator<ParcelableLoadContactGroupFieldsOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ParcelableLoadContactGroupFieldsOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableLoadContactGroupFieldsOptions(i, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
