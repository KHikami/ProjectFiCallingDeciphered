package p000;

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

final class jgl {
    private final int f20010a;
    private final List<jgm> f20011b = new LinkedList();
    private final File f20012c;
    private int f20013d;
    private int f20014e;

    public jgl(Context context, String str) {
        this.f20010a = ((VERSION.RELEASE.hashCode() + 31) * 31) + jgl.m24155a(context);
        String valueOf = String.valueOf(context.getDir(null, 0).getAbsolutePath());
        this.f20012c = new File(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append("/").append(str).toString());
        m24161d();
        m24159b();
    }

    public void m24165a(int i, String str, jgz jgz) {
        if (jgl.m24156a(jgz) <= 128000) {
            synchronized (this.f20011b) {
                m24159b();
                m24158a(new jgm(i, str, jgz));
                m24160c();
            }
        } else if (Log.isLoggable("BackgroundTask", 5)) {
            String valueOf = String.valueOf(jgz);
            new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(str).length()).append("Result too large to store: ").append(valueOf).append(", tag: ").append(str);
        }
    }

    public jgz m24164a(int i, String str) {
        jgz jgz;
        synchronized (this.f20011b) {
            Iterator it = this.f20011b.iterator();
            while (it.hasNext()) {
                jgm jgm = (jgm) it.next();
                if (jgm.f20015a == i && TextUtils.equals(jgm.f20016b, str)) {
                    m24157a(it, jgm);
                    jgz = jgm.f20017c;
                    break;
                }
            }
            jgz = null;
        }
        return jgz;
    }

    public int m24163a(int i) {
        int i2;
        synchronized (this.f20011b) {
            i2 = 0;
            Iterator it = this.f20011b.iterator();
            while (it.hasNext()) {
                int i3;
                jgm jgm = (jgm) it.next();
                if (jgm.f20015a == i) {
                    m24157a(it, jgm);
                    i3 = i2 + 1;
                } else {
                    i3 = i2;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private void m24159b() {
        Iterator it = this.f20011b.iterator();
        while (it.hasNext()) {
            jgm jgm = (jgm) it.next();
            if (jgm.f20017c.m24196h()) {
                if (Log.isLoggable("BackgroundTask", 4)) {
                    String valueOf = String.valueOf(jgm.f20017c);
                    String str = jgm.f20016b;
                    new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length()).append("Dropping expired result: ").append(valueOf).append(", tag: ").append(str);
                }
                m24157a(it, jgm);
            }
        }
    }

    private void m24160c() {
        Iterator it = this.f20011b.iterator();
        while (this.f20014e > 512000 && it.hasNext()) {
            jgm jgm = (jgm) it.next();
            if (Log.isLoggable("BackgroundTask", 4)) {
                String valueOf = String.valueOf(jgm.f20017c);
                String str = jgm.f20016b;
                new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(str).length()).append("Dropping result to make room: ").append(valueOf).append(", tag: ").append(str);
            }
            m24157a(it, jgm);
        }
    }

    private void m24158a(jgm jgm) {
        this.f20011b.add(jgm);
        this.f20014e += jgl.m24156a(jgm.f20017c);
    }

    private void m24157a(Iterator<jgm> it, jgm jgm) {
        it.remove();
        this.f20014e -= jgl.m24156a(jgm.f20017c);
    }

    private static int m24156a(jgz jgz) {
        byte[] e = jgz.m24193e();
        return (e != null ? e.length : 0) + HttpStatusCodes.STATUS_CODE_OK;
    }

    public int m24162a() {
        Throwable e;
        DataOutputStream dataOutputStream;
        synchronized (this.f20011b) {
            List arrayList = new ArrayList(this.f20011b.size());
            for (jgm jgm : this.f20011b) {
                if (jgm.f20017c.m24198j() == jha.f20058c) {
                    arrayList.add(jgm);
                }
            }
        }
        synchronized (this.f20012c) {
            int hashCode = arrayList.hashCode();
            if (hashCode == this.f20013d) {
                return 0;
            }
            DataOutputStream dataOutputStream2;
            try {
                dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.f20012c)));
                try {
                    dataOutputStream2.writeInt(this.f20010a);
                    dataOutputStream2.writeInt(arrayList.size());
                    ArrayList arrayList2 = (ArrayList) arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        byte[] a = gwb.m1947a((jgm) obj);
                        dataOutputStream2.writeInt(a.length);
                        dataOutputStream2.write(a);
                    }
                    this.f20013d = hashCode;
                    if (Log.isLoggable("BackgroundTask", 4)) {
                        new StringBuilder(38).append("writeResults: num written: ").append(arrayList.size());
                    }
                    int size2 = arrayList.size();
                    try {
                        dataOutputStream2.close();
                    } catch (IOException e2) {
                    }
                    return size2;
                } catch (Exception e3) {
                    e = e3;
                    dataOutputStream = dataOutputStream2;
                    try {
                        Log.e("BackgroundTask", "Cannot save background task results", e);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        return -1;
                    } catch (Throwable th) {
                        e = th;
                        dataOutputStream2 = dataOutputStream;
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (IOException e5) {
                            }
                        }
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    if (dataOutputStream2 != null) {
                        dataOutputStream2.close();
                    }
                    throw e;
                }
            } catch (Exception e6) {
                e = e6;
                dataOutputStream = null;
                Log.e("BackgroundTask", "Cannot save background task results", e);
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                return -1;
            } catch (Throwable th3) {
                e = th3;
                dataOutputStream2 = null;
                if (dataOutputStream2 != null) {
                    dataOutputStream2.close();
                }
                throw e;
            }
        }
    }

    private void m24161d() {
        Throwable e;
        synchronized (this.f20012c) {
            ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            DataInputStream dataInputStream;
            try {
                if (this.f20012c.exists()) {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(this.f20012c)));
                    try {
                        if (dataInputStream.readInt() != this.f20010a) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e2) {
                            }
                            if (this.f20012c.exists()) {
                                this.f20012c.delete();
                            }
                            this.f20013d = 0;
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return;
                        }
                        int readInt = dataInputStream.readInt();
                        for (int i = 0; i < readInt; i++) {
                            byte[] bArr = new byte[dataInputStream.readInt()];
                            dataInputStream.readFully(bArr);
                            m24158a((jgm) gwb.m1579a(bArr, jgm.class.getClassLoader()));
                        }
                        if (Log.isLoggable("BackgroundTask", 4)) {
                            new StringBuilder(34).append("readResults: num read: ").append(this.f20011b.size());
                        }
                        try {
                            dataInputStream.close();
                        } catch (IOException e3) {
                        }
                        if (this.f20012c.exists()) {
                            this.f20012c.delete();
                        }
                        this.f20013d = 0;
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
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
                            if (this.f20012c.exists()) {
                                this.f20012c.delete();
                            }
                            this.f20013d = 0;
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        } catch (Throwable th) {
                            e = th;
                            if (dataInputStream != null) {
                                try {
                                    dataInputStream.close();
                                } catch (IOException e6) {
                                }
                            }
                            if (this.f20012c.exists()) {
                                this.f20012c.delete();
                            }
                            this.f20013d = 0;
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            throw e;
                        }
                    }
                }
                if (this.f20012c.exists()) {
                    this.f20012c.delete();
                }
                this.f20013d = 0;
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            } catch (Exception e7) {
                e = e7;
                dataInputStream = null;
                Log.e("BackgroundTask", "Cannot read service results", e);
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                if (this.f20012c.exists()) {
                    this.f20012c.delete();
                }
                this.f20013d = 0;
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            } catch (Throwable th2) {
                e = th2;
                dataInputStream = null;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                if (this.f20012c.exists()) {
                    this.f20012c.delete();
                }
                this.f20013d = 0;
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw e;
            }
        }
    }

    private static int m24155a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable e) {
            Log.e("BackgroundTask", "Failed to get application version", e);
            return i;
        }
    }
}
