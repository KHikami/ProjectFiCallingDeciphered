package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.chromium.base.library_loader.Linker.LibInfo;

public final class oug implements Creator<LibInfo> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LibInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LibInfo(parcel);
    }
}
