package defpackage;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: hyp */
final class hyp implements Runnable {
    final /* synthetic */ MessageEventParcelable a;
    final /* synthetic */ hyn b;

    hyp(hyn hyn, MessageEventParcelable messageEventParcelable) {
        this.b = hyn;
        this.a = messageEventParcelable;
    }

    public void run() {
        this.b.a.a(this.a);
    }
}
