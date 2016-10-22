import android.content.Context;
import android.os.Parcel;
import java.io.Serializable;

public abstract class eaf implements Serializable {
    private final String a;
    public long b;
    private final int c;
    private int d;
    private int e;

    public abstract void a(Context context, int i, evz evz);

    public eaf(String str, int i) {
        this(str, i, 0, 0);
    }

    public eaf(String str, int i, int i2, int i3) {
        this.a = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.b);
    }

    public eaf(Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.b = parcel.readLong();
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public void e() {
        this.d++;
    }

    public void f() {
        this.e++;
    }
}
