package defpackage;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bdo */
final class bdo implements bbf {
    private /* synthetic */ bdn a;

    bdo(bdn bdn) {
        this.a = bdn;
    }

    public final void c(String str, bbe bbe) {
    }

    public final void a(String str, bbe bbe) {
        ayo a = azs.a.a(str);
        if (a != null) {
            a.g.c = bbe.o;
            Object obj = this.a;
            ayo b = bdn.b(azs.a);
            if (b != null && b.d.equals(a.d)) {
                int i;
                CharSequence a2;
                int i2;
                int c = b.c();
                if (b.c() == 8) {
                    i = buf.kA;
                } else if (b.i == 3) {
                    i = buf.kC;
                } else {
                    i = buf.ko;
                }
                Bitmap bitmap = null;
                if (b.c(1) && !b.c(2)) {
                    bitmap = BitmapFactory.decodeResource(obj.b.getResources(), buf.kE);
                }
                if (bbe.f != null && (bbe.f instanceof BitmapDrawable)) {
                    bitmap = ((BitmapDrawable) bbe.f).getBitmap();
                }
                if (b.o) {
                    bitmap = ayv.a(obj.b.getResources().getDrawable(buf.kh));
                }
                CharSequence a3 = obj.a(b, bbe.p);
                if (!b.c(1) || b.c(2)) {
                    a2 = aim.a(bbe.a, bbe.b, obj.f);
                    if (TextUtils.isEmpty(a2)) {
                        if (TextUtils.isEmpty(bbe.c)) {
                            a2 = null;
                        } else {
                            a2 = BidiFormatter.getInstance().unicodeWrap(bbe.c, TextDirectionHeuristics.LTR);
                        }
                    }
                } else {
                    a2 = obj.b.getResources().getString(aq.bY);
                }
                Object obj2 = b.i == 3 ? 1 : null;
                if (c == 4 || c == 5 || obj2 != null) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                Uri uri = bbe.q;
                Object obj3 = ((a2 == null || a2.equals(obj.l)) && (a2 != null || obj.l == null)) ? null : 1;
                obj3 = (obj.i == i && Objects.equals(obj.j, a3) && obj.h == c && obj.k == bitmap && obj3 == null && Objects.equals(obj.n, uri)) ? null : 1;
                if (obj.g != i2) {
                    if (obj.g == 0) {
                        bdf.a(obj, "Showing notification for first time.");
                    }
                    obj3 = 1;
                }
                obj.i = i;
                obj.j = a3;
                obj.h = c;
                obj.k = bitmap;
                obj.l = a2;
                obj.n = uri;
                if (obj3 != null) {
                    bdf.a(obj, "Data changed.  Showing notification");
                }
                if (obj3 != null) {
                    if (bitmap != null) {
                        if (bitmap == null) {
                            bitmap = null;
                        } else {
                            bitmap = buf.a(bitmap, (int) obj.b.getResources().getDimension(17104901), (int) obj.b.getResources().getDimension(17104902));
                        }
                    }
                    Builder builder = new Builder(obj.b);
                    builder.setSmallIcon(i).setColor(obj.b.getResources().getColor(buf.jT)).setContentTitle(obj.a(b, 0));
                    bdn.a(b, c, builder);
                    Builder builder2 = new Builder(obj.b);
                    builder2.setOngoing(true);
                    builder2.setPriority(1);
                    builder2.setPublicVersion(builder.build());
                    builder2.setContentIntent(obj.a(false));
                    if (i2 == 2 && !bcj.b().d()) {
                        PendingIntent a4 = obj.a(true);
                        String valueOf = String.valueOf(a4);
                        bdf.a(obj, new StringBuilder(String.valueOf(valueOf).length() + 28).append("- Setting fullScreenIntent: ").append(valueOf).toString());
                        builder2.setFullScreenIntent(a4, true);
                        obj3 = (b.c() == 5 || (b.c() == 4 && azs.a.f() != null)) ? 1 : null;
                        if (obj3 != null) {
                            bdf.d(obj, "updateInCallNotification: call-waiting! force relaunch...");
                            obj.d.cancel(1);
                        }
                        builder2.setCategory("call");
                    }
                    builder2.setContentText(a3);
                    builder2.setSmallIcon(i);
                    builder2.setContentTitle(a2);
                    builder2.setLargeIcon(bitmap);
                    builder2.setColor(obj.b.getResources().getColor(buf.jT));
                    if (obj2 != null) {
                        builder2.setUsesChronometer(false);
                        bdf.d(obj, "Will show \"dismiss upgrade\" action in the incoming call Notification");
                        builder2.addAction(0, obj.b.getText(aq.cG), bdn.a(obj.b, "com.android.incallui.ACTION_DECLINE_VIDEO_UPGRADE_REQUEST"));
                        bdf.d(obj, "Will show \"accept upgrade\" action in the incoming call Notification");
                        builder2.addAction(0, obj.b.getText(aq.cC), bdn.a(obj.b, "com.android.incallui.ACTION_ACCEPT_VIDEO_UPGRADE_REQUEST"));
                    } else {
                        bdn.a(b, c, builder2);
                        if (c == 3 || c == 8 || buf.f(c)) {
                            bdf.a(obj, "Will show \"hang-up\" action in the ongoing active call Notification");
                            builder2.addAction(buf.kn, obj.b.getText(aq.cH), bdn.a(obj.b, "com.android.incallui.ACTION_HANG_UP_ONGOING_CALL"));
                        } else if (c == 4 || c == 5) {
                            bdf.a(obj, "Will show \"dismiss\" action in the incoming call Notification");
                            builder2.addAction(buf.kp, obj.b.getText(aq.cG), bdn.a(obj.b, "com.android.incallui.ACTION_DECLINE_INCOMING_CALL"));
                            if (b.a(obj.b)) {
                                bdf.a(obj, "Will show \"voice\" action in the incoming call Notification");
                                builder2.addAction(buf.ko, obj.b.getText(aq.cF), bdn.a(obj.b, "com.android.incallui.ACTION_ANSWER_VOICE_INCOMING_CALL"));
                                bdf.d(obj, "Will show \"video\" action in the incoming call Notification");
                                builder2.addAction(buf.kC, obj.b.getText(aq.cE), bdn.a(obj.b, "com.android.incallui.ACTION_ANSWER_VIDEO_INCOMING_CALL"));
                            } else {
                                bdf.a(obj, "Will show \"answer\" action in the incoming call Notification");
                                builder2.addAction(buf.ko, obj.b.getText(aq.cD), bdn.a(obj.b, "com.android.incallui.ACTION_ANSWER_VOICE_INCOMING_CALL"));
                            }
                        }
                    }
                    if (bbe.k != null && bbe.p != 1) {
                        builder2.addPerson(bbe.k.toString());
                    } else if (!TextUtils.isEmpty(buf.c(b.b))) {
                        builder2.addPerson(Uri.fromParts("tel", buf.c(b.b), null).toString());
                    }
                    Notification build = builder2.build();
                    beu beu = obj.e;
                    Uri uri2 = bbe.q;
                    buf.c();
                    beu = obj.e;
                    buf.c();
                    if (!(obj.g == i2 || obj.g == 0)) {
                        bdf.d(obj, "Previous notification already showing - cancelling " + obj.g);
                        obj.d.cancel(obj.g);
                    }
                    bdf.d(obj, "Displaying notification for " + i2);
                    obj.d.notify(i2, build);
                    bde bde = b.c;
                    if (bde.g == -1) {
                        bde.g = SystemClock.elapsedRealtime();
                    }
                    obj.g = i2;
                }
            }
        }
    }

    public final void b(String str, bbe bbe) {
        ayo a = azs.a.a(str);
        if (a != null) {
            Object obj = this.a;
            ayo b = bdn.b(azs.a);
            if (b != null && b.d.equals(a.d)) {
                int i;
                CharSequence a2;
                int i2;
                int c = b.c();
                if (b.c() == 8) {
                    i = buf.kA;
                } else if (b.i == 3) {
                    i = buf.kC;
                } else {
                    i = buf.ko;
                }
                Bitmap bitmap = null;
                if (b.c(1) && !b.c(2)) {
                    bitmap = BitmapFactory.decodeResource(obj.b.getResources(), buf.kE);
                }
                if (bbe.f != null && (bbe.f instanceof BitmapDrawable)) {
                    bitmap = ((BitmapDrawable) bbe.f).getBitmap();
                }
                if (b.o) {
                    bitmap = ayv.a(obj.b.getResources().getDrawable(buf.kh));
                }
                CharSequence a3 = obj.a(b, bbe.p);
                if (!b.c(1) || b.c(2)) {
                    a2 = aim.a(bbe.a, bbe.b, obj.f);
                    if (TextUtils.isEmpty(a2)) {
                        if (TextUtils.isEmpty(bbe.c)) {
                            a2 = null;
                        } else {
                            a2 = BidiFormatter.getInstance().unicodeWrap(bbe.c, TextDirectionHeuristics.LTR);
                        }
                    }
                } else {
                    a2 = obj.b.getResources().getString(aq.bY);
                }
                Object obj2 = b.i == 3 ? 1 : null;
                if (c == 4 || c == 5 || obj2 != null) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                Uri uri = bbe.q;
                Object obj3 = ((a2 == null || a2.equals(obj.l)) && (a2 != null || obj.l == null)) ? null : 1;
                obj3 = (obj.i == i && Objects.equals(obj.j, a3) && obj.h == c && obj.k == bitmap && obj3 == null && Objects.equals(obj.n, uri)) ? null : 1;
                if (obj.g != i2) {
                    if (obj.g == 0) {
                        bdf.a(obj, "Showing notification for first time.");
                    }
                    obj3 = 1;
                }
                obj.i = i;
                obj.j = a3;
                obj.h = c;
                obj.k = bitmap;
                obj.l = a2;
                obj.n = uri;
                if (obj3 != null) {
                    bdf.a(obj, "Data changed.  Showing notification");
                }
                if (obj3 != null) {
                    if (bitmap != null) {
                        if (bitmap == null) {
                            bitmap = null;
                        } else {
                            bitmap = buf.a(bitmap, (int) obj.b.getResources().getDimension(17104901), (int) obj.b.getResources().getDimension(17104902));
                        }
                    }
                    Builder builder = new Builder(obj.b);
                    builder.setSmallIcon(i).setColor(obj.b.getResources().getColor(buf.jT)).setContentTitle(obj.a(b, 0));
                    bdn.a(b, c, builder);
                    Builder builder2 = new Builder(obj.b);
                    builder2.setOngoing(true);
                    builder2.setPriority(1);
                    builder2.setPublicVersion(builder.build());
                    builder2.setContentIntent(obj.a(false));
                    if (i2 == 2 && !bcj.b().d()) {
                        PendingIntent a4 = obj.a(true);
                        String valueOf = String.valueOf(a4);
                        bdf.a(obj, new StringBuilder(String.valueOf(valueOf).length() + 28).append("- Setting fullScreenIntent: ").append(valueOf).toString());
                        builder2.setFullScreenIntent(a4, true);
                        obj3 = (b.c() == 5 || (b.c() == 4 && azs.a.f() != null)) ? 1 : null;
                        if (obj3 != null) {
                            bdf.d(obj, "updateInCallNotification: call-waiting! force relaunch...");
                            obj.d.cancel(1);
                        }
                        builder2.setCategory("call");
                    }
                    builder2.setContentText(a3);
                    builder2.setSmallIcon(i);
                    builder2.setContentTitle(a2);
                    builder2.setLargeIcon(bitmap);
                    builder2.setColor(obj.b.getResources().getColor(buf.jT));
                    if (obj2 != null) {
                        builder2.setUsesChronometer(false);
                        bdf.d(obj, "Will show \"dismiss upgrade\" action in the incoming call Notification");
                        builder2.addAction(0, obj.b.getText(aq.cG), bdn.a(obj.b, "com.android.incallui.ACTION_DECLINE_VIDEO_UPGRADE_REQUEST"));
                        bdf.d(obj, "Will show \"accept upgrade\" action in the incoming call Notification");
                        builder2.addAction(0, obj.b.getText(aq.cC), bdn.a(obj.b, "com.android.incallui.ACTION_ACCEPT_VIDEO_UPGRADE_REQUEST"));
                    } else {
                        bdn.a(b, c, builder2);
                        if (c == 3 || c == 8 || buf.f(c)) {
                            bdf.a(obj, "Will show \"hang-up\" action in the ongoing active call Notification");
                            builder2.addAction(buf.kn, obj.b.getText(aq.cH), bdn.a(obj.b, "com.android.incallui.ACTION_HANG_UP_ONGOING_CALL"));
                        } else if (c == 4 || c == 5) {
                            bdf.a(obj, "Will show \"dismiss\" action in the incoming call Notification");
                            builder2.addAction(buf.kp, obj.b.getText(aq.cG), bdn.a(obj.b, "com.android.incallui.ACTION_DECLINE_INCOMING_CALL"));
                            if (b.a(obj.b)) {
                                bdf.a(obj, "Will show \"voice\" action in the incoming call Notification");
                                builder2.addAction(buf.ko, obj.b.getText(aq.cF), bdn.a(obj.b, "com.android.incallui.ACTION_ANSWER_VOICE_INCOMING_CALL"));
                                bdf.d(obj, "Will show \"video\" action in the incoming call Notification");
                                builder2.addAction(buf.kC, obj.b.getText(aq.cE), bdn.a(obj.b, "com.android.incallui.ACTION_ANSWER_VIDEO_INCOMING_CALL"));
                            } else {
                                bdf.a(obj, "Will show \"answer\" action in the incoming call Notification");
                                builder2.addAction(buf.ko, obj.b.getText(aq.cD), bdn.a(obj.b, "com.android.incallui.ACTION_ANSWER_VOICE_INCOMING_CALL"));
                            }
                        }
                    }
                    if (bbe.k != null && bbe.p != 1) {
                        builder2.addPerson(bbe.k.toString());
                    } else if (!TextUtils.isEmpty(buf.c(b.b))) {
                        builder2.addPerson(Uri.fromParts("tel", buf.c(b.b), null).toString());
                    }
                    Notification build = builder2.build();
                    beu beu = obj.e;
                    Uri uri2 = bbe.q;
                    buf.c();
                    beu = obj.e;
                    buf.c();
                    if (!(obj.g == i2 || obj.g == 0)) {
                        bdf.d(obj, "Previous notification already showing - cancelling " + obj.g);
                        obj.d.cancel(obj.g);
                    }
                    bdf.d(obj, "Displaying notification for " + i2);
                    obj.d.notify(i2, build);
                    bde bde = b.c;
                    if (bde.g == -1) {
                        bde.g = SystemClock.elapsedRealtime();
                    }
                    obj.g = i2;
                }
            }
        }
    }
}
