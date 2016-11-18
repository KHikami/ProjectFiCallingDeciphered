package p000;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

final class hai implements hag {
    private IBinder f16469a;

    hai(IBinder iBinder) {
        this.f16469a = iBinder;
    }

    public void mo2438a(Bitmap bitmap, gzw gzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (bitmap != null) {
                obtain.writeInt(1);
                bitmap.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(gzw != null ? gzw.asBinder() : null);
            this.f16469a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2439a(GoogleHelp googleHelp, Bitmap bitmap, gzw gzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (googleHelp != null) {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bitmap != null) {
                obtain.writeInt(1);
                bitmap.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(gzw != null ? gzw.asBinder() : null);
            this.f16469a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2440a(GoogleHelp googleHelp, gzw gzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (googleHelp != null) {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(gzw != null ? gzw.asBinder() : null);
            this.f16469a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2441a(gzw gzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            obtain.writeStrongBinder(gzw != null ? gzw.asBinder() : null);
            this.f16469a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2442a(String str, gzw gzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            obtain.writeString(str);
            obtain.writeStrongBinder(gzw != null ? gzw.asBinder() : null);
            this.f16469a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16469a;
    }

    public void mo2443b(gzw gzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            obtain.writeStrongBinder(gzw != null ? gzw.asBinder() : null);
            this.f16469a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2444c(gzw gzw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            obtain.writeStrongBinder(gzw != null ? gzw.asBinder() : null);
            this.f16469a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
