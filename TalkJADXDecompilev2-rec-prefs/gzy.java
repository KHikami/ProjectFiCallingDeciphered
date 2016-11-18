package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

final class gzy implements gzw {
    private IBinder f16460a;

    gzy(IBinder iBinder) {
        this.f16460a = iBinder;
    }

    public void mo2430a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            this.f16460a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2431a(GoogleHelp googleHelp) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            if (googleHelp != null) {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16460a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2432a(TogglingData togglingData) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            if (togglingData != null) {
                obtain.writeInt(1);
                togglingData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16460a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16460a;
    }

    public void mo2433b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            this.f16460a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2434c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            this.f16460a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2435d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            this.f16460a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
