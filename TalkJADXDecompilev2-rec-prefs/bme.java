package p000;

import android.text.Html;
import android.text.TextUtils;

public final class bme {
    public final int f3914A;
    public final int f3915B;
    public final String f3916C;
    public final int f3917D;
    public final String f3918E;
    public final String f3919F;
    public final String f3920G;
    public final int f3921H;
    public final long f3922I;
    public final int f3923J;
    public final int f3924K;
    public final byte[] f3925L;
    private String f3926M = null;
    public final String f3927a;
    public final String f3928b;
    public final String f3929c;
    public final String f3930d;
    public final String f3931e;
    public final fwx f3932f;
    public final fwy f3933g;
    public final long f3934h;
    public final long f3935i;
    public final String f3936j;
    public final String f3937k;
    public final String f3938l;
    public final String f3939m;
    public final String f3940n;
    public final String f3941o;
    public final String f3942p;
    public final String f3943q;
    public final double f3944r;
    public final double f3945s;
    public final String f3946t;
    public final String f3947u;
    public final String f3948v;
    public final String f3949w;
    public final int f3950x;
    public final String f3951y;
    public final int f3952z;

    public bme(String str, String str2, String str3, String str4, String str5, fwx fwx, fwy fwy, long j, long j2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, double d, double d2, String str13, String str14, int i, String str15, int i2, int i3, int i4, String str16, int i5, String str17, String str18, String str19, int i6, String str20, String str21, String str22, long j3, int i7, int i8, byte[] bArr) {
        this.f3927a = str;
        this.f3928b = str2;
        this.f3929c = str3;
        this.f3930d = str4;
        this.f3931e = str5;
        this.f3932f = fwx;
        this.f3933g = fwy;
        this.f3934h = j;
        this.f3935i = j2;
        this.f3936j = str6;
        this.f3937k = str7;
        this.f3938l = str8;
        this.f3939m = str9;
        this.f3940n = str10;
        this.f3941o = str11;
        this.f3942p = str12;
        this.f3943q = str22;
        this.f3944r = d;
        this.f3945s = d2;
        this.f3946t = str13;
        this.f3947u = str14;
        this.f3948v = str20;
        this.f3949w = str21;
        this.f3950x = i;
        this.f3951y = str15;
        this.f3952z = i2;
        this.f3914A = i3;
        this.f3915B = i4;
        this.f3916C = str16;
        this.f3917D = i5;
        this.f3918E = str17;
        this.f3919F = str18;
        this.f3920G = str19;
        this.f3921H = i6;
        this.f3922I = j3;
        this.f3923J = i7;
        this.f3924K = i8;
        this.f3925L = bArr;
    }

    public String m6159a() {
        if (this.f3926M == null) {
            if (TextUtils.isEmpty(this.f3931e)) {
                this.f3926M = "";
            } else if (this.f3950x == 3) {
                this.f3926M = this.f3931e;
            } else {
                this.f3926M = Html.fromHtml(this.f3931e).toString();
            }
        }
        return this.f3926M;
    }
}
