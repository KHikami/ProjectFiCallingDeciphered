package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: in */
final class in {
    final IntentFilter a;
    final BroadcastReceiver b;
    boolean c;

    in(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.a = intentFilter;
        this.b = broadcastReceiver;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("Receiver{");
        stringBuilder.append(this.b);
        stringBuilder.append(" filter=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
