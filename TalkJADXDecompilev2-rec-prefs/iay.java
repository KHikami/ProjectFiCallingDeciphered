package p000;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

public final class iay<T> extends iaa {
    private hge<Object> f17514a;
    private hge<Object> f17515b;
    private hge<hxs> f17516c;
    private hge<hyc> f17517d;
    private hge<Object> f17518e;
    private hge<Object> f17519f;
    private hge<hxo> f17520g;
    private hge<Object> f17521h;
    private final IntentFilter[] f17522i;
    private final String f17523j;

    public void mo3047a(DataHolder dataHolder) {
        if (this.f17516c != null) {
            this.f17516c.m19729a(new ibb(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    public void mo3048a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        if (this.f17514a != null) {
            this.f17514a.m19729a(new iba(amsEntityUpdateParcelable));
        }
    }

    public void mo3049a(AncsNotificationParcelable ancsNotificationParcelable) {
        if (this.f17515b != null) {
            this.f17515b.m19729a(new iaz(ancsNotificationParcelable));
        }
    }

    public void mo3050a(CapabilityInfoParcelable capabilityInfoParcelable) {
        if (this.f17521h != null) {
            this.f17521h.m19729a(new ibh(capabilityInfoParcelable));
        }
    }

    public void mo3051a(ChannelEventParcelable channelEventParcelable) {
        if (this.f17520g != null) {
            this.f17520g.m19729a(new ibg(channelEventParcelable));
        }
    }

    public void mo3052a(MessageEventParcelable messageEventParcelable) {
        if (this.f17517d != null) {
            this.f17517d.m19729a(new ibc(messageEventParcelable));
        }
    }

    public void mo3053a(NodeParcelable nodeParcelable) {
        if (this.f17518e != null) {
            this.f17518e.m19729a(new ibd(nodeParcelable));
        }
    }

    public void mo3054a(List<NodeParcelable> list) {
        if (this.f17519f != null) {
            this.f17519f.m19729a(new ibf(list));
        }
    }

    public IntentFilter[] m21512a() {
        return this.f17522i;
    }

    public String m21513b() {
        return this.f17523j;
    }

    public void mo3055b(NodeParcelable nodeParcelable) {
        if (this.f17518e != null) {
            this.f17518e.m19729a(new ibe(nodeParcelable));
        }
    }
}
