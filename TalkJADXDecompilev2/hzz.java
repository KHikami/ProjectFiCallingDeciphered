package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

public interface hzz extends IInterface {
    void a(DataHolder dataHolder);

    void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable);

    void a(AncsNotificationParcelable ancsNotificationParcelable);

    void a(CapabilityInfoParcelable capabilityInfoParcelable);

    void a(ChannelEventParcelable channelEventParcelable);

    void a(MessageEventParcelable messageEventParcelable);

    void a(NodeParcelable nodeParcelable);

    void a(List<NodeParcelable> list);

    void b(NodeParcelable nodeParcelable);
}
