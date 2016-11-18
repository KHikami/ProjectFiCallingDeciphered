package p000;

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

final class hyn extends iaa {
    final /* synthetic */ hym f17465a;
    private volatile int f17466b = -1;

    hyn(hym hym) {
        this.f17465a = hym;
    }

    private boolean m21263a(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            String.format("%s: %s %s", new Object[]{str, this.f17465a.f7207a, obj});
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f17466b) {
            if (gtv.m18569a(this.f17465a, callingUid)) {
                this.f17466b = callingUid;
            } else {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }
        synchronized (this.f17465a.f7209c) {
            if (this.f17465a.f7210d) {
                return false;
            }
            this.f17465a.f7208b.post(runnable);
            return true;
        }
    }

    public void mo3047a(DataHolder dataHolder) {
        try {
            if (!m21263a(new hyo(this, dataHolder), "onDataItemChanged", dataHolder)) {
            }
        } finally {
            dataHolder.close();
        }
    }

    public void mo3048a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        m21263a(new hyv(this, amsEntityUpdateParcelable), "onEntityUpdate", amsEntityUpdateParcelable);
    }

    public void mo3049a(AncsNotificationParcelable ancsNotificationParcelable) {
        m21263a(new hyu(this, ancsNotificationParcelable), "onNotificationReceived", ancsNotificationParcelable);
    }

    public void mo3050a(CapabilityInfoParcelable capabilityInfoParcelable) {
        m21263a(new hyt(this, capabilityInfoParcelable), "onConnectedCapabilityChanged", capabilityInfoParcelable);
    }

    public void mo3051a(ChannelEventParcelable channelEventParcelable) {
        m21263a(new hyw(this, channelEventParcelable), "onChannelEvent", channelEventParcelable);
    }

    public void mo3052a(MessageEventParcelable messageEventParcelable) {
        m21263a(new hyp(this, messageEventParcelable), "onMessageReceived", messageEventParcelable);
    }

    public void mo3053a(NodeParcelable nodeParcelable) {
        m21263a(new hyq(this, nodeParcelable), "onPeerConnected", nodeParcelable);
    }

    public void mo3054a(List<NodeParcelable> list) {
        m21263a(new hys(this, list), "onConnectedNodes", list);
    }

    public void mo3055b(NodeParcelable nodeParcelable) {
        m21263a(new hyr(this, nodeParcelable), "onPeerDisconnected", nodeParcelable);
    }
}
