import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.net.Uri;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.android.contacts.common.vcard.ImportVCardActivity;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class ajn extends Thread implements OnCancelListener {
    final Uri[] a;
    private final String[] b;
    private final byte[] c;
    private final String d;
    private boolean e;
    private WakeLock f;
    private bgs g;
    private /* synthetic */ ImportVCardActivity h;

    public ajn(ImportVCardActivity importVCardActivity, Uri[] uriArr, String[] strArr) {
        this.h = importVCardActivity;
        this.a = uriArr;
        this.b = strArr;
        this.c = null;
        this.f = ((PowerManager) importVCardActivity.getSystemService("power")).newWakeLock(536870918, "VCardImport");
        this.d = null;
    }

    public final void finalize() {
        if (this.f != null && this.f.isHeld()) {
            Log.w("VCardImport", "WakeLock is being held.");
            this.f.release();
        }
    }

    public final void run() {
        int i = 0;
        if (this.h.e == null) {
            throw new NullPointerException("vCard cache thread must be launched after a service connection is established");
        }
        this.f.acquire();
        try {
            if (!this.e) {
                List arrayList = new ArrayList();
                Uri[] uriArr = this.a;
                int length = uriArr.length;
                int i2 = 0;
                while (i < length) {
                    Uri uri = uriArr[i];
                    if (this.e) {
                        break;
                    }
                    int i3 = i2 + 1;
                    try {
                        ajh a = a(null, uri, this.b[i2]);
                        if (this.e) {
                            this.f.release();
                            this.h.unbindService(this.h.e);
                            this.h.c.dismiss();
                            this.h.c = null;
                            this.h.finish();
                            return;
                        }
                        arrayList.add(a);
                        i++;
                        i2 = i3;
                    } catch (Throwable e) {
                        Log.e("VCardImport", "Maybe the file is in wrong format", e);
                        this.h.a(buf.fh);
                        this.f.release();
                        this.h.unbindService(this.h.e);
                        this.h.c.dismiss();
                        this.h.c = null;
                        this.h.finish();
                        return;
                    } catch (Throwable e2) {
                        Log.e("VCardImport", "Unexpected IOException", e2);
                        this.h.a(buf.fe);
                        this.f.release();
                        this.h.unbindService(this.h.e);
                        this.h.c.dismiss();
                        this.h.c = null;
                        this.h.finish();
                        return;
                    } catch (OutOfMemoryError e3) {
                        Log.e("VCardImport", "OutOfMemoryError occured during caching vCard");
                        System.gc();
                        this.h.runOnUiThread(new ajl(this.h, this.h.getString(buf.ff)));
                    }
                }
                if (arrayList.isEmpty()) {
                    Log.w("VCardImport", "Empty import requests. Ignore it.");
                } else {
                    ajm ajm = this.h.e;
                    ajm.a.a(arrayList, ajm.b.a);
                }
                this.f.release();
                this.h.unbindService(this.h.e);
                this.h.c.dismiss();
                this.h.c = null;
                this.h.finish();
            }
        } catch (OutOfMemoryError e32) {
            Log.e("VCardImport", "OutOfMemoryError occured during caching vCard");
            System.gc();
            this.h.runOnUiThread(new ajl(this.h, this.h.getString(buf.ff)));
        } catch (Throwable e22) {
            Log.e("VCardImport", "IOException during caching vCard", e22);
            this.h.runOnUiThread(new ajl(this.h, this.h.getString(buf.fe)));
        } finally {
            this.f.release();
            this.h.unbindService(this.h.e);
            this.h.c.dismiss();
            this.h.c = null;
            this.h.finish();
        }
    }

    private final ajh a(byte[] bArr, Uri uri, String str) {
        bgr bgr;
        int i;
        bgp bgp;
        bgr bgr2;
        bgz bgz;
        bgr bgp2;
        Throwable th;
        Throwable th2;
        InputStream inputStream;
        bgr bgr3;
        InputStream inputStream2;
        int i2;
        Object obj;
        InputStream inputStream3;
        bgp bgp3 = null;
        int i3 = 1;
        ContentResolver contentResolver = this.h.getContentResolver();
        if (bArr != null) {
            try {
                InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (bhf e) {
                bgr = null;
                Log.w("VCardImport", "Nested Exception is found (it may be false-positive).");
                i = 1;
                bgp = bgp3;
                bgr2 = bgr;
                return new ajh(this.h.b, bArr, uri, str, bgz.e(), bgz.f(), i, bgp.a);
            }
        }
        byteArrayInputStream = contentResolver.openInputStream(uri);
        this.g = new bgw();
        try {
            bgp2 = new bgp();
            try {
                bgr = new bgz();
            } catch (bhh e2) {
                bgr = null;
                bgr2 = bgp2;
                try {
                    byteArrayInputStream.close();
                } catch (IOException e3) {
                }
                if (bArr != null) {
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                    } catch (Throwable th3) {
                        th = th3;
                        bgp2 = bgr;
                        th2 = th;
                        inputStream = byteArrayInputStream;
                        bgr3 = bgr2;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e4) {
                            }
                        }
                        try {
                            throw th2;
                        } catch (bhf e5) {
                            bgr = bgp2;
                            bgp3 = bgr3;
                        }
                    }
                } else {
                    byteArrayInputStream = contentResolver.openInputStream(uri);
                }
                this.g = new bgx();
                try {
                    bgp2 = new bgp();
                    try {
                        bgr2 = new bgz();
                        try {
                            this.g.a(bgp2);
                            this.g.a(bgr2);
                            this.g.a(byteArrayInputStream);
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                    bgr = bgr2;
                                    bgr2 = bgp2;
                                    i2 = 1;
                                } catch (IOException e6) {
                                    bgr = bgr2;
                                    bgr2 = bgp2;
                                    i2 = 1;
                                } catch (bhf e7) {
                                    bgr = bgr2;
                                    bgr2 = bgp2;
                                    Log.w("VCardImport", "Nested Exception is found (it may be false-positive).");
                                    i = 1;
                                    bgp = bgp3;
                                    bgr2 = bgr;
                                    return new ajh(this.h.b, bArr, uri, str, bgz.e(), bgz.f(), i, bgp.a);
                                }
                            }
                            bgr = bgr2;
                            bgr2 = bgp2;
                            i2 = 1;
                            if (obj != null) {
                                i3 = 2;
                            }
                            i = i3;
                            bgp = bgr2;
                            bgz = bgr;
                            return new ajh(this.h.b, bArr, uri, str, bgz.e(), bgz.f(), i, bgp.a);
                        } catch (bhh e8) {
                            bgr = bgr2;
                            bgr2 = bgp2;
                            try {
                                throw new bhd("vCard with unspported version.");
                            } catch (Throwable th32) {
                                th = th32;
                                bgp2 = bgr;
                                th2 = th;
                                inputStream = byteArrayInputStream;
                                bgr3 = bgr2;
                                inputStream2 = inputStream;
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            inputStream3 = byteArrayInputStream;
                            bgr3 = bgp2;
                            bgp2 = bgr2;
                            inputStream2 = inputStream3;
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            throw th2;
                        }
                    } catch (bhh e9) {
                        bgr2 = bgp2;
                        throw new bhd("vCard with unspported version.");
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream2 = byteArrayInputStream;
                        bgr3 = bgp2;
                        bgp2 = bgr;
                        th2 = th;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        throw th2;
                    }
                } catch (bhh e10) {
                    throw new bhd("vCard with unspported version.");
                }
            } catch (Throwable th6) {
                th2 = th6;
                inputStream3 = byteArrayInputStream;
                bgr3 = bgp2;
                bgp2 = null;
                inputStream2 = inputStream3;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th2;
            }
            try {
                this.g.a(bgp2);
                this.g.a(bgr);
                this.g.a(byteArrayInputStream);
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                        bgr2 = bgp2;
                        obj = null;
                    } catch (IOException e11) {
                        bgr2 = bgp2;
                        obj = null;
                    } catch (bhf e12) {
                        bgr2 = bgp2;
                        Log.w("VCardImport", "Nested Exception is found (it may be false-positive).");
                        i = 1;
                        bgp = bgp3;
                        bgr2 = bgr;
                        return new ajh(this.h.b, bArr, uri, str, bgz.e(), bgz.f(), i, bgp.a);
                    }
                }
                bgr2 = bgp2;
                obj = null;
            } catch (bhh e13) {
                bgr2 = bgp2;
                byteArrayInputStream.close();
                if (bArr != null) {
                    byteArrayInputStream = contentResolver.openInputStream(uri);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                }
                this.g = new bgx();
                bgp2 = new bgp();
                bgr2 = new bgz();
                this.g.a(bgp2);
                this.g.a(bgr2);
                this.g.a(byteArrayInputStream);
                if (byteArrayInputStream != null) {
                    bgr = bgr2;
                    bgr2 = bgp2;
                    i2 = 1;
                } else {
                    byteArrayInputStream.close();
                    bgr = bgr2;
                    bgr2 = bgp2;
                    i2 = 1;
                }
                if (obj != null) {
                    i3 = 2;
                }
                i = i3;
                bgp = bgr2;
                bgz = bgr;
                return new ajh(this.h.b, bArr, uri, str, bgz.e(), bgz.f(), i, bgp.a);
            } catch (Throwable th52) {
                th = th52;
                inputStream2 = byteArrayInputStream;
                bgr3 = bgp2;
                bgp2 = bgr;
                th2 = th;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th2;
            }
        } catch (bhh e14) {
            bgr = null;
            byteArrayInputStream.close();
            if (bArr != null) {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } else {
                byteArrayInputStream = contentResolver.openInputStream(uri);
            }
            this.g = new bgx();
            bgp2 = new bgp();
            bgr2 = new bgz();
            this.g.a(bgp2);
            this.g.a(bgr2);
            this.g.a(byteArrayInputStream);
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
                bgr = bgr2;
                bgr2 = bgp2;
                i2 = 1;
            } else {
                bgr = bgr2;
                bgr2 = bgp2;
                i2 = 1;
            }
            if (obj != null) {
                i3 = 2;
            }
            i = i3;
            bgp = bgr2;
            bgz = bgr;
            return new ajh(this.h.b, bArr, uri, str, bgz.e(), bgz.f(), i, bgp.a);
        } catch (Throwable th7) {
            th2 = th7;
            bgp2 = null;
            inputStream3 = byteArrayInputStream;
            bgr3 = null;
            inputStream2 = inputStream3;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th2;
        }
        if (obj != null) {
            i3 = 2;
        }
        i = i3;
        bgp = bgr2;
        bgz = bgr;
        return new ajh(this.h.b, bArr, uri, str, bgz.e(), bgz.f(), i, bgp.a);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.e = true;
        if (this.g != null) {
            this.g.a();
        }
    }
}
