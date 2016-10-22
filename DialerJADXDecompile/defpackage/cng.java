package defpackage;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: cng */
public abstract class cng extends Binder implements cnf {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ErrorReport errorReport = null;
        int i3 = 0;
        boolean a;
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                if (parcel.readInt() != 0) {
                    errorReport = (ErrorReport) ErrorReport.CREATOR.createFromParcel(parcel);
                }
                a = a(errorReport);
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case rl.e /*3*/:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                if (parcel.readInt() != 0) {
                    errorReport = (ErrorReport) ErrorReport.CREATOR.createFromParcel(parcel);
                }
                a = b(errorReport);
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
