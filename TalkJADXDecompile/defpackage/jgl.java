package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextUtils;
import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: jgl */
final class jgl {
    private final int a;
    private final List<jgm> b;
    private final File c;
    private int d;
    private int e;

    public jgl(Context context, String str) {
        this.b = new LinkedList();
        this.a = ((VERSION.RELEASE.hashCode() + 31) * 31) + jgl.a(context);
        String valueOf = String.valueOf(context.getDir(null, 0).getAbsolutePath());
        this.c = new File(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append("/").append(str).toString());
        d();
        b();
    }

    public void a(int i, String str, jgz jgz) {
        if (jgl.a(jgz) <= 128000) {
            synchronized (this.b) {
                b();
                a(new jgm(i, str, jgz));
                c();
            }
        } else if (Log.isLoggable("BackgroundTask", 5)) {
            String valueOf = String.valueOf(jgz);
            new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(str).length()).append("Result too large to store: ").append(valueOf).append(", tag: ").append(str);
        }
    }

    public jgz a(int i, String str) {
        jgz jgz;
        synchronized (this.b) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jgm jgm = (jgm) it.next();
                if (jgm.a == i && TextUtils.equals(jgm.b, str)) {
                    a(it, jgm);
                    jgz = jgm.c;
                    break;
                }
            }
            jgz = null;
        }
        return jgz;
    }

    public int a(int i) {
        int i2;
        synchronized (this.b) {
            i2 = 0;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                int i3;
                jgm jgm = (jgm) it.next();
                if (jgm.a == i) {
                    a(it, jgm);
                    i3 = i2 + 1;
                } else {
                    i3 = i2;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            jgm jgm = (jgm) it.next();
            if (jgm.c.h()) {
                if (Log.isLoggable("BackgroundTask", 4)) {
                    String valueOf = String.valueOf(jgm.c);
                    String str = jgm.b;
                    new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length()).append("Dropping expired result: ").append(valueOf).append(", tag: ").append(str);
                }
                a(it, jgm);
            }
        }
    }

    private void c() {
        Iterator it = this.b.iterator();
        while (this.e > 512000 && it.hasNext()) {
            jgm jgm = (jgm) it.next();
            if (Log.isLoggable("BackgroundTask", 4)) {
                String valueOf = String.valueOf(jgm.c);
                String str = jgm.b;
                new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(str).length()).append("Dropping result to make room: ").append(valueOf).append(", tag: ").append(str);
            }
            a(it, jgm);
        }
    }

    private void a(jgm jgm) {
        this.b.add(jgm);
        this.e += jgl.a(jgm.c);
    }

    private void a(Iterator<jgm> it, jgm jgm) {
        it.remove();
        this.e -= jgl.a(jgm.c);
    }

    private static int a(jgz jgz) {
        byte[] e = jgz.e();
        return (e != null ? e.length : 0) + HttpStatusCodes.STATUS_CODE_OK;
    }

    public int a() {
        DataOutputStream dataOutputStream;
        Throwable e;
        DataOutputStream dataOutputStream2;
        synchronized (this.b) {
            List arrayList = new ArrayList(this.b.size());
            for (jgm jgm : this.b) {
                if (jgm.c.j() == jha.c) {
                    arrayList.add(jgm);
                }
            }
        }
        synchronized (this.c) {
            int hashCode = arrayList.hashCode();
            if (hashCode == this.d) {
                return 0;
            }
            try {
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.c)));
                try {
                    dataOutputStream.writeInt(this.a);
                    dataOutputStream.writeInt(arrayList.size());
                    ArrayList arrayList2 = (ArrayList) arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        byte[] a = gwb.a((jgm) obj);
                        dataOutputStream.writeInt(a.length);
                        dataOutputStream.write(a);
                    }
                    this.d = hashCode;
                    if (Log.isLoggable("BackgroundTask", 4)) {
                        new StringBuilder(38).append("writeResults: num written: ").append(arrayList.size());
                    }
                    int size2 = arrayList.size();
                    try {
                        dataOutputStream.close();
                    } catch (IOException e2) {
                    }
                    return size2;
                } catch (Exception e3) {
                    e = e3;
                    dataOutputStream2 = dataOutputStream;
                    try {
                        Log.e("BackgroundTask", "Cannot save background task results", e);
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (IOException e4) {
                            }
                        }
                        return -1;
                    } catch (Throwable th) {
                        e = th;
                        dataOutputStream = dataOutputStream2;
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    throw e;
                }
            } catch (Exception e6) {
                e = e6;
                dataOutputStream2 = null;
                Log.e("BackgroundTask", "Cannot save background task results", e);
                if (dataOutputStream2 != null) {
                    dataOutputStream2.close();
                }
                return -1;
            } catch (Throwable th3) {
                e = th3;
                dataOutputStream = null;
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                throw e;
            }
        }
    }

    private void d() {
        Throwable e;
        synchronized (this.c) {
            ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            DataInputStream dataInputStream;
            try {
                if (this.c.exists()) {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(this.c)));
                    try {
                        if (dataInputStream.readInt() != this.a) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e2) {
                            }
                            if (this.c.exists()) {
                                this.c.delete();
                            }
                            this.d = 0;
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return;
                        }
                        int readInt = dataInputStream.readInt();
                        for (int i = 0; i < readInt; i++) {
                            byte[] bArr = new byte[dataInputStream.readInt()];
                            dataInputStream.readFully(bArr);
                            a((jgm) gwb.a(bArr, jgm.class.getClassLoader()));
                        }
                        if (Log.isLoggable("BackgroundTask", 4)) {
                            new StringBuilder(34).append("readResults: num read: ").append(this.b.size());
                        }
                        try {
                            dataInputStream.close();
                        } catch (IOException e3) {
                        }
                        if (this.c.exists()) {
                            this.c.delete();
                        }
                        this.d = 0;
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return;
                    } catch (Exception e4) {
                        e = e4;
                        try {
                            Log.e("BackgroundTask", "Cannot read service results", e);
                            if (dataInputStream != null) {
                                try {
                                    dataInputStream.close();
                                } catch (IOException e5) {
                                }
                            }
                            if (this.c.exists()) {
                                this.c.delete();
                            }
                            this.d = 0;
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return;
                        } catch (Throwable th) {
                            e = th;
                            if (dataInputStream != null) {
                                try {
                                    dataInputStream.close();
                                } catch (IOException e6) {
                                }
                            }
                            if (this.c.exists()) {
                                this.c.delete();
                            }
                            this.d = 0;
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            throw e;
                        }
                    }
                }
                if (this.c.exists()) {
                    this.c.delete();
                }
                this.d = 0;
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                return;
            } catch (Exception e7) {
                e = e7;
                dataInputStream = null;
                Log.e("BackgroundTask", "Cannot read service results", e);
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                if (this.c.exists()) {
                    this.c.delete();
                }
                this.d = 0;
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                return;
            } catch (Throwable th2) {
                e = th2;
                dataInputStream = null;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                if (this.c.exists()) {
                    this.c.delete();
                }
                this.d = 0;
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw e;
            }
        }
    }

    private static int a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable e) {
            Log.e("BackgroundTask", "Failed to get application version", e);
            return i;
        }
    }
}
