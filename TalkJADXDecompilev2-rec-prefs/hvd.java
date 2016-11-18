package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

final class hvd implements hvb {
    private IBinder f17349a;

    hvd(IBinder iBinder) {
        this.f17349a = iBinder;
    }

    public void mo2956a(int i, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle2 != null) {
                obtain.writeInt(1);
                bundle2.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17349a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo2957a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (parcelFileDescriptor != null) {
                obtain.writeInt(1);
                parcelFileDescriptor.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17349a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo2958a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (parcelFileDescriptor != null) {
                obtain.writeInt(1);
                parcelFileDescriptor.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle2 != null) {
                obtain.writeInt(1);
                bundle2.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17349a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo2959a(int i, Bundle bundle, DataHolder dataHolder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17349a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public void mo2960a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeTypedArray(dataHolderArr, 0);
            this.f17349a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17349a;
    }
}
