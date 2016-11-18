package defpackage;

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
    private hge<Object> a;
    private hge<Object> b;
    private hge<hxs> c;
    private hge<hyc> d;
    private hge<Object> e;
    private hge<Object> f;
    private hge<hxo> g;
    private hge<Object> h;
    private final IntentFilter[] i;
    private final String j;

    public void a(DataHolder dataHolder) {
        if (this.c != null) {
            this.c.a(new ibb(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    public void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        if (this.a != null) {
            this.a.a(new iba(amsEntityUpdateParcelable));
        }
    }

    public void a(AncsNotificationParcelable ancsNotificationParcelable) {
        if (this.b != null) {
            this.b.a(new iaz(ancsNotificationParcelable));
        }
    }

    public void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        if (this.h != null) {
            this.h.a(new ibh(capabilityInfoParcelable));
        }
    }

    public void a(ChannelEventParcelable channelEventParcelable) {
        if (this.g != null) {
            this.g.a(new ibg(channelEventParcelable));
        }
    }

    public void a(MessageEventParcelable messageEventParcelable) {
        if (this.d != null) {
            this.d.a(new ibc(messageEventParcelable));
        }
    }

    public void a(NodeParcelable nodeParcelable) {
        if (this.e != null) {
            this.e.a(new ibd(nodeParcelable));
        }
    }

    public void a(List<NodeParcelable> list) {
        if (this.f != null) {
            this.f.a(new ibf(list));
        }
    }

    public IntentFilter[] a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public void b(NodeParcelable nodeParcelable) {
        if (this.e != null) {
            this.e.a(new ibe(nodeParcelable));
        }
    }
}
