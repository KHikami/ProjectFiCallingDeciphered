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
    static final boolean a;
    static final gma b;
    final bnq c;
    private boolean i;

    static {
        kae kae = glk.d;
        a = false;
        b = gma.a("ImageRequest");
    }

    public bnn(gkc gkc, bnq bnq, boolean z, Object obj) {
        this(gkc, bnq, null, z, obj);
    }

    public bnn(gkc gkc, bnq bnq, String str, boolean z, Object obj) {
        super(z, gkc, str, obj);
        this.i = false;
        this.c = bnq;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public boolean d() {
        return this.i;
    }

    public fsh m_() {
        fsh fsh = null;
        Object obj = null;
        String b = b.b("MediaBytes.getMediaBytes");
        try {
            String valueOf;
            Object obj2;
            fsh fsh2;
            fsh fsh3;
            gkh gkh = this.f;
            if (gkh.o() != null) {
                String str = "file://";
                valueOf = String.valueOf(gkh.o());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            } else {
                valueOf = gkh.l();
            }
            if (TextUtils.isEmpty(valueOf)) {
                obj2 = 1;
                fsh2 = null;
            } else if ((gkh instanceof gkc) && ((gkc) gkh).e()) {
                Bitmap a = gkd.a(Uri.parse(valueOf));
                if (a == null) {
                    int i = 1;
                    fsh3 = null;
                } else {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    a.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
                    fsh3 = new fsh(byteArrayOutputStream.toByteArray(), "image/jpeg", false);
                }
                if (obj == null) {
                    ((fsi) jyn.a(gwb.H(), fsi.class)).a((fsr) this);
                } else {
                    fsh = fsh3;
                }
                b.c(b);
                return fsh;
            } else if (valueOf.startsWith("content://") || valueOf.startsWith("android.resource://") || valueOf.startsWith("file://")) {
                fsh3 = b(valueOf);
                if (fsh3 == null) {
                    fsh2 = fsh3;
                    r0 = 1;
                }
                if (obj == null) {
                    ((fsi) jyn.a(gwb.H(), fsi.class)).a((fsr) this);
                } else {
                    fsh = fsh3;
                }
                b.c(b);
                return fsh;
            } else if (frm.a(valueOf)) {
                if (frm.b == null) {
                    frm.b = new frm();
                }
                frm.b.a((fsr) this);
                fsh3 = null;
                if (obj == null) {
                    fsh = fsh3;
                } else {
                    ((fsi) jyn.a(gwb.H(), fsi.class)).a((fsr) this);
                }
                b.c(b);
                return fsh;
            } else if (a(this.f, 0)) {
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
                ((fsi) jyn.a(gwb.H(), fsi.class)).a((fsr) this);
            }
            b.c(b);
            return fsh;
        } catch (Throwable th) {
            b.c(b);
        }
    }

    private static fsh b(String str) {
        String str2;
        String valueOf;
        if (a) {
            str2 = "loading local image ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        Uri parse = Uri.parse(str);
        ContentResolver contentResolver = gwb.H().getContentResolver();
        try {
            InputStream createInputStream;
            if (str.startsWith(ContactsContract.AUTHORITY_URI.toString())) {
                ehz ehz = (ehz) jyn.a(gwb.H(), ehz.class);
                if (!(ehz.a("android.permission.READ_CONTACTS") || ehz.a("android.permission.WRITE_CONTACTS"))) {
                    return null;
                }
            }
            if (str.startsWith(Contacts.CONTENT_URI.toString())) {
                createInputStream = contentResolver.openAssetFileDescriptor(parse, "r").createInputStream();
                valueOf = "image/jpeg";
            } else {
                createInputStream = contentResolver.openInputStream(parse);
                valueOf = gkd.a(contentResolver, parse, "image/*");
            }
            if (createInputStream != null) {
                return new fsh(gkd.a(createInputStream), valueOf, true);
            }
        } catch (Throwable e) {
            Throwable th = e;
            String str3 = "Babel_medialoader";
            String str4 = "exception reading image ";
            str2 = String.valueOf(str);
            glk.d(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4), th);
        }
        return null;
    }

    private void a(gkt gkt, gjo gjo, boolean z, boolean z2) {
        boolean z3;
        if ((!z || gkt == null || gkt.e() == null || gjo != null || this.f.n()) && ((!z || gkt != null || gjo == null || this.f.n()) && !((z && this.f.n() && gkt == null && gjo == null) || (!z && gkt == null && gjo == null)))) {
            z3 = false;
        } else {
            z3 = true;
        }
        iil.a("Expected condition to be true", z3);
        if (o()) {
            String b = b.b("deliverImageOnCorrectThread");
            try {
                this.c.a(gkt, gjo, z, this, z2);
            } finally {
                b.c(b);
            }
        } else {
            new Thread(new bno(this, gkt, gjo, z, z2), "CACHED_BITMAP_TRANSFER_THREAD").start();
        }
    }

    public boolean e() {
        gkt a = gkd.a().a(c());
        String str;
        String valueOf;
        if (a != null) {
            if (a) {
                str = "Cache hit for image request: ";
                valueOf = String.valueOf(c());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
        } else if (a) {
            str = "Cache miss for image request: ";
            valueOf = String.valueOf(c());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (a == null || this.c == null) {
            return false;
        }
        a(a, null, true, true);
        return true;
    }

    public String toString() {
        gkc gkc = (gkc) this.f;
        String valueOf = String.valueOf(super.toString());
        int b = gkc.b();
        int c = gkc.c();
        return new StringBuilder(String.valueOf(valueOf).length() + 68).append(valueOf).append(" ImageRequest:  (").append(b).append("x").append(c).append(") shouldUseLoaderQueue=").append(a()).toString();
    }

    public boolean f() {
        return !this.f.n();
    }

    public fsq a(byte[] bArr) {
        String str;
        String valueOf;
        int i = 0;
        if (a) {
            str = "ImageRequest decodeBytes starting for request ";
            valueOf = String.valueOf(toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (gjo.a(bArr)) {
            boolean h = ((gkc) this.f).h();
            gjo gjo = new gjo(bArr, h ? this : null, gkd.a());
            if (gjo.f()) {
                ((fsi) jyn.a(gwb.H(), fsi.class)).a((fsr) this);
                return null;
            } else if (!h) {
                return gjo;
            } else {
                gjo.a(false);
                return null;
            }
        }
        boolean z;
        if (bArr == null || bArr.length == 0) {
            z = false;
        } else {
            z = true;
        }
        iil.a("Expected condition to be true", z);
        gix a = gkd.a();
        gkc gkc = (gkc) this.f;
        int f = ((gkc) this.f).f();
        if (f == 0) {
            f = gwb.a(bArr);
        }
        Bitmap a2 = a.a(bArr, gkc.b(), gkc.c(), f);
        if (a) {
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
            ((fsi) jyn.a(gwb.H(), fsi.class)).a((fsr) this);
            return null;
        }
        Bitmap b = b(a2);
        if (b != a2) {
            a.a(a2);
        }
        gkt gkt = new gkt(b, c());
        gkt.a();
        a.a(c(), gkt);
        if (!a) {
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

    public void a(Bitmap bitmap) {
        Bitmap b = b(bitmap);
        if (b != bitmap) {
            gkd.a().a(bitmap);
        }
        gkt gkt = new gkt(b, c());
        gkt.a();
        gkd.a().a(c(), gkt);
        new Thread(new bnp(this, gkt), "STATIC_GIF_TRANSFER_THREAD").start();
    }

    protected final Bitmap b(Bitmap bitmap) {
        boolean z = false;
        gix a = gkd.a();
        gkc gkc = (gkc) this.f;
        boolean z2 = (bitmap.getWidth() == gkc.b() && bitmap.getHeight() == gkc.c()) ? false : true;
        if (gkc.i() && z2) {
            z = true;
        }
        if (!z && !gkc.j() && !gkc.g()) {
            return bitmap;
        }
        Bitmap a2;
        Paint paint;
        if (gkc.g()) {
            a2 = gkd.a(bitmap);
            bitmap = a2;
        } else {
            a2 = null;
        }
        Bitmap b = a.b(gkc.b(), gkc.c());
        Canvas canvas = new Canvas(b);
        Matrix matrix = new Matrix();
        if (z2) {
            matrix.postScale(((float) gkc.b()) / ((float) bitmap.getWidth()), ((float) gkc.c()) / ((float) bitmap.getHeight()));
            paint = new Paint();
            paint.setFilterBitmap(true);
        } else {
            paint = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
        if (gkc.j()) {
            Object bitmap2;
            Resources resources = gwb.H().getResources();
            if (gkc.k() == bjy.CARRIER) {
                bitmap2 = ((BitmapDrawable) resources.getDrawable(R$drawable.aJ)).getBitmap();
            } else if (gkc.k() == bjy.GV) {
                bitmap2 = ((BitmapDrawable) resources.getDrawable(R$drawable.bd)).getBitmap();
            } else {
                Bitmap bitmap3 = null;
            }
            bm.a(bitmap2, (Object) "SMS badge should not be empty!");
            float dimension = resources.getDimension(gwb.fy);
            canvas.drawBitmap(bitmap2, ((float) (gkc.b() - bitmap2.getWidth())) - dimension, ((float) (gkc.c() - bitmap2.getHeight())) - dimension, null);
        }
        if (a2 != null) {
            a.a(a2);
        }
        return b;
    }

    public void a(fsq fsq, boolean z) {
        if (a) {
            String str = "ImageRequest deliverDecoded for request ";
            String valueOf = String.valueOf(toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (this.c == null) {
            return;
        }
        if (fsq instanceof gjo) {
            a(null, (gjo) fsq, true, false);
            return;
        }
        gkt gkt = (gkt) fsq;
        gkt.a();
        a(gkt, null, true, false);
    }

    public void g() {
        if (this.c != null) {
            a(null, null, false, false);
        }
    }

    public void h() {
        if (this.c != null) {
            a(null, null, true, false);
        }
    }

    public void a(boolean z) {
        if (this.f instanceof gkc) {
            ((gkc) this.f).b(z);
        }
    }

    boolean a(gkh gkh, int i) {
        iil.b("Expected non-null", (Object) gkh);
        iil.b("Expected non-null", gkh.r());
        long a = glj.a();
        if (a) {
            String valueOf = String.valueOf(toString());
            new StringBuilder(String.valueOf(valueOf).length() + 61).append("ImageRequest loadImageFromVolley retryCount=").append(i).append(" this=").append(valueOf);
        }
        if (i > 5) {
            glk.d("Babel_medialoader", "Load image from volley retried several times and failed.", new Object[0]);
            return false;
        }
        alr a2 = dzr.a();
        if (this.i && a2.b().a(gkh.r()) == null) {
            return false;
        }
        a2.a(new bce(gkh, new alu(this, a, gkh, i, this), new alt(this, this)));
        return true;
    }
}
