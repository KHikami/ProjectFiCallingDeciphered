import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.hangouts.phone.SmsAccountPickerActivity;

final class eph implements Creator<SmsAccountPickerActivity> {
    eph() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new SmsAccountPickerActivity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SmsAccountPickerActivity();
    }
}
