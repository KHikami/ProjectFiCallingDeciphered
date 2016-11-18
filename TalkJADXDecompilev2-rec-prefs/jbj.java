package p000;

import android.os.Build;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class jbj {
    private static final byte[] f19720a = jbj.m23790b();

    public static byte[] m23789a() {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(f19720a);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new SecurityException("Failed to generate seed", e);
        }
    }

    private static byte[] m23790b() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            stringBuilder.append(str);
        }
        str = Build.SERIAL;
        if (str != null) {
            stringBuilder.append(str);
        }
        try {
            return stringBuilder.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding not supported");
        }
    }
}
