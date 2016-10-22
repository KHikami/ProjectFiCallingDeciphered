package defpackage;

import android.os.Binder;
import android.os.Parcel;

/* renamed from: cnm */
public abstract class cnm extends Binder implements cnl {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                a(cnj.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                a(cnj.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.createIntArray(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                a(cnj.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rl.f /*4*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                a(cnj.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rl.g /*5*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                b(cnj.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rl.i /*6*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                b(cnj.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case rl.h /*7*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                a(cnj.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case rl.j /*8*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                a(cnj.a(parcel.readStrongBinder()), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case rl.l /*9*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                a(cnj.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case rl.m /*10*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                c(cnj.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.phenotype.internal.IPhenotypeService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
