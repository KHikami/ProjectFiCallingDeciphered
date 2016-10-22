package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import buf;
import ckj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTeleporter implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    ParcelFileDescriptor b;
    final String c;
    final String d;
    public File e;

    static {
        CREATOR = new ckj();
    }

    public FileTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = str;
        this.d = str2;
    }

    private final FileOutputStream a() {
        if (this.e == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.e);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.b = ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            Closeable dataOutputStream = new DataOutputStream(a());
            Object[] objArr = null;
            try {
                dataOutputStream.writeInt(objArr.length);
                dataOutputStream.writeUTF(this.c);
                dataOutputStream.writeUTF(this.d);
                dataOutputStream.write(null);
                a(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                a(dataOutputStream);
            }
        }
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, i, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, false);
        buf.v(parcel, c);
    }
}
