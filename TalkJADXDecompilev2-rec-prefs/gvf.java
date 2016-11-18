package p000;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

public final class gvf implements Creator<DataHolder> {
    public /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = gwb.m1970b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.m1498a(parcel);
            switch (gwb.m2390y(a)) {
                case 1:
                    strArr = gwb.m2335q(parcel, a);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) gwb.m2067b(parcel, a, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = gwb.m2189f(parcel, a);
                    break;
                case 4:
                    bundle = gwb.m2304n(parcel, a);
                    break;
                case 1000:
                    i2 = gwb.m2189f(parcel, a);
                    break;
                default:
                    gwb.m2019b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new dt("Overread allowed size end=" + b, parcel);
        }
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.m9675a();
        return dataHolder;
    }
}
