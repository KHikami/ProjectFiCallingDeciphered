import android.os.IBinder;
import android.os.Parcel;

final class cnn implements cnl {
    private IBinder a;

    cnn(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(cni cni) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(cni cni, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(cni cni, String str, int i, String[] strArr, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            obtain.writeByteArray(bArr);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(cni cni, String str, int i, String[] strArr, int[] iArr, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            obtain.writeIntArray(iArr);
            obtain.writeByteArray(bArr);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(cni cni, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(cni cni, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(cni cni, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeByteArray(bArr);
            this.a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final void b(cni cni, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void b(cni cni, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void c(cni cni, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.phenotype.internal.IPhenotypeService");
            obtain.writeStrongBinder(cni != null ? cni.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
