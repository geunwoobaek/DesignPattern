package designpattern.pratice.behavior.chain.code;

import designpattern.pratice.behavior.chain.code.processor.AuthenticationProcessor;
import designpattern.pratice.behavior.chain.code.processor.OauthProcessor;
import designpattern.pratice.behavior.chain.code.processor.UsernamePasswordProcessor;
import designpattern.pratice.behavior.chain.code.provider.OAuthTokenProvider;
import designpattern.pratice.behavior.chain.code.provider.SamlTokenProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ChainOfResponsibilityTest {

    private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new OauthProcessor(null);
        return new UsernamePasswordProcessor(oAuthProcessor);
    }

    @Test
    @DisplayName("OauthProvider 권한확인후 성공했으면..")
    public void givenOAuthProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        assertTrue(authProcessorChain.isAuthorized(new OAuthTokenProvider()));
    }

    @Test
    @DisplayName("SamlTokenProvider에서 권한확인후 성공했으면..")
    public void givenSamlProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        assertFalse(authProcessorChain.isAuthorized(new SamlTokenProvider()));
    }
}