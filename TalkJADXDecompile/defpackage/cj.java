package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: cj */
public final class cj {
    private static Method a;

    public static List<File> a(Context context, ApplicationInfo applicationInfo, File file, boolean z) {
        List<File> a;
        new StringBuilder("MultiDexExtractor.load(").append(applicationInfo.sourceDir).append(", ").append(z).append(")");
        File file2 = new File(applicationInfo.sourceDir);
        File file3 = new File(applicationInfo.sourceDir);
        long a2 = gwb.a(file3);
        if (a2 == -1) {
            a2--;
        }
        if (!z) {
            Object obj;
            SharedPreferences a3 = cj.a(context);
            if (a3.getLong("timestamp", -1) == cj.b(file3) && a3.getLong("crc", -1) == a2) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj == null) {
                try {
                    a = cj.a(context, file2, file);
                } catch (IOException e) {
                }
                new StringBuilder("load found ").append(a.size()).append(" secondary dex files");
                return a;
            }
        }
        a = cj.a(file2, file);
        cj.a(context, cj.b(file2), a2, a.size() + 1);
        new StringBuilder("load found ").append(a.size()).append(" secondary dex files");
        return a;
    }

    private static List<File> a(Context context, File file, File file2) {
        String str = file.getName() + ".classes";
        int i = cj.a(context).getInt("dex.number", 1);
        List<File> arrayList = new ArrayList(i);
        int i2 = 2;
        while (i2 <= i) {
            File file3 = new File(file2, str + i2 + ".zip");
            if (file3.isFile()) {
                arrayList.add(file3);
                if (cj.a(file3)) {
                    i2++;
                } else {
                    new StringBuilder("Invalid zip file: ").append(file3);
                    throw new IOException("Invalid ZIP file.");
                }
            }
            throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
        }
        return arrayList;
    }

    private static long b(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static List<File> a(File file, File file2) {
        String str = file.getName() + ".classes";
        cj.a(file2, str);
        List<File> arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            int i = 2;
            while (entry != null) {
                File file3 = new File(file2, str + i + ".zip");
                arrayList.add(file3);
                new StringBuilder("Extraction is needed for file ").append(file3);
                boolean z = false;
                int i2 = 0;
                while (i2 < 3 && !z) {
                    int i3 = i2 + 1;
                    cj.a(zipFile, entry, file3, str);
                    boolean a = cj.a(file3);
                    new StringBuilder("Extraction ").append(a ? "success" : "failed").append(" - length ").append(file3.getAbsolutePath()).append(": ").append(file3.length());
                    if (!a) {
                        file3.delete();
                        if (file3.exists()) {
                            new StringBuilder("Failed to delete corrupted secondary dex '").append(file3.getPath()).append("'");
                            z = a;
                            i2 = i3;
                        }
                    }
                    z = a;
                    i2 = i3;
                }
                if (z) {
                    i2 = i + 1;
                    entry = zipFile.getEntry("classes" + i2 + ".dex");
                    i = i2;
                } else {
                    throw new IOException("Could not create zip file " + file3.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    private static void a(Context context, long j, long j2, int i) {
        Editor edit = cj.a(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", i);
        if (a != null) {
            try {
                a.invoke(edit, new Object[0]);
                return;
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException e2) {
            }
        }
        edit.commit();
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static void a(File file, String str) {
        file.mkdir();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new ck(str));
            if (listFiles == null) {
                new StringBuilder("Failed to list secondary dex dir content (").append(file.getPath()).append(").");
                return;
            }
            for (File file2 : listFiles) {
                new StringBuilder("Trying to delete old file ").append(file2.getPath()).append(" of size ").append(file2.length());
                if (file2.delete()) {
                    new StringBuilder("Deleted old file ").append(file2.getPath());
                } else {
                    new StringBuilder("Failed to delete old file ").append(file2.getPath());
                }
            }
            return;
        }
        throw new IOException("Failed to create dex directory " + file.getPath());
    }

    private static void a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        Closeable inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(str, ".zip", file.getParentFile());
        new StringBuilder("Extracting ").append(createTempFile.getPath());
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            new StringBuilder("Renaming to ").append(file.getPath());
            if (createTempFile.renameTo(file)) {
                cj.a(inputStream);
                createTempFile.delete();
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } catch (Throwable th) {
            cj.a(inputStream);
            createTempFile.delete();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(java.io.File r2) {
        /*
        r0 = new java.util.zip.ZipFile;	 Catch:{ ZipException -> 0x001b, IOException -> 0x0031 }
        r0.<init>(r2);	 Catch:{ ZipException -> 0x001b, IOException -> 0x0031 }
        r0.close();	 Catch:{ IOException -> 0x000a, ZipException -> 0x001b }
        r0 = 1;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ ZipException -> 0x001b, IOException -> 0x0031 }
        r1 = "Failed to close zip file: ";
        r0.<init>(r1);	 Catch:{ ZipException -> 0x001b, IOException -> 0x0031 }
        r1 = r2.getAbsolutePath();	 Catch:{ ZipException -> 0x001b, IOException -> 0x0031 }
        r0.append(r1);	 Catch:{ ZipException -> 0x001b, IOException -> 0x0031 }
    L_0x0019:
        r0 = 0;
        goto L_0x0009;
    L_0x001b:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r1 = "File ";
        r0.<init>(r1);
        r1 = r2.getAbsolutePath();
        r0 = r0.append(r1);
        r1 = " is not a valid zip file.";
        r0.append(r1);
        goto L_0x0019;
    L_0x0031:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r1 = "Got an IOException trying to open zip file: ";
        r0.<init>(r1);
        r1 = r2.getAbsolutePath();
        r0.append(r1);
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.a(java.io.File):boolean");
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    static {
        try {
            a = Editor.class.getMethod("apply", new Class[0]);
        } catch (NoSuchMethodException e) {
            a = null;
        }
    }
}
