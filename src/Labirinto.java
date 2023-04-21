import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {
    private char[][] labirinto;
    private FileReader fr;
    private BufferedReader br;

    public void criaLabirinto(String fileName) {
        try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String line = br.readLine();
            int linha = Integer.parseInt(line);

            line = br.readLine();
            int coluna = Integer.parseInt(line);

            labirinto = new char[linha][coluna];

            for(int i=0; i < labirinto.length; i++){
                line = br.readLine();
                for(int j=0; j < labirinto[i].length; j++){
                    labirinto[i][j] = line.charAt(j);
                }
            }
            br.close();

            System.out.println(labirinto);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void percorreLabirinto() {

    }

    private boolean verificaSaidasLabirinto() {
        return false;
    }
}
