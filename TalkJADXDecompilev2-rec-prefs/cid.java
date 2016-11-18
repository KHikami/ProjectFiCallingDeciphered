package p000;

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
    final Uri f5360a;
    final Context f5361b;
    final int f5362c;
    final ContentResolver f5363d;
    boolean f5364e;
    boolean f5365f;
    long f5366g;
    final /* synthetic */ PreviewImageActivity f5367h;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7710a();
    }

    protected /* synthetic */ void onCancelled(Object obj) {
        m7712b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7711a((bxy) obj);
    }

    public cid(PreviewImageActivity previewImageActivity, Context context, int i, Uri uri) {
        this.f5367h = previewImageActivity;
        this.f5361b = context;
        this.f5360a = uri;
        this.f5362c = i;
        this.f5363d = context.getContentResolver();
    }

    private bxy m7710a() {
        InputStream openInputStream;
        Throwable e;
        bxo bxo = bxo.NONE;
        if (this.f5367h.f6082w != null) {
            bxo bxo2;
            if (gwb.m2061b(this.f5367h.f6082w)) {
                bxo2 = bxo.VIDEO;
            } else {
                bxo2 = bxo.PHOTO;
            }
            bxo = bxo2;
        }
        try {
            bxy a;
            if (gwb.m1906a(this.f5361b, "babel_copy_shared_media_to_scratch_uri", false) || ccy.m7229a(this.f5360a)) {
                a = ccy.m7221a(this.f5361b, this.f5362c, bxo, this.f5360a, this.f5360a.toString(), this.f5367h.f6083x);
            } else {
                try {
                    openInputStream = this.f5361b.getContentResolver().openInputStream(this.f5360a);
                    try {
                        openInputStream.read();
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (Throwable e2) {
                                glk.m17978c("Babel_PreviewImage", "Exception closing", e2);
                            }
                        }
                        a = new bxy();
                        a.b = this.f5360a.toString();
                        a.f4761j = -1;
                        a.a = this.f5360a.toString();
                        a.d = this.f5367h.f6083x;
                        a.c = bxo;
                        if (a.c == bxo.VIDEO) {
                            ccy.m7227a(this.f5360a, this.f5363d, this.f5361b, a);
                        } else if (a.c == bxo.PHOTO) {
                            ccy.m7228a(this.f5360a, this.f5363d, a);
                        }
                    } catch (IOException e3) {
                        e2 = e3;
                        try {
                            glk.m17978c("Babel_PreviewImage", "Could not read from the passed in uri", e2);
                            cancel(false);
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (Throwable e22) {
                                    glk.m17978c("Babel_PreviewImage", "Exception closing", e22);
                                }
                            }
                            return null;
                        } catch (Throwable th) {
                            e22 = th;
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (Throwable e4) {
                                    glk.m17978c("Babel_PreviewImage", "Exception closing", e4);
                                }
                            }
                            throw e22;
                        }
                    }
                } catch (IOException e5) {
                    e22 = e5;
                    openInputStream = null;
                    glk.m17978c("Babel_PreviewImage", "Could not read from the passed in uri", e22);
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
                this.f5366g = (long) a.f4760i;
                if (this.f5366g > this.f5367h.f6081v) {
                    this.f5364e = true;
                    if (this.f5367h.f6080u) {
                        String b = ccy.m7231b(this.f5360a);
                        if (gwb.m1906a(this.f5361b, "babel_save_camera_images_to_hangouts", true)) {
                            ccy.m7220a(this.f5361b.getContentResolver(), b, bxo.VIDEO);
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
            glk.m17978c("Babel_PreviewImage", "Exception getting video metadata", e222);
            this.f5365f = true;
            cancel(false);
            return null;
        }
    }

    private void m7712b() {
        if (this.f5364e) {
            this.f5367h.f6077r.setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.f5366g)));
            this.f5367h.f6077r.setVisibility(0);
            this.f5367h.f6076q.setVisibility(0);
            this.f5367h.f6076q.setVideoURI(this.f5360a);
            this.f5367h.f6076q.setOnPreparedListener(new cie(this));
            this.f5367h.f6074o.setVisibility(8);
            this.f5367h.f6073n.setVisibility(0);
            this.f5367h.f6078s.m10452b(this.f5367h.getResources().getColor(ba.jc));
            this.f5367h.f6078s.setColorFilter(this.f5367h.getResources().getColor(ba.jb), Mode.SRC_IN);
            this.f5367h.f6078s.setEnabled(false);
            String a = glj.m17961a(this.f5367h.f6081v, true, false);
            Builder builder = new Builder(this.f5367h);
            if (this.f5367h.f6080u) {
                builder.setMessage(this.f5367h.getString(gwb.mj, new Object[]{a})).setTitle(gwb.mk);
            } else {
                builder.setMessage(this.f5367h.getString(gwb.mi, new Object[]{a})).setTitle(gwb.lR);
            }
            builder.setPositiveButton(gwb.lS, new cif(this));
            builder.create().show();
        } else if (this.f5365f) {
            this.f5367h.f6074o.setVisibility(8);
            this.f5367h.f6073n.setVisibility(0);
            this.f5367h.f6078s.m10452b(this.f5367h.getResources().getColor(ba.jc));
            this.f5367h.f6078s.setColorFilter(this.f5367h.getResources().getColor(ba.jb), Mode.SRC_IN);
            this.f5367h.f6078s.setEnabled(false);
            new Builder(this.f5367h).setMessage(this.f5367h.getString(gwb.mg)).setTitle(gwb.mh).setPositiveButton(gwb.lS, new cig(this)).create().show();
        } else {
            String valueOf = String.valueOf(this.f5360a);
            glk.m17981d("Babel_PreviewImage", new StringBuilder(String.valueOf(valueOf).length() + 51).append("Cancelled preview. Unable to create attachment for ").append(valueOf).toString(), new Object[0]);
            Toast.makeText(this.f5367h, this.f5367h.getString(gwb.mf), 0).show();
            this.f5367h.setResult(0, this.f5367h.getIntent());
            this.f5367h.finish();
        }
    }

    private void m7711a(bxy bxy) {
        if (bxy.c == bxo.VIDEO) {
            this.f5367h.f6077r.setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds((long) bxy.f4760i)));
            this.f5367h.f6077r.setVisibility(0);
            this.f5367h.f6076q.setVisibility(0);
            this.f5367h.f6076q.setVideoURI(this.f5360a);
            this.f5367h.f6076q.setOnPreparedListener(new cih(this));
        } else {
            this.f5367h.f6075p.setVisibility(0);
            dex dex = (dex) this.f5367h.E.m25443a(dex.class);
            dey dey = (dey) this.f5367h.E.m25443a(dey.class);
            baf baf = null;
            if (ccy.m7229a(this.f5360a)) {
                baf = new baf(bxy.d, System.currentTimeMillis(), bxy.f4759h);
            }
            dex.mo1502a(this.f5360a, this.f5367h.f6075p, baf, dey.mo1512a());
        }
        this.f5367h.f6074o.setVisibility(8);
        this.f5367h.f6073n.setVisibility(0);
        this.f5367h.f6079t = bxy;
    }
}
