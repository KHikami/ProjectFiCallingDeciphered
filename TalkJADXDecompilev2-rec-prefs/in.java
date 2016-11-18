package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class in {
    final IntentFilter f18097a;
    final BroadcastReceiver f18098b;
    boolean f18099c;

    in(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f18097a = intentFilter;
        this.f18098b = broadcastReceiver;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("Receiver{");
        stringBuilder.append(this.f18098b);
        stringBuilder.append(" filter=");
        stringBuilder.append(this.f18097a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
