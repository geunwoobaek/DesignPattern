package designpattern.pratice.behavior.chain.code.processor;

import designpattern.pratice.behavior.chain.code.provider.AuthenticationProvider;

public abstract class AuthenticationProcessor {
    public AuthenticationProcessor nextProcessor;
    public AuthenticationProcessor(AuthenticationProcessor nextProcessor){
        this.nextProcessor=nextProcessor;
    }
    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}
