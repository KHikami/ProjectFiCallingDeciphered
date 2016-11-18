package p000;

import android.os.IBinder;
import android.os.Parcel;

final class gsk implements gsi {
    private IBinder f16011a;

    gsk(IBinder iBinder) {
        this.f16011a = iBinder;
    }

    public IBinder asBinder() {
        return this.f16011a;
    }

    public int mo2326a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.tycho.IVoiceService");
            this.f16011a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo2328b() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.tycho.IVoiceService");
            this.f16011a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2329c() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.tycho.IVoiceService");
            this.f16011a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo2327a(String str, gsf gsf) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.apps.tycho.IVoiceService");
            obtain.writeString(str);
            if (gsf != null) {
                iBinder = gsf.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f16011a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
