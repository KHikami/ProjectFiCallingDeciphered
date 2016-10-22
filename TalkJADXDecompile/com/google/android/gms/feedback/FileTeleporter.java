package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import gyz;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTeleporter extends AbstractSafeParcelable {
    public static final Creator<FileTeleporter> CREATOR;
    final int a;
    ParcelFileDescriptor b;
    final String c;
    final String d;
    byte[] e;
    private File f;

    static {
        CREATOR = new gyz();
    }

    public FileTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = str;
        this.d = str2;
    }

    public FileTeleporter(byte[] bArr, String str, String str2) {
        this(1, null, str, str2);
        this.e = bArr;
    }

    DataOutputStream a(FileOutputStream fileOutputStream) {
        return new DataOutputStream(fileOutputStream);
    }

    File a(String str, String str2, File file) {
        return File.createTempFile(str, str2, file);
    }

    FileOutputStream a() {
        if (this.f == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            File a = a("teleporter", ".tmp", this.f);
            try {
                FileOutputStream c = c(a);
                this.b = b(a);
                a.delete();
                return c;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not create temporary file:", e2);
        }
    }

    void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    void a(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.writeInt(i);
    }

    void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeUTF(str);
    }

    void a(DataOutputStream dataOutputStream, byte[] bArr) {
        dataOutputStream.write(bArr);
    }

    public void a(File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.f = file;
    }

    ParcelFileDescriptor b(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    FileOutputStream c(File file) {
        return new FileOutputStream(file);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            Closeable a = a(a());
            try {
                a((DataOutputStream) a, this.e.length);
                a((DataOutputStream) a, this.c);
                a((DataOutputStream) a, this.d);
                a((DataOutputStream) a, this.e);
                a(a);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                a(a);
            }
        }
        a(parcel, i);
    }

    void a(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, i, false);
        gwb.a(parcel, 3, this.c, false);
        gwb.a(parcel, 4, this.d, false);
        gwb.v(parcel, c);
    }
}
