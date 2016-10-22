import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.AbsSavedState;

public class jwj extends AbsSavedState {
    public static final Creator<jwj> CREATOR;

    public jwj(Parcel parcel) {
        super(parcel);
    }

    public jwj(Parcelable parcelable) {
        super(parcelable);
    }

    static {
        CREATOR = new jwk();
    }
}
