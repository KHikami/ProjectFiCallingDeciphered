package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hxo;
import ibn;
import wi;

public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Creator<ChannelEventParcelable> CREATOR;
    final int a;
    final ChannelImpl b;
    final int c;
    final int d;
    final int e;

    static {
        CREATOR = new ibn();
    }

    public ChannelEventParcelable(int i, ChannelImpl channelImpl, int i2, int i3, int i4) {
        this.a = i;
        this.b = channelImpl;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public void a(hxo hxo) {
        switch (this.c) {
            case wi.j /*1*/:
            case wi.l /*2*/:
            case wi.z /*3*/:
            case wi.h /*4*/:
            default:
                new StringBuilder(25).append("Unknown type: ").append(this.c);
        }
    }

    public String toString() {
        Object obj;
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        int i2 = this.c;
        switch (i2) {
            case wi.j /*1*/:
                obj = "CHANNEL_OPENED";
                break;
            case wi.l /*2*/:
                obj = "CHANNEL_CLOSED";
                break;
            case wi.z /*3*/:
                obj = "INPUT_CLOSED";
                break;
            case wi.h /*4*/:
                obj = "OUTPUT_CLOSED";
                break;
            default:
                obj = Integer.toString(i2);
                break;
        }
        String valueOf2 = String.valueOf(obj);
        i2 = this.d;
        switch (i2) {
            case wi.w /*0*/:
                obj = "CLOSE_REASON_NORMAL";
                break;
            case wi.j /*1*/:
                obj = "CLOSE_REASON_DISCONNECTED";
                break;
            case wi.l /*2*/:
                obj = "CLOSE_REASON_REMOTE_CLOSE";
                break;
            case wi.z /*3*/:
                obj = "CLOSE_REASON_LOCAL_CLOSE";
                break;
            default:
                obj = Integer.toString(i2);
                break;
        }
        String valueOf3 = String.valueOf(obj);
        return new StringBuilder(((String.valueOf(valueOf).length() + 104) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("ChannelEventParcelable[versionCode=").append(i).append(", channel=").append(valueOf).append(", type=").append(valueOf2).append(", closeReason=").append(valueOf3).append(", appErrorCode=").append(this.e).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, i, false);
        gwb.d(parcel, 3, this.c);
        gwb.d(parcel, 4, this.d);
        gwb.d(parcel, 5, this.e);
        gwb.v(parcel, c);
    }
}
