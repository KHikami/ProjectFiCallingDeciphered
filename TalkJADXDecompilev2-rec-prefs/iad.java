package p000;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

public abstract class iad extends Binder implements iac {
    public static iac m21435a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof iac)) ? new iae(iBinder) : (iac) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        ConnectionConfiguration connectionConfiguration = null;
        hzw a;
        Uri uri;
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    connectionConfiguration = (ConnectionConfiguration) ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                }
                mo3107b(a, connectionConfiguration);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3129n(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3130o(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3131p(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                PutDataRequest putDataRequest;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    putDataRequest = (PutDataRequest) PutDataRequest.CREATOR.createFromParcel(parcel);
                }
                mo3091a(a, putDataRequest);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                mo3087a(a, uri);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3103b(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                mo3105b(a, uri);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                mo3114c(a, uri);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3101a(hzx.m21299a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 13:
                Asset asset;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    asset = (Asset) Asset.CREATOR.createFromParcel(parcel);
                }
                mo3089a(a, asset);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3112c(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3116d(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 16:
                AddListenerRequest addListenerRequest;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    addListenerRequest = (AddListenerRequest) AddListenerRequest.CREATOR.createFromParcel(parcel);
                }
                mo3092a(a, addListenerRequest);
                parcel2.writeNoException();
                return true;
            case wi.dK /*17*/:
                RemoveListenerRequest removeListenerRequest;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    removeListenerRequest = (RemoveListenerRequest) RemoveListenerRequest.CREATOR.createFromParcel(parcel);
                }
                mo3094a(a, removeListenerRequest);
                parcel2.writeNoException();
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3118e(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3120f(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    connectionConfiguration = (ConnectionConfiguration) ConnectionConfiguration.CREATOR.createFromParcel(parcel);
                }
                mo3090a(a, connectionConfiguration);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3096a(hzx.m21299a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3084a(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.f29038do /*23*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3109b(hzx.m21299a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.dA /*24*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3115c(hzx.m21299a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.dz /*25*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3122g(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.dx /*26*/:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3123h(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                AncsNotificationParcelable ancsNotificationParcelable;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    ancsNotificationParcelable = (AncsNotificationParcelable) AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                }
                mo3093a(a, ancsNotificationParcelable);
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3104b(hzx.m21299a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3113c(hzx.m21299a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3124i(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3100a(hzx.m21299a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3121f(hzx.m21299a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3110b(hzx.m21299a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3095a(hzx.m21299a(parcel.readStrongBinder()), hzu.m21350a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3108b(hzx.m21299a(parcel.readStrongBinder()), hzu.m21350a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3125j(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 38:
                ParcelFileDescriptor parcelFileDescriptor;
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                }
                mo3098a(a, readString, parcelFileDescriptor);
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3099a(hzx.m21299a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                mo3088a(a, uri, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                a = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                mo3106b(a, uri, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 42:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3097a(hzx.m21299a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3086a(hzx.m21299a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 46:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3117d(hzx.m21299a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 47:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3119e(hzx.m21299a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 48:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3102a(hzx.m21299a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 49:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3126k(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 50:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                hzw a2 = hzx.m21299a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo3111b(a2, z);
                parcel2.writeNoException();
                return true;
            case 51:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3127l(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 52:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3128m(hzx.m21299a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 53:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                mo3085a(hzx.m21299a(parcel.readStrongBinder()), parcel.readByte());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IWearableService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
