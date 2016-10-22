import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class apn implements aay, Parcelable {
    public static final Creator CREATOR;
    long a;
    String b;
    String c;
    String d;
    long e;
    String f;
    String g;

    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    public final /* synthetic */ boolean a(Object obj, Context context) {
        return abn.a("vnd.android.cursor.item/phone_v2", this.b, "vnd.android.cursor.item/phone_v2", ((apn) obj).b);
    }

    static {
        CREATOR = new apo();
    }

    apn(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.b;
    }
}
