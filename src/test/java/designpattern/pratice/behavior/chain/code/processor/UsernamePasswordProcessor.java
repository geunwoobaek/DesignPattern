package designpattern.pratice.behavior.chain.code.processor;

import designpattern.pratice.behavior.chain.code.provider.AuthenticationProvider;
import designpattern.pratice.behavior.chain.code.provider.UsernamePasswordProvider;

public class UsernamePasswordProcessor extends AuthenticationProcessor {
    public UsernamePasswordProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if(authProvider instanceof UsernamePasswordProvider){
            return true;
        }
        else if (nextProcessor != null){
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}
