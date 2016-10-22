import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;
import java.lang.ref.WeakReference;

public final class gqo extends Handler {
    private final WeakReference<ParticipantsGalleryView> a;

    public gqo(ParticipantsGalleryView participantsGalleryView) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(participantsGalleryView);
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            ParticipantsGalleryView participantsGalleryView = (ParticipantsGalleryView) this.a.get();
            if (participantsGalleryView != null) {
                participantsGalleryView.i = false;
                gql gql = new gql(participantsGalleryView, participantsGalleryView.h.size());
                while (participantsGalleryView.h.size() > 0) {
                    gqr gqr = (gqr) participantsGalleryView.h.poll();
                    participantsGalleryView.i = true;
                    if (gqr instanceof gqp) {
                        String str;
                        gqp gqp = (gqp) gqr;
                        if (ParticipantsGalleryView.a) {
                            str = gqp.c ? "set" : "unset";
                            String valueOf = String.valueOf(OverlayedAvatarView.a(gqp.b));
                            String valueOf2 = String.valueOf(gqp.a.b);
                            new StringBuilder(((String.valueOf(str).length() + 50) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("[PartGallery] change participant state  ").append(str).append(" ").append(valueOf).append(" bit for ").append(valueOf2);
                        }
                        edk edk;
                        OverlayedAvatarView b;
                        int b2;
                        int d;
                        int b3;
                        if (gqp.c) {
                            Object obj;
                            boolean z;
                            edk = gqp.a;
                            int i = gqp.b;
                            boolean z2 = gqp.d;
                            OverlayedAvatarView c = participantsGalleryView.c(edk);
                            if (c == null) {
                                obj = 1;
                                b = participantsGalleryView.b(edk);
                            } else {
                                obj = null;
                                b = c;
                            }
                            b2 = b.b();
                            d = b.d(i);
                            int b4 = OverlayedAvatarView.b(d);
                            b3 = OverlayedAvatarView.b(b2);
                            if (participantsGalleryView.d(edk)) {
                                b.f(d);
                                if (ParticipantsGalleryView.a) {
                                    participantsGalleryView.a(null, b, "SetState (COALESCED) " + b2 + " -> " + d);
                                    z = false;
                                } else {
                                    z = false;
                                }
                            } else if (b4 == b3) {
                                b.e(d);
                                if (ParticipantsGalleryView.a) {
                                    participantsGalleryView.a(null, b, "SetState (HI EQ) " + b2 + " -> " + d);
                                }
                                z = false;
                            } else if (b4 == 4 && b3 == 2) {
                                b.e(d);
                                if (ParticipantsGalleryView.a) {
                                    participantsGalleryView.a(null, b, "SetState (F->T) " + b2 + " -> " + d);
                                }
                                z = true;
                            } else {
                                if (obj != null) {
                                    participantsGalleryView.a(edk, b, d, z2);
                                } else {
                                    participantsGalleryView.a(gql, edk, b, b2, d);
                                }
                                z = true;
                            }
                            gql.a(z);
                            if (i == 2) {
                                if (ParticipantsGalleryView.a) {
                                    str = String.valueOf(edk.b);
                                    new StringBuilder(String.valueOf(str).length() + 25).append("Focus state set for user ").append(str);
                                }
                                if (participantsGalleryView.b != null) {
                                    participantsGalleryView.b.a();
                                }
                            }
                        } else {
                            boolean z3;
                            boolean z4;
                            edk = gqp.a;
                            int i2 = gqp.b;
                            boolean z5 = gqp.d;
                            b = participantsGalleryView.c(edk);
                            if (b != null) {
                                b2 = b.b();
                                d = b.c(i2);
                                b3 = OverlayedAvatarView.b(d);
                                int b5 = OverlayedAvatarView.b(b2);
                                if (participantsGalleryView.d(edk)) {
                                    b.f(d);
                                    if (ParticipantsGalleryView.a) {
                                        participantsGalleryView.a(null, b, "UnsetState (COALESCED) " + b2 + " -> " + d);
                                        z3 = false;
                                        z4 = true;
                                    }
                                } else if (b3 == b5) {
                                    b.e(d);
                                    if (ParticipantsGalleryView.a) {
                                        participantsGalleryView.a(null, b, "UnsetState (HI EQ) " + b2 + " -> " + d);
                                    }
                                    z3 = false;
                                    z4 = true;
                                } else if (b3 == 2 && b5 == 4) {
                                    b.e(d);
                                    if (ParticipantsGalleryView.a) {
                                        participantsGalleryView.a(null, b, "UnsetState (T->F) " + b2 + " -> " + d);
                                    }
                                    z3 = true;
                                    z4 = true;
                                } else {
                                    if (d == 0) {
                                        z3 = participantsGalleryView.c(edk, b2, z5);
                                    } else {
                                        z3 = participantsGalleryView.a(gql, edk, b, b2, d);
                                    }
                                    z4 = z3;
                                    z3 = true;
                                }
                                if (z4) {
                                    gql.a(z3);
                                }
                                if (b != null && i2 == 2) {
                                    if (ParticipantsGalleryView.a) {
                                        str = String.valueOf(edk.b);
                                        new StringBuilder(String.valueOf(str).length() + 27).append("Focus state unset for user ").append(str);
                                    }
                                    if (participantsGalleryView.b != null) {
                                        participantsGalleryView.b.a();
                                    }
                                }
                            }
                            z3 = false;
                            z4 = true;
                            if (z4) {
                                gql.a(z3);
                            }
                            if (ParticipantsGalleryView.a) {
                                str = String.valueOf(edk.b);
                                new StringBuilder(String.valueOf(str).length() + 27).append("Focus state unset for user ").append(str);
                            }
                            if (participantsGalleryView.b != null) {
                                participantsGalleryView.b.a();
                            }
                        }
                    } else if (gqr instanceof gqm) {
                        gqm gqm = (gqm) gqr;
                        if (ParticipantsGalleryView.a) {
                            String str2 = gqm.c ? "set" : "unset";
                            new StringBuilder(String.valueOf(str2).length() + 71).append("[PartGallery] batch change participant state  ").append(str2).append(" watermark bit for users:");
                            for (edk edk2 : gqm.a) {
                                str2 = String.valueOf(edk2.b);
                                new StringBuilder(String.valueOf(str2).length() + 2).append("  ").append(str2);
                            }
                        }
                        if (gqm.c) {
                            participantsGalleryView.b(gql, gqm.a, gqm.b);
                        } else {
                            participantsGalleryView.a(gql, gqm.a, gqm.b);
                        }
                    }
                }
            }
        }
    }
}
