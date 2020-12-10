package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.util.ArrayList;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            
            kSession.fireAllRules();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    

    public static class Question {
            public String question;
            public String[] answers;
            public String answer;
            
            public Question(String question, String[] answers,String answer) {
                    this.question=question;
                    this.answers=answers;
                    this.answer=answer;
            }       

        
    }


}
