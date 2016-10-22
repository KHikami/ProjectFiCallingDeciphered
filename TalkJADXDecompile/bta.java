import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class bta implements Parcelable {
    public static final Creator<bta> CREATOR;
    public String a;
    public String b;
    public int c;
    public int d;
    public String e;
    public double f;
    public double g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public int n;
    public byte[] o;
    public boolean p;
    public long q;
    public int r;

    public btc a(Context context) {
        btc btc = btc.UNKNOWN;
        if (ba.b(this.j)) {
            if (this.k == null || this.a == null || (!this.a.startsWith("sticker://") && !this.a.startsWith(gwb.i(context)))) {
                return btc.PHOTO;
            }
            return btc.STICKER;
        } else if ("hangouts/location".equals(this.j)) {
            return btc.LOCATION;
        } else {
            if (ba.d(this.j)) {
                if (this.p) {
                    return btc.VIDEO_MMS;
                }
                return btc.VIDEO;
            } else if (ba.c(this.j)) {
                return btc.AUDIO;
            } else {
                if ("hangouts/gv_voicemail".equals(this.j)) {
                    return btc.GV_VOICEMAIL;
                }
                if (ba.e(this.j)) {
                    return btc.VCARD;
                }
                if ("hangouts/askjane_result".equals(this.j)) {
                    return btc.ASKJANE_RESULT;
                }
                return btc;
            }
        }
    }

    public String a() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (TextUtils.isEmpty(this.a)) {
            return "";
        }
        return this.a;
    }

    public String b() {
        return TextUtils.isEmpty(this.l) ? a() : this.l;
    }

    public boolean b(Context context) {
        btc a = a(context);
        return a == btc.STICKER || a == btc.PHOTO || a == btc.VIDEO || a == btc.VIDEO_MMS;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bta bta = (bta) obj;
        if (gwb.g(this.a, bta.a) && gwb.g(this.b, bta.b) && gwb.g(Integer.valueOf(this.c), Integer.valueOf(bta.c)) && gwb.g(Integer.valueOf(this.d), Integer.valueOf(bta.d)) && gwb.g(this.e, bta.e) && gwb.g(Double.valueOf(this.f), Double.valueOf(bta.f)) && gwb.g(Double.valueOf(this.g), Double.valueOf(bta.g)) && gwb.g(this.h, bta.h) && gwb.g(this.i, bta.i) && gwb.g(this.j, bta.j) && gwb.g(this.k, bta.k) && gwb.g(this.l, bta.l) && gwb.g(Integer.valueOf(this.m), Integer.valueOf(bta.m)) && gwb.g(Integer.valueOf(this.n), Integer.valueOf(bta.n)) && gwb.g(this.o, bta.o) && gwb.g(Boolean.valueOf(this.p), Boolean.valueOf(bta.p)) && gwb.g(Long.valueOf(this.q), Long.valueOf(bta.q)) && gwb.g(Integer.valueOf(this.r), Integer.valueOf(bta.r))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.c(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, Double.valueOf(this.f), Double.valueOf(this.g), this.h, this.i, this.j, this.k, this.l, Integer.valueOf(this.m), Integer.valueOf(this.n), this.o, Boolean.valueOf(this.p), Long.valueOf(this.q), Integer.valueOf(this.r));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeByteArray(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r);
    }

    static {
        CREATOR = new btb();
    }
}
