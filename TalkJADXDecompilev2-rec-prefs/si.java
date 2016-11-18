package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class si extends lr {
    public static final Creator<si> CREATOR = gwb.a(new sj());
    public int f35102a = 0;
    public int f35103b;
    public int f35104c;
    public int f35105f;
    public int f35106g;

    public si(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f35102a = parcel.readInt();
        this.f35103b = parcel.readInt();
        this.f35104c = parcel.readInt();
        this.f35105f = parcel.readInt();
        this.f35106g = parcel.readInt();
    }

    public si(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f35102a);
        parcel.writeInt(this.f35103b);
        parcel.writeInt(this.f35104c);
        parcel.writeInt(this.f35105f);
        parcel.writeInt(this.f35106g);
    }
}
