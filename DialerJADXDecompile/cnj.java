import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;

public abstract class cnj extends Binder implements cni {
    public cnj() {
        attachInterface(this, "com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    public static cni a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cni)) ? new cnk(iBinder) : (cni) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                b(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                c(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rl.f /*4*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Configurations) Configurations.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rl.g /*5*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                d(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rl.i /*6*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ExperimentTokens) ExperimentTokens.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rl.h /*7*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (DogfoodsToken) DogfoodsToken.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rl.j /*8*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                e(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rl.l /*9*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Flag) Flag.CREATOR.createFromParcel(parcel) : null);
                return true;
            case rl.m /*10*/:
                parcel.enforceInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                b(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Configurations) Configurations.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
