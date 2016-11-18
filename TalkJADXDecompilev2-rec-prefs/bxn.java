package p000;

import android.os.Parcel;
import java.io.Serializable;
import java.util.Random;

public class bxn implements Serializable {
    private static final Random f4738f = mfo.f27617a;
    public String f4739a;
    public String f4740b;
    public bxo f4741c;
    public String f4742d;
    public final String f4743e;

    protected bxn() {
        String valueOf = String.valueOf("client_generated:");
        this.f4743e = new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(Math.abs(f4738f.nextLong())).toString();
    }

    protected void m6897a(Parcel parcel) {
        parcel.writeInt(this.f4741c.ordinal());
        parcel.writeString(this.f4740b);
        parcel.writeString(this.f4739a);
        parcel.writeString(this.f4742d);
        parcel.writeString(this.f4743e);
    }

    protected bxn(Parcel parcel) {
        this.f4741c = bxo.values()[parcel.readInt()];
        this.f4740b = parcel.readString();
        this.f4739a = parcel.readString();
        this.f4742d = parcel.readString();
        this.f4743e = parcel.readString();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f4741c);
        String str = this.f4740b;
        String str2 = this.f4742d;
        String str3 = this.f4739a;
        String str4 = this.f4743e;
        return new StringBuilder(((((String.valueOf(valueOf).length() + 67) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("attachmentType: ").append(valueOf).append(" id: ").append(str).append(" contentType: ").append(str2).append(" uriToSend: ").append(str3).append(" clientGeneratedId: ").append(str4).toString();
    }
}
