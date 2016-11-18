package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

final class hlm implements hlk {
    private IBinder f17079a;

    hlm(IBinder iBinder) {
        this.f17079a = iBinder;
    }

    public gyj mo2609a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            this.f17079a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2610a(float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(f);
            this.f17079a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2611a(float f, float f2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(f);
            obtain.writeFloat(f2);
            this.f17079a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2612a(float f, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(f);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f17079a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2613a(CameraPosition cameraPosition) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (cameraPosition != null) {
                obtain.writeInt(1);
                cameraPosition.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17079a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2614a(LatLng latLng) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17079a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2615a(LatLng latLng, float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeFloat(f);
            this.f17079a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2616a(LatLngBounds latLngBounds, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLngBounds != null) {
                obtain.writeInt(1);
                latLngBounds.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.f17079a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2617a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLngBounds != null) {
                obtain.writeInt(1);
                latLngBounds.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f17079a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17079a;
    }

    public gyj mo2618b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            this.f17079a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gyj mo2619b(float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(f);
            this.f17079a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
