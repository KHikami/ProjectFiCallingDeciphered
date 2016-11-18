package p000;

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
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class cj {
    private static Method f5416a;

    public static List<File> m7753a(Context context, ApplicationInfo applicationInfo, File file, boolean z) {
        List<File> a;
        new StringBuilder("MultiDexExtractor.load(").append(applicationInfo.sourceDir).append(", ").append(z).append(")");
        File file2 = new File(applicationInfo.sourceDir);
        File file3 = new File(applicationInfo.sourceDir);
        long a2 = gwb.m1520a(file3);
        if (a2 == -1) {
            a2--;
        }
        if (!z) {
            Object obj;
            SharedPreferences a3 = cj.m7752a(context);
            if (a3.getLong("timestamp", -1) == cj.m7761b(file3) && a3.getLong("crc", -1) == a2) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj == null) {
                try {
                    a = cj.m7754a(context, file2, file);
                } catch (IOException e) {
                }
                new StringBuilder("load found ").append(a.size()).append(" secondary dex files");
                return a;
            }
        }
        a = cj.m7755a(file2, file);
        cj.m7756a(context, cj.m7761b(file2), a2, a.size() + 1);
        new StringBuilder("load found ").append(a.size()).append(" secondary dex files");
        return a;
    }

    private static List<File> m7754a(Context context, File file, File file2) {
        String str = file.getName() + ".classes";
        int i = cj.m7752a(context).getInt("dex.number", 1);
        List<File> arrayList = new ArrayList(i);
        int i2 = 2;
        while (i2 <= i) {
            File file3 = new File(file2, str + i2 + ".zip");
            if (file3.isFile()) {
                arrayList.add(file3);
                if (cj.m7760a(file3)) {
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

    private static long m7761b(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static List<File> m7755a(File file, File file2) {
        String str = file.getName() + ".classes";
        cj.m7758a(file2, str);
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
                    cj.m7759a(zipFile, entry, file3, str);
                    boolean a = cj.m7760a(file3);
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

    private static void m7756a(Context context, long j, long j2, int i) {
        Editor edit = cj.m7752a(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", i);
        if (f5416a != null) {
            try {
                f5416a.invoke(edit, new Object[0]);
                return;
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException e2) {
            }
        }
        edit.commit();
    }

    private static SharedPreferences m7752a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static void m7758a(File file, String str) {
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

    private static void m7759a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
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
                cj.m7757a(inputStream);
                createTempFile.delete();
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } catch (Throwable th) {
            cj.m7757a(inputStream);
            createTempFile.delete();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m7760a(File file) {
        try {
            new ZipFile(file).close();
            return true;
        } catch (ZipException e) {
            new StringBuilder("File ").append(file.getAbsolutePath()).append(" is not a valid zip file.");
        } catch (IOException e2) {
            new StringBuilder("Got an IOException trying to open zip file: ").append(file.getAbsolutePath());
        }
        return false;
    }

    private static void m7757a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    static {
        try {
            f5416a = Editor.class.getMethod("apply", new Class[0]);
        } catch (NoSuchMethodException e) {
            f5416a = null;
        }
    }
}
