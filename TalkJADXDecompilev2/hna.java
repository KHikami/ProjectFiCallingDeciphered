package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

final class hna implements hmy {
    private IBinder a;

    hna(IBinder iBinder) {
        this.a = iBinder;
    }

    public hlk a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            hlk hlk;
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder == null) {
                hlk = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                hlk = (queryLocalInterface == null || !(queryLocalInterface instanceof hlk)) ? new hlm(readStrongBinder) : (hlk) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return hlk;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hlw a(gyj gyj, GoogleMapOptions googleMapOptions) {
        hlw hlw = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            if (googleMapOptions != null) {
                obtain.writeInt(1);
                googleMapOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                hlw = (queryLocalInterface == null || !(queryLocalInterface instanceof hlw)) ? new hly(readStrongBinder) : (hlw) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return hlw;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hmi a(gyj gyj, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        hmi hmi = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            if (streetViewPanoramaOptions != null) {
                obtain.writeInt(1);
                streetViewPanoramaOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                hmi = (queryLocalInterface == null || !(queryLocalInterface instanceof hmi)) ? new hmk(readStrongBinder) : (hmi) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return hmi;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(gyj gyj) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(gyj gyj, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeInt(i);
            this.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    public hlt b(gyj gyj) {
        hlt hlt = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                hlt = (queryLocalInterface == null || !(queryLocalInterface instanceof hlt)) ? new hlv(readStrongBinder) : (hlt) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return hlt;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hqa b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            hqa hqa;
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder == null) {
                hqa = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                hqa = (queryLocalInterface == null || !(queryLocalInterface instanceof hqa)) ? new hqc(readStrongBinder) : (hqa) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return hqa;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hmf c(gyj gyj) {
        hmf hmf = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                hmf = (queryLocalInterface == null || !(queryLocalInterface instanceof hmf)) ? new hmh(readStrongBinder) : (hmf) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return hmf;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
