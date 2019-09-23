package br.edu.utp.trabalho1;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Atividade 2 numeros primos
 *
 * @author Magdiel
 * @version 1.0
 */

public class Atividade2 {

    private int numero;

    //Construtor com parametros
    public Atividade2(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Lista para adicionar os numeros primos
    ArrayList<Integer> primos = new ArrayList();

    public void numerosPrimos() {
        boolean primo;
        System.out.println("--------Atividade2---------");
        for (int i = 0; i <= getNumero(); i++)  {
            primo = true;
            // O numero um não é primo
            if (i == 1) {
                primo = false;
            }

            if (primo) {
                // Todo numero primo é divivel por 1  e por ele mesmo
                if ((i % 2 == 0) && (i != 2)) {
                    primo = false;
                }

                if (primo) {
                    // Verfica os outros numeros
                    for (int j = 3; j <= (i / 2); j++) {
                        if (i % j == 0) {
                            primo = false;
                            break;
                        }
                    }
                }

                if (primo) {
                    // Adiciona na lista
                    primos.add(i);
                }

            }
        }
        System.out.printf("Números primos entre 0 e %d = ", getNumero());
        for (Integer lista : primos) {
            System.out.printf("%d, ", lista);
        }
    }
}
