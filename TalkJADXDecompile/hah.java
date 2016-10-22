import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

public abstract class hah extends Binder implements hag {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(parcel.readInt() != 0 ? (GoogleHelp) GoogleHelp.CREATOR.createFromParcel(parcel) : null, gzx.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(parcel.readInt() != 0 ? (GoogleHelp) GoogleHelp.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null, gzx.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.z /*3*/:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null, gzx.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.h /*4*/:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(gzx.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.p /*5*/:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                b(gzx.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.s /*6*/:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                c(gzx.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.q /*7*/:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(parcel.readString(), gzx.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
