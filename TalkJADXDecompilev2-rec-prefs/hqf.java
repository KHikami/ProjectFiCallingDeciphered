package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

final class hqf implements hqd {
    private IBinder f17131a;

    hqf(IBinder iBinder) {
        this.f17131a = iBinder;
    }

    public void mo2834a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2835a(double d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            obtain.writeDouble(d);
            this.f17131a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2836a(float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            obtain.writeFloat(f);
            this.f17131a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2837a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            obtain.writeInt(i);
            this.f17131a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2838a(LatLng latLng) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17131a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2839a(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f17131a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo2840a(hqd hqd) {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            obtain.writeStrongBinder(hqd != null ? hqd.asBinder() : null);
            this.f17131a.transact(17, obtain, obtain2, 0);
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

    public IBinder asBinder() {
        return this.f17131a;
    }

    public String mo2841b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2842b(float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            obtain.writeFloat(f);
            this.f17131a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2843b(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            obtain.writeInt(i);
            this.f17131a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public LatLng mo2844c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            LatLng latLng = obtain2.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return latLng;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public double mo2845d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            double readDouble = obtain2.readDouble();
            return readDouble;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public float mo2846e() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            float readFloat = obtain2.readFloat();
            return readFloat;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int mo2847f() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int mo2848g() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public float mo2849h() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            float readFloat = obtain2.readFloat();
            return readFloat;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo2850i() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(16, obtain, obtain2, 0);
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

    public int mo2851j() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
            this.f17131a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
