package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

final class hhz implements hhx {
    private IBinder f16984a;

    hhz(IBinder iBinder) {
        this.f16984a = iBinder;
    }

    public void mo2548a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f16984a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo2549a(ErrorReport errorReport) {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            if (errorReport != null) {
                obtain.writeInt(1);
                errorReport.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16984a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16984a;
    }

    public boolean mo2550b(ErrorReport errorReport) {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            if (errorReport != null) {
                obtain.writeInt(1);
                errorReport.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16984a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}