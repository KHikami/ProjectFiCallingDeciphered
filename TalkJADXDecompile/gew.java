final class gew implements gea {//**CATCHY NAME NEEDED HERE*** jk it matches the network cell for
    //related geb into gef(joiner for all the cells and used by geu later) and calls
    //is WifiCallPossible in geu

    final /* synthetic */ geu a;

    gew(geu geu) {
        this.a = geu;
    }

    public void a(geb geb) {
        if (!this.a.g) {//if geu.g is false
            this.a.b.f().a(geb.c);//use given geb and feed to geu.b.f().a(geb.c)
            //this becomes gcq.f().a(geb.c) => gcq.f().a(gec/Network Cell)
            // => gef.a(gec) => sets gef's network status to geb's network cell

            this.a.a(geb);//geu.a(geb) => calls the is WifiCallpossible method!
        }
    }
}
