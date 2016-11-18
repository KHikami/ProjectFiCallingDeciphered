package p000;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

final class hlp implements hln {
    private IBinder f17080a;

    hlp(IBinder iBinder) {
        this.f17080a = iBinder;
    }

    public CameraPosition mo2620a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            CameraPosition cameraPosition = obtain2.readInt() != 0 ? (CameraPosition) CameraPosition.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return cameraPosition;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hpx mo2621a(PolylineOptions polylineOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (polylineOptions != null) {
                obtain.writeInt(1);
                polylineOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            hpx a = hpy.m20462a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hqd mo2622a(CircleOptions circleOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (circleOptions != null) {
                obtain.writeInt(1);
                circleOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(35, obtain, obtain2, 0);
            obtain2.readException();
            hqd a = hqe.m20524a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hqg mo2623a(GroundOverlayOptions groundOverlayOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (groundOverlayOptions != null) {
                obtain.writeInt(1);
                groundOverlayOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            hqg a = hqh.m20566a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hqm mo2624a(MarkerOptions markerOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (markerOptions != null) {
                obtain.writeInt(1);
                markerOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            hqm a = hqn.m20629a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hqp mo2625a(PolygonOptions polygonOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (polygonOptions != null) {
                obtain.writeInt(1);
                polygonOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            hqp a = hqq.m20678a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hqs mo2626a(TileOverlayOptions tileOverlayOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (tileOverlayOptions != null) {
                obtain.writeInt(1);
                tileOverlayOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            hqs a = hqt.m20712a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2627a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeInt(i);
            this.f17080a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2628a(int i, int i2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.f17080a.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2629a(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(54, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2630a(gyj gyj) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.f17080a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2631a(gyj gyj, int i, hmv hmv) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            obtain.writeInt(i);
            if (hmv != null) {
                iBinder = hmv.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f17080a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2632a(gyj gyj, hmv hmv) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            if (hmv != null) {
                iBinder = hmv.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f17080a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2633a(hlq hlq) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hlq != null ? hlq.asBinder() : null);
            this.f17080a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2634a(hmr hmr, gyj gyj) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hmr != null ? hmr.asBinder() : null);
            if (gyj != null) {
                iBinder = gyj.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f17080a.transact(38, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2635a(hnb hnb) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hnb != null ? hnb.asBinder() : null);
            this.f17080a.transact(33, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2636a(hne hne) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hne != null ? hne.asBinder() : null);
            this.f17080a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2637a(hnh hnh) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hnh != null ? hnh.asBinder() : null);
            this.f17080a.transact(83, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2638a(hnk hnk) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hnk != null ? hnk.asBinder() : null);
            this.f17080a.transact(45, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2639a(hnn hnn) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hnn != null ? hnn.asBinder() : null);
            this.f17080a.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2640a(hnq hnq) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hnq != null ? hnq.asBinder() : null);
            this.f17080a.transact(86, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2641a(hnt hnt) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hnt != null ? hnt.asBinder() : null);
            this.f17080a.transact(84, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2642a(hnz hnz) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hnz != null ? hnz.asBinder() : null);
            this.f17080a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2643a(hoc hoc) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hoc != null ? hoc.asBinder() : null);
            this.f17080a.transact(42, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2644a(hof hof) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hof != null ? hof.asBinder() : null);
            this.f17080a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2645a(hoi hoi) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hoi != null ? hoi.asBinder() : null);
            this.f17080a.transact(53, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2646a(hol hol) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hol != null ? hol.asBinder() : null);
            this.f17080a.transact(30, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2647a(hoo hoo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hoo != null ? hoo.asBinder() : null);
            this.f17080a.transact(31, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2648a(hor hor) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hor != null ? hor.asBinder() : null);
            this.f17080a.transact(37, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2649a(hou hou) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hou != null ? hou.asBinder() : null);
            this.f17080a.transact(36, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2650a(hox hox) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hox != null ? hox.asBinder() : null);
            this.f17080a.transact(80, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2651a(hpa hpa) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hpa != null ? hpa.asBinder() : null);
            this.f17080a.transact(85, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2652a(hpd hpd) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(hpd != null ? hpd.asBinder() : null);
            this.f17080a.transact(87, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2653a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeString(str);
            this.f17080a.transact(61, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2654a(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f17080a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17080a;
    }

    public float mo2655b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            float readFloat = obtain2.readFloat();
            return readFloat;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2656b(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(60, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                bundle.readFromParcel(obtain2);
            }
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2657b(gyj gyj) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.f17080a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo2658b(boolean z) {
        boolean z2 = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeInt(z ? 1 : 0);
            this.f17080a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public float mo2659c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            float readFloat = obtain2.readFloat();
            return readFloat;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2660c(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17080a.transact(81, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2661c(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f17080a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2662d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2663d(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f17080a.transact(41, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2664e() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int mo2665f() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo2666g() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(17, obtain, obtain2, 0);
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

    public boolean mo2667h() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(19, obtain, obtain2, 0);
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

    public boolean mo2668i() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(21, obtain, obtain2, 0);
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

    public Location mo2669j() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
            Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return location;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hml mo2670k() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            hml hml;
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder == null) {
                hml = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                hml = (queryLocalInterface == null || !(queryLocalInterface instanceof hml)) ? new hmn(readStrongBinder) : (hml) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return hml;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public hlz mo2671l() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            hlz hlz;
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder == null) {
                hlz = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                hlz = (queryLocalInterface == null || !(queryLocalInterface instanceof hlz)) ? new hmb(readStrongBinder) : (hlz) queryLocalInterface;
            }
            obtain2.recycle();
            obtain.recycle();
            return hlz;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo2672m() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(40, obtain, obtain2, 0);
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

    public hqj mo2673n() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(44, obtain, obtain2, 0);
            obtain2.readException();
            hqj a = hqk.m20596a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2674o() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(55, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2675p() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(56, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2676q() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(57, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2677r() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(58, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo2678s() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(59, obtain, obtain2, 0);
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

    public void mo2679t() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f17080a.transact(82, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
