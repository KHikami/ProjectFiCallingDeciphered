package p000;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

final class iae implements iac {
    private IBinder f17494a;

    iae(IBinder iBinder) {
        this.f17494a = iBinder;
    }

    public void mo3084a(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3085a(hzw hzw, byte b) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeByte(b);
            this.f17494a.transact(53, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3086a(hzw hzw, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeInt(i);
            this.f17494a.transact(43, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3087a(hzw hzw, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3088a(hzw hzw, Uri uri, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.f17494a.transact(40, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3089a(hzw hzw, Asset asset) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (asset != null) {
                obtain.writeInt(1);
                asset.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3090a(hzw hzw, ConnectionConfiguration connectionConfiguration) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (connectionConfiguration != null) {
                obtain.writeInt(1);
                connectionConfiguration.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3091a(hzw hzw, PutDataRequest putDataRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (putDataRequest != null) {
                obtain.writeInt(1);
                putDataRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3092a(hzw hzw, AddListenerRequest addListenerRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (addListenerRequest != null) {
                obtain.writeInt(1);
                addListenerRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3093a(hzw hzw, AncsNotificationParcelable ancsNotificationParcelable) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (ancsNotificationParcelable != null) {
                obtain.writeInt(1);
                ancsNotificationParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3094a(hzw hzw, RemoveListenerRequest removeListenerRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (removeListenerRequest != null) {
                obtain.writeInt(1);
                removeListenerRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3095a(hzw hzw, hzt hzt, String str) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (hzt != null) {
                iBinder = hzt.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            this.f17494a.transact(34, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3096a(hzw hzw, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            this.f17494a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3097a(hzw hzw, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f17494a.transact(42, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3098a(hzw hzw, String str, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            if (parcelFileDescriptor != null) {
                obtain.writeInt(1);
                parcelFileDescriptor.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(38, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3099a(hzw hzw, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            if (parcelFileDescriptor != null) {
                obtain.writeInt(1);
                parcelFileDescriptor.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeLong(j);
            obtain.writeLong(j2);
            this.f17494a.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3100a(hzw hzw, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f17494a.transact(31, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3101a(hzw hzw, String str, String str2, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeByteArray(bArr);
            this.f17494a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3102a(hzw hzw, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f17494a.transact(48, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17494a;
    }

    public void mo3103b(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3104b(hzw hzw, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeInt(i);
            this.f17494a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3105b(hzw hzw, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3106b(hzw hzw, Uri uri, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.f17494a.transact(41, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3107b(hzw hzw, ConnectionConfiguration connectionConfiguration) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (connectionConfiguration != null) {
                obtain.writeInt(1);
                connectionConfiguration.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3108b(hzw hzw, hzt hzt, String str) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (hzt != null) {
                iBinder = hzt.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeString(str);
            this.f17494a.transact(35, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3109b(hzw hzw, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            this.f17494a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3110b(hzw hzw, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f17494a.transact(33, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3111b(hzw hzw, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f17494a.transact(50, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3112c(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3113c(hzw hzw, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeInt(i);
            this.f17494a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3114c(hzw hzw, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17494a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3115c(hzw hzw, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            this.f17494a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3116d(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3117d(hzw hzw, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            this.f17494a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3118e(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3119e(hzw hzw, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            this.f17494a.transact(47, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3120f(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3121f(hzw hzw, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            obtain.writeString(str);
            this.f17494a.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3122g(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3123h(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3124i(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(30, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3125j(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(37, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3126k(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(49, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3127l(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(51, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3128m(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(52, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3129n(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3130o(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3131p(hzw hzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            obtain.writeStrongBinder(hzw != null ? hzw.asBinder() : null);
            this.f17494a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
