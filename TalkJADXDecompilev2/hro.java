package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;

public final class hro implements Creator<GoogleMapOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        int i = 0;
        byte b2 = (byte) -1;
        byte b3 = (byte) -1;
        int i2 = 0;
        CameraPosition cameraPosition = null;
        byte b4 = (byte) -1;
        byte b5 = (byte) -1;
        byte b6 = (byte) -1;
        byte b7 = (byte) -1;
        byte b8 = (byte) -1;
        byte b9 = (byte) -1;
        byte b10 = (byte) -1;
        byte b11 = (byte) -1;
        byte b12 = (byte) -1;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case 1:
                    i = gwb.f(parcel, a);
                    break;
                case 2:
                    b2 = gwb.d(parcel, a);
                    break;
                case 3:
                    b3 = gwb.d(parcel, a);
                    break;
                case 4:
                    i2 = gwb.f(parcel, a);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) gwb.a(parcel, a, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = gwb.d(parcel, a);
                    break;
                case 7:
                    b5 = gwb.d(parcel, a);
                    break;
                case 8:
                    b6 = gwb.d(parcel, a);
                    break;
                case 9:
                    b7 = gwb.d(parcel, a);
                    break;
                case 10:
                    b8 = gwb.d(parcel, a);
                    break;
                case 11:
                    b9 = gwb.d(parcel, a);
                    break;
                case 12:
                    b10 = gwb.d(parcel, a);
                    break;
                case 14:
                    b11 = gwb.d(parcel, a);
                    break;
                case 15:
                    b12 = gwb.d(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleMapOptions(i, b2, b3, i2, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}