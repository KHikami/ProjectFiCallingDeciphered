package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.MediaStore.Audio.Media;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class gku {
    public static final Uri f15522a = gld.m17944c(gwb.ix);
    public static final Uri f15523b = gld.m17944c(gwb.iw);

    private static File m17907a(String str, int i, String str2) {
        String a = gku.m17909a(i, str2);
        File file = new File(str);
        file.mkdirs();
        if (file.exists()) {
            return gku.m17906a(i, str, a);
        }
        String str3 = "Babel_RingtoneUtils";
        String str4 = "Could not create the directory ";
        a = String.valueOf(str);
        glk.m17982e(str3, a.length() != 0 ? str4.concat(a) : new String(str4), new Object[0]);
        return null;
    }

    public static Uri m17903a(int i, int i2, String str, int i3) {
        boolean z = false;
        boolean z2 = true;
        Context H = gwb.m1400H();
        String string = H.getString(i2);
        boolean z3;
        Uri a;
        if (VERSION.SDK_INT < 21) {
            if (VERSION.SDK_INT < 21) {
                z3 = true;
            } else {
                z3 = false;
            }
            iil.m21874a("Expected condition to be true", z3);
            Object a2 = gku.m17907a(gku.m17908a(), i, str);
            a = gku.m17904a(H, i, str);
            if (a != null) {
                return a;
            }
            if (a2 == null) {
                return null;
            }
            iil.m21869a((Object) str, (Object) ".ogg");
            iil.m21868a(i3, 1, 2);
            iil.m21875b("Expected non-null", a2);
            gku.m17912a(H, string, a2, str, i3);
            z3 = i3 == 2;
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", a2.getAbsolutePath());
            contentValues.put("title", string);
            contentValues.put("mime_type", "audio/ogg");
            contentValues.put("_size", Long.valueOf(a2.length()));
            contentValues.put("artist", Integer.valueOf(bc.f2959o));
            string = "is_ringtone";
            if (z3) {
                z2 = false;
            }
            contentValues.put(string, Boolean.valueOf(z2));
            contentValues.put("is_notification", Boolean.valueOf(z3));
            contentValues.put("is_alarm", Boolean.valueOf(z3));
            contentValues.put("is_music", Boolean.valueOf(false));
            Object contentUriForPath = Media.getContentUriForPath(a2.getAbsolutePath());
            iil.m21869a(contentUriForPath, Media.EXTERNAL_CONTENT_URI);
            return H.getContentResolver().insert(contentUriForPath, contentValues);
        }
        if (VERSION.SDK_INT >= 21) {
            z3 = true;
        } else {
            z3 = false;
        }
        iil.m21874a("Expected condition to be true", z3);
        if (gku.m17914a(H)) {
            a = gku.m17904a(H, i, str);
            if (a != null) {
                gku.m17913a(H, a.toString(), string);
                gku.m17912a(H, string, new File(gku.m17908a(), gku.m17909a(i, str)), str, i3);
            }
        }
        String a3 = gku.m17910a(H, i3);
        if (a3 == null) {
            return null;
        }
        File a4 = gku.m17907a(a3, i, str);
        iil.m21869a((Object) str, (Object) ".ogg");
        if (i3 == 1 || i3 == 2) {
            z = true;
        }
        iil.m21874a("Expected condition to be true", z);
        a = Uri.fromFile(a4);
        H.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", a));
        return a;
    }

    private static boolean m17914a(Context context) {
        List arrayList = new ArrayList();
        arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        return ((ehz) jyn.m25426a(context, ehz.class)).mo1883a(arrayList);
    }

    private static void m17913a(Context context, String str, String str2) {
        boolean z;
        String string = context.getString(bc.ae);
        String string2 = context.getString(bc.ee);
        List arrayList = new ArrayList();
        if (string.equals(str2)) {
            arrayList.add("sms_notification_sound_key");
            arrayList.add("gv_sms_sound_key");
            arrayList.add("gv_voicemail_sound_key");
            arrayList.add("chat_notification_sound_key");
            z = true;
        } else if (string2.equals(str2)) {
            arrayList.add("hangout_sound_key");
            z = false;
        } else {
            z = true;
        }
        if (!arrayList.isEmpty()) {
            jcf jcf = (jcf) jyn.m25426a(context, jcf.class);
            for (int i : fde.m15020e()) {
                if (jcf.mo3467c(i)) {
                    try {
                        jch a = jcf.mo3456a(i);
                        ArrayList arrayList2 = (ArrayList) arrayList;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            string2 = (String) obj;
                            if (str.equals(jcf.mo3456a(i).mo3440b(string2))) {
                                jcf.mo3464b(i).m23893e(string2).m23891d();
                            }
                        }
                        if (a.mo3437a()) {
                            try {
                                new blo(context, i).m6042d(str, z);
                            } catch (bmu e) {
                                glk.m17981d("Babel_RingtoneUtils", "Don't need to clean db for logged out user", new Object[0]);
                            }
                        }
                    } catch (jcj e2) {
                        glk.m17979c("Babel_RingtoneUtils", "ignore account which cannot be found: " + i, new Object[0]);
                    }
                }
            }
        }
    }

    private static Uri m17904a(Context context, int i, String str) {
        if (!gku.m17914a(context)) {
            return null;
        }
        File file = new File(gku.m17908a(), gku.m17909a(i, str));
        if (!file.exists()) {
            return null;
        }
        Object contentUriForPath = Media.getContentUriForPath(file.getAbsolutePath());
        iil.m21869a(contentUriForPath, Media.EXTERNAL_CONTENT_URI);
        ContentResolver contentResolver = gwb.m1400H().getContentResolver();
        String[] strArr = new String[]{"_id"};
        String valueOf = String.valueOf("_data=\"");
        String valueOf2 = String.valueOf(file.getAbsolutePath());
        Cursor query = contentResolver.query(contentUriForPath, strArr, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append("\"").toString(), null, null);
        if (query == null) {
            return null;
        }
        if (query.getCount() == 0) {
            query.close();
            return null;
        }
        query.moveToFirst();
        int i2 = query.getInt(0);
        query.close();
        return Uri.withAppendedPath(contentUriForPath, Integer.toString(i2));
    }

    private static String m17908a() {
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory().toString());
        String valueOf2 = String.valueOf(File.separator);
        String valueOf3 = String.valueOf(gwb.m1400H().getString(bc.jZ));
        return new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(valueOf3).toString();
    }

    private static String m17910a(Context context, int i) {
        File[] externalMediaDirs = context.getExternalMediaDirs();
        if (externalMediaDirs != null) {
            for (File file : externalMediaDirs) {
                if (file != null && Environment.getExternalStorageState(file) == "mounted") {
                    String valueOf;
                    String valueOf2;
                    String valueOf3;
                    if (i == 1) {
                        valueOf = String.valueOf(file.toString());
                        valueOf2 = String.valueOf(File.separator);
                        valueOf3 = String.valueOf(context.getString(bc.jZ));
                        return new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(valueOf3).toString();
                    } else if (i == 2) {
                        valueOf = String.valueOf(file.toString());
                        valueOf2 = String.valueOf(File.separator);
                        valueOf3 = String.valueOf(context.getString(bc.ho));
                        return new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(valueOf3).toString();
                    }
                }
            }
        }
        return null;
    }

    private static String m17909a(int i, String str) {
        String valueOf = String.valueOf(gwb.m1400H().getResources().getResourceEntryName(i));
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static void m17912a(Context context, String str, File file, String str2, int i) {
        iil.m21869a((Object) str2, (Object) ".ogg");
        iil.m21868a(i, 1, 2);
        iil.m21875b("Expected non-null", (Object) file);
        Object contentUriForPath = Media.getContentUriForPath(file.getAbsolutePath());
        iil.m21869a(contentUriForPath, Media.EXTERNAL_CONTENT_URI);
        ContentResolver contentResolver = context.getContentResolver();
        String valueOf = String.valueOf("_data=\"");
        String valueOf2 = String.valueOf(file.getAbsolutePath());
        contentResolver.delete(contentUriForPath, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append("\"").toString(), null);
        valueOf = String.valueOf("title=\"");
        contentResolver.delete(contentUriForPath, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("\"").toString(), null);
    }

    private static File m17906a(int i, String str, String str2) {
        InputStream openRawResource = gwb.m1400H().getResources().openRawResource(i);
        try {
            byte[] bArr = new byte[openRawResource.available()];
            openRawResource.read(bArr);
            openRawResource.close();
            String valueOf = String.valueOf(File.separator);
            FileOutputStream fileOutputStream = new FileOutputStream(new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString());
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            File file = new File(str, str2);
            if (file.exists()) {
                return file;
            }
            glk.m17982e("Babel_RingtoneUtils", String.format(Locale.US, "Could not create ringtone file at %s/%s ", new Object[]{str, str2}), new Object[0]);
            return null;
        } catch (Throwable e) {
            glk.m17980d("Babel_RingtoneUtils", "Could not create a file for the ringtone", e);
            return null;
        }
    }

    public static Uri m17905a(Uri uri, String... strArr) {
        String str;
        Context H = gwb.m1400H();
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (strArr.length == 0) {
            str = null;
        } else {
            str = strArr[strArr.length - 1];
        }
        try {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                if (str2 == null) {
                    i++;
                } else if (str2.isEmpty()) {
                    mediaPlayer.release();
                    return null;
                } else {
                    if (!str2.equals(str)) {
                        Ringtone ringtone = RingtoneManager.getRingtone(H, Uri.parse(str2));
                        Object title = ringtone == null ? str2 : ringtone.getTitle(H);
                        String string = H.getResources().getString(bc.ae);
                        String string2 = H.getResources().getString(bc.ee);
                        if (f15523b.toString().equals(str2) || string.equals(title) || string2.equals(title)) {
                            str2 = str;
                        }
                    }
                    try {
                        Uri parse = Uri.parse(str2);
                        if (!parse.equals(uri)) {
                            mediaPlayer.reset();
                            mediaPlayer.setDataSource(H, parse);
                        }
                        mediaPlayer.release();
                        return parse;
                    } catch (Exception e) {
                    }
                }
            }
            mediaPlayer.release();
            return uri;
        } catch (Throwable th) {
            mediaPlayer.release();
        }
    }

    public static String m17911a(Context context, Uri uri) {
        Resources resources = context.getResources();
        if (f15522a.equals(uri)) {
            return resources.getString(bc.ae);
        }
        if (f15523b.equals(uri)) {
            return resources.getString(bc.ee);
        }
        Ringtone ringtone = null;
        if (uri != null) {
            ringtone = RingtoneManager.getRingtone(context, uri);
        }
        return ringtone == null ? resources.getString(bc.kk) : ringtone.getTitle(context);
    }
}
