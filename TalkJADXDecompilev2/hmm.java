package defpackage;

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
                a(z);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(z);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                d(z);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                e(z);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                f(z);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                g(z);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                h(z);
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = a();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = b();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = c();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = d();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = e();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = f();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = g();
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
                i(z);
                parcel2.writeNoException();
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = h();
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
                j(z);
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = i();
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
