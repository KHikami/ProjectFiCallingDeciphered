package defpackage;

import android.os.Parcel;
import java.io.Serializable;
import java.util.Random;

/* renamed from: bxn */
public class bxn implements Serializable {
    private static final Random f;
    public String a;
    public String b;
    public bxo c;
    public String d;
    public final String e;

    protected bxn() {
        String valueOf = String.valueOf("client_generated:");
        this.e = new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(Math.abs(f.nextLong())).toString();
    }

    protected void a(Parcel parcel) {
        parcel.writeInt(this.c.ordinal());
        parcel.writeString(this.b);
        parcel.writeString(this.a);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    protected bxn(Parcel parcel) {
        this.c = bxo.values()[parcel.readInt()];
        this.b = parcel.readString();
        this.a = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    public String toString() {
        String valueOf = String.valueOf(this.c);
        String str = this.b;
        String str2 = this.d;
        String str3 = this.a;
        String str4 = this.e;
        return new StringBuilder(((((String.valueOf(valueOf).length() + 67) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("attachmentType: ").append(valueOf).append(" id: ").append(str).append(" contentType: ").append(str2).append(" uriToSend: ").append(str3).append(" clientGeneratedId: ").append(str4).toString();
    }

    static {
        f = mfo.a;
    }
}
