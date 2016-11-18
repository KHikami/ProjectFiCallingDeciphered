package p000;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import com.google.android.apps.hangouts.R$drawable;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class bnn extends fsr implements gjr {
    static final boolean f3559a = false;
    static final gma f3560b = gma.m18073a("ImageRequest");
    final bnq f3561c;
    private boolean f3562i;

    static {
        kae kae = glk.f15557d;
    }

    public bnn(gkc gkc, bnq bnq, boolean z, Object obj) {
        this(gkc, bnq, null, z, obj);
    }

    public bnn(gkc gkc, bnq bnq, String str, boolean z, Object obj) {
        super(z, gkc, str, obj);
        this.f3562i = false;
        this.f3561c = bnq;
    }

    public void m5521b(boolean z) {
        this.f3562i = z;
    }

    public boolean m5522d() {
        return this.f3562i;
    }

    public fsh m_() {
        fsh fsh = null;
        Object obj = null;
        String b = f3560b.m18078b("MediaBytes.getMediaBytes");
        try {
            String valueOf;
            Object obj2;
            fsh fsh2;
            fsh fsh3;
            gkh gkh = this.f;
            if (gkh.m5542o() != null) {
                String str = "file://";
                valueOf = String.valueOf(gkh.m5542o());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            } else {
                valueOf = gkh.m5539l();
            }
            if (TextUtils.isEmpty(valueOf)) {
                obj2 = 1;
                fsh2 = null;
            } else if ((gkh instanceof gkc) && ((gkc) gkh).m5561e()) {
                Bitmap a = gkd.m17872a(Uri.parse(valueOf));
                if (a == null) {
                    int i = 1;
                    fsh3 = null;
                } else {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    a.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
                    fsh3 = new fsh(byteArrayOutputStream.toByteArray(), "image/jpeg", false);
                }
                if (obj == null) {
                    ((fsi) jyn.m25426a(gwb.m1400H(), fsi.class)).m16136a((fsr) this);
                } else {
                    fsh = fsh3;
                }
                f3560b.m18079c(b);
                return fsh;
            } else if (valueOf.startsWith("content://") || valueOf.startsWith("android.resource://") || valueOf.startsWith("file://")) {
                fsh3 = bnn.m5513b(valueOf);
                if (fsh3 == null) {
                    fsh2 = fsh3;
                    r0 = 1;
                }
                if (obj == null) {
                    ((fsi) jyn.m25426a(gwb.m1400H(), fsi.class)).m16136a((fsr) this);
                } else {
                    fsh = fsh3;
                }
                f3560b.m18079c(b);
                return fsh;
            } else if (frm.m16048a(valueOf)) {
                if (frm.f13817b == null) {
                    frm.f13817b = new frm();
                }
                frm.f13817b.m16050a((fsr) this);
                fsh3 = null;
                if (obj == null) {
                    fsh = fsh3;
                } else {
                    ((fsi) jyn.m25426a(gwb.m1400H(), fsi.class)).m16136a((fsr) this);
                }
                f3560b.m18079c(b);
                return fsh;
            } else if (m5519a(this.f, 0)) {
                obj2 = null;
                fsh2 = null;
            } else {
                r0 = 1;
                fsh2 = null;
            }
            obj = obj2;
            fsh3 = fsh2;
            if (obj == null) {
                fsh = fsh3;
            } else {
                ((fsi) jyn.m25426a(gwb.m1400H(), fsi.class)).m16136a((fsr) this);
            }
            f3560b.m18079c(b);
            return fsh;
        } catch (Throwable th) {
            f3560b.m18079c(b);
        }
    }

    private static fsh m5513b(String str) {
        String str2;
        String valueOf;
        if (f3559a) {
            str2 = "loading local image ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        Uri parse = Uri.parse(str);
        ContentResolver contentResolver = gwb.m1400H().getContentResolver();
        try {
            InputStream createInputStream;
            if (str.startsWith(ContactsContract.AUTHORITY_URI.toString())) {
                ehz ehz = (ehz) jyn.m25426a(gwb.m1400H(), ehz.class);
                if (!(ehz.mo1882a("android.permission.READ_CONTACTS") || ehz.mo1882a("android.permission.WRITE_CONTACTS"))) {
                    return null;
                }
            }
            if (str.startsWith(Contacts.CONTENT_URI.toString())) {
                createInputStream = contentResolver.openAssetFileDescriptor(parse, "r").createInputStream();
                valueOf = "image/jpeg";
            } else {
                String a = gkd.m17874a(contentResolver, parse, "image/*");
                createInputStream = contentResolver.openInputStream(parse);
                valueOf = a;
            }
            if (createInputStream != null) {
                return new fsh(gkd.m17878a(createInputStream), valueOf, true);
            }
        } catch (Throwable e) {
            Throwable th = e;
            String str3 = "Babel_medialoader";
            String str4 = "exception reading image ";
            str2 = String.valueOf(str);
            glk.m17980d(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4), th);
        }
        return null;
    }

    private void m5511a(gkt gkt, gjo gjo, boolean z, boolean z2) {
        boolean z3;
        if ((!z || gkt == null || gkt.m17898e() == null || gjo != null || this.f.m5541n()) && ((!z || gkt != null || gjo == null || this.f.m5541n()) && !((z && this.f.m5541n() && gkt == null && gjo == null) || (!z && gkt == null && gjo == null)))) {
            z3 = false;
        } else {
            z3 = true;
        }
        iil.m21874a("Expected condition to be true", z3);
        if (m5509o()) {
            String b = f3560b.m18078b("deliverImageOnCorrectThread");
            try {
                this.f3561c.mo604a(gkt, gjo, z, this, z2);
            } finally {
                f3560b.m18079c(b);
            }
        } else {
            new Thread(new bno(this, gkt, gjo, z, z2), "CACHED_BITMAP_TRANSFER_THREAD").start();
        }
    }

    public boolean mo598e() {
        gkt a = gkd.m17873a().m17768a(mo594c());
        String str;
        String valueOf;
        if (a != null) {
            if (f3559a) {
                str = "Cache hit for image request: ";
                valueOf = String.valueOf(mo594c());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
        } else if (f3559a) {
            str = "Cache miss for image request: ";
            valueOf = String.valueOf(mo594c());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (a == null || this.f3561c == null) {
            return false;
        }
        m5511a(a, null, true, true);
        return true;
    }

    public String toString() {
        gkc gkc = (gkc) this.f;
        String valueOf = String.valueOf(super.toString());
        int b = gkc.m5552b();
        int c = gkc.m5556c();
        return new StringBuilder(String.valueOf(valueOf).length() + 68).append(valueOf).append(" ImageRequest:  (").append(b).append("x").append(c).append(") shouldUseLoaderQueue=").append(mo606a()).toString();
    }

    public boolean mo599f() {
        return !this.f.m5541n();
    }

    public fsq mo595a(byte[] bArr) {
        String str;
        String valueOf;
        int i = 0;
        if (f3559a) {
            str = "ImageRequest decodeBytes starting for request ";
            valueOf = String.valueOf(toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (gjo.m17833a(bArr)) {
            boolean h = ((gkc) this.f).m5565h();
            gjo gjo = new gjo(bArr, h ? this : null, gkd.m17873a());
            if (gjo.m17842f()) {
                ((fsi) jyn.m25426a(gwb.m1400H(), fsi.class)).m16136a((fsr) this);
                return null;
            } else if (!h) {
                return gjo;
            } else {
                gjo.m17837a(false);
                return null;
            }
        }
        boolean z;
        if (bArr == null || bArr.length == 0) {
            z = false;
        } else {
            z = true;
        }
        iil.m21874a("Expected condition to be true", z);
        gix a = gkd.m17873a();
        gkc gkc = (gkc) this.f;
        int f = ((gkc) this.f).m5562f();
        if (f == 0) {
            f = gwb.m1516a(bArr);
        }
        Bitmap a2 = a.m17767a(bArr, gkc.m5552b(), gkc.m5556c(), f);
        if (f3559a) {
            Object obj;
            if (bArr != null) {
                i = bArr.length;
            }
            if (a2 == null) {
                obj = null;
            } else {
                obj = Integer.valueOf(a2.getWidth());
            }
            str = String.valueOf(obj);
            new StringBuilder(String.valueOf(str).length() + 55).append("decodeStaticImageBytes in bytes=").append(i).append(" bitmap out=").append(str);
        }
        if (a2 == null) {
            ((fsi) jyn.m25426a(gwb.m1400H(), fsi.class)).m16136a((fsr) this);
            return null;
        }
        Bitmap b = m5520b(a2);
        if (b != a2) {
            a.m17771a(a2);
        }
        gkt gkt = new gkt(b, mo594c());
        gkt.mo2291a();
        a.m17769a(mo594c(), gkt);
        if (!f3559a) {
            return gkt;
        }
        str = "ImageRequest decodeBytes ended for request ";
        valueOf = String.valueOf(toString());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
            return gkt;
        }
        valueOf = new String(str);
        return gkt;
    }

    public void mo596a(Bitmap bitmap) {
        Bitmap b = m5520b(bitmap);
        if (b != bitmap) {
            gkd.m17873a().m17771a(bitmap);
        }
        gkt gkt = new gkt(b, mo594c());
        gkt.mo2291a();
        gkd.m17873a().m17769a(mo594c(), gkt);
        new Thread(new bnp(this, gkt), "STATIC_GIF_TRANSFER_THREAD").start();
    }

    protected final Bitmap m5520b(Bitmap bitmap) {
        boolean z = false;
        gix a = gkd.m17873a();
        gkc gkc = (gkc) this.f;
        boolean z2 = (bitmap.getWidth() == gkc.m5552b() && bitmap.getHeight() == gkc.m5556c()) ? false : true;
        if (gkc.m5566i() && z2) {
            z = true;
        }
        if (!z && !gkc.m5567j() && !gkc.m5564g()) {
            return bitmap;
        }
        Bitmap a2;
        Paint paint;
        if (gkc.m5564g()) {
            a2 = gkd.m17871a(bitmap);
            bitmap = a2;
        } else {
            a2 = null;
        }
        Bitmap b = a.m17772b(gkc.m5552b(), gkc.m5556c());
        Canvas canvas = new Canvas(b);
        Matrix matrix = new Matrix();
        if (z2) {
            matrix.postScale(((float) gkc.m5552b()) / ((float) bitmap.getWidth()), ((float) gkc.m5556c()) / ((float) bitmap.getHeight()));
            paint = new Paint();
            paint.setFilterBitmap(true);
        } else {
            paint = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
        if (gkc.m5567j()) {
            Object bitmap2;
            Resources resources = gwb.m1400H().getResources();
            if (gkc.m5568k() == bjy.CARRIER) {
                bitmap2 = ((BitmapDrawable) resources.getDrawable(R$drawable.aJ)).getBitmap();
            } else if (gkc.m5568k() == bjy.GV) {
                bitmap2 = ((BitmapDrawable) resources.getDrawable(R$drawable.bd)).getBitmap();
            } else {
                Bitmap bitmap3 = null;
            }
            bm.m6123a(bitmap2, (Object) "SMS badge should not be empty!");
            float dimension = resources.getDimension(gwb.fy);
            canvas.drawBitmap(bitmap2, ((float) (gkc.m5552b() - bitmap2.getWidth())) - dimension, ((float) (gkc.m5556c() - bitmap2.getHeight())) - dimension, null);
        }
        if (a2 != null) {
            a.m17771a(a2);
        }
        return b;
    }

    public void mo597a(fsq fsq, boolean z) {
        if (f3559a) {
            String str = "ImageRequest deliverDecoded for request ";
            String valueOf = String.valueOf(toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (this.f3561c == null) {
            return;
        }
        if (fsq instanceof gjo) {
            m5511a(null, (gjo) fsq, true, false);
            return;
        }
        gkt gkt = (gkt) fsq;
        gkt.mo2291a();
        m5511a(gkt, null, true, false);
    }

    public void mo600g() {
        if (this.f3561c != null) {
            m5511a(null, null, false, false);
        }
    }

    public void mo601h() {
        if (this.f3561c != null) {
            m5511a(null, null, true, false);
        }
    }

    public void mo605a(boolean z) {
        if (this.f instanceof gkc) {
            ((gkc) this.f).m5555b(z);
        }
    }

    boolean m5519a(gkh gkh, int i) {
        iil.m21875b("Expected non-null", (Object) gkh);
        iil.m21875b("Expected non-null", gkh.m5545r());
        long a = glj.m17956a();
        if (f3559a) {
            String valueOf = String.valueOf(toString());
            new StringBuilder(String.valueOf(valueOf).length() + 61).append("ImageRequest loadImageFromVolley retryCount=").append(i).append(" this=").append(valueOf);
        }
        if (i > 5) {
            glk.m17981d("Babel_medialoader", "Load image from volley retried several times and failed.", new Object[0]);
            return false;
        }
        alr a2 = dzr.m13194a();
        if (this.f3562i && a2.m2868b().mo1786a(gkh.m5545r()) == null) {
            return false;
        }
        a2.m2866a(new bce(gkh, new alu(this, a, gkh, i, this), new alt(this, this)));
        return true;
    }
}
