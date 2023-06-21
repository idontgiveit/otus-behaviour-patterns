package org.example.cor;

import org.example.cor.data.AuthCtx;
import org.example.cor.data.Realm;
import org.example.cor.data.Resource;
import org.example.cor.data.User;


public class AuthorizationStep extends AuthStep {
    public AuthorizationStep(final AuthStep next) {
        super(next);
    }

    @Override
    public void check(AuthCtx ctx) {
        System.out.println("---------> Authorisation");
        User user = ctx.getUser();
        Realm realm = user.getRealm();
        if (realm.checkResource(ctx.getResource())) {
            ctx.setGranted(true);
            next(ctx);
        }
    }
}
