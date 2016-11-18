package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;

public final class fdv implements Parcelable {
    public static final Creator<fdv> CREATOR = new fdw();
    public static final fdv f12822a = new fdv(1, null, null, 0, null, null, null, 61);
    private int f12823b;
    private String f12824c;
    private String f12825d;
    private long f12826e;
    private int f12827f;
    private String f12828g;
    private String f12829h;
    private String f12830i;
    private int f12831j;
    private mfa<String> f12832k;
    private byte[] f12833l;

    public fdv(int i, String str, String str2, int i2, String str3, String str4, String str5, int i3) {
        this.f12832k = mdv.f27537a;
        this.f12833l = new byte[0];
        this.f12823b = i;
        this.f12824c = str;
        this.f12825d = str2;
        this.f12826e = glj.m17956a();
        this.f12827f = i2;
        this.f12828g = str3;
        this.f12829h = str4;
        this.f12830i = str5;
        this.f12831j = i3;
    }

    private fdv m15101f() {
        return this.f12827f == 1 ? this : new fdv(this.f12823b, this.f12824c, this.f12825d, this.f12827f, null, null, null, 61);
    }

    public edk m15105a(Context context) {
        boolean z = !TextUtils.isEmpty(this.f12828g);
        edk a = gwb.m1599a(context, this.f12824c, gwb.au(), z, this.f12829h, z ? this.f12828g : this.f12824c, this.f12827f);
        if (this.f12832k.mo3733a() && this.f12833l.length > 0) {
            a.m13588a((String) this.f12832k.mo3734b(), this.f12833l);
        }
        return a;
    }

    public int m15103a() {
        return this.f12823b;
    }

    public String m15107b() {
        return this.f12824c;
    }

    public String m15108c() {
        return this.f12825d;
    }

    public long m15109d() {
        return this.f12826e;
    }

    public int m15110e() {
        return this.f12827f;
    }

    private int m15102g() {
        return this.f12831j;
    }

    public void m15106a(mfa<beq> mfa_beq) {
        if (mfa_beq.mo3733a()) {
            this.f12832k = mfa.m31910b(((beq) mfa_beq.mo3734b()).m5011c());
            this.f12833l = ((beq) mfa_beq.mo3734b()).m5012d();
            return;
        }
        this.f12833l = new byte[0];
        this.f12832k = mdv.f27537a;
    }

    public Intent m15104a(Context context, int i, String str) {
        boolean z;
        String b = m15107b();
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        dhz a = new dib(str, 1).m11920i(glq.m18021e(context, b)).m11911a(2).m11910a();
        fdv f = m15101f();
        RealTimeChatService.m8992a(i, 1, f);
        Intent a2 = gwb.m1549a(a, ba.m4541a(Arrays.asList(new edk[]{m15105a(context)})), true, m15102g(), glj.m17963b(), false);
        a2.putExtra("recent_call_timestamp", f.m15109d());
        return a2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12823b);
        parcel.writeString(this.f12824c);
        parcel.writeString(this.f12825d);
        parcel.writeInt(this.f12827f);
        parcel.writeLong(this.f12826e);
        parcel.writeString(this.f12828g);
        parcel.writeString(this.f12829h);
        parcel.writeString(this.f12830i);
        parcel.writeInt(this.f12831j);
        parcel.writeString(this.f12832k.mo3733a() ? (String) this.f12832k.mo3734b() : null);
        parcel.writeInt(this.f12833l.length);
        parcel.writeByteArray(this.f12833l);
    }

    fdv(Parcel parcel) {
        this.f12832k = mdv.f27537a;
        this.f12833l = new byte[0];
        this.f12823b = parcel.readInt();
        this.f12824c = parcel.readString();
        this.f12825d = parcel.readString();
        this.f12827f = parcel.readInt();
        this.f12826e = parcel.readLong();
        this.f12828g = parcel.readString();
        this.f12829h = parcel.readString();
        this.f12830i = parcel.readString();
        this.f12831j = parcel.readInt();
        this.f12832k = mfa.m31911c(parcel.readString());
        this.f12833l = new byte[parcel.readInt()];
        parcel.readByteArray(this.f12833l);
    }
}
