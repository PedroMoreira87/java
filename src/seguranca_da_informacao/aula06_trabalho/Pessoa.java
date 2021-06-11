package aula06_trasbalho;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Pessoa {
    private String id;
    private String chaveMestre;

    public Pessoa(String id, String chaveMestre) {
        this.id = id;
        this.chaveMestre = chaveMestre;
    }

    public String getId() {
        return this.id;
    }

    public String getChaveMestre(){
        return this.chaveMestre;
    }

    public String getNonce() {
        SecureRandom nonce = new SecureRandom();
        return new BigInteger(15, nonce).toString(10);
    }

    public int getFuncAutentica(int n) {
        return n * 823 / 941;
    }
}
