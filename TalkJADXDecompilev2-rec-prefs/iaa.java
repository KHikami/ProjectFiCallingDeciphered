package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;

public abstract class iaa extends Binder implements hzz {
    public iaa() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    public static hzz m21262a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hzz)) ? new iab(iBinder) : (hzz) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        AmsEntityUpdateParcelable amsEntityUpdateParcelable = null;
        NodeParcelable nodeParcelable;
        switch (i) {
            case 1:
                DataHolder dataHolder;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    dataHolder = (DataHolder) DataHolder.CREATOR.createFromParcel(parcel);
                }
                mo3047a(dataHolder);
                return true;
            case 2:
                MessageEventParcelable messageEventParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    messageEventParcelable = (MessageEventParcelable) MessageEventParcelable.CREATOR.createFromParcel(parcel);
                }
                mo3052a(messageEventParcelable);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    nodeParcelable = (NodeParcelable) NodeParcelable.CREATOR.createFromParcel(parcel);
                }
                mo3053a(nodeParcelable);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    nodeParcelable = (NodeParcelable) NodeParcelable.CREATOR.createFromParcel(parcel);
                }
                mo3055b(nodeParcelable);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                mo3054a(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                return true;
            case 6:
                AncsNotificationParcelable ancsNotificationParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    ancsNotificationParcelable = (AncsNotificationParcelable) AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                }
                mo3049a(ancsNotificationParcelable);
                return true;
            case 7:
                ChannelEventParcelable channelEventParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    channelEventParcelable = (ChannelEventParcelable) ChannelEventParcelable.CREATOR.createFromParcel(parcel);
                }
                mo3051a(channelEventParcelable);
                return true;
            case 8:
                CapabilityInfoParcelable capabilityInfoParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    capabilityInfoParcelable = (CapabilityInfoParcelable) CapabilityInfoParcelable.CREATOR.createFromParcel(parcel);
                }
                mo3050a(capabilityInfoParcelable);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) AmsEntityUpdateParcelable.CREATOR.createFromParcel(parcel);
                }
                mo3048a(amsEntityUpdateParcelable);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
