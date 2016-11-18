package p000;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class bta implements Parcelable {
    public static final Creator<bta> CREATOR = new btb();
    public String f4358a;
    public String f4359b;
    public int f4360c;
    public int f4361d;
    public String f4362e;
    public double f4363f;
    public double f4364g;
    public String f4365h;
    public String f4366i;
    public String f4367j;
    public String f4368k;
    public String f4369l;
    public int f4370m;
    public int f4371n;
    public byte[] f4372o;
    public boolean f4373p;
    public long f4374q;
    public int f4375r;

    public btc m6573a(Context context) {
        btc btc = btc.UNKNOWN;
        if (ba.m4613b(this.f4367j)) {
            if (this.f4368k == null || this.f4358a == null || (!this.f4358a.startsWith("sticker://") && !this.f4358a.startsWith(gwb.m2249i(context)))) {
                return btc.PHOTO;
            }
            return btc.STICKER;
        } else if ("hangouts/location".equals(this.f4367j)) {
            return btc.LOCATION;
        } else {
            if (ba.m4630d(this.f4367j)) {
                if (this.f4373p) {
                    return btc.VIDEO_MMS;
                }
                return btc.VIDEO;
            } else if (ba.m4623c(this.f4367j)) {
                return btc.AUDIO;
            } else {
                if ("hangouts/gv_voicemail".equals(this.f4367j)) {
                    return btc.GV_VOICEMAIL;
                }
                if (ba.m4636e(this.f4367j)) {
                    return btc.VCARD;
                }
                if ("hangouts/askjane_result".equals(this.f4367j)) {
                    return btc.ASKJANE_RESULT;
                }
                return btc;
            }
        }
    }

    public String m6574a() {
        if (!TextUtils.isEmpty(this.f4359b)) {
            return this.f4359b;
        }
        if (TextUtils.isEmpty(this.f4358a)) {
            return "";
        }
        return this.f4358a;
    }

    public String m6575b() {
        return TextUtils.isEmpty(this.f4369l) ? m6574a() : this.f4369l;
    }

    public boolean m6576b(Context context) {
        btc a = m6573a(context);
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
        if (gwb.m2223g(this.f4358a, bta.f4358a) && gwb.m2223g(this.f4359b, bta.f4359b) && gwb.m2223g(Integer.valueOf(this.f4360c), Integer.valueOf(bta.f4360c)) && gwb.m2223g(Integer.valueOf(this.f4361d), Integer.valueOf(bta.f4361d)) && gwb.m2223g(this.f4362e, bta.f4362e) && gwb.m2223g(Double.valueOf(this.f4363f), Double.valueOf(bta.f4363f)) && gwb.m2223g(Double.valueOf(this.f4364g), Double.valueOf(bta.f4364g)) && gwb.m2223g(this.f4365h, bta.f4365h) && gwb.m2223g(this.f4366i, bta.f4366i) && gwb.m2223g(this.f4367j, bta.f4367j) && gwb.m2223g(this.f4368k, bta.f4368k) && gwb.m2223g(this.f4369l, bta.f4369l) && gwb.m2223g(Integer.valueOf(this.f4370m), Integer.valueOf(bta.f4370m)) && gwb.m2223g(Integer.valueOf(this.f4371n), Integer.valueOf(bta.f4371n)) && gwb.m2223g(this.f4372o, bta.f4372o) && gwb.m2223g(Boolean.valueOf(this.f4373p), Boolean.valueOf(bta.f4373p)) && gwb.m2223g(Long.valueOf(this.f4374q), Long.valueOf(bta.f4374q)) && gwb.m2223g(Integer.valueOf(this.f4375r), Integer.valueOf(bta.f4375r))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.m2074c(this.f4358a, this.f4359b, Integer.valueOf(this.f4360c), Integer.valueOf(this.f4361d), this.f4362e, Double.valueOf(this.f4363f), Double.valueOf(this.f4364g), this.f4365h, this.f4366i, this.f4367j, this.f4368k, this.f4369l, Integer.valueOf(this.f4370m), Integer.valueOf(this.f4371n), this.f4372o, Boolean.valueOf(this.f4373p), Long.valueOf(this.f4374q), Integer.valueOf(this.f4375r));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4358a);
        parcel.writeString(this.f4359b);
        parcel.writeInt(this.f4360c);
        parcel.writeInt(this.f4361d);
        parcel.writeString(this.f4362e);
        parcel.writeDouble(this.f4363f);
        parcel.writeDouble(this.f4364g);
        parcel.writeString(this.f4365h);
        parcel.writeString(this.f4366i);
        parcel.writeString(this.f4367j);
        parcel.writeString(this.f4368k);
        parcel.writeString(this.f4369l);
        parcel.writeInt(this.f4370m);
        parcel.writeInt(this.f4371n);
        parcel.writeByteArray(this.f4372o);
        parcel.writeInt(this.f4373p ? 1 : 0);
        parcel.writeLong(this.f4374q);
        parcel.writeInt(this.f4375r);
    }
}
