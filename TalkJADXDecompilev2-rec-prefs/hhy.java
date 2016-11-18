package p000;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

public abstract class hhy extends Binder implements hhx {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ErrorReport errorReport = null;
        int i3 = 0;
        boolean a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                if (parcel.readInt() != 0) {
                    errorReport = (ErrorReport) ErrorReport.CREATOR.createFromParcel(parcel);
                }
                a = mo2549a(errorReport);
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                mo2548a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                if (parcel.readInt() != 0) {
                    errorReport = (ErrorReport) ErrorReport.CREATOR.createFromParcel(parcel);
                }
                a = mo2550b(errorReport);
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.feedback.internal.IFeedbackService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
