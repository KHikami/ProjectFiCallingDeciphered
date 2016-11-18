package defpackage;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

final class hyw implements Runnable {
    final /* synthetic */ ChannelEventParcelable a;
    final /* synthetic */ hyn b;

    hyw(hyn hyn, ChannelEventParcelable channelEventParcelable) {
        this.b = hyn;
        this.a = channelEventParcelable;
    }

    public void run() {
        this.a.a(this.b.a);
    }
}
