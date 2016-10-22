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

    public static hzz a(IBinder iBinder) {
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
            case wi.j /*1*/:
                DataHolder dataHolder;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    dataHolder = (DataHolder) DataHolder.CREATOR.createFromParcel(parcel);
                }
                a(dataHolder);
                return true;
            case wi.l /*2*/:
                MessageEventParcelable messageEventParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    messageEventParcelable = (MessageEventParcelable) MessageEventParcelable.CREATOR.createFromParcel(parcel);
                }
                a(messageEventParcelable);
                return true;
            case wi.z /*3*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    nodeParcelable = (NodeParcelable) NodeParcelable.CREATOR.createFromParcel(parcel);
                }
                a(nodeParcelable);
                return true;
            case wi.h /*4*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    nodeParcelable = (NodeParcelable) NodeParcelable.CREATOR.createFromParcel(parcel);
                }
                b(nodeParcelable);
                return true;
            case wi.p /*5*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                return true;
            case wi.s /*6*/:
                AncsNotificationParcelable ancsNotificationParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    ancsNotificationParcelable = (AncsNotificationParcelable) AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                }
                a(ancsNotificationParcelable);
                return true;
            case wi.q /*7*/:
                ChannelEventParcelable channelEventParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    channelEventParcelable = (ChannelEventParcelable) ChannelEventParcelable.CREATOR.createFromParcel(parcel);
                }
                a(channelEventParcelable);
                return true;
            case wi.m /*8*/:
                CapabilityInfoParcelable capabilityInfoParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    capabilityInfoParcelable = (CapabilityInfoParcelable) CapabilityInfoParcelable.CREATOR.createFromParcel(parcel);
                }
                a(capabilityInfoParcelable);
                return true;
            case wi.n /*9*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                if (parcel.readInt() != 0) {
                    amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) AmsEntityUpdateParcelable.CREATOR.createFromParcel(parcel);
                }
                a(amsEntityUpdateParcelable);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
