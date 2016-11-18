package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

public class dt extends RuntimeException {
    public dt(String str, Exception exception) {
        super(str, exception);
    }

    public dt(String str) {
        super(str);
    }

    public dt(Object obj) {
        String valueOf = String.valueOf(obj);
        this(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Failed to find any ModelLoaders for model: ").append(valueOf).toString());
    }

    public dt(Class<?> cls, Class<?> cls2) {
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        this(new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(valueOf2).length()).append("Failed to find any ModelLoaders for model: ").append(valueOf).append(" and data: ").append(valueOf2).toString());
    }

    public dt(Class<?> cls) {
        String valueOf = String.valueOf(cls);
        this(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Failed to find result encoder for resource class: ").append(valueOf).toString());
    }

    public dt(Class<?> cls, byte b) {
        String valueOf = String.valueOf(cls);
        this(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Failed to find source encoder for data class: ").append(valueOf).toString());
    }

    public dt(String str, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        super(new StringBuilder(String.valueOf(str).length() + 41).append(str).append(" Parcel: pos=").append(dataPosition).append(" size=").append(parcel.dataSize()).toString());
    }

    public dt(RemoteException remoteException) {
        super(remoteException);
    }

    public dt(Throwable th) {
        super(th);
    }
}
