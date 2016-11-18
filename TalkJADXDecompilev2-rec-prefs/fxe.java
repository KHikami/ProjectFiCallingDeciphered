package p000;

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
    private static final ExecutorService f14243a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(2));
    private static final Runnable f14244b = new fxh();

    static {
        gwb.m1835a(new fxf());
    }

    public static void m16458a() {
        if (fde.m15028i()) {
            f14243a.execute(f14244b);
        }
    }

    static void m16464b() {
        Context H = gwb.m1400H();
        String b = gwb.m1998b(gwb.m1400H(), "babel_apn_ota_file_prefix", "apnota-");
        String b2 = gwb.m1998b(gwb.m1400H(), "babel_apn_ota_file_suffix", ".xml.gz");
        int a = gwb.m1492a(gwb.m1400H(), "babel_apn_ota_version", -1);
        glk.m17979c("Babel_SMS", "ApnsOta: OTA version " + a, new Object[0]);
        fzw fzw = (fzw) jyn.m25426a(H, fzw.class);
        int h = fzw.mo2160h();
        int g = fzw.mo2159g();
        SQLiteDatabase a2 = bjs.m5482a(H);
        if (a > g) {
            String format = String.format(Locale.US, "%s%d%s", new Object[]{b, Integer.valueOf(a), b2});
            String valueOf = String.valueOf(H.getFilesDir());
            File file = new File(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(format).length()).append(valueOf).append("/").append(format).toString());
            if (fxe.m16463a(format, file)) {
                List a3 = bjs.m5483a(a2);
                if (!fxe.m16461a(a2, file, a, a3)) {
                    glk.m17979c("Babel_SMS", "ApnsOta: revert to defaults because of failure", new Object[0]);
                    fxe.m16460a(a2, a3);
                }
            }
            file.delete();
        } else if (a == -1 && g != h) {
            glk.m17979c("Babel_SMS", "ApnsOta: forced to load defaults", new Object[0]);
            fxe.m16460a(a2, bjs.m5483a(a2));
        }
    }

    private static boolean m16463a(String str, File file) {
        String valueOf;
        Throwable e;
        InputStream inputStream;
        OutputStream outputStream;
        InputStream inputStream2;
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
        glk.m17979c(str2, valueOf3, new Object[0]);
        OutputStream fileOutputStream;
        try {
            valueOf3 = String.valueOf(gwb.m1998b(gwb.m1400H(), "babel_apn_ota_url_prefix", "https://www.gstatic.com/android/hangouts"));
            URL url = new URL(new StringBuilder((String.valueOf(valueOf3).length() + 1) + String.valueOf(str).length()).append(valueOf3).append("/").append(str).toString());
            str3 = String.valueOf(url);
            glk.m17979c("Babel_SMS", new StringBuilder(String.valueOf(str3).length() + 24).append("ApnsOta.downloadUpdate: ").append(str3).toString(), new Object[0]);
            HttpsURLConnection httpsURLConnection4 = (HttpsURLConnection) url.openConnection();
            try {
                httpsURLConnection4.connect();
                if (httpsURLConnection4.getResponseCode() != HttpStatusCodes.STATUS_CODE_OK) {
                    str2 = String.valueOf(url);
                    glk.m17982e("Babel_SMS", new StringBuilder(String.valueOf(str2).length() + 63).append("ApnsOta.downloadUpdate: failed to connect").append(str2).append(", response=").append(httpsURLConnection4.getResponseCode()).toString(), new Object[0]);
                    if (httpsURLConnection4 != null) {
                        try {
                            httpsURLConnection4.disconnect();
                        } catch (Throwable e2) {
                            valueOf = String.valueOf(e2);
                            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e2);
                        }
                    }
                    return false;
                }
                int contentLength = httpsURLConnection4.getContentLength();
                if (contentLength <= 0) {
                    glk.m17982e("Babel_SMS", "ApnsOta.downloadUpdate: invalid content length " + contentLength, new Object[0]);
                    if (httpsURLConnection4 != null) {
                        try {
                            httpsURLConnection4.disconnect();
                        } catch (Throwable e22) {
                            valueOf = String.valueOf(e22);
                            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e22);
                        }
                    }
                    return false;
                }
                inputStream = httpsURLConnection4.getInputStream();
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        int i = 0;
                        while (true) {
                            int read = inputStream.read(bArr, 0, 4096);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            i += read;
                        }
                        if (i != contentLength) {
                            glk.m17982e("Babel_SMS", "ApnsOta.downloadUpdate: incomplete: " + i + "/" + contentLength, new Object[0]);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable e222) {
                                    valueOf = String.valueOf(e222);
                                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e222);
                                }
                            }
                            fileOutputStream.close();
                            if (httpsURLConnection4 != null) {
                                httpsURLConnection4.disconnect();
                            }
                            return false;
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable e2222) {
                                str2 = String.valueOf(e2222);
                                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(str2).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(str2).toString(), e2222);
                            }
                        }
                        fileOutputStream.close();
                        if (httpsURLConnection4 != null) {
                            httpsURLConnection4.disconnect();
                        }
                        return true;
                    } catch (Throwable e3) {
                        outputStream = fileOutputStream;
                        inputStream2 = inputStream;
                        Throwable th = e3;
                        httpsURLConnection = httpsURLConnection4;
                        e2222 = th;
                        try {
                            valueOf2 = String.valueOf(e2222);
                            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 33).append("ApnsOta.downloadUpdate: io error ").append(valueOf2).toString(), e2222);
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable e22222) {
                                    valueOf = String.valueOf(e22222);
                                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e22222);
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
                            inputStream = inputStream2;
                            fileOutputStream = outputStream;
                            httpsURLConnection3 = httpsURLConnection;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable e4) {
                                    valueOf = String.valueOf(e4);
                                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 51).append("ApnsOta.downloadUpdate: io error in closing stream ").append(valueOf).toString(), e4);
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
                        if (inputStream != null) {
                            inputStream.close();
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
                    inputStream2 = inputStream;
                    httpsURLConnection2 = httpsURLConnection4;
                    e22222 = e32;
                    httpsURLConnection = httpsURLConnection2;
                    valueOf2 = String.valueOf(e22222);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 33).append("ApnsOta.downloadUpdate: io error ").append(valueOf2).toString(), e22222);
                    if (inputStream2 != null) {
                        inputStream2.close();
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
                    if (inputStream != null) {
                        inputStream.close();
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
                inputStream2 = null;
                httpsURLConnection2 = httpsURLConnection4;
                e22222 = e322;
                httpsURLConnection = httpsURLConnection2;
                valueOf2 = String.valueOf(e22222);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 33).append("ApnsOta.downloadUpdate: io error ").append(valueOf2).toString(), e22222);
                if (inputStream2 != null) {
                    inputStream2.close();
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
                inputStream = null;
                httpsURLConnection3 = httpsURLConnection4;
                e22222 = e4222;
                if (inputStream != null) {
                    inputStream.close();
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
            inputStream2 = null;
            valueOf2 = String.valueOf(e22222);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 33).append("ApnsOta.downloadUpdate: io error ").append(valueOf2).toString(), e22222);
            if (inputStream2 != null) {
                inputStream2.close();
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
            inputStream = null;
            if (inputStream != null) {
                inputStream.close();
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

    private static void m16460a(SQLiteDatabase sQLiteDatabase, List<ContentValues> list) {
        Context H = gwb.m1400H();
        bjs.m5485b(sQLiteDatabase);
        bjs.m5487d(sQLiteDatabase);
        fxt.m16511a(H);
        bjs.m5484a(sQLiteDatabase, list);
        fxe.m16459a(((fzw) jyn.m25426a(H, fzw.class)).mo2160h());
    }

    public static boolean m16462a(File file, int i) {
        SQLiteDatabase a = bjs.m5482a(gwb.m1400H());
        return fxe.m16461a(a, file, 99, bjs.m5483a(a));
    }

    private static boolean m16461a(SQLiteDatabase sQLiteDatabase, File file, int i, List<ContentValues> list) {
        FileInputStream fileInputStream;
        Throwable e;
        Throwable e2;
        String valueOf;
        String valueOf2;
        glk.m17979c("Babel_SMS", "ApnsOta.loadUpdate version " + i, new Object[0]);
        try {
            bjs.m5486c(sQLiteDatabase);
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            fileInputStream = new FileInputStream(file);
            try {
                newPullParser.setInput(new InputStreamReader(new GZIPInputStream(fileInputStream)));
                fxk a = fxk.m16470a(newPullParser);
                a.m16476a(new fxi(sQLiteDatabase));
                a.m16477a(new fxj(new ContentValues(), sQLiteDatabase));
                a.m16478a();
                bjs.m5484a(sQLiteDatabase, list);
                fxt.m16511a(gwb.m1400H());
                fxe.m16459a(i);
                try {
                    fileInputStream.close();
                } catch (Throwable e3) {
                    String valueOf3 = String.valueOf(e3);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf3).toString(), e3);
                }
                return true;
            } catch (XmlPullParserException e4) {
                e2 = e4;
                try {
                    valueOf = String.valueOf(e2);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 37).append("ApnsOta.loadUpdate: XML parser error ").append(valueOf).toString(), e2);
                    if (fileInputStream != null) {
                        return false;
                    }
                    try {
                        fileInputStream.close();
                        return false;
                    } catch (Throwable e22) {
                        valueOf2 = String.valueOf(e22);
                        glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf2).toString(), e22);
                        return false;
                    }
                } catch (Throwable th) {
                    e3 = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable e222) {
                            valueOf2 = String.valueOf(e222);
                            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf2).toString(), e222);
                        }
                    }
                    throw e3;
                }
            } catch (FileNotFoundException e5) {
                e222 = e5;
                valueOf = String.valueOf(file);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 33).append("ApnsOta.loadUpdate: can not find ").append(valueOf).toString(), e222);
                if (fileInputStream != null) {
                    return false;
                }
                try {
                    fileInputStream.close();
                    return false;
                } catch (Throwable e2222) {
                    valueOf2 = String.valueOf(e2222);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf2).toString(), e2222);
                    return false;
                }
            } catch (IOException e6) {
                e2222 = e6;
                valueOf = String.valueOf(e2222);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 31).append("ApnsOta.loadUpdate: io failure ").append(valueOf).toString(), e2222);
                if (fileInputStream != null) {
                    return false;
                }
                try {
                    fileInputStream.close();
                    return false;
                } catch (Throwable e22222) {
                    valueOf2 = String.valueOf(e22222);
                    glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 41).append("ApnsOta.loadUpdate: file closing failure ").append(valueOf2).toString(), e22222);
                    return false;
                }
            }
        } catch (XmlPullParserException e7) {
            e22222 = e7;
            fileInputStream = null;
            valueOf = String.valueOf(e22222);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 37).append("ApnsOta.loadUpdate: XML parser error ").append(valueOf).toString(), e22222);
            if (fileInputStream != null) {
                return false;
            }
            fileInputStream.close();
            return false;
        } catch (FileNotFoundException e8) {
            e22222 = e8;
            fileInputStream = null;
            valueOf = String.valueOf(file);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 33).append("ApnsOta.loadUpdate: can not find ").append(valueOf).toString(), e22222);
            if (fileInputStream != null) {
                return false;
            }
            fileInputStream.close();
            return false;
        } catch (IOException e9) {
            e22222 = e9;
            fileInputStream = null;
            valueOf = String.valueOf(e22222);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 31).append("ApnsOta.loadUpdate: io failure ").append(valueOf).toString(), e22222);
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

    private static void m16459a(int i) {
        ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2156e(i);
    }
}
