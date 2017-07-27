package jogo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class FonteDeExpressoes {

    Expressao obj;
    ArrayList<Expressao> ListaDeExpressao;

    public FonteDeExpressoes() {
        arquivo();
    }

    private void arquivo() {

        String linha = null;

        try {
            FileReader reader = new FileReader("dados.txt"); // Localização do Arquivo  
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            int nivel = 0;         // Armazena campo de nivel  
            char tipo = 0;      // Armazena campo de tipo  
            String expressao = null;        // Armazena campo de expressao  
            double resposta = 0;          // Armazena campo de reprova   

            ListaDeExpressao = new ArrayList<Expressao>(40);
            while ((linha = leitor.readLine()) != null) {

                // UTILIZA DELIMITADOR ; PARA DIVIDIR OS CAMPOS  
                st = new StringTokenizer(linha, "\t");
                String dados = null;

                while (st.hasMoreTokens()) {

                    // Campo nivel
                    dados = st.nextToken();
                    nivel = Integer.parseInt(dados);

                    // Campo tipo  
                    dados = st.nextToken();
                    tipo = dados.charAt(0);

                    // Campo expressao  
                    dados = st.nextToken();
                    expressao = dados;

                    // Campo resposta  
                    dados = st.nextToken();
                    resposta = Double.parseDouble(dados);

                }
                //Aqui insere os dados em um array list
                Expressao obj = new Expressao(nivel, tipo, expressao, resposta);
                ListaDeExpressao.add(obj);
            }
            leitor.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Expressao> getlista() {
        return ListaDeExpressao;
    }
}
