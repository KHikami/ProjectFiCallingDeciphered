import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class fxe {
    private static final ExecutorService a;
    private static final Runnable b;

    static {
        gwb.a(new fxf());
        a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(2));
        b = new fxh();
    }

    public static void a() {
        if (fde.i()) {
            a.execute(b);
        }
    }

    static void b() {
        Context H = gwb.H();
        String b = gwb.b(gwb.H(), "babel_apn_ota_file_prefix", "apnota-");
        String b2 = gwb.b(gwb.H(), "babel_apn_ota_file_suffix", ".xml.gz");
        int a = gwb.a(gwb.H(), "babel_apn_ota_version", -1);
        glk.c("Babel_SMS", "ApnsOta: OTA version " + a, new Object[0]);
        fzw fzw = (fzw) jyn.a(H, fzw.class);
        int h = fzw.h();
        int g = fzw.g();
        SQLiteDatabase a2 = bjs.a(H);
        if (a > g) {
            String format = String.format(Locale.US, "%s%d%s", new Object[]{b, Integer.valueOf(a), b2});
            String valueOf = String.valueOf(H.getFilesDir());
            File file = new File(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(format).length()).append(valueOf).append("/").append(format).toString());
            if (a(format, file)) {
                List a3 = bjs.a(a2);
                if (!a(a2, file, a, a3)) {
                    glk.c("Babel_SMS", "ApnsOta: revert to defaults because of failure", new Object[0]);
                    a(a2, a3);
                }
            }
            file.delete();
        } else if (a == -1 && g != h) {
            glk.c("Babel_SMS", "ApnsOta: forced to load defaults", new Object[0]);
            a(a2, bjs.a(a2));
        }
    }

    private static boolean a(String str, File file) {
        String valueOf;
        Throwable e;
        OutputStream fileOutputStream;
        OutputStream outputStream;
        InputStream inputStream;
        HttpsURLConnection httpsURLConnection;
        String valueOf2;
        HttpsURLConnection httpsURLConnection2;
        HttpsURLConnection httpsURLConnection3 = null;
        String str2 = "Babel_SMS";
        String str3 = "ApnsOta: download new update ";
        String valueOf3 = String.valueOf(str);
        if (valueOf3.length() != 0) {
            valueOf3 = str3.concat(valueOf3);
        } else {
            valueOf3 = new String(str3);
        }
        glk.c(str2, valueOf3, new Object[0]);
        InputStream inputStream2;
        try {
            valueOf3 = String.valueOf(gwb.b(gwb.H(), "babel_apn_ota_url_prefix", "https://www.gstatic.com/android/hangouts"));
            URL url = new URL(new StringBuilder((String.valueOf(valueOf3).length() + 1) + String.valueOf(str).length()).append(valueOf3).append("/").append(str).toString());
            str3 = String.valueOf(url);
            glk.c("Babel_SMS", new StringBuilder(String.valueOf(str3).length() + 24).append("ApnsOta.downloadUpdate: ").append(str3).toString(), new Object[0]);
            HttpsURLConnection httpsURLConnection4 = (HttpsURLConnection) url.openConnection();
            try {
                httpsURLConnection4.connect();
                if (httpsURLConnection4.getResponseCode() != HttpStatusCodes.STATUS_CODE_OK) {
                    str2 = String.valueOf(url);
                    glk.e("Babel_SMS", new StringBuilder(String.valueOf(str2).length() + 63).append("ApnsOta.downloadUpdate: failed to connect").append(str2).append(", response=").append(httpsURLConnection4.getResponseCode()).toString(), new Object[0]);
                    if (httpsURLConnection4 != null) {
                        try {
                            httpsURLConnection4.disconnect();
                        } catch (Throwable e2) {
                            valueOf = String.valueOf(e2);
                            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e2);
                        }
                    }
                    return false;
                }
                int contentLength = httpsURLConnection4.getContentLength();
                if (contentLength <= 0) {
                    glk.e("Babel_SMS", "ApnsOta.downloadUpdate: invalid content length " + contentLength, new Object[0]);
                    if (httpsURLConnection4 != null) {
                        try {
                            httpsURLConnection4.disconnect();
                        } catch (Throwable e22) {
                            valueOf = String.valueOf(e22);
                            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e22);
                        }
                    }
                    return false;
                }
                inputStream2 = httpsURLConnection4.getInputStream();
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        int i = 0;
                        while (true) {
                            int read = inputStream2.read(bArr, 0, 4096);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            i += read;
                        }
                        if (i != contentLength) {
                            glk.e("Babel_SMS", "ApnsOta.downloadUpdate: incomplete: " + i + "/" + contentLength, new Object[0]);
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable e222) {
                                    valueOf = String.valueOf(e222);
                                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e222);
                                }
                            }
                            fileOutputStream.close();
                            if (httpsURLConnection4 != null) {
                                httpsURLConnection4.disconnect();
                            }
                            return false;
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable e2222) {
                                str2 = String.valueOf(e2222);
                                glk.d("Babel_SMS", new StringBuilder(String.valueOf(str2).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(str2).toString(), e2222);
                            }
                        }
                        fileOutputStream.close();
                        if (httpsURLConnection4 != null) {
                            httpsURLConnection4.disconnect();
                        }
                        return true;
                    } catch (Throwable e3) {
                        outputStream = fileOutputStream;
                        inputStream = inputStream2;
                        Throwable th = e3;
                        httpsURLConnection = httpsURLConnection4;
                        e2222 = th;
                        try {
                            valueOf2 = String.valueOf(e2222);
                            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 33).append("ApnsOta.downloadUpdate: io error ").append(valueOf2).toString(), e2222);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable e22222) {
                                    valueOf = String.valueOf(e22222);
                                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e22222);
                                    return false;
                                }
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            return false;
                        } catch (Throwable th2) {
                            e22222 = th2;
                            inputStream2 = inputStream;
                            fileOutputStream = outputStream;
                            httpsURLConnection3 = httpsURLConnection;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable e4) {
                                    valueOf = String.valueOf(e4);
                                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e4);
                                    throw e22222;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (httpsURLConnection3 != null) {
                                httpsURLConnection3.disconnect();
                            }
                            throw e22222;
                        }
                    } catch (Throwable e42) {
                        httpsURLConnection3 = httpsURLConnection4;
                        e22222 = e42;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (httpsURLConnection3 != null) {
                            httpsURLConnection3.disconnect();
                        }
                        throw e22222;
                    }
                } catch (Throwable e32) {
                    inputStream = inputStream2;
                    httpsURLConnection2 = httpsURLConnection4;
                    e22222 = e32;
                    httpsURLConnection = httpsURLConnection2;
                    valueOf2 = String.valueOf(e22222);
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 33).append("ApnsOta.downloadUpdate: io error ").append(valueOf2).toString(), e22222);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return false;
                } catch (Throwable e422) {
                    fileOutputStream = null;
                    httpsURLConnection3 = httpsURLConnection4;
                    e22222 = e422;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (httpsURLConnection3 != null) {
                        httpsURLConnection3.disconnect();
                    }
                    throw e22222;
                }
            } catch (Throwable e322) {
                inputStream = null;
                httpsURLConnection2 = httpsURLConnection4;
                e22222 = e322;
                httpsURLConnection = httpsURLConnection2;
                valueOf2 = String.valueOf(e22222);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 33).append("ApnsOta.downloadUpdate: io error ").append(valueOf2).toString(), e22222);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return false;
            } catch (Throwable e4222) {
                fileOutputStream = null;
                inputStream2 = null;
                httpsURLConnection3 = httpsURLConnection4;
                e22222 = e4222;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (httpsURLConnection3 != null) {
                    httpsURLConnection3.disconnect();
                }
                throw e22222;
            }
        } catch (IOException e5) {
            e22222 = e5;
            httpsURLConnection = null;
            inputStream = null;
            valueOf2 = String.valueOf(e22222);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 33).append("ApnsOta.downloadUpdate: io error ").append(valueOf2).toString(), e22222);
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            return false;
        } catch (Throwable th3) {
            e22222 = th3;
            fileOutputStream = null;
            inputStream2 = null;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (httpsURLConnection3 != null) {
                httpsURLConnection3.disconnect();
            }
            throw e22222;
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase, List<ContentValues> list) {
        Context H = gwb.H();
        bjs.b(sQLiteDatabase);
        bjs.d(sQLiteDatabase);
        fxt.a(H);
        bjs.a(sQLiteDatabase, list);
        a(((fzw) jyn.a(H, fzw.class)).h());
    }

    public static boolean a(File file, int i) {
        SQLiteDatabase a = bjs.a(gwb.H());
        return a(a, file, 99, bjs.a(a));
    }

    private static boolean a(SQLiteDatabase sQLiteDatabase, File file, int i, List<ContentValues> list) {
        FileInputStream fileInputStream;
        Throwable e;
        Throwable e2;
        String valueOf;
        String valueOf2;
        glk.c("Babel_SMS", "ApnsOta.loadUpdate version " + i, new Object[0]);
        try {
            bjs.c(sQLiteDatabase);
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            fileInputStream = new FileInputStream(file);
            try {
                newPullParser.setInput(new InputStreamReader(new GZIPInputStream(fileInputStream)));
                fxk a = fxk.a(newPullParser);
                a.a(new fxi(sQLiteDatabase));
                a.a(new fxj(new ContentValues(), sQLiteDatabase));
                a.a();
                bjs.a(sQLiteDatabase, list);
                fxt.a(gwb.H());
                a(i);
                try {
                    fileInputStream.close();
                } catch (Throwable e3) {
                    String valueOf3 = String.valueOf(e3);
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf3).toString(), e3);
                }
                return true;
            } catch (XmlPullParserException e4) {
                e2 = e4;
                try {
                    valueOf = String.valueOf(e2);
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 37).append("ApnsOta.loadUpdate: XML parser error ").append(valueOf).toString(), e2);
                    if (fileInputStream != null) {
                        return false;
                    }
                    try {
                        fileInputStream.close();
                        return false;
                    } catch (Throwable e22) {
                        valueOf2 = String.valueOf(e22);
                        glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf2).toString(), e22);
                        return false;
                    }
                } catch (Throwable th) {
                    e3 = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable e222) {
                            valueOf2 = String.valueOf(e222);
                            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf2).toString(), e222);
                        }
                    }
                    throw e3;
                }
            } catch (FileNotFoundException e5) {
                e222 = e5;
                valueOf = String.valueOf(file);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 33).append("ApnsOta.loadUpdate: can not find ").append(valueOf).toString(), e222);
                if (fileInputStream != null) {
                    return false;
                }
                try {
                    fileInputStream.close();
                    return false;
                } catch (Throwable e2222) {
                    valueOf2 = String.valueOf(e2222);
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf2).toString(), e2222);
                    return false;
                }
            } catch (IOException e6) {
                e2222 = e6;
                valueOf = String.valueOf(e2222);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 31).append("ApnsOta.loadUpdate: io failure ").append(valueOf).toString(), e2222);
                if (fileInputStream != null) {
                    return false;
                }
                try {
                    fileInputStream.close();
                    return false;
                } catch (Throwable e22222) {
                    valueOf2 = String.valueOf(e22222);
                    glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf2).toString(), e22222);
                    return false;
                }
            }
        } catch (XmlPullParserException e7) {
            e22222 = e7;
            fileInputStream = null;
            valueOf = String.valueOf(e22222);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 37).append("ApnsOta.loadUpdate: XML parser error ").append(valueOf).toString(), e22222);
            if (fileInputStream != null) {
                return false;
            }
            fileInputStream.close();
            return false;
        } catch (FileNotFoundException e8) {
            e22222 = e8;
            fileInputStream = null;
            valueOf = String.valueOf(file);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 33).append("ApnsOta.loadUpdate: can not find ").append(valueOf).toString(), e22222);
            if (fileInputStream != null) {
                return false;
            }
            fileInputStream.close();
            return false;
        } catch (IOException e9) {
            e22222 = e9;
            fileInputStream = null;
            valueOf = String.valueOf(e22222);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 31).append("ApnsOta.loadUpdate: io failure ").append(valueOf).toString(), e22222);
            if (fileInputStream != null) {
                return false;
            }
            fileInputStream.close();
            return false;
        } catch (Throwable th2) {
            e3 = th2;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw e3;
        }
    }

    private static void a(int i) {
        ((fzw) jyn.a(gwb.H(), fzw.class)).e(i);
    }
}
