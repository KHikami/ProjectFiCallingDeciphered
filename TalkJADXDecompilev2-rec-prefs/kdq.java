package p000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Random;

public final class kdq {
    private static final Random f21421a = new Random();
    private static final char[] f21422b = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final ThreadLocal<kds> f21423c = new kdr();

    public static StringBuilder m25600a() {
        return ((kds) f21423c.get()).m25602a();
    }

    public static String m25599a(StringBuilder stringBuilder) {
        String stringBuilder2 = stringBuilder.toString();
        ((kds) f21423c.get()).m25603a(stringBuilder);
        return stringBuilder2;
    }

    public static void m25601a(String str, String str2) {
        OutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(str);
        } catch (FileNotFoundException e) {
            File parentFile = new File(str).getParentFile();
            if (parentFile == null || parentFile.exists()) {
                throw e;
            }
            parentFile.mkdirs();
            fileOutputStream = new FileOutputStream(str);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        try {
            bufferedWriter.write(str2);
        } finally {
            bufferedWriter.close();
        }
    }

    public static String m25598a(String str) {
        return kdq.m25597a(new FileInputStream(str));
    }

    private static String m25597a(InputStream inputStream) {
        try {
            String readLine = new BufferedReader(new InputStreamReader(inputStream)).readLine();
            if (readLine == null) {
                readLine = "";
            }
            inputStream.close();
            return readLine;
        } catch (Throwable th) {
            inputStream.close();
        }
    }

    public static String m25596a(long j) {
        if (j < 1024) {
            return j + " B";
        }
        int log = (int) (Math.log((double) j) / Math.log(1024.0d));
        return String.format("%.1f %sB", new Object[]{Double.valueOf(((double) j) / Math.pow(1024.0d, (double) log)), Character.valueOf("KMGTPE".charAt(log - 1))});
    }
}
