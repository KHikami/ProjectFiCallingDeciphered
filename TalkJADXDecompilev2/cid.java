package defpackage;

import android.app.AlertDialog.Builder;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.format.DateUtils;
import android.widget.Toast;
import com.google.android.apps.hangouts.conversation.v2.PreviewImageActivity;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public final class cid extends AsyncTask<Void, Integer, bxy> {
    final Uri a;
    final Context b;
    final int c;
    final ContentResolver d;
    boolean e;
    boolean f;
    long g;
    final /* synthetic */ PreviewImageActivity h;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onCancelled(Object obj) {
        b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((bxy) obj);
    }

    public cid(PreviewImageActivity previewImageActivity, Context context, int i, Uri uri) {
        this.h = previewImageActivity;
        this.b = context;
        this.a = uri;
        this.c = i;
        this.d = context.getContentResolver();
    }

    private bxy a() {
        Throwable e;
        bxo bxo = bxo.NONE;
        if (this.h.w != null) {
            bxo bxo2;
            if (gwb.b(this.h.w)) {
                bxo2 = bxo.VIDEO;
            } else {
                bxo2 = bxo.PHOTO;
            }
            bxo = bxo2;
        }
        try {
            bxy a;
            if (gwb.a(this.b, "babel_copy_shared_media_to_scratch_uri", false) || ccy.a(this.a)) {
                a = ccy.a(this.b, this.c, bxo, this.a, this.a.toString(), this.h.x);
            } else {
                InputStream openInputStream;
                try {
                    openInputStream = this.b.getContentResolver().openInputStream(this.a);
                    try {
                        openInputStream.read();
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (Throwable e2) {
                                glk.c("Babel_PreviewImage", "Exception closing", e2);
                            }
                        }
                        a = new bxy();
                        a.b = this.a.toString();
                        a.j = -1;
                        a.a = this.a.toString();
                        a.d = this.h.x;
                        a.c = bxo;
                        if (a.c == bxo.VIDEO) {
                            ccy.a(this.a, this.d, this.b, a);
                        } else if (a.c == bxo.PHOTO) {
                            ccy.a(this.a, this.d, a);
                        }
                    } catch (IOException e3) {
                        e2 = e3;
                        try {
                            glk.c("Babel_PreviewImage", "Could not read from the passed in uri", e2);
                            cancel(false);
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (Throwable e22) {
                                    glk.c("Babel_PreviewImage", "Exception closing", e22);
                                }
                            }
                            return null;
                        } catch (Throwable th) {
                            e22 = th;
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (Throwable e4) {
                                    glk.c("Babel_PreviewImage", "Exception closing", e4);
                                }
                            }
                            throw e22;
                        }
                    }
                } catch (IOException e5) {
                    e22 = e5;
                    openInputStream = null;
                    glk.c("Babel_PreviewImage", "Could not read from the passed in uri", e22);
                    cancel(false);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    e22 = th2;
                    openInputStream = null;
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    throw e22;
                }
            }
            if (bxo == bxo.VIDEO) {
                this.g = (long) a.i;
                if (this.g > this.h.v) {
                    this.e = true;
                    if (this.h.u) {
                        String b = ccy.b(this.a);
                        if (gwb.a(this.b, "babel_save_camera_images_to_hangouts", true)) {
                            ccy.a(this.b.getContentResolver(), b, bxo.VIDEO);
                        }
                    }
                    cancel(false);
                    return null;
                }
            }
            if (a != null) {
                return a;
            }
            cancel(false);
            return a;
        } catch (Throwable e222) {
            glk.c("Babel_PreviewImage", "Exception getting video metadata", e222);
            this.f = true;
            cancel(false);
            return null;
        }
    }

    private void b() {
        if (this.e) {
            this.h.r.setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.g)));
            this.h.r.setVisibility(0);
            this.h.q.setVisibility(0);
            this.h.q.setVideoURI(this.a);
            this.h.q.setOnPreparedListener(new cie(this));
            this.h.o.setVisibility(8);
            this.h.n.setVisibility(0);
            this.h.s.b(this.h.getResources().getColor(ba.jc));
            this.h.s.setColorFilter(this.h.getResources().getColor(ba.jb), Mode.SRC_IN);
            this.h.s.setEnabled(false);
            String a = glj.a(this.h.v, true, false);
            Builder builder = new Builder(this.h);
            if (this.h.u) {
                builder.setMessage(this.h.getString(gwb.mj, new Object[]{a})).setTitle(gwb.mk);
            } else {
                builder.setMessage(this.h.getString(gwb.mi, new Object[]{a})).setTitle(gwb.lR);
            }
            builder.setPositiveButton(gwb.lS, new cif(this));
            builder.create().show();
        } else if (this.f) {
            this.h.o.setVisibility(8);
            this.h.n.setVisibility(0);
            this.h.s.b(this.h.getResources().getColor(ba.jc));
            this.h.s.setColorFilter(this.h.getResources().getColor(ba.jb), Mode.SRC_IN);
            this.h.s.setEnabled(false);
            new Builder(this.h).setMessage(this.h.getString(gwb.mg)).setTitle(gwb.mh).setPositiveButton(gwb.lS, new cig(this)).create().show();
        } else {
            String valueOf = String.valueOf(this.a);
            glk.d("Babel_PreviewImage", new StringBuilder(String.valueOf(valueOf).length() + 51).append("Cancelled preview. Unable to create attachment for ").append(valueOf).toString(), new Object[0]);
            Toast.makeText(this.h, this.h.getString(gwb.mf), 0).show();
            this.h.setResult(0, this.h.getIntent());
            this.h.finish();
        }
    }

    private void a(bxy bxy) {
        if (bxy.c == bxo.VIDEO) {
            this.h.r.setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds((long) bxy.i)));
            this.h.r.setVisibility(0);
            this.h.q.setVisibility(0);
            this.h.q.setVideoURI(this.a);
            this.h.q.setOnPreparedListener(new cih(this));
        } else {
            this.h.p.setVisibility(0);
            dex dex = (dex) this.h.E.a(dex.class);
            dey dey = (dey) this.h.E.a(dey.class);
            baf baf = null;
            if (ccy.a(this.a)) {
                baf = new baf(bxy.d, System.currentTimeMillis(), bxy.h);
            }
            dex.a(this.a, this.h.p, baf, dey.a());
        }
        this.h.o.setVisibility(8);
        this.h.n.setVisibility(0);
        this.h.t = bxy;
    }
}
