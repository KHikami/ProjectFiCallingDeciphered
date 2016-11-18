package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

public final class ag extends lr {
    public static final Creator<ag> CREATOR = gwb.m1577a(new hbe());
    public SparseArray<Parcelable> f581a;

    public ag(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f581a = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f581a.append(iArr[i], readParcelableArray[i]);
        }
    }

    public ag(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        super.writeToParcel(parcel, i);
        int size = this.f581a != null ? this.f581a.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        while (i2 < size) {
            iArr[i2] = this.f581a.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f581a.valueAt(i2);
            i2++;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
