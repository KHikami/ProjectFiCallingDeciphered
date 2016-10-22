package defpackage;

import android.content.Context;
import com.android.dialer.app.interactions.UndemoteOutgoingCallReceiver;

/* compiled from: PG */
/* renamed from: apq */
public final class apq extends Thread {
    private /* synthetic */ Context a;
    private /* synthetic */ String b;
    private /* synthetic */ UndemoteOutgoingCallReceiver c;

    public apq(UndemoteOutgoingCallReceiver undemoteOutgoingCallReceiver, Context context, String str) {
        this.c = undemoteOutgoingCallReceiver;
        this.a = context;
        this.b = str;
    }

    public final void run() {
        UndemoteOutgoingCallReceiver undemoteOutgoingCallReceiver = this.c;
        long a = UndemoteOutgoingCallReceiver.a(this.a, this.b);
        if (a != -1) {
            UndemoteOutgoingCallReceiver undemoteOutgoingCallReceiver2 = this.c;
            UndemoteOutgoingCallReceiver.a(this.a, a);
        }
    }
}
