package defpackage;

import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

/* renamed from: hyn */
final class hyn extends iaa {
    final /* synthetic */ hym a;
    private volatile int b;

    hyn(hym hym) {
        this.a = hym;
        this.b = -1;
    }

    private boolean a(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            String.format("%s: %s %s", new Object[]{str, this.a.a, obj});
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (gtv.a(this.a, callingUid)) {
                this.b = callingUid;
            } else {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }
        synchronized (this.a.c) {
            if (this.a.d) {
                return false;
            }
            this.a.b.post(runnable);
            return true;
        }
    }

    public void a(DataHolder dataHolder) {
        try {
            if (!a(new hyo(this, dataHolder), "onDataItemChanged", dataHolder)) {
            }
        } finally {
            dataHolder.close();
        }
    }

    public void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        a(new hyv(this, amsEntityUpdateParcelable), "onEntityUpdate", amsEntityUpdateParcelable);
    }

    public void a(AncsNotificationParcelable ancsNotificationParcelable) {
        a(new hyu(this, ancsNotificationParcelable), "onNotificationReceived", ancsNotificationParcelable);
    }

    public void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        a(new hyt(this, capabilityInfoParcelable), "onConnectedCapabilityChanged", capabilityInfoParcelable);
    }

    public void a(ChannelEventParcelable channelEventParcelable) {
        a(new hyw(this, channelEventParcelable), "onChannelEvent", channelEventParcelable);
    }

    public void a(MessageEventParcelable messageEventParcelable) {
        a(new hyp(this, messageEventParcelable), "onMessageReceived", messageEventParcelable);
    }

    public void a(NodeParcelable nodeParcelable) {
        a(new hyq(this, nodeParcelable), "onPeerConnected", nodeParcelable);
    }

    public void a(List<NodeParcelable> list) {
        a(new hys(this, list), "onConnectedNodes", list);
    }

    public void b(NodeParcelable nodeParcelable) {
        a(new hyr(this, nodeParcelable), "onPeerDisconnected", nodeParcelable);
    }
}
