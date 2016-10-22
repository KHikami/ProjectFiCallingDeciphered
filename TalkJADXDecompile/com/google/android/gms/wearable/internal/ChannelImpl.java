package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;
import gwb;
import ibo;

public class ChannelImpl extends AbstractSafeParcelable implements Channel {
    public static final Creator<ChannelImpl> CREATOR;
    final int a;
    private final String b;
    private final String c;
    private final String d;

    static {
        CREATOR = new ibo();
    }

    public ChannelImpl(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = (String) gwb.L((Object) str);
        this.c = (String) gwb.L((Object) str2);
        this.d = (String) gwb.L((Object) str3);
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.b.equals(channelImpl.b) && gwb.e(channelImpl.c, this.c) && gwb.e(channelImpl.d, this.d) && channelImpl.a == this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        return new StringBuilder(((String.valueOf(str).length() + 66) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("ChannelImpl{versionCode=").append(i).append(", token='").append(str).append("', nodeId='").append(str2).append("', path='").append(str3).append("'}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, c(), false);
        gwb.a(parcel, 3, a(), false);
        gwb.a(parcel, 4, b(), false);
        gwb.v(parcel, c);
    }
}
