import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;

public final class fdv implements Parcelable {
    public static final Creator<fdv> CREATOR;
    public static final fdv a;
    private int b;
    private String c;
    private String d;
    private long e;
    private int f;
    private String g;
    private String h;
    private String i;
    private int j;
    private mfa<String> k;
    private byte[] l;

    static {
        a = new fdv(1, null, null, 0, null, null, null, 61);
        CREATOR = new fdw();
    }

    public fdv(int i, String str, String str2, int i2, String str3, String str4, String str5, int i3) {
        this.k = mdv.a;
        this.l = new byte[0];
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = glj.a();
        this.f = i2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i3;
    }

    private fdv f() {
        return this.f == 1 ? this : new fdv(this.b, this.c, this.d, this.f, null, null, null, 61);
    }

    public edk a(Context context) {
        boolean z = !TextUtils.isEmpty(this.g);
        edk a = gwb.a(context, this.c, gwb.au(), z, this.h, z ? this.g : this.c, this.f);
        if (this.k.a() && this.l.length > 0) {
            a.a((String) this.k.b(), this.l);
        }
        return a;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public long d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    private int g() {
        return this.j;
    }

    public void a(mfa<beq> mfa_beq) {
        if (mfa_beq.a()) {
            this.k = mfa.b(((beq) mfa_beq.b()).c());
            this.l = ((beq) mfa_beq.b()).d();
            return;
        }
        this.l = new byte[0];
        this.k = mdv.a;
    }

    public Intent a(Context context, int i, String str) {
        boolean z;
        String b = b();
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        dhz a = new dib(str, 1).i(glq.e(context, b)).a(2).a();
        fdv f = f();
        RealTimeChatService.a(i, 1, f);
        Intent a2 = gwb.a(a, ba.a(Arrays.asList(new edk[]{a(context)})), true, g(), glj.b(), false);
        a2.putExtra("recent_call_timestamp", f.d());
        return a2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.f);
        parcel.writeLong(this.e);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k.a() ? (String) this.k.b() : null);
        parcel.writeInt(this.l.length);
        parcel.writeByteArray(this.l);
    }

    fdv(Parcel parcel) {
        this.k = mdv.a;
        this.l = new byte[0];
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readInt();
        this.e = parcel.readLong();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        this.k = mfa.c(parcel.readString());
        this.l = new byte[parcel.readInt()];
        parcel.readByteArray(this.l);
    }
}
