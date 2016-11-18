package p000;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

final class hyw implements Runnable {
    final /* synthetic */ ChannelEventParcelable f17483a;
    final /* synthetic */ hyn f17484b;

    hyw(hyn hyn, ChannelEventParcelable channelEventParcelable) {
        this.f17484b = hyn;
        this.f17483a = channelEventParcelable;
    }

    public void run() {
        this.f17483a.m10044a(this.f17484b.f17465a);
    }
}
