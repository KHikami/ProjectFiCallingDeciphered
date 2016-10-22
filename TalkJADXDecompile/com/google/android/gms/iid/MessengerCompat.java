package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import hbq;
import hbt;
import hbv;

public class MessengerCompat implements Parcelable {
    public static final Creator<MessengerCompat> CREATOR;
    Messenger a;
    hbt b;

    static {
        CREATOR = new hbq();
    }

    public MessengerCompat(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.a = new Messenger(iBinder);
            return;
        }
        hbt hbt;
        if (iBinder == null) {
            hbt = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            hbt = (queryLocalInterface == null || !(queryLocalInterface instanceof hbt)) ? new hbv(iBinder) : (hbt) queryLocalInterface;
        }
        this.b = hbt;
    }

    public IBinder a() {
        return this.a != null ? this.a.getBinder() : this.b.asBinder();
    }

    public void a(Message message) {
        if (this.a != null) {
            this.a.send(message);
        } else {
            this.b.a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = a().equals(((MessengerCompat) obj).a());
            } catch (ClassCastException e) {
            }
        }
        return z;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.a != null) {
            parcel.writeStrongBinder(this.a.getBinder());
        } else {
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
