package p000;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

final class hyp implements Runnable {
    final /* synthetic */ MessageEventParcelable f17469a;
    final /* synthetic */ hyn f17470b;

    hyp(hyn hyn, MessageEventParcelable messageEventParcelable) {
        this.f17470b = hyn;
        this.f17469a = messageEventParcelable;
    }

    public void run() {
        this.f17470b.f17465a.mo1276a(this.f17469a);
    }
}
