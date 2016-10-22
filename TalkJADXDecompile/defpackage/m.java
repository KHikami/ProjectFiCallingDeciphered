package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: m */
public abstract class m extends Binder implements l {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        boolean a;
        Bundle bundle;
        switch (i) {
            case wi.l /*2*/:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                a = a(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            case wi.z /*3*/:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                a = a(j.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.h /*4*/:
                Uri uri;
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                i a2 = j.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                } else {
                    uri = null;
                }
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                a = a(a2, uri, bundle, parcel.createTypedArrayList(Bundle.CREATOR));
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.p /*5*/:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                bundle = a(readString, bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case wi.s /*6*/:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                i a3 = j.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                a = a(a3, bundle);
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
