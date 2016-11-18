package p000;

import android.os.Binder;
import android.os.Parcel;

public abstract class hmm extends Binder implements hml {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        boolean z;
        boolean a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2751a(z);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2753b(z);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2755c(z);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2757d(z);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2759e(z);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2761f(z);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2763g(z);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2765h(z);
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2752a();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2754b();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2756c();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2758d();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2760e();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2762f();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2764g();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2767i(z);
                parcel2.writeNoException();
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2766h();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2769j(z);
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = mo2768i();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
