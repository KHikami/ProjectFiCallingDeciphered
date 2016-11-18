package p000;

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
    void mo3047a(DataHolder dataHolder);

    void mo3048a(AmsEntityUpdateParcelable amsEntityUpdateParcelable);

    void mo3049a(AncsNotificationParcelable ancsNotificationParcelable);

    void mo3050a(CapabilityInfoParcelable capabilityInfoParcelable);

    void mo3051a(ChannelEventParcelable channelEventParcelable);

    void mo3052a(MessageEventParcelable messageEventParcelable);

    void mo3053a(NodeParcelable nodeParcelable);

    void mo3054a(List<NodeParcelable> list);

    void mo3055b(NodeParcelable nodeParcelable);
}
