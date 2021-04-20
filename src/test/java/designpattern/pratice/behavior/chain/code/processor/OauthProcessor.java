package designpattern.pratice.behavior.chain.code.processor;

import designpattern.pratice.behavior.chain.code.processor.AuthenticationProcessor;
import designpattern.pratice.behavior.chain.code.provider.AuthenticationProvider;
import designpattern.pratice.behavior.chain.code.provider.OAuthTokenProvider;

public class OauthProcessor extends AuthenticationProcessor {
    public OauthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof OAuthTokenProvider) return true;
        else if (nextProcessor != null) return nextProcessor.isAuthorized(authProvider);
        return false;
    }
}
