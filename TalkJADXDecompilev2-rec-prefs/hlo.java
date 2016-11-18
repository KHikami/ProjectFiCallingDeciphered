package p000;

import android.location.Location;
import android.os.Binder;
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

public abstract class hlo extends Binder implements hln {
    public static hln m20111a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hln)) ? new hlp(iBinder) : (hln) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        hpd hpd = null;
        float b;
        IBinder asBinder;
        boolean g;
        boolean z;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                CameraPosition a = mo2620a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                b = mo2655b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                b = mo2659c();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2630a(gyk.m18960a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2657b(gyk.m18960a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2632a(gyk.m18960a(parcel.readStrongBinder()), hmw.m20366a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2631a(gyk.m18960a(parcel.readStrongBinder()), parcel.readInt(), hmw.m20366a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2662d();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hpx a2 = mo2621a(parcel.readInt() != 0 ? (PolylineOptions) PolylineOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    asBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hqp a3 = mo2625a(parcel.readInt() != 0 ? (PolygonOptions) PolygonOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a3 != null) {
                    asBinder = a3.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hqm a4 = mo2624a(parcel.readInt() != 0 ? (MarkerOptions) MarkerOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a4 != null) {
                    asBinder = a4.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hqg a5 = mo2623a(parcel.readInt() != 0 ? (GroundOverlayOptions) GroundOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a5 != null) {
                    asBinder = a5.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hqs a6 = mo2626a(parcel.readInt() != 0 ? (TileOverlayOptions) TileOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a6 != null) {
                    asBinder = a6.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2664e();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                int f = mo2665f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2627a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo2666g();
                parcel2.writeNoException();
                parcel2.writeInt(g ? 1 : 0);
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2654a(z);
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo2667h();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo2658b(parcel.readInt() != 0);
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo2668i();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2661c(z);
                parcel2.writeNoException();
                return true;
            case wi.f29038do /*23*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Location j = mo2669j();
                parcel2.writeNoException();
                if (j != null) {
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case wi.dA /*24*/:
                hlq hls;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    hls = (queryLocalInterface == null || !(queryLocalInterface instanceof hlq)) ? new hls(readStrongBinder) : (hlq) queryLocalInterface;
                }
                mo2633a(hls);
                parcel2.writeNoException();
                return true;
            case wi.dz /*25*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hml k = mo2670k();
                parcel2.writeNoException();
                if (k != null) {
                    asBinder = k.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case wi.dx /*26*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hlz l = mo2671l();
                parcel2.writeNoException();
                if (l != null) {
                    asBinder = l.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 27:
                hne hng;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                    hng = (queryLocalInterface == null || !(queryLocalInterface instanceof hne)) ? new hng(readStrongBinder) : (hne) queryLocalInterface;
                }
                mo2636a(hng);
                parcel2.writeNoException();
                return true;
            case 28:
                hnz hob;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                    hob = (queryLocalInterface == null || !(queryLocalInterface instanceof hnz)) ? new hob(readStrongBinder) : (hnz) queryLocalInterface;
                }
                mo2642a(hob);
                parcel2.writeNoException();
                return true;
            case 29:
                hof hoh;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    hoh = (queryLocalInterface == null || !(queryLocalInterface instanceof hof)) ? new hoh(readStrongBinder) : (hof) queryLocalInterface;
                }
                mo2644a(hoh);
                parcel2.writeNoException();
                return true;
            case 30:
                hol hon;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    hon = (queryLocalInterface == null || !(queryLocalInterface instanceof hol)) ? new hon(readStrongBinder) : (hol) queryLocalInterface;
                }
                mo2646a(hon);
                parcel2.writeNoException();
                return true;
            case 31:
                hoo hoq;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    hoq = (queryLocalInterface == null || !(queryLocalInterface instanceof hoo)) ? new hoq(readStrongBinder) : (hoo) queryLocalInterface;
                }
                mo2647a(hoq);
                parcel2.writeNoException();
                return true;
            case 32:
                hnn hnp;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    hnp = (queryLocalInterface == null || !(queryLocalInterface instanceof hnn)) ? new hnp(readStrongBinder) : (hnn) queryLocalInterface;
                }
                mo2639a(hnp);
                parcel2.writeNoException();
                return true;
            case 33:
                hnb hnd;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    hnd = (queryLocalInterface == null || !(queryLocalInterface instanceof hnb)) ? new hnd(readStrongBinder) : (hnb) queryLocalInterface;
                }
                mo2635a(hnd);
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hqd a7 = mo2622a(parcel.readInt() != 0 ? (CircleOptions) CircleOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a7 != null) {
                    asBinder = a7.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 36:
                hou how;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    how = (queryLocalInterface == null || !(queryLocalInterface instanceof hou)) ? new how(readStrongBinder) : (hou) queryLocalInterface;
                }
                mo2649a(how);
                parcel2.writeNoException();
                return true;
            case 37:
                hor hot;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    hot = (queryLocalInterface == null || !(queryLocalInterface instanceof hor)) ? new hot(readStrongBinder) : (hor) queryLocalInterface;
                }
                mo2648a(hot);
                parcel2.writeNoException();
                return true;
            case 38:
                hmr hmt;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    hmt = (queryLocalInterface == null || !(queryLocalInterface instanceof hmr)) ? new hmt(readStrongBinder) : (hmr) queryLocalInterface;
                }
                mo2634a(hmt, gyk.m18960a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2628a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo2672m();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 41:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2663d(z);
                parcel2.writeNoException();
                return true;
            case 42:
                hoc hoe;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    hoe = (queryLocalInterface == null || !(queryLocalInterface instanceof hoc)) ? new hoe(readStrongBinder) : (hoc) queryLocalInterface;
                }
                mo2643a(hoe);
                parcel2.writeNoException();
                return true;
            case 44:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                hqj n = mo2673n();
                parcel2.writeNoException();
                if (n != null) {
                    asBinder = n.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 45:
                hnk hnm;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                    hnm = (queryLocalInterface == null || !(queryLocalInterface instanceof hnk)) ? new hnm(readStrongBinder) : (hnk) queryLocalInterface;
                }
                mo2638a(hnm);
                parcel2.writeNoException();
                return true;
            case 53:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2645a(hoj.m20022a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 54:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2629a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 55:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2674o();
                parcel2.writeNoException();
                return true;
            case 56:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2675p();
                parcel2.writeNoException();
                return true;
            case 57:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2676q();
                parcel2.writeNoException();
                return true;
            case 58:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2677r();
                parcel2.writeNoException();
                return true;
            case 59:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo2678s();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 60:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                mo2656b(bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 61:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2653a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 80:
                hox hoz;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
                    hoz = (queryLocalInterface == null || !(queryLocalInterface instanceof hox)) ? new hoz(readStrongBinder) : (hox) queryLocalInterface;
                }
                mo2650a(hoz);
                parcel2.writeNoException();
                return true;
            case 81:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2660c(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 82:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2679t();
                parcel2.writeNoException();
                return true;
            case 83:
                hnh hnj;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
                    hnj = (queryLocalInterface == null || !(queryLocalInterface instanceof hnh)) ? new hnj(readStrongBinder) : (hnh) queryLocalInterface;
                }
                mo2637a(hnj);
                parcel2.writeNoException();
                return true;
            case 84:
                hnt hnv;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                    hnv = (queryLocalInterface == null || !(queryLocalInterface instanceof hnt)) ? new hnv(readStrongBinder) : (hnt) queryLocalInterface;
                }
                mo2641a(hnv);
                parcel2.writeNoException();
                return true;
            case 85:
                hpa hpc;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
                    hpc = (queryLocalInterface == null || !(queryLocalInterface instanceof hpa)) ? new hpc(readStrongBinder) : (hpa) queryLocalInterface;
                }
                mo2651a(hpc);
                parcel2.writeNoException();
                return true;
            case 86:
                hnq hns;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                    hns = (queryLocalInterface == null || !(queryLocalInterface instanceof hnq)) ? new hns(readStrongBinder) : (hnq) queryLocalInterface;
                }
                mo2640a(hns);
                parcel2.writeNoException();
                return true;
            case 87:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                    hpd = (queryLocalInterface == null || !(queryLocalInterface instanceof hpd)) ? new hpf(readStrongBinder) : (hpd) queryLocalInterface;
                }
                mo2652a(hpd);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
